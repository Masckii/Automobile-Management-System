/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.View_AMS;

/**
 *
 * @author Omar Shan
 */
public class AutoMobileManagmentSystem {



    //--engine
    private boolean state_engine = false;

    //-- compunents of our RMS 
    private CruiseController cc;
    private Monitor monitor;
    private DriveShaftSensor dss;
    private Model.Fuel_Sensor fuel_sensor;
    private Model.Led_light led_light;
    
    
    //gui
    private view.View_AMS gui;
    //-
    
    
    public AutoMobileManagmentSystem() {
        this.cc = new CruiseController();
        this.monitor = new Monitor();
        this.dss = new DriveShaftSensor();
        gui = new View_AMS();

    }

}
