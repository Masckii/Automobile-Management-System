/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Youssef Negm
 */
public class Fuel_Sensor {

    public void beep(int fuel_value) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (fuel_value < 20)//
                {
                    System.out.println("Beep!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Fuel_Sensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

}
