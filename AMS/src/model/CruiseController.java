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

    private CruiseControllerState state;
    private CruiseControllerAcceleration acceleration;
    private view.View_AMS gui;
    private int cruise_con_value;
    
    
    
    
    public CruiseController(view.View_AMS gui) {
        state = CruiseControllerState.DEACTIVATE;
        acceleration = CruiseControllerAcceleration.STOP_ACCELERATE;
        this.gui = gui ;
    }

    
    
      
    @Override
    public void run() {
        while (true) {

            try {
                this.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(CruiseController.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Config.sendEvent(new CruiseController(temp));
        }
    }

}
