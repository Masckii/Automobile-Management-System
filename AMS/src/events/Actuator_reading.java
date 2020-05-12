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
public class Actuator_reading {
    int state ;

    public Actuator_reading(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
    
}
