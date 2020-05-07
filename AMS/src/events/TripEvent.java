/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Samir
 */
public class TripEvent {
    
    private boolean state;
    
    public TripEvent(boolean state)
    {
        this.state = state;
    }
    
    public boolean getState() {
        return state;
    }
    
}
