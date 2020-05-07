/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author samir mohamed
 */
public class Led_light {

    private boolean state;
    private AutoMobileManagmentSystem AMS_class;

    public Led_light(AutoMobileManagmentSystem AMS_class) {
        this.state = false;
        this.AMS_class = AMS_class;
    }

    public void setState(boolean state) {
        this.state = state;
        if (state) {
            AMS_class.getGUI().getLedStatusTxt().setText("ON");
        } else {
            AMS_class.getGUI().getLedStatusTxt().setText("OFF");
        }

    }

}
