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
    private float fuel_reading;
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
    private static float volt = 1;
    private static float temp_volt = 1;
    private static int actoutor_state = 1;
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
        if (rpm == 0) {
            gui.getRadialRPM().setValue(rpm);
            gui.getDisplayRPM().setValue(rpm);
        }
    }

    public boolean isAccelerate() {
        return accelerate;
    }

    public void setAccelerate(boolean accelerate) {
        this.accelerate = accelerate;
    }

    public void setFuel_value(int f) {
        gui.getRadialFuel().setValueAnimated(f);
        this.fuel_reading = f;
    }

    public void PerformAcceleration(boolean state) {

        if (state == true && state_engine == true) {
            //Config.sendEvent(new events.Gear_Reading(getGear_pos()));

            int speedo = (int) gui.getRadialSpeedometer().getValue();
            double u = 0, p = 0;
            int g;
            if (accelerate == true) {
                // int rr=(int)gui.getRadialSpeedometer().getValue();
                /* g = (gear_pos - 1) * 33;

                rpm = rpm + ac_value * 10;
                p = ac_value * 10;
                if (rpm >= 80) {
                    u = rpm - ac_value * 10;
                    System.out.println(u);
                    p = 80 - u;
                    System.out.println(p);
                    rpm = 80;
                }
                System.out.println((p));
                System.out.println(((33.0 / 80.0) * (p)));
                speedo = (int) (speedo + ((33.0 / 80.0) * (p)));
                if (gear_pos * 33 - speedo > 33) {
                    rpm = 0;
                }
                if (gear_pos == 1) {
                    if (speedo > 33) {
                        speedo = 33;
                    }
                }
                if (gear_pos == 2) {
                    if (speedo > 66) {
                        speedo = 66;
                    }
                }
                if (gear_pos == 3) {
                    if (speedo > 99) {
                        speedo = 99;
                    }
                }
                //speedo=speedo+g;
                System.out.println(speedo);*/

                if (speedo < (gear_pos * 33)) {

                    speedo = speedo + 5;

                    rpm = ((speedo - ((gear_pos - 1) * 33)) * (70 / 33));
                    if (rpm < 5) {
                        rpm = 5;
                    }

                }
                if (speedo > 99) {
                    speedo = 99;
                }
            } else {
                //int rr=(int)gui.getRadialSpeedometer().getValue();

                /* rpm = rpm - ac_value * 10;
                p = ac_value * 10;
                if (rpm < 0) {
                    rpm = 0;
                }
                speedo = (int) (speedo - ((33.0 / 80.0) * p));
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
                }*/
                speedo = speedo - 5;
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
            volt = (float) (rpm / 10);

            gui.getVolt_dislpay_actual().setValue(volt);
            gui.getVolt_dislpay().setValueAnimated(volt - temp_volt);
            if (volt - temp_volt > 0) {
                gui.getVolt_dislpay().setUnitString(" + Vlt");

            } else {
                gui.getVolt_dislpay().setUnitString("  - Vlt");

            }
            temp_volt = (float) (rpm / 10);
            // return cruise_controll_values;
        }
    }

    void decreas_rpm_value() {
        if (rpm > 0) {
            rpm = rpm - 1;
            gui.getRadialRPM().setValueAnimated(rpm);
            if (gui.getVolt_dislpay_actual().getValue() < 1) {
                gui.getVolt_dislpay_actual().setValueAnimated(0);

            } else {
                if (rpm < 11) {
                    gui.getRadialRPM().setValueAnimated(10);
                    gui.getDisplayRPM().setValueAnimated(10);
                } else {
                    gui.getVolt_dislpay_actual().setValueAnimated(Math.abs(rpm / 10));
                    gui.getDisplayRPM().setValueAnimated(rpm);

                }

            }
            gui.getVolt_dislpay().setValueAnimated(0);
        }
    }

    public void drop_speed_automatic() {
        try {

            Config.sendEvent(new events.Gear_Reading(getGear_pos()));
            // Config.sendEvent(new SpeedOMeterReading(get_speedOmeter()));
            if (state_engine == true && current_speed > 0) {
                if (current_speed > 20 && current_speed <= 40) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);

                    decreas_rpm_value();

                    if (current_speed == 36 && gear_pos > 1) {
                        gui.getDisplayGear().setValue(1);
                    }
                } else if (current_speed > 40 && current_speed <= 60) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    decreas_rpm_value();
                } else if (current_speed > 60 && current_speed <= 80) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    decreas_rpm_value();

                    if (current_speed == 66 && gear_pos > 2) {
                        gui.getDisplayGear().setValue(2);
                    }

                } else if (current_speed > 80 && current_speed <= 100) {
                    gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.01);
                    decreas_rpm_value();

                }
            } else {
                gui.getRadialSpeedometer().setValueAnimated(current_speed - current_speed * 0.02);
                decreas_rpm_value();

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

    public boolean isCruise_state() {
        return cruise_state;
    }

    public static int getAc_value() {
        return ac_value;
    }

    public double getRpm() {
        return rpm;
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

    void set_distance_driven() {
        if (state_engine && current_speed > 0) {
            // distance += current_speed * time_counter_sec / 100;
            float temp = 0;

            distance += dss.generates_drive_shaft(current_speed, state_engine) / 1000;
            setDreive_shaft_rotation(dss.generates_drive_shaft(current_speed, state_engine));

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
            if (state_engine == true && current_speed > 0 && distance > 50) {

                int x = (1000 - (int) gui.getDisplayAvgFuel().getValue() * 100);
                int distance_1 = (int) distance;
                System.out.println(distance_1 + "model.AutoMobileManagmentSystem.decrease_fuel() " + x);
                int mod = ((distance_1) % x);

                if (mod == 0) {
                    gui.getRadialFuel().setValue(fuel_reading - 1);

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

        gui.getTripbulb().setOn(trip_state);

        time_counter_trip = 0;
        speed_counter_trip = 0;
        this.trip_state = trip_state;
    }

    public void setGear_pos(int gear_pos) {

        if (gear_pos == 1) {
            gui.getGear_label().setText("LOW_GEAR");
        } else if (gear_pos == 2) {
            gui.GearState = gear_pos;
            gui.getDisplayGear().setValue(gear_pos);
            gui.getGear_label().setText("MID_GEAR");

        } else if (gear_pos == 3) {
            gui.getGear_label().setText("TOP_GEAR");
            gui.GearState = gear_pos;
            gui.getDisplayGear().setValue(gear_pos);

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

    public boolean isState_engine() {
        return state_engine;
    }

    public void setState_engine(boolean state_engine) {
        this.state_engine = state_engine;
    }

    public int getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(int current_speed) {
        this.current_speed = current_speed;
    }

    public float getFuel_reading() {
        return fuel_reading;
    }

    public void setFuel_reading(float fuel_reading) {
        this.fuel_reading = fuel_reading;
    }

    public static int getTime_counter_sec() {
        return time_counter_sec;
    }

    public static void setTime_counter_sec(int time_counter_sec) {
        AutoMobileManagmentSystem.time_counter_sec = time_counter_sec;
    }

    public static int getTime_counter_trip() {
        return time_counter_trip;
    }

    public static void setTime_counter_trip(int time_counter_trip) {
        AutoMobileManagmentSystem.time_counter_trip = time_counter_trip;
    }

    public static int getSpeed_counter_trip() {
        return speed_counter_trip;
    }

    public static void setSpeed_counter_trip(int speed_counter_trip) {
        AutoMobileManagmentSystem.speed_counter_trip = speed_counter_trip;
    }

    public static int getAverage_speed() {
        return average_speed;
    }

    public static void setAverage_speed(int average_speed) {
        AutoMobileManagmentSystem.average_speed = average_speed;
    }

    public static int getRpm_total() {
        return rpm_total;
    }

    public static void setRpm_total(int rpm_total) {
        AutoMobileManagmentSystem.rpm_total = rpm_total;
    }

    public static float getDistance() {
        return distance;
    }

    public static void setDistance(float distance) {
        AutoMobileManagmentSystem.distance = distance;
    }

    public static int getCruise_value() {
        return cruise_value;
    }

    public static void setCruise_value(int cruise_value) {
        AutoMobileManagmentSystem.cruise_value = cruise_value;
    }

    public static int getChange_stage() {
        return change_stage;
    }

    public static void setChange_stage(int change_stage) {
        AutoMobileManagmentSystem.change_stage = change_stage;
    }

    public CruiseController getCc() {
        return cc;
    }

    public void setCc(CruiseController cc) {
        this.cc = cc;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public DriveShaftSensor getDss() {
        return dss;
    }

    public void setDss(DriveShaftSensor dss) {
        this.dss = dss;
    }

    public Gear_sensor getGrs() {
        return grs;
    }

    public void setGrs(Gear_sensor grs) {
        this.grs = grs;
    }

    public Calibrator getCal() {
        return cal;
    }

    public void setCal(Calibrator cal) {
        this.cal = cal;
    }

    public Fuel_Sensor getFs() {
        return fs;
    }

    public void setFs(Fuel_Sensor fs) {
        this.fs = fs;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public ServiceCompletion getSer_com() {
        return ser_com;
    }

    public void setSer_com(ServiceCompletion ser_com) {
        this.ser_com = ser_com;
    }

    public SystemStateTracer getSst() {
        return sst;
    }

    public void setSst(SystemStateTracer sst) {
        this.sst = sst;
    }

    public View_AMS getGui() {
        return gui;
    }

    public void setGui(View_AMS gui) {
        this.gui = gui;
    }

    public double[] getCruise_controll_values() {
        return cruise_controll_values;
    }

    public void setCruise_controll_values(double[] cruise_controll_values) {
        this.cruise_controll_values = cruise_controll_values;
    }
    public void auto_increass_speed()
    {
        
    }
    

    public void setactoutor_state(int state) {
        if (state_engine == true) {
            actoutor_state = state;
            if (state == 2 || state == 3) {
                gui.getActo_bulb().setOn(true);
                gui.getActuator_label().setText("Actuator ON");
            } else {
                gui.getActo_bulb().setOn(false);
                gui.getActuator_label().setText("Actuator OFF");

            }
        }

    }

}
