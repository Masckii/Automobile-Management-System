/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.View_AMS;

/**
 *
 * @author Omar Shan
 */
public class AutoMobileManagmentSystem {

    //--engine
    private boolean state_engine = false;
    private int current_speed;
    private boolean cruise_state = false;
    private int fuel_reading = 0;
    private int gear_pos = 0;
    private int trip_start_time = 0;
    private boolean trip_state = false;
    private static int time_counter_sec = 0;
    private  float distance = 0 ;
    //-- compunents of our AMS 
    private CruiseController cc;
    private Monitor monitor;
    private DriveShaftSensor dss;
    private Gear_sensor grs;
    private Calibrator cal;
    private Fuel_Sensor fs;
    private model.Timer timer;
    //therad
    //private model.Fuel_Sensor fuel_sensor;
    // private model.Led_light led_light;
    //gui
    private View_AMS gui;
    //-
    private double cruise_controll_values[] = new double[3];

    public AutoMobileManagmentSystem() {
        cal = new Calibrator(this);
        fs = new Fuel_Sensor(this);
        grs = new Gear_sensor(this);
        timer = new Timer(this);
        current_speed = 0;
        gui = new View_AMS();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        cal.start();
        fs.start();
        grs.start();
        timer.start();
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

    public void drop_speed_automatic() {
        if (state_engine == true && current_speed > 0) {
            if (current_speed > 20) {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                // gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.01);
            } else if (current_speed > 40) {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.02);
                //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.02);

            } else if (current_speed > 60) {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.03);
                //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.03);

            } else if (current_speed > 80) {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.04);
                //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.03);

            }
        } else {

        }
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

            gui.getRadialRPM().setValueAnimated(5);
            gui.getDisplayRPM().setValueAnimated(5);
            gui.getLightBulb1().setOn(state_engine);
        } else {
            gui.getLightBulb1().setOn(state_engine);
            gui.getRadialRPM().setValueAnimated(0);
            gui.getDisplayRPM().setValueAnimated(0);

        }

    }

    void set_distance_driven() {
        if (state_engine && trip_state && current_speed > 0) {
            distance += current_speed*time_counter_sec/1000;
            System.out.println("dist = "+distance);
            gui.getDisplayMilesDriven().setValue(distance);
            time_counter_sec++;
        }
    }

    public void setFuel_reading(int fuel_reading) {
        this.fuel_reading = fuel_reading;

    }

    public void setCruise_state(boolean cruise_state) {
        this.cruise_state = cruise_state;
    }

    public int get_speedOmeter() {
        return ((int) gui.getRadialSpeedometer().getValue());
    }

    public int get_fuel_reaging() {
        return ((int) gui.getRadialFuel().getValue());
    }

    public int getGear_pos() {
        return ((int) gui.getDisplayGear().getValue());

    }

    public int getTrip_start_time() {
        return trip_start_time;
    }

    public void setTrip_start_time(int trip_start_time) {
        this.trip_start_time = trip_start_time;
    }

    public boolean isTrip_state() {
        return trip_state;
    }

    public void setTrip_state(boolean trip_state) {
        this.trip_state = trip_state;
    }

    public void setGear_pos(int gear_pos) {
        this.gear_pos = gear_pos;
    }

    public void set_speedOmeter(int speed_in) {
        current_speed = speed_in;
        if (cruise_state == false) {
            drop_speed_automatic();

        }
        System.err.println("Curent Fuel : " + fuel_reading);
        System.err.println("gear_pos : " + gear_pos);
        System.err.println("Curent speed : " + speed_in);
    }

}
