/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;
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
    private static float distance = 0;
    private int dreive_shaft_rotation = 0;
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
        dss = new DriveShaftSensor(this);
        timer = new Timer(this);
        current_speed = 0;
        gui = new View_AMS();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        cal.start();
        fs.start();
        grs.start();
        timer.start();
        dss.start();
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
        try {
            if (state_engine == true && current_speed > 0) {
                if (current_speed > 20 && current_speed < 40) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.02);
                    // gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.01);
                } else if (current_speed > 40 && current_speed < 60) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.02);
                    //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.02);

                } else if (current_speed > 60 && current_speed < 80) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.03);

                } else if (current_speed > 80) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.03);

                }
            } else {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.02);

            }
        } catch (Exception e) {
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

    public int getDreive_shaft_rotation() {
        return ((int) gui.getDriveshaft_display().getValue()) + 1;
    }

    public void setDreive_shaft_rotation(int dreive_shaft_rotation) {

        gui.getDriveshaft_display().setValue(generates_drive_shaft());
        System.out.println("model.AutoMobileManagmentSystem.setDreive_shaft_rotation()" + generates_drive_shaft());
        this.dreive_shaft_rotation = dreive_shaft_rotation;

    }

    private int random(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    float generates_drive_shaft() {
        if (state_engine && cruise_state == false) {
            try {
                if (current_speed >= 20 && current_speed < 40) {
                    float dss_gen = (float) ((1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * random(1, 2)) / 100 * current_speed + random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 40 && current_speed < 60) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * random(2, 3) + current_speed + random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 60 && current_speed < 80) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * random(3, 4) + current_speed + random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 80) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * random(4, 6) + current_speed + random(1, 5));
                    return dss_gen;

                } else {
                    float dss_gen = (float) ((1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * random(1, 2)) / 100 * current_speed);

                }
            } catch (Exception e) {
            }

        }

        return 0;
    }

    void set_distance_driven() {
        if (state_engine && trip_state && current_speed > 0) {

            distance += current_speed * time_counter_sec / 100;

            set_mentainace_notify((int) distance);

            float dradial = distance / 165; //13*(10+20) led light
            gui.getDigitalRadial1().setValue(dradial);

            gui.getDisplayMilesDriven().setValue(distance);
            time_counter_sec++;
        }
    }

    void set_mentainace_notify(int drav) {
        if (drav > 4950 && drav <= 5000) {
            gui.getDisplayMaintenance().setValue(5000 - drav);
            if (drav % 2 == 0) {
                gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 - drav) + " miles");

            }

        } else if (drav >= 4750 && drav <= 4950) {
            gui.getDisplayMaintenance().setValue(5000 - drav);

            if (drav % 3 == 0) {
                gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 - drav));

            }
        } else if (drav >= 9750 && drav < 9950) {
            gui.getDisplayMaintenance().setValue(10000 - drav);

            if (drav % 3 == 0) {
                gui.getScreen().setText("There is required maintenance ->   air filter change : " + (10000 - drav));

            }
        } else if (drav >= 9950 && drav <= 10000) {
            gui.getDisplayMaintenance().setValue(10000 - drav);

            if (drav % 2 == 0) {
                gui.getScreen().setText("There is required maintenance ->   air filter change : " + (10000 - drav));

            }
        } else if (drav >= 14750 && drav < 14950) {
            gui.getDisplayMaintenance().setValue(15000 - drav);

            if (drav % 3 == 0) {
                gui.getScreen().setText("There is required maintenance ->    major service change : " + (15000 - drav));

            }
        } else if (drav >= 14950 && drav <= 15000) {
            gui.getDisplayMaintenance().setValue(15000 - drav);

            if (drav % 2 == 0) {
                gui.getScreen().setText("There is required maintenance ->    major service change : " + (15000 - drav));

            }
        } else {
            if (drav > 5000) {
                gui.getDisplayMaintenance().setValue(10000 - drav);

            } else if (drav > 10000) {
                gui.getDisplayMaintenance().setValue(15000 - drav);

            } else if (drav < 5000) {
                gui.getDisplayMaintenance().setValue(5000 - drav);

            }
        }
    }

    public void setFuel_reading(int fuel_reading) {
        this.fuel_reading = fuel_reading;

    }

    public void set_message_display(String s) {
        // gui.get.setText(s);
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

    public int getDrisaft_rot() {
        return ((int) gui.getDriveshaft_display().getValue());

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
        System.err.println("drivesaft rot  : " + dreive_shaft_rotation);
    }

}
