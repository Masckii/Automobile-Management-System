/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author sam
 */
public class Gear_Reading {
    
    
    private final int gear_position;
    
    public Gear_Reading(int gp)
    {
        this.gear_position = gp;
    }

    public int getGear_position() {
        return gear_position;
    }


    
}
