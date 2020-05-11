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
public class Accelerate_cruise {
    int cruise_value;

    public Accelerate_cruise(int cruise_value) {
        this.cruise_value = cruise_value;
    }

    public int getCruise_value() {
        return cruise_value;
    }
    
}
