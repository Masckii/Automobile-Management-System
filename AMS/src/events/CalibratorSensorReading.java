/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Lenovo
 */
public class CalibratorSensorReading {
    private float speed;
    
    public CalibratorSensorReading(float s){
    
    this.speed = s;
    }
    public float getSpeed(){
    
    return speed;
    }
    
}
