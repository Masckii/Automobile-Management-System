/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import eu.hansolo.lightbulb.LightBulb;
import eu.hansolo.steelseries.gauges.Clock;
import eu.hansolo.steelseries.gauges.DigitalRadial;
import eu.hansolo.steelseries.gauges.DisplaySingle;
import eu.hansolo.steelseries.gauges.Radial1Lcd;
import eu.hansolo.steelseries.gauges.Radial2Lcd;
import eu.hansolo.steelseries.gauges.Radial4;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
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
    static double speed = 0.0;
    static double RPM=0.0;
    static double GearState=1.0;
    static boolean enginestate=false;
    static AutoMobileManagmentSystem Auto=new AutoMobileManagmentSystem();
    public View_AMS() {
        initComponents();
        if (sliderFuel.getValue() <= 2) {
            radialFuel.setLedEnabled(true);
            radialFuel.setLedBlinking(true);
        } else {
            radialFuel.setLedBlinking(false);
        }
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
        return jTextArea1;
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

    public JSlider getSliderFuel() {
        return sliderFuel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clock1 = new eu.hansolo.steelseries.gauges.Clock();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buttonStartCruise = new javax.swing.JToggleButton();
        buttonStopCruise = new javax.swing.JButton();
        lightBulb1 = new eu.hansolo.lightbulb.LightBulb();
        buttonStartEngine = new javax.swing.JButton();
        buttonStopEngine = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sliderFuel = new javax.swing.JSlider();
        buttonSetFuel = new javax.swing.JButton();
        buttonAccelerate = new javax.swing.JToggleButton();
        buttonBrake = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonFirstGear = new javax.swing.JButton();
        buttonSecondGear = new javax.swing.JButton();
        buttonThirdGear = new javax.swing.JButton();
        buttonStartTrip = new javax.swing.JButton();
        butonStopTrip = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        clock1.setBackgroundColor(eu.hansolo.steelseries.tools.BackgroundColor.LIGHT_GRAY);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Monitor");

        buttonStartCruise.setText("Start Cruising");
        buttonStartCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartCruiseActionPerformed(evt);
            }
        });

        buttonStopCruise.setText("Stop Cruising");
        buttonStopCruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopCruiseActionPerformed(evt);
            }
        });

        buttonStartEngine.setText("Start Engine");
        buttonStartEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartEngineActionPerformed(evt);
            }
        });

        buttonStopEngine.setText("Stop Engine");
        buttonStopEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopEngineActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Set Fuel:");

        sliderFuel.setMaximum(10);
        sliderFuel.setValue(0);

        buttonSetFuel.setText("Set Fuel");
        buttonSetFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetFuelActionPerformed(evt);
            }
        });

        buttonAccelerate.setText("Accelerate");
        buttonAccelerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccelerateActionPerformed(evt);
            }
        });

        buttonBrake.setText("Brake");
        buttonBrake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrakeActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Low Gear");

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Medium Gear");

        jLabel7.setForeground(new java.awt.Color(153, 255, 0));
        jLabel7.setText("Top Gear");

        buttonFirstGear.setText("First");
        buttonFirstGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFirstGearActionPerformed(evt);
            }
        });

        buttonSecondGear.setText("Second");
        buttonSecondGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSecondGearActionPerformed(evt);
            }
        });

        buttonThirdGear.setText("Third");
        buttonThirdGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThirdGearActionPerformed(evt);
            }
        });

        buttonStartTrip.setText("Start Trip");
        buttonStartTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartTripActionPerformed(evt);
            }
        });

        butonStopTrip.setText("Stop Trip");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonStopEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonStartEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonStopCruise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonStartCruise, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(buttonSetFuel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonAccelerate)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonSecondGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(41, 41, 41)
                                        .addComponent(buttonThirdGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40)
                                        .addComponent(buttonFirstGear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonStartTrip)
                                    .addComponent(butonStopTrip)))
                            .addComponent(buttonBrake, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lightBulb1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonStartEngine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonStopEngine))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonStartCruise)
                                    .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonStopCruise)
                                    .addComponent(buttonSetFuel))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(buttonFirstGear)
                            .addComponent(buttonAccelerate)
                            .addComponent(buttonStartTrip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(buttonSecondGear)
                            .addComponent(butonStopTrip))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonThirdGear)
                            .addComponent(jLabel7)
                            .addComponent(buttonBrake))
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        displayCrusingSpeed.setUnitString("Km/h");

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
        radialSpeedometer.setUnitString("km.h");

        displayMilesDriven.setUnitString("Miles");

        jLabel8.setText("Miles Driven:");

        jLabel9.setText("Current Maintenance");

        jLabel10.setText("Average Speed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(displayCrusingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(displayAvgFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(displayMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayMilesDriven, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(radialRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radialSpeedometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radialFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(digitalRadial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radialRPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(digitalRadial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(radialFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radialSpeedometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(displayRPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(displayMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayAvgFuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayCrusingSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayMilesDriven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStartCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartCruiseActionPerformed
        radialSpeedometer.setValueAnimated(100);
        displayCrusingSpeed.setValueAnimated(100);
    }//GEN-LAST:event_buttonStartCruiseActionPerformed

    private void buttonStopCruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopCruiseActionPerformed
        radialSpeedometer.setValueAnimated(0);
        displayCrusingSpeed.setValueAnimated(0);
    }//GEN-LAST:event_buttonStopCruiseActionPerformed

    private void buttonStartEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartEngineActionPerformed
        if (lightBulb1.isOn() == false) {
            lightBulb1.setOn(true);
            radialRPM.setValueAnimated(10);
            displayRPM.setValueAnimated(10);
        }
        enginestate=true;
        //else do nothing.
    }//GEN-LAST:event_buttonStartEngineActionPerformed

    private void buttonStopEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopEngineActionPerformed
        if (lightBulb1.isOn() == true) {
            lightBulb1.setOn(false);
            radialRPM.setValueAnimated(0);
            displayRPM.setValueAnimated(0);
        }
        enginestate=false;
        //else do nothing.
    }//GEN-LAST:event_buttonStopEngineActionPerformed

    private void buttonSetFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetFuelActionPerformed
        radialFuel.setValueAnimated(sliderFuel.getValue());
        
    }//GEN-LAST:event_buttonSetFuelActionPerformed

    private void buttonAccelerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccelerateActionPerformed
       
        speed=Auto.PerformAcceleration(speed, GearState, RPM, true)[0];
        RPM=Auto.PerformAcceleration(speed, GearState, RPM, true)[1];
        GearState=Auto.PerformAcceleration(speed, GearState, RPM, true)[2];
        radialSpeedometer.setValueAnimated(speed);
        displayCrusingSpeed.setValueAnimated(speed);
        if(enginestate==true){
        radialRPM.setValueAnimated(RPM);
        displayRPM.setValueAnimated(RPM);
        }
        displayGear.setValueAnimated(GearState);

        
    }//GEN-LAST:event_buttonAccelerateActionPerformed

    private void buttonBrakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrakeActionPerformed
        speed=Auto.PerformAcceleration(speed, GearState, RPM, false)[0];
        RPM=Auto.PerformAcceleration(speed, GearState, RPM, false)[1];
        GearState=Auto.PerformAcceleration(speed, GearState, RPM, false)[2];
        displayCrusingSpeed.setValueAnimated(speed);
        radialSpeedometer.setValueAnimated(speed);
        
        if(enginestate==true){
        radialRPM.setValueAnimated(RPM);
        displayRPM.setValueAnimated(RPM);
        }
        displayGear.setValueAnimated(GearState);
    }//GEN-LAST:event_buttonBrakeActionPerformed

    private void buttonFirstGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFirstGearActionPerformed
        
        GearState=1;
    }//GEN-LAST:event_buttonFirstGearActionPerformed

    private void buttonStartTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartTripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonStartTripActionPerformed

    private void buttonSecondGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSecondGearActionPerformed
         GearState=2;
    }//GEN-LAST:event_buttonSecondGearActionPerformed

    private void buttonThirdGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThirdGearActionPerformed
         GearState=3;
    }//GEN-LAST:event_buttonThirdGearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_AMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_AMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_AMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_AMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_AMS().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private eu.hansolo.steelseries.gauges.DigitalRadial digitalRadial1;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayAvgFuel;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayCrusingSpeed;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayGear;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayMaintenance;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayMilesDriven;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayRPM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private eu.hansolo.lightbulb.LightBulb lightBulb1;
    private eu.hansolo.steelseries.gauges.Radial1Lcd radialFuel;
    private eu.hansolo.steelseries.gauges.Radial4 radialRPM;
    private eu.hansolo.steelseries.gauges.Radial2Lcd radialSpeedometer;
    private javax.swing.JSlider sliderFuel;
    // End of variables declaration//GEN-END:variables
}