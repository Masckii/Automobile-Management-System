/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sam
 */
public class Timer extends Thread{
    
            
    model.AutoMobileManagmentSystem ams ;
    public Timer(model.AutoMobileManagmentSystem ams) {
        this.ams = ams ;
        
    }

    @Override
   public void run() {
        while (true) {
           

            try {
                Gear_sensor.sleep(1000);
            } catch (InterruptedException ex) {
                
               Logger.getLogger(model.Calibrator.class.getName()).log(Level.SEVERE, null, ex);
            }
            ams.set_average_speed();
            ams.set_distance_driven();
              //System.out.println("speed : "+ams.get_speedOmeter());
                //Config.sendEvent(new events.Gear_Reading( ams.getGear_pos()));
        }
    }
    
}
