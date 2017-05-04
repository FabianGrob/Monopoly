/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.User;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian
 */
public class MainMenu extends javax.swing.JFrame {

    private DataBase dB;
    private ArrayList<Player> players;

    /**
     * Creates new form MainMenu
     */
    public MainMenu(DataBase dBs) {
        players = new ArrayList<Player>();
       
        dB = dBs;
        initComponents();
        jCheckBoxUser1.setEnabled(false);

        jComboBoxUser2.setEnabled(false);
        jTextField2.setEnabled(false);
        jComboBoxUser3.setEnabled(false);
        jTextField3.setEnabled(false);
        jComboBoxUser4.setEnabled(false);
        jTextField4.setEnabled(false);
        jComboBoxUser8.setEnabled(false);
        jTextField8.setEnabled(false);
        jComboBoxUser7.setEnabled(false);
        jTextField7.setEnabled(false);
        jComboBoxUser6.setEnabled(false);
        jTextField5.setEnabled(false);
        jComboBoxUser5.setEnabled(false);
        jTextField6.setEnabled(false);

        for (int i = 0; i < dB.getUsers().size(); i++) {

            jComboBoxUser1.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser2.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser3.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser4.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser5.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser6.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser7.addItem(dB.getUsers().get(i).getName());
            jComboBoxUser8.addItem(dB.getUsers().get(i).getName());

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtoncreateUser = new javax.swing.JButton();
        jComboBoxUser1 = new javax.swing.JComboBox<>();
        jLabelChoose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBoxUser1 = new javax.swing.JCheckBox();
        jCheckBoxUser2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jComboBoxUser2 = new javax.swing.JComboBox<>();
        jCheckBoxUser3 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jComboBoxUser3 = new javax.swing.JComboBox<>();
        jComboBoxUser4 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jCheckBoxUser4 = new javax.swing.JCheckBox();
        jCheckBoxUser8 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jCheckBoxUser7 = new javax.swing.JCheckBox();
        jCheckBoxUser6 = new javax.swing.JCheckBox();
        jCheckBoxUser5 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBoxUser8 = new javax.swing.JComboBox<>();
        jComboBoxUser7 = new javax.swing.JComboBox<>();
        jComboBoxUser6 = new javax.swing.JComboBox<>();
        jComboBoxUser5 = new javax.swing.JComboBox<>();
        jButtonStart = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PredefPic/monopolyIlustration.jpg"))); // NOI18N

        jButtoncreateUser.setText("Crear un Usuario");
        jButtoncreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncreateUserActionPerformed(evt);
            }
        });

        jComboBoxUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser1ActionPerformed(evt);
            }
        });

        jLabelChoose.setText("Selecciona un usuario:");

        jLabel1.setText("O escribe tu nombre de invitado:");

        jCheckBoxUser1.setSelected(true);
        jCheckBoxUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser1ActionPerformed(evt);
            }
        });

        jCheckBoxUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser2ActionPerformed(evt);
            }
        });

        jComboBoxUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser2ActionPerformed(evt);
            }
        });

        jCheckBoxUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser3ActionPerformed(evt);
            }
        });

        jComboBoxUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser3ActionPerformed(evt);
            }
        });

        jComboBoxUser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser4ActionPerformed(evt);
            }
        });

        jCheckBoxUser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser4ActionPerformed(evt);
            }
        });

        jCheckBoxUser8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser8ActionPerformed(evt);
            }
        });

        jCheckBoxUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser7ActionPerformed(evt);
            }
        });

        jCheckBoxUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser6ActionPerformed(evt);
            }
        });

        jCheckBoxUser5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser5ActionPerformed(evt);
            }
        });

        jComboBoxUser8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser8ActionPerformed(evt);
            }
        });

        jComboBoxUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser7ActionPerformed(evt);
            }
        });

        jComboBoxUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser6ActionPerformed(evt);
            }
        });

        jComboBoxUser5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser5ActionPerformed(evt);
            }
        });

        jButtonStart.setText("Comenzar");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        Salir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonStart)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUser8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelChoose))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBoxUser1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxUser8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtoncreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelChoose)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser4))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxUser8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtoncreateUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonStart, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        User none = new User();
        none.setName("<Ninguno>");
        boolean isNoneSelected1 = ((String) jComboBoxUser1.getSelectedItem()).equals(none.getName()) && (jTextField1.getText().equals("") || jTextField1.getText().length() < 4);
        boolean isNoneSelected2 = ((String) jComboBoxUser2.getSelectedItem()).equals(none.getName()) && (jTextField2.getText().equals("") || jTextField2.getText().length() < 4);
        boolean isNoneSelected3 = ((String) jComboBoxUser3.getSelectedItem()).equals(none.getName()) && (jTextField3.getText().equals("") || jTextField3.getText().length() < 4);
        boolean isNoneSelected4 = ((String) jComboBoxUser4.getSelectedItem()).equals(none.getName()) && (jTextField4.getText().equals("") || jTextField4.getText().length() < 4);
        boolean isNoneSelected5 = ((String) jComboBoxUser5.getSelectedItem()).equals(none.getName()) && (jTextField5.getText().equals("") || jTextField5.getText().length() < 4);
        boolean isNoneSelected6 = ((String) jComboBoxUser6.getSelectedItem()).equals(none.getName()) && (jTextField6.getText().equals("") || jTextField6.getText().length() < 4);
        boolean isNoneSelected7 = ((String) jComboBoxUser7.getSelectedItem()).equals(none.getName()) && (jTextField7.getText().equals("") || jTextField7.getText().length() < 4);
        boolean isNoneSelected8 = ((String) jComboBoxUser8.getSelectedItem()).equals(none.getName()) && (jTextField8.getText().equals("") || jTextField8.getText().length() < 4);
        boolean isNoneSelected = isNoneSelected1 || isNoneSelected2 || isNoneSelected3 || isNoneSelected4 || isNoneSelected5 || isNoneSelected6 || isNoneSelected7 || isNoneSelected8;

        if (isNoneSelected) {
            JOptionPane.showMessageDialog(this, "Debe de seleccionarse un usuario o jugar como invitado con un nombre de 4 caracteres o más", "Error", WIDTH);
        } else {
            String actualName="";
            ArrayList<String> names= new ArrayList<String>();
            if (!((String) jComboBoxUser1.getSelectedItem()).equals(none.getName())) {
                
                names.add((String)jComboBoxUser1.getSelectedItem());
                //create player1 as user
            } else {
                names.add((String)jTextField1.getSelectedText());
                //create player1 as guest
            }
            if (jCheckBoxUser2.isSelected()) {
                if (!((String) jComboBoxUser2.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser2.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField2.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
                if (names.contains(actualName)) {
                    
                }
            }
            if (jCheckBoxUser3.isSelected()) {
                if (!((String) jComboBoxUser3.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser3.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField3.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }
            if (jCheckBoxUser4.isSelected()) {
                if (!((String) jComboBoxUser4.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser4.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField4.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }
            if (jCheckBoxUser5.isSelected()) {
                if (!((String) jComboBoxUser5.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser5.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField5.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }
            if (jCheckBoxUser6.isSelected()) {
                if (!((String) jComboBoxUser6.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser6.getSelectedItem();
                    //create player2 as user
                    names.add(actualName);
                } else {
                    actualName=(String)jTextField6.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }
            if (jCheckBoxUser7.isSelected()) {
                if (!((String) jComboBoxUser7.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser7.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField7.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }
            if (jCheckBoxUser8.isSelected()) {
                if (!((String) jComboBoxUser8.getSelectedItem()).equals(none.getName())) {
                    actualName=(String)jComboBoxUser8.getSelectedItem();
                    names.add(actualName);
                    //create player2 as user
                } else {
                    actualName=(String)jTextField8.getSelectedText();
                    names.add(actualName);
                    //create player2 as guest
                }
            }

        }

    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtoncreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncreateUserActionPerformed
        CreatePlayerWindow window = new CreatePlayerWindow(this, dB);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtoncreateUserActionPerformed

    private void jCheckBoxUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser1ActionPerformed
        boolean isEnable = jCheckBoxUser1.isSelected();
        jComboBoxUser1.setEnabled(isEnable);
        jTextField1.setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser1ActionPerformed

    private void jCheckBoxUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser2ActionPerformed
        boolean isEnable = jCheckBoxUser2.isSelected();
        jComboBoxUser2.setEnabled(isEnable);
        jTextField2.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser2ActionPerformed

    private void jCheckBoxUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser3ActionPerformed
        boolean isEnable = jCheckBoxUser3.isSelected();
        jComboBoxUser3.setEnabled(isEnable);
        jTextField3.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser3ActionPerformed

    private void jCheckBoxUser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser4ActionPerformed
        boolean isEnable = jCheckBoxUser4.isSelected();
        jComboBoxUser4.setEnabled(isEnable);
        jTextField4.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser4ActionPerformed

    private void jCheckBoxUser5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser5ActionPerformed
        boolean isEnable = jCheckBoxUser5.isSelected();
        jComboBoxUser5.setEnabled(isEnable);
        jTextField5.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser5ActionPerformed

    private void jCheckBoxUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser6ActionPerformed
        boolean isEnable = jCheckBoxUser6.isSelected();
        jComboBoxUser6.setEnabled(isEnable);
        jTextField6.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser6ActionPerformed

    private void jCheckBoxUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser7ActionPerformed
        boolean isEnable = jCheckBoxUser7.isSelected();
        jComboBoxUser7.setEnabled(isEnable);
        jTextField7.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser7ActionPerformed

    private void jCheckBoxUser8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser8ActionPerformed
        boolean isEnable = jCheckBoxUser8.isSelected();
        jComboBoxUser8.setEnabled(isEnable);
        jTextField8.setEnabled(isEnable);
    }//GEN-LAST:event_jCheckBoxUser8ActionPerformed

    private void jComboBoxUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser1ActionPerformed
        if (!((String) jComboBoxUser1.getSelectedItem()).equals("<Ninguno>")) {
            jTextField1.setEnabled(false);
        } else {
            jTextField1.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser1ActionPerformed

    private void jComboBoxUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser2ActionPerformed
        if (!((String) jComboBoxUser2.getSelectedItem()).equals("<Ninguno>")) {
            jTextField2.setEnabled(false);
        } else {
            jTextField2.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser2ActionPerformed

    private void jComboBoxUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser3ActionPerformed
        if (!((String) jComboBoxUser3.getSelectedItem()).equals("<Ninguno>")) {
            jTextField3.setEnabled(false);
        } else {
            jTextField3.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser3ActionPerformed

    private void jComboBoxUser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser4ActionPerformed
        if (!((String) jComboBoxUser4.getSelectedItem()).equals("<Ninguno>")) {
            jTextField4.setEnabled(false);
        } else {
            jTextField4.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser4ActionPerformed

    private void jComboBoxUser5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser5ActionPerformed
        if (!((String) jComboBoxUser5.getSelectedItem()).equals("<Ninguno>")) {
            jTextField5.setEnabled(false);
        } else {
            jTextField5.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser5ActionPerformed

    private void jComboBoxUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser6ActionPerformed
        if (!((String) jComboBoxUser6.getSelectedItem()).equals("<Ninguno>")) {
            jTextField6.setEnabled(false);
        } else {
            jTextField6.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser6ActionPerformed

    private void jComboBoxUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser7ActionPerformed
        if (!((String) jComboBoxUser7.getSelectedItem()).equals("<Ninguno>")) {
            jTextField7.setEnabled(false);
        } else {
            jTextField7.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser7ActionPerformed

    private void jComboBoxUser8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser8ActionPerformed
        if (!((String) jComboBoxUser8.getSelectedItem()).equals("<Ninguno>")) {
            jTextField8.setEnabled(false);
        } else {
            jTextField8.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxUser8ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBase db = new DataBase();
                User u = new User();
                u.setName("Jorge");
                db.addUser(u);

                new MainMenu(db).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtoncreateUser;
    private javax.swing.JCheckBox jCheckBoxUser1;
    private javax.swing.JCheckBox jCheckBoxUser2;
    private javax.swing.JCheckBox jCheckBoxUser3;
    private javax.swing.JCheckBox jCheckBoxUser4;
    private javax.swing.JCheckBox jCheckBoxUser5;
    private javax.swing.JCheckBox jCheckBoxUser6;
    private javax.swing.JCheckBox jCheckBoxUser7;
    private javax.swing.JCheckBox jCheckBoxUser8;
    private javax.swing.JComboBox<String> jComboBoxUser1;
    private javax.swing.JComboBox<String> jComboBoxUser2;
    private javax.swing.JComboBox<String> jComboBoxUser3;
    private javax.swing.JComboBox<String> jComboBoxUser4;
    private javax.swing.JComboBox<String> jComboBoxUser5;
    private javax.swing.JComboBox<String> jComboBoxUser6;
    private javax.swing.JComboBox<String> jComboBoxUser7;
    private javax.swing.JComboBox<String> jComboBoxUser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChoose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}