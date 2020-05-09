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
 * @author Group 7
 */
public class CruiseController extends Thread {

    private CruiseControllerState state;
    private CruiseControllerAcceleration acceleration;
    private model.AutoMobileManagmentSystem ams;
    private int cruise_con_value;
    private int cruise_res_value;

    private int init_value;
    boolean inside;

    public CruiseController(AutoMobileManagmentSystem ams) {
        state = CruiseControllerState.DEACTIVATE;
        acceleration = CruiseControllerAcceleration.STOP_ACCELERATE;
        this.ams = ams;
        inside = true;
        init_value = 0;
        cruise_res_value = 0;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void Activate_Cruise_control() {
        if (state == CruiseControllerState.ACTIVATE) {
            Config.sendEvent(new events.Cruise_con_Reading(init_value));

        }
    }

    public Void Deactivate_Cruise_control() {
        if (state == CruiseControllerState.DEACTIVATE) {
            Config.sendEvent(new events.Cruise_con_Reading(cruise_res_value));

        }
        return null;
    }

    public Void Res_Cruise_control() {
        if (state == CruiseControllerState.RESUME) {
            Config.sendEvent(new events.Cruise_con_Reading(cruise_res_value));

        }
        return null;
    }

    public void setState(CruiseControllerState state) {
        this.state = state;
    }

    public void setAcceleration(CruiseControllerAcceleration acceleration) {
        this.acceleration = acceleration;
    }

    public void setCruise_con_value(int cruise_con_value) {
        this.cruise_con_value = cruise_con_value;
    }

    public void setAms(AutoMobileManagmentSystem ams) {
        this.ams = ams;
    }

    public void setCruise_res_value(int cruise_res_value) {
        this.cruise_res_value = cruise_res_value;
    }

    public void setInit_value(int init_value) {
        this.init_value = init_value;
    }

    @Override
    public void run() {
        while (true) {
            ams.get_cruise_update();

            try {
                System.out.println("model.CruiseController.run()" + this.toString());
                this.sleep(900);
            } catch (InterruptedException ex) {
                Logger.getLogger(CruiseController.class.getName()).log(Level.SEVERE, null, ex);
            }
            //if active or deactive or resume
            Activate_Cruise_control();
            Deactivate_Cruise_control();
            Res_Cruise_control();
        }
    }

}
