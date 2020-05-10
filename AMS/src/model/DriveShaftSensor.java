/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import events.SpeedOMeterReading;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Shan
 */
public class DriveShaftSensor extends Thread {

    private int pulse;
    private int revolution;
    private int RPM;
    AutoMobileManagmentSystem ams;

    public DriveShaftSensor(AutoMobileManagmentSystem ams) {
        this.pulse = 0;
        this.revolution = 0;
        this.RPM = 0;
        this.ams = ams ;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getRevolution() {
        return revolution;
    }

    public void setRevolution(int revolution) {
        this.revolution = revolution;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }

    @Override
    public void run() {
        while (true) {

            try {
                this.sleep(1000);
                //ams.drop_speed_automatic();
            } catch (InterruptedException ex) {
                Logger.getLogger(Calibrator.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println("speed : "+ams.get_speedOmeter());
            Config.sendEvent(new events.Drive_shaft_reading (ams.getDreive_shaft_rotation()));
        }
    }

}
