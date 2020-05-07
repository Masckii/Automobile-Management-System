/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import model.TransmissionState;

/**
 *
 * @author Omar
 */
public class TransmissionGearEvent {
    private TransmissionState state;
    
    public void setState(TransmissionState s) {
        this.state = s;
    }
    
    public TransmissionState getState() {
        return this.state;
    }
}
