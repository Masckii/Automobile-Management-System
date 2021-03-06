/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import model.AutoMobileManagmentSystem;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Group 7
 */
public class Main {

    /**
     */
    //private Calibrator cal;
    public static AutoMobileManagmentSystem ams = new AutoMobileManagmentSystem();

    public static void main(String[] args) {
        // Create Ams

        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);
        // Register events
        Config.registerEvents();

        Config.createStatement("select speed from SpeedOMeterReading")
                .setSubscriber(new Object() {
                    public void update(int state) throws InterruptedException {
                        ams.set_speedOmeter(state);
                    }
                });

        System.out.println("esper.Main.main()");
        Config.createStatement("select state from EngineEvent")
                .setSubscriber(new Object() {
                    public void update(boolean state) throws InterruptedException {
                        ams.setEngineState(state);
                    }
                });

        Config.createStatement("select state_csr from Cruise_state_reading")
                .setSubscriber(new Object() {
                    public void update(boolean state) throws InterruptedException {
                        ams.setCruise_state(state);
                    }
                });

        Config.createStatement("select dsr from Drive_shaft_reading")
                .setSubscriber(new Object() {
                    public void update(int fl) throws InterruptedException {
                        ams.setDreive_shaft_rotation(fl);

                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select fuel_Read from Fuel_Reading")
                .setSubscriber(new Object() {
                    public void update(int fl) throws InterruptedException {
                        ams.setFuel_reading(fl);
                        //  System.err.println("in fuel");
                    }
                });

        Config.createStatement("select gear_position from Gear_Reading")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.setGear_pos(gl);
                        //  System.err.println("in fuel");
                    }
                });

        Config.createStatement("select state from TripEvent")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {
                        ams.setTrip_state(gl);
                        //  System.err.println("in fuel");
                    }
                });

        Config.createStatement("select value from Cruise_con_Reading")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.set_cruise_readig_handle(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select state from BrakeEvent")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {
                        ams.setAccelerate(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select state from AccelerateEvent")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {
                        ams.setAccelerate(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select speed from SpeedOMeterReading")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {//
                        ams.set_speedOmeter(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select gear_position from Gear_Reading")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.setGear_pos(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select cruise_value from Accelerate_cruise")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.accelearate_cruise_value(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select rpm from RpmEvent")
                .setSubscriber(new Object() {
                    public void update(double gl) throws InterruptedException {
                        ams.setRpm(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select state from PerformEvent")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {
                        ams.Calibirator(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select state from Maintenace_done")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {//Actuator_reading
                        ams.setMaintainance_state(gl);
                        //  System.err.println("in fuel");
                    }
                });
        Config.createStatement("select value from set_Fuel")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.setFuel_value(gl);
                        //  System.err.println("in fuel");
                    }
                });

        Config.createStatement("select state from Actuator_reading")
                .setSubscriber(new Object() {
                    public void update(int gl) throws InterruptedException {
                        ams.setactoutor_state(gl);
                        //  System.err.println("in fuel");
                    }
                });
//        //PedalEvent
//        Config.createStatement("select speed from PedalEvent")
//                .setSubscriber(new Object() {
//                    public void update(int temp) throws InterruptedException {
//                        //  ams.tempSignal(temp); expected feed back to be writen 
//                    }
//                });
//        //SpeedOMeterReading
//        Config.createStatement("select Speed from SpeedOMeterReading")
//                .setSubscriber(new Object() {
//                    public void update(int temp) throws InterruptedException {
//                        //  ams.tempSignal(temp); expected feed back to be writen 
//                    }
//                });
    }
}
