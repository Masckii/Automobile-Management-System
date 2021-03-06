/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import esper.Config;
import eu.hansolo.lightbulb.LightBulb;
import eu.hansolo.steelseries.gauges.Clock;
import eu.hansolo.steelseries.gauges.DigitalRadial;
import eu.hansolo.steelseries.gauges.DisplayCircular;
import eu.hansolo.steelseries.gauges.DisplaySingle;
import eu.hansolo.steelseries.gauges.Radial1Lcd;
import eu.hansolo.steelseries.gauges.Radial2Lcd;
import eu.hansolo.steelseries.gauges.Radial4;
import events.AccelerateEvent;
import events.BrakeEvent;
import events.Cruise_state_reading;
import events.EngineEvent;
import events.Gear_Reading;
import events.PerformEvent;
import events.RpmEvent;
import events.SpeedOMeterReading;
import events.set_Fuel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import model.AutoMobileManagmentSystem;

/**
 *
 * @author sam
 */
public class View_AMS extends javax.swing.JFrame {

    /**
     * Creates new form View_AMS
     */
    public static int speed = 0;
    public static double RPM = 0.0;
    public static int GearState = 1;
    public static int pre_GearState = 1;
    public static boolean enginestate = false;

    public View_AMS() {
        initComponents();

    }

    public DisplayCircular getDriveshaft_display() {
        return driveshaft_display;
    }

    public JLabel getCruise_label() {
        return cruise_label;
    }

    public void setDriveshaft_display(DisplayCircular driveshaft_display) {
        this.driveshaft_display = driveshaft_display;
    }

    public JButton getButonStopTrip() {
        return butonStopTrip;
    }

    public JToggleButton getButtonAccelerate() {
        return buttonAccelerate;
    }

    public JButton getButtonBrake() {
        return buttonBrake;
    }

    public JButton getButtonFirstGear() {
        return buttonFirstGear;
    }

    public JButton getButtonSecondGear() {
        return buttonSecondGear;
    }

    public JButton getButtonSetFuel() {
        return buttonSetFuel;
    }

    public JToggleButton getButtonStartCruise() {
        return buttonStartCruise;
    }

    public JTextArea getScreen() {
        return screen;
    }

    public JButton getButtonStartEngine() {
        return buttonStartEngine;
    }

    public JButton getButtonStartTrip() {
        return buttonStartTrip;
    }

    public JButton getButtonStopCruise() {
        return buttonStopCruise;
    }

    public JButton getButtonStopEngine() {
        return buttonStopEngine;
    }

    public JButton getButtonThirdGear() {
        return buttonThirdGear;
    }

    public Clock getClock1() {
        return clock1;
    }

    public DigitalRadial getDigitalRadial1() {
        return digitalRadial1;
    }

    public DisplaySingle getDisplayAvgFuel() {
        return displayAvgFuel;
    }

    public DisplaySingle getDisplayCrusingSpeed() {
        return displayCrusingSpeed;
    }

    public DisplaySingle getDisplayGear() {
        return displayGear;
    }

    public DisplaySingle getDisplayMaintenance() {
        return displayMaintenance;
    }

    public DisplaySingle getDisplayMilesDriven() {
        return displayMilesDriven;
    }

    public DisplaySingle getDisplayRPM() {
        return displayRPM;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return screen;
    }

    public LightBulb getLightBulb1() {
        return lightBulb1;
    }

    public Radial1Lcd getRadialFuel() {
        return radialFuel;
    }

    public Radial4 getRadialRPM() {
        return radialRPM;
    }

    public Radial2Lcd getRadialSpeedometer() {
        return radialSpeedometer;
    }

    public JLabel getActuator_label() {
        return actuator_label;
    }

    public DisplaySingle getThrotel_display() {
        return Throtel_display;
    }

    public LightBulb getActo_bulb() {
        return acto_bulb;
    }

    public void setActo_bulb(LightBulb acto_bulb) {
        this.acto_bulb = acto_bulb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linear1 = new org.pushingpixels.trident.ease.Linear();
        clock1 = new eu.hansolo.steelseries.gauges.Clock();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buttonStartCruise = new javax.swing.JToggleButton();
        buttonStopCruise = new javax.swing.JButton();
        lightBulb1 = new eu.hansolo.lightbulb.LightBulb();
        buttonStartEngine = new javax.swing.JButton();
        buttonStopEngine = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        buttonSetFuel = new javax.swing.JButton();
        buttonAccelerate = new javax.swing.JToggleButton();
        buttonBrake = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonFirstGear = new javax.swing.JButton();
        buttonSecondGear = new javax.swing.JButton();
        buttonThirdGear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lightBulb3 = new eu.hansolo.lightbulb.LightBulb();
        crusing_lightBulb1 = new eu.hansolo.lightbulb.LightBulb();
        Maintenance_done_button = new javax.swing.JButton();
        cruise_label = new javax.swing.JLabel();
        Increase_cruise = new javax.swing.JButton();
        Decrease_cruise = new javax.swing.JButton();
        Gear_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        acto_bulb = new eu.hansolo.lightbulb.LightBulb();
        volt_dislpay = new eu.hansolo.steelseries.gauges.DisplaySingle();
        sliderFuel2 = new javax.swing.JSlider();
        volt_dislpay_actual = new eu.hansolo.steelseries.gauges.DisplaySingle();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        actuator_label = new javax.swing.JLabel();
        Throtel_display = new eu.hansolo.steelseries.gauges.DisplaySingle();
        jLabel14 = new javax.swing.JLabel();
        radialFuel = new eu.hansolo.steelseries.gauges.Radial1Lcd();
        radialRPM = new eu.hansolo.steelseries.gauges.Radial4();
        displayCrusingSpeed = new eu.hansolo.steelseries.gauges.DisplaySingle();
        digitalRadial1 = new eu.hansolo.steelseries.gauges.DigitalRadial();
        displayGear = new eu.hansolo.steelseries.gauges.DisplaySingle();
        displayRPM = new eu.hansolo.steelseries.gauges.DisplaySingle();
        jLabel2 = new javax.swing.JLabel();
        displayAvgFuel = new eu.hansolo.steelseries.gauges.DisplaySingle();
        radialSpeedometer = new eu.hansolo.steelseries.gauges.Radial2Lcd();
        displayMilesDriven = new eu.hansolo.steelseries.gauges.DisplaySingle();
        jLabel8 = new javax.swing.JLabel();
        displayMaintenance = new eu.hansolo.steelseries.gauges.DisplaySingle();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        driveshaft_display = new eu.hansolo.steelseries.gauges.DisplayCircular();
        buttonStartTrip = new javax.swing.JButton();
        butonStopTrip = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Tripbulb = new eu.hansolo.lightbulb.LightBulb();
        displaytrip = new eu.hansolo.steelseries.gauges.DisplaySingle();
        speed_time = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automobile Management System");
        setBackground(new java.awt.Color(153, 153, 153));

        clock1.setBackgroundColor(eu.hansolo.steelseries.tools.BackgroundColor.LIGHT_GRAY);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        screen.setBackground(new java.awt.Color(102, 102, 102));
        screen.setColumns(20);
        screen.setForeground(new java.awt.Color(255, 255, 255));
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Monitor");

        buttonStartCruise.setBackground(new java.awt.Color(204, 204, 204));
        buttonStartCruise.setForeground(new java.awt.Color(51, 51, 51));
        buttonStartCruise.setText("Start Cruising");
        buttonStartCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartCruiseActionPerformed(evt);
            }
        });

        buttonStopCruise.setBackground(new java.awt.Color(204, 204, 204));
        buttonStopCruise.setForeground(new java.awt.Color(51, 51, 51));
        buttonStopCruise.setText("Stop Cruising");
        buttonStopCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopCruiseActionPerformed(evt);
            }
        });

        buttonStartEngine.setBackground(new java.awt.Color(102, 102, 102));
        buttonStartEngine.setForeground(new java.awt.Color(204, 204, 204));
        buttonStartEngine.setText("Start Engine");
        buttonStartEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartEngineActionPerformed(evt);
            }
        });

        buttonStopEngine.setBackground(new java.awt.Color(102, 102, 102));
        buttonStopEngine.setForeground(new java.awt.Color(204, 204, 204));
        buttonStopEngine.setText("Stop Engine");
        buttonStopEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopEngineActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Set Fuel:");

        buttonSetFuel.setBackground(new java.awt.Color(51, 51, 51));
        buttonSetFuel.setForeground(new java.awt.Color(204, 204, 204));
        buttonSetFuel.setText("Set Fuel");
        buttonSetFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetFuelActionPerformed(evt);
            }
        });

        buttonAccelerate.setBackground(new java.awt.Color(204, 204, 204));
        buttonAccelerate.setForeground(new java.awt.Color(51, 51, 51));
        buttonAccelerate.setText("Accelerate");
        buttonAccelerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccelerateActionPerformed(evt);
            }
        });

        buttonBrake.setBackground(new java.awt.Color(204, 204, 204));
        buttonBrake.setForeground(new java.awt.Color(51, 51, 51));
        buttonBrake.setText("Brake");
        buttonBrake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrakeActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Low Gear");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Medium Gear");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Top Gear");

        buttonFirstGear.setBackground(new java.awt.Color(51, 51, 51));
        buttonFirstGear.setForeground(new java.awt.Color(204, 204, 204));
        buttonFirstGear.setText("First");
        buttonFirstGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFirstGearActionPerformed(evt);
            }
        });

        buttonSecondGear.setBackground(new java.awt.Color(51, 51, 51));
        buttonSecondGear.setForeground(new java.awt.Color(204, 204, 204));
        buttonSecondGear.setText("Second");
        buttonSecondGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSecondGearActionPerformed(evt);
            }
        });

        buttonThirdGear.setBackground(new java.awt.Color(51, 51, 51));
        buttonThirdGear.setForeground(new java.awt.Color(204, 204, 204));
        buttonThirdGear.setText("Third");
        buttonThirdGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThirdGearActionPerformed(evt);
            }
        });

        Maintenance_done_button.setText("Maintenance done");
        Maintenance_done_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maintenance_done_buttonActionPerformed(evt);
            }
        });

        cruise_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        cruise_label.setForeground(new java.awt.Color(153, 153, 153));
        cruise_label.setText("Activate");

        Increase_cruise.setBackground(new java.awt.Color(102, 102, 102));
        Increase_cruise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Increase_cruise.setForeground(new java.awt.Color(204, 204, 204));
        Increase_cruise.setText("+");
        Increase_cruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Increase_cruiseActionPerformed(evt);
            }
        });

        Decrease_cruise.setBackground(new java.awt.Color(102, 102, 102));
        Decrease_cruise.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Decrease_cruise.setForeground(new java.awt.Color(204, 204, 204));
        Decrease_cruise.setText("-");
        Decrease_cruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decrease_cruiseActionPerformed(evt);
            }
        });

        Gear_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gear_label.setForeground(new java.awt.Color(102, 102, 102));
        Gear_label.setText("-----------");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Up hill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Normal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Down hill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        volt_dislpay.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        volt_dislpay.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.GRAY_LCD);
        volt_dislpay.setUnitString("VLT");
        volt_dislpay.setVerifyInputWhenFocusTarget(false);

        sliderFuel2.setBackground(new java.awt.Color(51, 51, 51));
        sliderFuel2.setForeground(new java.awt.Color(204, 204, 204));
        sliderFuel2.setMajorTickSpacing(1);
        sliderFuel2.setMaximum(10);
        sliderFuel2.setMinimum(1);
        sliderFuel2.setMinorTickSpacing(1);
        sliderFuel2.setPaintLabels(true);
        sliderFuel2.setPaintTicks(true);

        volt_dislpay_actual.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        volt_dislpay_actual.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.GRAY_LCD);
        volt_dislpay_actual.setUnitString("VLT");
        volt_dislpay_actual.setVerifyInputWhenFocusTarget(false);

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Curent Volt");

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Needed Volt");

        actuator_label.setForeground(new java.awt.Color(204, 204, 204));

        Throtel_display.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Throtel_display.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.GRAY_LCD);
        Throtel_display.setUnitString("VLT");
        Throtel_display.setVerifyInputWhenFocusTarget(false);

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Throttle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(buttonStartEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(buttonStopEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(buttonBrake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(buttonAccelerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(Throtel_display, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(64, 64, 64)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Increase_cruise, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Decrease_cruise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(buttonStartCruise)
                                            .addComponent(buttonStopCruise, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crusing_lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cruise_label))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(41, 41, 41)
                                                .addComponent(buttonThirdGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonSecondGear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(40, 40, 40)
                                                .addComponent(buttonFirstGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lightBulb3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(Gear_label, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4)
                                        .addGap(136, 136, 136))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sliderFuel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(buttonSetFuel)
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(volt_dislpay_actual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(volt_dislpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(jLabel13))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acto_bulb, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(actuator_label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Maintenance_done_button, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonStartEngine)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonStopEngine)))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonStartCruise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(buttonStopCruise)
                                            .addComponent(cruise_label)))
                                    .addComponent(crusing_lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Increase_cruise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Decrease_cruise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(buttonFirstGear))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(buttonSecondGear)))
                                    .addComponent(lightBulb3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonThirdGear)
                                    .addComponent(jLabel7)
                                    .addComponent(Gear_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonAccelerate)
                                    .addComponent(Throtel_display, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(buttonBrake)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(volt_dislpay_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonSetFuel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6)
                                .addComponent(volt_dislpay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderFuel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(acto_bulb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton3)
                                            .addComponent(actuator_label)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Maintenance_done_button)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        radialFuel.setMaxValue(10.0);
        radialFuel.setName("Fuel"); // NOI18N
        radialFuel.setTitle("Fuel");
        radialFuel.setTrackRange(10.0);
        radialFuel.setTrackSection(5.0);
        radialFuel.setTrackStartColor(new java.awt.Color(255, 0, 0));
        radialFuel.setTrackStopColor(new java.awt.Color(0, 255, 0));
        radialFuel.setTrackVisible(true);
        radialFuel.setUnitString("E/F");

        radialRPM.setToolTipText("");
        radialRPM.setMaxMeasuredValueVisible(true);
        radialRPM.setMaxValue(80.0);
        radialRPM.setTitle("RPM");
        radialRPM.setTrackRange(10.0);
        radialRPM.setTrackStart(70.0);
        radialRPM.setTrackStartColor(new java.awt.Color(255, 255, 0));
        radialRPM.setTrackVisible(true);
        radialRPM.setUnitString("X100");

        displayCrusingSpeed.setUnitString("Ml/h");

        digitalRadial1.setTitle("Maintenance");
        digitalRadial1.setUnitString("Time");

        displayGear.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.BLACK_LCD);
        displayGear.setLcdDecimals(0);
        displayGear.setUnitString("Gear");
        displayGear.setVerifyInputWhenFocusTarget(false);

        displayRPM.setUnitString("RPM");

        jLabel2.setText("Cruising Speed");

        displayAvgFuel.setUnitString("avg/fuel");
        displayAvgFuel.setVerifyInputWhenFocusTarget(false);

        radialSpeedometer.setLcdUnitStringVisible(true);
        radialSpeedometer.setTitle("Speed");
        radialSpeedometer.setUnitString("ML.h");

        displayMilesDriven.setUnitString("Miles");

        jLabel8.setText("Miles Driven:");

        jLabel9.setText("Current Maintenance");

        jLabel10.setText("Average(100 M)/Fuel");

        driveshaft_display.setAutoscrolls(true);
        driveshaft_display.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        driveshaft_display.setUnitString("SRPM");

        buttonStartTrip.setText("Start Trip");
        buttonStartTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartTripActionPerformed(evt);
            }
        });

        butonStopTrip.setText("Pause Trip");
        butonStopTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonStopTripActionPerformed(evt);
            }
        });

        jLabel3.setText("Drive shaft");

        displaytrip.setUnitString("m/s");

        speed_time.setText("1");
        speed_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speed_timeActionPerformed(evt);
            }
        });

        jLabel11.setText("Drive shaft X");

        jLabel15.setText("Average speeed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(displayCrusingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(displayMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(displayMilesDriven, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonStartTrip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butonStopTrip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaytrip, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(radialRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radialSpeedometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayAvgFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tripbulb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radialFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(digitalRadial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(driveshaft_display, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(63, 63, 63))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speed_time, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speed_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radialRPM, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(digitalRadial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radialFuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radialSpeedometer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driveshaft_display, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(displayRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(displayAvgFuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(displayMaintenance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(displayCrusingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayMilesDriven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tripbulb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonStartTrip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butonStopTrip)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displaytrip, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStartCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartCruiseActionPerformed
        Config.sendEvent(new Cruise_state_reading(true));

    }//GEN-LAST:event_buttonStartCruiseActionPerformed

    private void buttonStopCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopCruiseActionPerformed
        Config.sendEvent(new Cruise_state_reading(false));

    }//GEN-LAST:event_buttonStopCruiseActionPerformed

    private void buttonStartEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartEngineActionPerformed

        Config.sendEvent(new EngineEvent(true));

        //else do nothing.
    }//GEN-LAST:event_buttonStartEngineActionPerformed

    private void buttonStopEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopEngineActionPerformed

        Config.sendEvent(new EngineEvent((false)));
        //else do nothing.
    }//GEN-LAST:event_buttonStopEngineActionPerformed

    public DisplaySingle getVolt_dislpay() {
        return volt_dislpay;
    }

    private void buttonSetFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetFuelActionPerformed

        Config.sendEvent(new set_Fuel(sliderFuel2.getValue()));


    }//GEN-LAST:event_buttonSetFuelActionPerformed

    public static double getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        View_AMS.speed = speed;
    }

    public static double getRPM() {
        return RPM;
    }

    public static void setRPM(double RPM) {
        View_AMS.RPM = RPM;
    }

    public static double getGearState() {
        return GearState;
    }

    public static void setGearState(int GearState) {
        View_AMS.GearState = GearState;
    }

    public static boolean isEnginestate() {
        return enginestate;
    }

    public static void setEnginestate(boolean enginestate) {
        View_AMS.enginestate = enginestate;
    }

    public DisplayCircular getDisplaytime() {
        return driveshaft_display;
    }

    public void setDisplaytime(DisplayCircular displaytime) {
        this.driveshaft_display = displaytime;
    }

    private void buttonAccelerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccelerateActionPerformed

        Config.sendEvent(new AccelerateEvent((true)));
        Config.sendEvent(new SpeedOMeterReading((speed)));
        Config.sendEvent(new Gear_Reading((GearState)));
        Config.sendEvent(new RpmEvent((RPM)));
        Config.sendEvent(new PerformEvent(true));


    }//GEN-LAST:event_buttonAccelerateActionPerformed

    private void buttonBrakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrakeActionPerformed

        Config.sendEvent(new BrakeEvent((false)));
        Config.sendEvent(new SpeedOMeterReading((speed)));
        Config.sendEvent(new Gear_Reading((GearState)));
        Config.sendEvent(new RpmEvent((RPM)));
        Config.sendEvent(new PerformEvent(true));
    }//GEN-LAST:event_buttonBrakeActionPerformed

    private void buttonFirstGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFirstGearActionPerformed

        GearState = 1;
    }//GEN-LAST:event_buttonFirstGearActionPerformed

    private void buttonStartTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartTripActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.TripEvent(true));

    }//GEN-LAST:event_buttonStartTripActionPerformed

    public JButton getMaintenance_done_button() {
        return Maintenance_done_button;
    }

    public DisplaySingle getDisplaytrip() {
        return displaytrip;
    }

    private void buttonSecondGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSecondGearActionPerformed

        Config.sendEvent(new events.Gear_Reading(2));


    }//GEN-LAST:event_buttonSecondGearActionPerformed

    public DisplaySingle getVolt_dislpay_actual() {
        return volt_dislpay_actual;
    }

    private void buttonThirdGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThirdGearActionPerformed
        Config.sendEvent(new events.Gear_Reading(3));


    }//GEN-LAST:event_buttonThirdGearActionPerformed

    public JLabel getGear_label() {
        return Gear_label;
    }

    public void setGear_label(JLabel Gear_label) {
        this.Gear_label = Gear_label;
    }

    private void butonStopTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonStopTripActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.TripEvent(false));

    }//GEN-LAST:event_butonStopTripActionPerformed

    private void speed_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speed_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speed_timeActionPerformed

    private void Maintenance_done_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maintenance_done_buttonActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Maintenace_done(true));

    }//GEN-LAST:event_Maintenance_done_buttonActionPerformed

    private void Increase_cruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Increase_cruiseActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Accelerate_cruise((int) (displayCrusingSpeed.getValue() + 1)));

    }//GEN-LAST:event_Increase_cruiseActionPerformed

    private void Decrease_cruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decrease_cruiseActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Accelerate_cruise((int) (displayCrusingSpeed.getValue() - 1)));

    }//GEN-LAST:event_Decrease_cruiseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Actuator_reading(1));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Actuator_reading(2));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new events.Actuator_reading(3));

    }//GEN-LAST:event_jButton3ActionPerformed

    public JTextField getSpeed_time() {
        return speed_time;
    }

    /**
     * @param args the command line arguments
     */
    public LightBulb getTripbulb() {
        return Tripbulb;
    }

    public void setTripbulb(LightBulb Tripbulb) {
        this.Tripbulb = Tripbulb;
    }

    public LightBulb getCrusing_lightBulb1() {
        return crusing_lightBulb1;
    }

    public void setCrusing_lightBulb1(LightBulb crusing_lightBulb1) {
        this.crusing_lightBulb1 = crusing_lightBulb1;
    }

    public LightBulb getLightBulb3() {
        return lightBulb3;
    }

    public void setLightBulb3(LightBulb lightBulb3) {
        this.lightBulb3 = lightBulb3;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decrease_cruise;
    private javax.swing.JLabel Gear_label;
    private javax.swing.JButton Increase_cruise;
    private javax.swing.JButton Maintenance_done_button;
    private eu.hansolo.steelseries.gauges.DisplaySingle Throtel_display;
    private eu.hansolo.lightbulb.LightBulb Tripbulb;
    private eu.hansolo.lightbulb.LightBulb acto_bulb;
    private javax.swing.JLabel actuator_label;
    private javax.swing.JButton butonStopTrip;
    private javax.swing.JToggleButton buttonAccelerate;
    private javax.swing.JButton buttonBrake;
    private javax.swing.JButton buttonFirstGear;
    private javax.swing.JButton buttonSecondGear;
    private javax.swing.JButton buttonSetFuel;
    private javax.swing.JToggleButton buttonStartCruise;
    private javax.swing.JButton buttonStartEngine;
    private javax.swing.JButton buttonStartTrip;
    private javax.swing.JButton buttonStopCruise;
    private javax.swing.JButton buttonStopEngine;
    private javax.swing.JButton buttonThirdGear;
    private eu.hansolo.steelseries.gauges.Clock clock1;
    private javax.swing.JLabel cruise_label;
    private eu.hansolo.lightbulb.LightBulb crusing_lightBulb1;
    private eu.hansolo.steelseries.gauges.DigitalRadial digitalRadial1;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayAvgFuel;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayCrusingSpeed;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayGear;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayMaintenance;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayMilesDriven;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayRPM;
    private eu.hansolo.steelseries.gauges.DisplaySingle displaytrip;
    private eu.hansolo.steelseries.gauges.DisplayCircular driveshaft_display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private eu.hansolo.lightbulb.LightBulb lightBulb1;
    private eu.hansolo.lightbulb.LightBulb lightBulb3;
    private org.pushingpixels.trident.ease.Linear linear1;
    private eu.hansolo.steelseries.gauges.Radial1Lcd radialFuel;
    private eu.hansolo.steelseries.gauges.Radial4 radialRPM;
    private eu.hansolo.steelseries.gauges.Radial2Lcd radialSpeedometer;
    private javax.swing.JTextArea screen;
    private javax.swing.JSlider sliderFuel2;
    private javax.swing.JTextField speed_time;
    private eu.hansolo.steelseries.gauges.DisplaySingle volt_dislpay;
    private eu.hansolo.steelseries.gauges.DisplaySingle volt_dislpay_actual;
    // End of variables declaration//GEN-END:variables
}
