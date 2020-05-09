/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Config;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group 7
 */
public class CruiseController extends Thread {

    private static CruiseControllerState state;
    private static CruiseControllerAcceleration acceleration;
    private model.AutoMobileManagmentSystem ams;
    private static int cruise_con_value;

    public CruiseController(AutoMobileManagmentSystem ams) {
        state = CruiseControllerState.DEACTIVATE;
        acceleration = CruiseControllerAcceleration.STOP_ACCELERATE;
        this.ams = ams;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Void Activate_Cruise_control() {

    

        return null;
    }

    public Void Deactivate_Cruise_control() {



        return null;
    }

    public Void Res_Cruise_control() {

        return null;
    }

    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("model.CruiseController.run()"+this.toString());
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CruiseController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
