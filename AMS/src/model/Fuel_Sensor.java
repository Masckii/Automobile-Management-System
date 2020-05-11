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
    public class Fuel_Sensor extends Thread{

    
    model.AutoMobileManagmentSystem ams ;
    public Fuel_Sensor(model.AutoMobileManagmentSystem ams) {
        this.ams = ams ;
        
    }



   public void run() {
        while (true) {
           

            try {
                this.sleep(250);
            } catch (InterruptedException ex) {
                
               Logger.getLogger(model.Calibrator.class.getName()).log(Level.SEVERE, null, ex);
            }
                ams.set_average_fuel_distance();
              //System.out.println("speed : "+ams.get_speedOmeter());
                Config.sendEvent(new events.Fuel_Reading( ams.get_fuel_reaging()));
        }
    }

}

