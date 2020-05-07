/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Omar Shan
 */
public class CruiseController {
    private CruiseControllerState state;
    private CruiseControllerAcceleration acceleration;

    public CruiseController() {
        state = CruiseControllerState.DEACTIVATE;
        acceleration = CruiseControllerAcceleration.START_ACCELERATE;
    }

    public CruiseControllerState getState() {
        return state;
    }

    public void setState(CruiseControllerState state) {
        this.state = state;
    }

    public CruiseControllerAcceleration getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(CruiseControllerAcceleration acceleration) {
        this.acceleration = acceleration;
    }
    
    
}
