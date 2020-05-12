/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import events.SpeedOMeterReading;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author group  7
 */
public class DriveShaftSensor extends Thread {

    private int pulse;
    private int revolution;
    private int RPM;
    AutoMobileManagmentSystem ams;

    
        private int random(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    
    float generates_drive_shaft(int current_speed ,boolean state_en) {
        if (state_en == true) {
            if (current_speed > 0 && current_speed <= 100) {
                try {
                    int speed_time = Integer.valueOf(ams.getGui().getSpeed_time().getText());
                    if (current_speed != 0) {
                        float dss_gen = (float) ((current_speed * 0.05) * (5.0 / 6.0) * 60 * 0.7 * speed_time + random(1, 3));
                        return dss_gen;

                    } else {
                        return 0;

                    }
                } catch (Exception e) {

                    float dss_gen = (float) ((current_speed * 0.05) * (5.0 / 6.0) * 60 * 0.7 + random(1, 3));
                    return dss_gen;
                }

            }

        }

        return 0;
    }

    public DriveShaftSensor(AutoMobileManagmentSystem ams) {
        this.pulse = 0;
        this.revolution = 0;
        this.RPM = 0;
        this.ams = ams;
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
            Config.sendEvent(new events.Drive_shaft_reading(ams.getDreive_shaft_rotation()));
        }
    }

}
