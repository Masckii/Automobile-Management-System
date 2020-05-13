/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author anas
 */
public class EngineEvent {

    private boolean state;

    public EngineEvent(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

}
