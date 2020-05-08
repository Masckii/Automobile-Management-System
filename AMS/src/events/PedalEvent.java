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
public class PedalEvent {
    private float pressure;
    private boolean isReleased;

    public PedalEvent() {
        this.pressure = 1;
        isReleased = true;
    }
    
    public void increaseSpeed() throws InterruptedException {
        this.isReleased = false;
        while (pressure <= 100.0) {
            Thread.sleep(50);
            this.pressure += (pressure / 10.0);
        }
    }
    
    public void releasePedal() {
        this.isReleased = true;
    }
}
