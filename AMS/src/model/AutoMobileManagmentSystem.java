/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Omar Shan
 */
public class AutoMobileManagmentSystem {
    private CruiseController cc;
    private Monitor monitor;
    private DriveShaftSensor dss;

    public AutoMobileManagmentSystem() {
        this.cc = new CruiseController();
        this.monitor = new Monitor();
        this.dss = new DriveShaftSensor();
    }
    
    
}
