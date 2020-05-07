/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author samir  mohamed
 */
public class Fuel_Reading {

    private final int fuel_Read;
    
    public Fuel_Reading(int fuel_Read)
    {
        this.fuel_Read = fuel_Read;
    }

    public int getFuel_Read() {
        return fuel_Read;
    }


}
