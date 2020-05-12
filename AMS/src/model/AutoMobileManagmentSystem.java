/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import java.util.Random;
import view.View_AMS;

/**
 *
 * @author Omar Shan
 */
public class AutoMobileManagmentSystem {

    //--engine
    private boolean state_engine;
    private int current_speed;
    private boolean cruise_state;
    private int fuel_reading;
    private int gear_pos;
    private int trip_start_time;
    private boolean trip_state;
    private static int time_counter_sec = 0;
    private static int time_counter_trip = 0;
    private static int speed_counter_trip = 0;
    private static int average_speed = 0;
    private static int rpm_total = 0;
    private static float distance = 0;
    private int dreive_shaft_rotation;
    private boolean Clabirator_state;
    private static int cruise_value;
    private boolean accelerate;
    private boolean maintainance_state;
    private static int change_stage;
    private static int ac_value;
    private double rpm;
    //-- compunents of our AMS 
    private CruiseController cc;
    private Monitor monitor;
    private DriveShaftSensor dss;
    private Gear_sensor grs;
    private Calibrator cal;
    private Fuel_Sensor fs;
    private model.Timer timer;
    private model.Monitor mon;
    private model.ServiceCompletion ser_com;
    private SystemStateTracer sst;
    //therad
    //private model.Fuel_Sensor fuel_sensor;
    // private model.Led_light led_light;
    //gui
    private View_AMS gui;
    //-
    private double cruise_controll_values[] = new double[3];

    public AutoMobileManagmentSystem() {
        //vars
        state_engine = false;
        Clabirator_state = false;
        cruise_value = 0;
        cruise_state = false;
        maintainance_state = false;
        average_speed = 0;
        ser_com = ServiceCompletion.SERVICE_INCOMPLETE;
        Clabirator_state = false;
        cruise_state = false;
        fuel_reading = 0;
        gear_pos = 0;
        trip_start_time = 0;
        trip_state = false;
        dreive_shaft_rotation = 0;
        change_stage = 1;
        rpm = 0;
        
        current_speed = 0;
        //
        //table
        String maintance[] = {"Oil and oil filter change after : ", "Air filter change  : ", "Major service change :  change after : "};

        //GUI
        gui = new View_AMS();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        gui.getMaintenance_done_button().setVisible(false);

        //
        //Threads
        cal = new Calibrator(this);
        fs = new Fuel_Sensor(this);
        grs = new Gear_sensor(this);
        cc = new CruiseController(this);
        dss = new DriveShaftSensor(this);
        mon = new Monitor(this);
        timer = new Timer(this);

        cc.start();     //1
        cal.start();    //2
        fs.start();     //3
        grs.start();    //4
        timer.start();  //5
        dss.start();    //6
        mon.start();    //7
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public boolean isAccelerate() {
        return accelerate;
    }

    public void setAccelerate(boolean accelerate) {
        this.accelerate = accelerate;
    }

    public static void setAc_value(int ac_value) {
        AutoMobileManagmentSystem.ac_value = ac_value;
    }

    public void PerformAcceleration(boolean state) {

        if (state == true && state_engine == true) {
            //Config.sendEvent(new events.Gear_Reading(getGear_pos()));

            int speedo = (int) gui.getRadialSpeedometer().getValue();
            if (accelerate == true) {
                // int rr=(int)gui.getRadialSpeedometer().getValue();
                if(rpm!=80){
                rpm=rpm+ac_value*10;
                if(rpm>80){
                    rpm=80;
                }
                 System.out.println(((33.0/80.0)*(rpm)));
                speedo = (int) (speedo +  ((33.0/80.0)*(rpm)));
                 System.out.println(speedo);
                }
                /*if (speedo < (gear_pos * 33)) {

                    speedo = speedo + 5;

                    rpm = ((speedo - ((gear_pos - 1) * 33)) * (70 / 33));
                    if (rpm < 5) {
                        rpm = 5;
                    }

                }
                if (speedo > 99) {
                    speedo = 99;
                }*/

            } else {
                //int rr=(int)gui.getRadialSpeedometer().getValue();
                 
                
                    rpm=rpm-ac_value*10;
                    
                if(rpm<0){
                    rpm=0;
                }                
                 speedo=(int) (speedo-((33.0/80.0)*rpm));
                 if(speedo<0){
                     speedo=0;
                 }
                 if (speedo > 0 && speedo < 33) {
                    if (gear_pos == 2) {
                        gear_pos--;
                    }
                }
                if (speedo > 34 && speedo < 66) {
                    if (gear_pos == 3) {
                        gear_pos--;
                    }
                }
                if (gear_pos < 1) {
                    gear_pos = 1;
                }
                 
               /* speedo = speedo - 5;
                rpm = ((speedo - ((gear_pos - 1) * 33)) * (70 / 33));
                if (rpm < 5) {
                    rpm = 5;
                }

                if (speedo < 0) {
                    speedo = 0;
                }
                if (speedo > 0 && speedo < 33) {
                    if (gear_pos == 2) {
                        gear_pos--;
                    }
                }
                if (speedo > 34 && speedo < 66) {
                    if (gear_pos == 3) {
                        gear_pos--;
                    }
                }
                if (gear_pos < 1) {
                    gear_pos = 1;
                }
                if (speedo < 0) {
                    speedo = 0;
                }
*/
            }
            System.out.println(speedo);
            gui.getRadialSpeedometer().setValueAnimated(speedo);
            //  gui.getDisplayCrusingSpeed().setValueAnimated(rr);
            gui.getRadialRPM().setValueAnimated(rpm);
            gui.getDisplayRPM().setValueAnimated(rpm);
            gui.getDisplayGear().setValueAnimated(gear_pos);
            gui.GearState = gear_pos;
            gui.RPM = rpm;
            gui.speed = speedo;
            // return cruise_controll_values;
        }
    }

    public void drop_speed_automatic() {
        try {

            Config.sendEvent(new events.Gear_Reading(getGear_pos()));
            // Config.sendEvent(new SpeedOMeterReading(get_speedOmeter()));
            if (state_engine == true && current_speed > 0) {
                if (current_speed > 20 && current_speed <= 40) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);

                    if (current_speed == 36 && gear_pos > 1) {
                        //  gui.getDisplayGear().setValue(1);
                    }
                    // gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.01);
                } else if (current_speed > 40 && current_speed <= 60) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);

                    //  gui.getDisplayCrusingSpeed().setValueAnimated(current_speed - current_speed * 0.02);
                } else if (current_speed > 60 && current_speed <= 80) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    if (current_speed == 66 && gear_pos > 2) {
                        // gui.getDisplayGear().setValue(2);
                    }

                } else if (current_speed > 80 && current_speed <= 100) {
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
        if (cruise_state == true && gear_pos == 3 && current_speed != cruise_value) {
            cc.setState(CruiseControllerState.RESUME);
            cc.setInit_value(cruise_value);
            cc.setCruise_res_value(current_speed);
            //---
            cc.Res_Cruise_control(gui);

        } else if (cruise_state == true && gear_pos == 3 && current_speed == cruise_value) {
            cc.setState(CruiseControllerState.ACTIVATE);
            cc.setInit_value(cruise_value);
            cc.setCruise_res_value(current_speed);
            //--
            cc.Activate_Cruise_control(gui);
        } else {
            cc.setState(CruiseControllerState.DEACTIVATE);
            cc.setCruise_con_value(current_speed);
            //--
            cc.Deactivate_Cruise_control(gui);

        }

    }

    public boolean isMaintainance_state() {
        return maintainance_state;
    }

    public void setMaintainance_state(boolean maintainance_state) {
        this.maintainance_state = maintainance_state;
        change_stage++;
        gui.getMaintenance_done_button().setVisible(false);
        gui.getScreen().setText("<<NO Maintinance Needed>>");
    }

    public void set_cruise_readig_handle(int cruise_speed) {
        if (cruise_state == true && gear_pos == 3) {

            if (cruise_value != current_speed) {
                gui.getRadialSpeedometer().setValueAnimated(cruise_speed);
            }
            // cc.setPriority(7);

            gui.getDisplayCrusingSpeed().setValue(cruise_speed);

            this.current_speed = cruise_speed;

        } else {

            gui.getDisplayCrusingSpeed().setValue(0);
        }
    }

    public boolean isEngineOn() {
        return state_engine;
    }

    public void setEngineState(boolean state_engine) {
        if (fuel_reading > 0) {
            this.state_engine = state_engine;
            set_bulb_on();
        }
        if (state_engine == false) {
            gear_pos = 0;
        }

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
        return ((int) gui.getDriveshaft_display().getValue());
    }

    public void setDreive_shaft_rotation(float dreive_shaft_rotation) {

        gui.getDriveshaft_display().setValue(dreive_shaft_rotation);
        this.dreive_shaft_rotation = (int) dreive_shaft_rotation;

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
            if (current_speed > 0 && current_speed <= 100) {
                try {
                    int speed_time = Integer.valueOf(gui.getSpeed_time().getText());

                    float dss_gen = (float) ((current_speed * 0.05) * (5.0 / 6.0) * 60 * 0.7 * speed_time + random(1, 3));
                    return dss_gen;
                } catch (Exception e) {

                    float dss_gen = (float) ((current_speed * 0.05) * (5.0 / 6.0) * 60 *0.7 + random(1, 3));
                    return dss_gen;
                }

            }

        }

        return 0;
    }

    void set_distance_driven() {
        if (state_engine && current_speed > 0) {
            // distance += current_speed * time_counter_sec / 100;
            float temp = 0;

            distance += generates_drive_shaft() / 1000;
            setDreive_shaft_rotation(generates_drive_shaft());

            set_mentainace_notify((int) distance);
            float dradial = distance / 165; //13*(10+20) led light
            gui.getDigitalRadial1().setValue(dradial);

            gui.getDisplayMilesDriven().setValue(distance);
            time_counter_sec++;
        }
    }

    void set_average_speed() {
        float average_speedin = 0;
        if (trip_state == true) {
            time_counter_trip++;
            speed_counter_trip += current_speed;
            average_speedin = speed_counter_trip / time_counter_trip;
            gui.getDisplaytrip().setValueAnimated(average_speedin);

        }

    }

    void set_average_fuel_distance() {
        if (state_engine == true && fuel_reading > 0 && distance > 0 && rpm_total > 0 && time_counter_sec > 0) {

            gui.getDisplayAvgFuel().setValueAnimated(((rpm_total / time_counter_sec) / 10) + 2);
        }
    }

    void set_mentainace_notify(int drav) {
        int miles_done = 5000;

        if (drav > (5000 * change_stage) - 50 && drav <= 5000 * change_stage) {
            gui.getDisplayMaintenance().setValue(5000 * change_stage - drav);

            if (drav % 5 == 0) {
                if (change_stage == 1) {
                    gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 * change_stage - drav) + " miles");

                } else if (change_stage == 2) {
                    gui.getScreen().setText("There is required maintenance ->   air filter change : " + (5000 * change_stage - drav));

                } else if (change_stage == 3) {
                    gui.getScreen().setText("There is required maintenance ->   Major service change : " + (5000 * change_stage - drav));

                }
            }

        } else if (drav >= 5000 * change_stage - 250 && drav <= 5000 * change_stage) {
            gui.getDisplayMaintenance().setValue(5000 * change_stage - drav);

            if (drav % 15 == 0) {
                if (change_stage == 1) {
                    gui.getScreen().setText("There is required maintenance ->  oil and oil filter change after : " + (5000 * change_stage - drav) + " miles");

                } else if (change_stage == 2) {
                    gui.getScreen().setText("There is required maintenance ->   air filter change : " + (5000 * change_stage - drav));

                } else if (change_stage == 3) {
                    gui.getScreen().setText("There is required maintenance ->    Major service change : " + (5000 * change_stage - drav));

                }
            }
        } else {

            if (drav > 0 && drav < 5000 * change_stage) {
                gui.getDisplayMaintenance().setValue(5000 * change_stage - drav);
                if (gui.getDisplayMaintenance().getValue() == 2000) {
                    gui.getMaintenance_done_button().setVisible(true);

                }

            } else if (drav == 5000 * change_stage) {
                gui.getScreen().setText("");

            }
        }
    }

    public void decrease_fuel() {

        try {
            if (state_engine == true && current_speed > 0) {
                int x = ((int) gui.getDisplayAvgFuel().getValue() * 10);
                int distance_1 = (int) distance;
                int mod = ((distance_1) % x);

                if (mod == 0) {
                    gui.getRadialFuel().setValue(--fuel_reading);

                    distance = distance + 1;
                }
            }

        } catch (Exception e) {
        }

    }

    public void setFuel_reading(int fuel_reading) {
        if (fuel_reading == 0) {
            this.state_engine = false;

        } else {
            this.fuel_reading = fuel_reading;

        }

    }

    void mantain_butn_clear_display() {
        gui.getScreen().setText("");

    }

    public void set_message_display(String s) {
        // gui.get.setText(s);
    }

    public void setCruise_state(boolean cruise_state) {
        if (cruise_state == true && gear_pos == 3) {
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
        for (int i = 0; i < 3; i++) {
            gui.getTripbulb().setOn(trip_state);

        }
        time_counter_trip = 0;
        speed_counter_trip = 0;
        this.trip_state = trip_state;
    }

    public void setGear_pos(int gear_pos) {

        if (gear_pos == 1) {
            gui.getGear_label().setText("LOW_GEAR");
        } else if (gear_pos == 2) {
            gui.getGear_label().setText("MID_GEAR");

        } else if (gear_pos == 3) {
            gui.getGear_label().setText("TOP_GEAR");

        } else if (gear_pos == 0) {
            gui.getGear_label().setText("Clutch");

        }
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

    public void set_speedOmeter(int speed_in) {
        current_speed = speed_in;
        if (cruise_state == false) {
            drop_speed_automatic();
            System.out.println("drop down turend on ");
        }
        System.err.println("Curent Fuel : " + fuel_reading);
        System.err.println("engine state : " + state_engine);
        System.err.println("gear_pos : " + gear_pos);
        System.err.println("Curent speed : " + speed_in);
        System.err.println("cruise_state : " + cruise_state);
        System.err.println("cruise_value : " + cruise_value);
        System.err.println("drivesaft rot  : " + dreive_shaft_rotation);

    }

    void add_rpm_number() {
        rpm_total += gui.getDisplayRPM().getValue();

    }

    public void accelearate_cruise_value(int gl) {
        if (state_engine == true && cruise_state == true && gear_pos == 3) {
            if (gl <= 100) {
                this.cruise_value = gl;

            } else {

            }
        }

    }
}
