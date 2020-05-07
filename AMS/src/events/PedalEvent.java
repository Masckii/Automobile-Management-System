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
    private float speed;
    private boolean isReleased;

    public PedalEvent() {
        this.speed = 1;
        isReleased = true;
    }
    
    public void increaseSpeed() throws InterruptedException {
        this.isReleased = false;
        while (speed <= 100.0) {
            Thread.sleep(50);
            speed += (speed / 10.0);
            System.out.println(speed);
        }
    }
    
    public void releasePedal() {
        this.isReleased = true;
    }
}
