/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Omar
 */
public class BrakeEvent {
    private boolean state;
    
    

    public void BrakeEvent(boolean state) {
        this.state = state;
    }

    public BrakeEvent(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    
    
    
}
