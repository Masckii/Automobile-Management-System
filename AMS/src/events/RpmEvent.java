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
public class RpmEvent {
    private double rpm;

    public RpmEvent(double rpm) {
        this.rpm = rpm;
    }

    public double getRpm() {
        return rpm;
    }
    
}
