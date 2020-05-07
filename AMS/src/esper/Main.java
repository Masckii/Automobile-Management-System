/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;
import model.AutoMobileManagmentSystem;
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
    
      final  model.AutoMobileManagmentSystem ams = new AutoMobileManagmentSystem();
    public static void main(String[] args) {
        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);         
        // Register events
        Config.registerEvents();
        
         // Create Kettle
      

        Config.createStatement("select value from Cruise_con_Reading")
                .setSubscriber(new Object() {
                    public void update(int temp) throws InterruptedException {
                      //  ams.tempSignal(temp); expected feed back to be writen 
                    }
                });

        
        
    }
}