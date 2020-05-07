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
public class Calibrator {
    private float speed;
    private float distance;
    private DriveShaftSensor dss;

    public Calibrator() {
        this.speed = 0f;
        this.distance = 0f;
        this.dss = new DriveShaftSensor();
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public DriveShaftSensor getDss() {
        return dss;
    }

    public void setDss(DriveShaftSensor dss) {
        this.dss = dss;
    }
    
    
}
