/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author sam
 */
public class Cruise_state_reading {

    private boolean  state_csr;

    public Cruise_state_reading(boolean state) {
        this.state_csr = state;
    }

    public boolean isState_csr() {
        return state_csr;
    }


}
