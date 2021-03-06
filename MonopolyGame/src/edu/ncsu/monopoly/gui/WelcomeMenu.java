package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.Serialize;
import edu.ncsu.monopoly.User;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import javax.swing.JOptionPane;

public class WelcomeMenu extends javax.swing.JFrame {
    private DataBase dB;
    private String[] args;
    
    public WelcomeMenu(DataBase dBs,String[] arg) {
        args= arg;
        initComponents();
        dB=dBs;
        this.setLocationRelativeTo(null);
        User guest = new User();
        guest.setName("Play as guest");
        guest.setWonGames(9999);
        if (!dB.getUsers().contains(guest)) {
            dB.getUsers().add(guest);
        }
        if(dB.getUsers().size() < 2){
            jButtonRanking.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonRanking = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setText("Create user");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonRanking.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButtonRanking.setText("Ranking");
        jButtonRanking.setPreferredSize(new java.awt.Dimension(75, 29));
        jButtonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRankingActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PredefPic/Monopoly_logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu window= new MainMenu(dB,this,args);
        this.setVisible(false);
        window.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CreatePlayerWindow window = new CreatePlayerWindow(this,dB,args);
        this.setVisible(false);
        window.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Serialize ser = new Serialize();
        ser.serializer(dB);
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Serialize ser = new Serialize();
        ser.serializer(dB);
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jButtonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRankingActionPerformed
        if (dB.getUsers().size()==0) {
            JOptionPane.showMessageDialog(this, "There are not users registered", "Error", WIDTH);
        }else{
            Ranking window = new Ranking(this.dB, this, this.args);
            this.setVisible(false);
            window.setVisible(true);
        }

    }//GEN-LAST:event_jButtonRankingActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Serialize ser = new Serialize();
        ser.serializer(dB);
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed
    /*
    public static void main(String args[]) {
    try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    break;
    }
    }
    } catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(WelcomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
    DataBase dtB = new DataBase();
    User u = new User();
    u.setName("Jorge");
    u.setPicture(new File("src/PredefPic/PredefPicture.png"));
    dtB.addUser(u);
    new WelcomeMenu(dtB,args).setVisible(true);
    }
    });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonRanking;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
