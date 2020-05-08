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
public class Monitor {
    private float avg_speed;
    private String maintenance;
    private float fuel_consumption;
    private int miles_driven;
    private Calibrator speed;
    private int trip;

    public Monitor() {
        this.avg_speed = 0f;
        this.maintenance = "";
        this.fuel_consumption = 0f;
        this.miles_driven = 0;
        this.trip = 0;
    }

    public float getAvg_speed() {
        return avg_speed;
    }

    public void setAvg_speed(float avg_speed) {
        this.avg_speed = avg_speed;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public float getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(float fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public int getMiles_driven() {
        return miles_driven;
    }

    public void setMiles_driven(int miles_driven) {
        this.miles_driven = miles_driven;
    }

    public Calibrator getSpeed() {
        return speed;
    }

    public void setSpeed(Calibrator speed) {
        this.speed = speed;
    }

    public int getTrip() {
        return trip;
    }

    public void setTrip(int trip) {
        this.trip = trip;
    }
    
    
}
