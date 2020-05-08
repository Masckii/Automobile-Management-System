/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import view.View_AMS;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Omar Shan
 */
public class AutoMobileManagmentSystem {

    //--engine
    private boolean state_engine = false;
    private int current_speed;

    //-- compunents of our AMS 
    private CruiseController cc;
    private Monitor monitor;
    private DriveShaftSensor dss;
    private Calibrator cal;

    //therad
    //private model.Fuel_Sensor fuel_sensor;
    // private model.Led_light led_light;
    //gui
    private View_AMS gui;
    //-
    private double cruise_controll_values[] = new double[3];

    public AutoMobileManagmentSystem() {
         cal = new Calibrator(this);
        current_speed = 0;
        gui = new View_AMS();
        gui.setVisible(true);

            cal.start();


    }

    public double[] PerformAcceleration(double speed, double gear, double rpm, boolean accelerate) {

        if (accelerate == true) {
            if (speed < (gear * 33)) {
                speed = speed + 5;
                rpm = ((speed - ((gear - 1) * 33)) * (70 / 33));

            }
            if (speed > 99) {
                speed = 99;
            }

        } else {
            if (speed > (gear * 33)) {
                speed = speed - 5;
                rpm = ((speed - ((gear - 1) * 33)) * (70 / 33));
            }
            if (speed <= (gear * 33)) {
                speed = speed - 5;
                gear--;
                if (gear < 1) {
                    gear = 1;
                }
                rpm = ((speed - ((gear - 1) * 33)) * (70 / 33));

            }
            if (gear < 1) {
                gear = 1;
            }
            if (speed < 0) {
                speed = 0;
            }
        }

        cruise_controll_values[0] = speed;
        cruise_controll_values[1] = rpm;
        cruise_controll_values[2] = gear;
        return cruise_controll_values;
    }

    public boolean isEngineOn() {
        return state_engine;
    }

    public void setEngineState(boolean state_engine) {
        this.state_engine = state_engine;
        set_bulb_on();
    }

    void set_bulb_on() {
        if (state_engine == true) {

            gui.getRadialRPM().setValueAnimated(10);
            gui.getDisplayRPM().setValueAnimated(10);
            gui.getLightBulb1().setOn(state_engine);
        } else {
            gui.getLightBulb1().setOn(state_engine);
            gui.getRadialRPM().setValueAnimated(0);
            gui.getDisplayRPM().setValueAnimated(0);

        }

    }

    public int get_speedOmeter() {
        return ((int) gui.getRadialSpeedometer().getValue())  ;
    }

    public void set_speedOmeter(int speed_in) {
        current_speed = speed_in;
        System.err.println("Curent speed : " + speed_in);
    }

}
