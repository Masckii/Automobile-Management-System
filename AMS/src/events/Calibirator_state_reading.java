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
public class Calibirator_state_reading {
    
    
       private final boolean  calibirator_state;

    public Calibirator_state_reading(boolean Calibirator_state) {
        this.calibirator_state = Calibirator_state;
    }

    public boolean isCalibirator_state() {
        return calibirator_state;
    }


    
}
