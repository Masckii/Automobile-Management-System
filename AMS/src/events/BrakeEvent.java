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
    private float pressure;
    
    public BrakeEvent() {
        this.pressure = 1;
    }
    
    public void increasePressure() throws InterruptedException {
        this.pressure += (pressure/10);
        Thread.sleep(60);
    }
    
    public float getPressure() {
        return this.pressure;
    }
}
