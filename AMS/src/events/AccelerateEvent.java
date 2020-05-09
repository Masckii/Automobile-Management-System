/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package events;

/**
 *
 * @author moamen
 */
public class AccelerateEvent {
    private boolean state;

    public boolean isState() {
        return state;
    }

   

    public AccelerateEvent(boolean state) {
        this.state = state;
    }

    
}
