/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author samir mohamed
 */
public class SpeedOMeterReading {
    
    private final int Speed;
    
    public SpeedOMeterReading(int Speed)
    {
        this.Speed = Speed;
    }

    public int getSpeed() {
        return Speed;
    }
    

    
}
