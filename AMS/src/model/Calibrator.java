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
public class Calibrator extends Thread {

    private int speed;
    private float distance;
    private DriveShaftSensor dss;
    AutoMobileManagmentSystem ams;

    public Calibrator(AutoMobileManagmentSystem ams) {
        this.speed = 0;
        this.distance = 0f;
        this.ams = ams;
    }

    @Override
    public void run() {
        while (true) {
           

            try {
                this.sleep(1000000);
                ams.drop_speed_automatic();
            } catch (InterruptedException ex) {
               Logger.getLogger(Calibrator.class.getName()).log(Level.SEVERE, null, ex);
            }
              //System.out.println("speed : "+ams.get_speedOmeter());
                Config.sendEvent(new SpeedOMeterReading(ams.get_speedOmeter()));
        }
    }

}
