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
    private int messsured_speed = 0;
    private boolean cruise_state = false;
    private int fuel_reading = 0;
    private int gear_pos = 0;
    private int trip_start_time = 0;
    private boolean trip_state = false;
    private static int time_counter_sec = 0;
    private static int average_speed = 0;
    private static float distance = 0;
    private int dreive_shaft_rotation = 0;
    private boolean Clabirator_state;
    private static int cruise_value;
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
        //vars
        Clabirator_state = false;
        cruise_value = 0;
        cruise_state = false;
        //
        cal = new Calibrator(this);
        fs = new Fuel_Sensor(this);
        grs = new Gear_sensor(this);
        cc = new CruiseController(this);
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
        cc.start();
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

    public void get_cruise_update() {
        if (cruise_state == true&&gear_pos==3) {
            cc.setState(CruiseControllerState.ACTIVATE);
            cc.setCruise_res_value(current_speed);

        } else {
            cc.setState(CruiseControllerState.DEACTIVATE);
            cc.setCruise_con_value(current_speed);

        }

    }

    public void set_cruise_readig_handle(int cruise_speed) {
        if (cruise_state == true&&gear_pos==3) {
            System.out.println("model.AutoMobileManagmentSystem.set_cruise_readig_handle()");
            gui.getDisplayCrusingSpeed().setValue(cruise_value);
            this.current_speed = cruise_value;

        } else {
            gui.getDisplayCrusingSpeed().setValue(0);
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
        if (state_engine == true) {
            try {
                if (current_speed >= 20 && current_speed < 40) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.34 * 3 + 200 * current_speed / 4 + random(1, 2) * random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 40 && current_speed < 60) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.30 * 3 + 200 * current_speed / 4 + random(2, 3) * random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 60 && current_speed < 80) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.25 * 3 + 200 * current_speed / 4 + random(3, 4) * random(1, 5));
                    return dss_gen;

                } else if (current_speed >= 80) {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.2 * 3 + 200 * current_speed / 4 + random(4, 5) * random(1, 5));
                    return dss_gen;

                } else {
                    float dss_gen = (float) (1000 * gear_pos * gear_pos * 0.2 * 3 + 200 * current_speed / 4 + random(1, 2) * random(1, 2));
                    return dss_gen;

                }
            } catch (Exception e) {
            }

        }

        return 0;
    }

    void set_distance_driven() {
        if (state_engine && current_speed > 0 && dreive_shaft_rotation > 0) {

            // distance += current_speed * time_counter_sec / 100;
            distance += dreive_shaft_rotation / 1000;
            messsured_speed = (int) (dreive_shaft_rotation * 1.7) / 100;
            System.err.println("messsured_speed " + messsured_speed);
            set_mentainace_notify((int) distance);
            decrease_fuel((int) distance, fuel_reading);
            float dradial = distance / 165; //13*(10+20) led light
            gui.getDigitalRadial1().setValue(dradial);

            gui.getDisplayMilesDriven().setValue(distance);
            time_counter_sec++;
        }
    }

    void set_average_speed() {
        if (trip_state == true) {

        }

    }

    void set_mentainace_notify(int drav) {
        if (drav > 4950 && drav <= 5000) {
            gui.getDisplayMaintenance().setValue(5000 - drav);
            if (drav % 5 == 0) {
                gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 - drav) + " miles");

            }

        } else if (drav >= 4750 && drav <= 4950) {
            gui.getDisplayMaintenance().setValue(5000 - drav);

            if (drav % 10 == 0) {
                gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 - drav));

            }
        } else if (drav >= 9750 && drav < 9950) {
            gui.getDisplayMaintenance().setValue(10000 - drav);

            if (drav % 10 == 0) {
                gui.getScreen().setText("There is required maintenance ->   air filter change : " + (10000 - drav));

            }
        } else if (drav >= 9950 && drav <= 10000) {
            gui.getDisplayMaintenance().setValue(10000 - drav);

            if (drav % 5 == 0) {
                gui.getScreen().setText("There is required maintenance ->   air filter change : " + (10000 - drav));

            }
        } else if (drav >= 14750 && drav < 14950) {
            gui.getDisplayMaintenance().setValue(15000 - drav);

            if (drav % 10 == 0) {
                gui.getScreen().setText("There is required maintenance ->    major service change : " + (15000 - drav));

            }
        } else if (drav >= 14950 && drav <= 15000) {
            gui.getDisplayMaintenance().setValue(15000 - drav);

            if (drav % 5 == 0) {
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

    public int decrease_fuel(int distance, int fuel_reading) {

        if (distance % 1000 == 0) {
            return fuel_reading--;
        } else {
            return fuel_reading;
        }
    }

    public void setFuel_reading(int fuel_reading) {
        this.fuel_reading = fuel_reading;

    }

    public void set_message_display(String s) {
        // gui.get.setText(s);
    }

    public void setCruise_state(boolean cruise_state) {
        if (cruise_state == true &&gear_pos==3) {
            gui.getCrusing_lightBulb1().setOn(true);
            cruise_value = current_speed;
            this.cruise_state = true;
        } else {
            gui.getCrusing_lightBulb1().setOn(false);
            this.cruise_state = false;
        }

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
        gui.getTripbulb().setOn(trip_state);
        this.trip_state = trip_state;
    }

    public void setGear_pos(int gear_pos) {
        if (gear_pos == 3) {
            gui.getLightBulb3().setOn(true);

        } else {
            gui.getLightBulb3().setOn(false);

        }
        this.gear_pos = gear_pos;
    }

    public boolean isClabirator_state() {
        return Clabirator_state;
    }

    public void setClabirator_state(boolean Clabirator_state) {

        gui.getClibirate_lightBulb().setOn(Clabirator_state);
        this.Clabirator_state = Clabirator_state;
    }

    public void set_speedOmeter(int speed_in) {
        current_speed = speed_in;
        if (cruise_state == false) {
            drop_speed_automatic();

        }
        System.err.println("Curent Fuel : " + fuel_reading);
        System.err.println("gear_pos : " + gear_pos);
        System.err.println("Curent speed : " + speed_in);
        System.err.println("cruise_state : " + cruise_state);
        System.err.println("cruise_value : " + cruise_value);
        System.err.println("drivesaft rot  : " + dreive_shaft_rotation);

    }
}
