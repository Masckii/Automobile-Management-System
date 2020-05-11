/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import events.AccelerateEvent;
import events.Accelerate_cruise;
import events.CalibratorSensorReading;
import events.Cruise_con_Reading;
import events.Fuel_Reading;
import events.SpeedOMeterReading;
import events.TransmissionGearEvent;
import events.TripEvent;
import events.BrakeEvent;
import events.Calibirator_state_reading;
import events.Cruise_state_reading;
import events.Drive_shaft_reading;
import events.Mintainace_done;
import events.PerformEvent;
import events.RpmEvent;

// Add all events classes

/**
 *
 * @author Omar
 */
public class Config {

    private static final EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();

    public static void registerEvents() {
        engine.getEPAdministrator().getConfiguration().addEventType(CalibratorSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Cruise_state_reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(events.EngineEvent.class);
        engine.getEPAdministrator().getConfiguration().addEventType(events.Gear_Reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Cruise_con_Reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(events.Fuel_Reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Fuel_Reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(SpeedOMeterReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(TransmissionGearEvent.class);
        engine.getEPAdministrator().getConfiguration().addEventType(TripEvent.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Calibirator_state_reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Drive_shaft_reading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(BrakeEvent.class);
        engine.getEPAdministrator().getConfiguration().addEventType(AccelerateEvent.class);//Accelerate_cruise
        engine.getEPAdministrator().getConfiguration().addEventType(Mintainace_done.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Accelerate_cruise.class);
       
        engine.getEPAdministrator().getConfiguration().addEventType(RpmEvent.class);
         engine.getEPAdministrator().getConfiguration().addEventType(PerformEvent.class);
        System.out.println("Events Successfully Registered.");
    }

    public static EPStatement createStatement(String s) {
        EPStatement result = engine.getEPAdministrator().createEPL(s);
        System.out.println("EPL Statement Successfully Created.");
        return result;
    }

    public static void sendEvent(Object o) {
        engine.getEPRuntime().sendEvent(o);
    }
}
