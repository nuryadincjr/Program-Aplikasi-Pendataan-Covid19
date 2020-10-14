/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid19.ui;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abugray
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        icon();
    }

    public void logIn(){
        String user, pass;
        user = buttonUsername_1955201182.getText();
        pass = buttonPassword_1955201182.getText();
        if(user.equalsIgnoreCase("admin")&&(pass.equalsIgnoreCase("admin"))){
            this.dispose();
            new Menu().setVisible(true);
            JOptionPane.showMessageDialog(null, "Selamaat \n Anda Telah Login", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Maaf \n Nama Pengguna atau Kata Sansi Anda Salah", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonKeluar_1955201182 = new javax.swing.JButton();
        lableImage_1955201182 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameL = new javax.swing.JLabel();
        buttonUsername_1955201182 = new javax.swing.JTextField();
        passwordL = new javax.swing.JLabel();
        buttonPassword_1955201182 = new javax.swing.JPasswordField();
        checkBoxShowPass_1955201182 = new javax.swing.JCheckBox();
        buttonLogin_1955201182 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 31, 122));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(474, 544));

        buttonKeluar_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/btn-close.png"))); // NOI18N
        buttonKeluar_1955201182.setText("Keluar");
        buttonKeluar_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonKeluar_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluar_1955201182ActionPerformed(evt);
            }
        });

        lableImage_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/stayhome.png"))); // NOI18N
        lableImage_1955201182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/login-user.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        usernameL.setForeground(new java.awt.Color(255, 255, 255));
        usernameL.setText("Nama Pengguna");

        buttonUsername_1955201182.setToolTipText("imput username");
        buttonUsername_1955201182.setName(""); // NOI18N
        buttonUsername_1955201182.setPreferredSize(new java.awt.Dimension(200, 21));
        buttonUsername_1955201182.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonUsername_1955201182KeyPressed(evt);
            }
        });

        passwordL.setForeground(new java.awt.Color(255, 255, 255));
        passwordL.setText("Kata Sandi");

        buttonPassword_1955201182.setToolTipText("input password");
        buttonPassword_1955201182.setPreferredSize(new java.awt.Dimension(111, 21));
        buttonPassword_1955201182.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonPassword_1955201182KeyPressed(evt);
            }
        });

        checkBoxShowPass_1955201182.setBackground(new java.awt.Color(0, 31, 122));
        checkBoxShowPass_1955201182.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        checkBoxShowPass_1955201182.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxShowPass_1955201182.setText("show password");
        checkBoxShowPass_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxShowPass_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPass_1955201182ActionPerformed(evt);
            }
        });

        buttonLogin_1955201182.setText("Login");
        buttonLogin_1955201182.setToolTipText("klik untuk login");
        buttonLogin_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogin_1955201182ActionPerformed(evt);
            }
        });
        buttonLogin_1955201182.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonLogin_1955201182KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonLogin_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonKeluar_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkBoxShowPass_1955201182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonUsername_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(buttonPassword_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lableImage_1955201182)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lableImage_1955201182)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUsername_1955201182, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameL, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPassword_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxShowPass_1955201182)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKeluar_1955201182)
                    .addComponent(buttonLogin_1955201182))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(464, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluar_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluar_1955201182ActionPerformed
        Menu.exit();
    }//GEN-LAST:event_buttonKeluar_1955201182ActionPerformed

    private void buttonUsername_1955201182KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonUsername_1955201182KeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            validasiuser();
            break;
            case KeyEvent.VK_DOWN:
            buttonPassword_1955201182.requestFocus();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_buttonUsername_1955201182KeyPressed

    private void buttonPassword_1955201182KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonPassword_1955201182KeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            validasilogin();
            break;
            case KeyEvent.VK_UP:
            buttonUsername_1955201182.requestFocus();
            break;
            case KeyEvent.VK_DOWN:
            buttonLogin_1955201182.requestFocus();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_buttonPassword_1955201182KeyPressed

    private void checkBoxShowPass_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowPass_1955201182ActionPerformed
        if (checkBoxShowPass_1955201182.isSelected()){
            buttonPassword_1955201182.setEchoChar((char)0);
        } else{
            buttonPassword_1955201182.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxShowPass_1955201182ActionPerformed

    private void buttonLogin_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogin_1955201182ActionPerformed
        validasilogin();
    }//GEN-LAST:event_buttonLogin_1955201182ActionPerformed

    private void buttonLogin_1955201182KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonLogin_1955201182KeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
            buttonKeluar_1955201182.requestFocus();
            break;
            case KeyEvent.VK_UP:
            buttonPassword_1955201182.requestFocus();
            break;
            case KeyEvent.VK_ENTER:
            logIn();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_buttonLogin_1955201182KeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar_1955201182;
    private javax.swing.JButton buttonLogin_1955201182;
    private javax.swing.JPasswordField buttonPassword_1955201182;
    private javax.swing.JTextField buttonUsername_1955201182;
    private javax.swing.JCheckBox checkBoxShowPass_1955201182;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lableImage_1955201182;
    private javax.swing.JLabel passwordL;
    private javax.swing.JLabel usernameL;
    // End of variables declaration//GEN-END:variables

     public void validasiuser(){
        if (buttonUsername_1955201182.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf \n Nama Pengguna Tidak Boleh Kosong", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } else buttonPassword_1955201182.requestFocus();
    }
   
    public void validasipass(){
        if (buttonPassword_1955201182.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf \n Kata Sandi Tidak Boleh Kosong", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } else logIn();
    }
    
    public void validasilogin(){
        boolean nama, pass;
        nama = buttonUsername_1955201182.getText().equals("");
        pass = buttonPassword_1955201182.getText().equals("");
        if (nama && pass){
                JOptionPane.showMessageDialog(null, "Maaf \n Nama Pengguna & Kata Sandi Tidak Boleh Kosong", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } else if (nama){
                JOptionPane.showMessageDialog(null, "Maaf \n Nama Pengguna Tidak Boleh Kosong", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } else if (pass){
                JOptionPane.showMessageDialog(null, "Maaf \n Kata Sandi Tidak Boleh Kosong", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } else logIn();
    }

    private void icon() {
        ImageIcon icon = new ImageIcon("src/com/covid19/icon/saveHealth.png");
        setIconImage(icon.getImage());
    }


}
