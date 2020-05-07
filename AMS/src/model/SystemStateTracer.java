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
public class SystemStateTracer {
    private TransmissionState transmission_state;
    private EngineState engine_state;
    private int throttle_lvl;
    private boolean air_filter_flag;
    private int air_filter_counter;
    private boolean oil_filter_flag;
    private int oil_filter_counter;
    private ServiceCompletion is_maintained;
    private int fuel;
    private Calibration cbl;

    public SystemStateTracer() {
        this.transmission_state = TransmissionState.LOW_GEAR;
        this.engine_state = EngineState.IDLE;
        this.throttle_lvl = 0;
        this.air_filter_flag = false;
        this.air_filter_counter = 0;
        this.oil_filter_flag = false;
        this.oil_filter_counter = 0;
        this.is_maintained = ServiceCompletion.SERVICE_COMPLETED;
        this.fuel = 0;
        this.cbl = Calibration.STOP_CALIBRATE;
    }

    public TransmissionState getTransmission_state() {
        return transmission_state;
    }

    public void setTransmission_state(TransmissionState transmission_state) {
        this.transmission_state = transmission_state;
    }

    public EngineState getEngine_state() {
        return engine_state;
    }

    public void setEngine_state(EngineState engine_state) {
        this.engine_state = engine_state;
    }

    public int getThrottle_lvl() {
        return throttle_lvl;
    }

    public void setThrottle_lvl(int throttle_lvl) {
        this.throttle_lvl = throttle_lvl;
    }

    public boolean isAir_filter_flag() {
        return air_filter_flag;
    }

    public void setAir_filter_flag(boolean air_filter_flag) {
        this.air_filter_flag = air_filter_flag;
    }

    public int getAir_filter_counter() {
        return air_filter_counter;
    }

    public void setAir_filter_counter(int air_filter_counter) {
        this.air_filter_counter = air_filter_counter;
    }

    public boolean isOil_filter_flag() {
        return oil_filter_flag;
    }

    public void setOil_filter_flag(boolean oil_filter_flag) {
        this.oil_filter_flag = oil_filter_flag;
    }

    public int getOil_filter_counter() {
        return oil_filter_counter;
    }

    public void setOil_filter_counter(int oil_filter_counter) {
        this.oil_filter_counter = oil_filter_counter;
    }

    public ServiceCompletion getIs_maintained() {
        return is_maintained;
    }

    public void setIs_maintained(ServiceCompletion is_maintained) {
        this.is_maintained = is_maintained;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Calibration getCbl() {
        return cbl;
    }

    public void setCbl(Calibration cbl) {
        this.cbl = cbl;
    }
    
    
    
    
}
