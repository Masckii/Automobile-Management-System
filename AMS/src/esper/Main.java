/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import model.AutoMobileManagmentSystem;
import model.Calibrator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Shan
 */
public class Main {

    /**
     * @param args the command line arguments
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
        Config.createStatement("select calibirator_state from Calibirator_state_reading")
                .setSubscriber(new Object() {
                    public void update(boolean gl) throws InterruptedException {
                        ams.setClabirator_state(gl);
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
