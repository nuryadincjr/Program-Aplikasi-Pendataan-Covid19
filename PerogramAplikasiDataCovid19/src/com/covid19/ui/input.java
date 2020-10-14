
package com.covid19.ui;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class input extends javax.swing.JFrame {

    public input() {
        initComponents();
        icon();
        radioButtonLaki2_1955201182.setSelected(true);
        jenisKelamin= "Laki-Laki";
    }

    String jenisKelamin;
    
    public void clear(){
        textFieldNama_1955201182.setText("");
        textFieldAlamat_1955201182.setText("");
        textFieldNoHp_1955201182.setText("");
        comboBoxStatus_1955201182.setSelectedIndex(0);
        radioButtonLaki2_1955201182.setSelected(true);
        jenisKelamin= "Laki-Laki";
        radioButtonPerempuan_1955201182.setSelected(false);
    }
    
    private void submit(){
        
        boolean nama, alamat, noHp;
        
        nama = textFieldNama_1955201182.getText().isEmpty();  
        alamat = textFieldAlamat_1955201182.getText().isEmpty();  
        noHp = textFieldNoHp_1955201182.getText().isEmpty();
        
        if(comboBoxStatus_1955201182.getSelectedItem().equals("-- Pilih --")){
            
            JOptionPane.showMessageDialog(null, "Harap Pilih Status", "Kesalahan !", JOptionPane.ERROR_MESSAGE);
        } else{
            
            if(nama && alamat && noHp){
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null, "Maaf \n Data  Tidak Boleh Kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            } else{
                
                try {
                    DefaultTableModel model = (DefaultTableModel)Menu.tableData_1955201182.getModel();
                    model.addRow(new Object[]{
                        Menu.tableData_1955201182.getRowCount()+1, textFieldNama_1955201182.getText(), 
                        textFieldAlamat_1955201182.getText(), textFieldNoHp_1955201182.getText(), jenisKelamin, comboBoxStatus_1955201182.getSelectedItem()
                    });
                } catch (Exception e) {
                }
                
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses !", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldNama_1955201182 = new javax.swing.JTextField();
        textFieldAlamat_1955201182 = new javax.swing.JTextField();
        textFieldNoHp_1955201182 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioButtonLaki2_1955201182 = new javax.swing.JRadioButton();
        radioButtonPerempuan_1955201182 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        comboBoxStatus_1955201182 = new javax.swing.JComboBox<>();
        buttonSubmit_1955201182 = new javax.swing.JButton();
        buttonClear_1955201182 = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Input Data");

        jPanel1.setBackground(new java.awt.Color(0, 31, 122));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(474, 544));

        textFieldNoHp_1955201182.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNoHp_1955201182KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alamat");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. HP");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Kelamin");

        radioButtonLaki2_1955201182.setBackground(new java.awt.Color(0, 31, 122));
        radioButtonLaki2_1955201182.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonLaki2_1955201182.setText("Laki - Laki");
        radioButtonLaki2_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonLaki2_1955201182ActionPerformed(evt);
            }
        });

        radioButtonPerempuan_1955201182.setBackground(new java.awt.Color(0, 31, 122));
        radioButtonPerempuan_1955201182.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonPerempuan_1955201182.setText("Perempuan");
        radioButtonPerempuan_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPerempuan_1955201182ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");

        comboBoxStatus_1955201182.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ODP", "PDP", "Positif Corona" }));

        buttonSubmit_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/btn-submit.png"))); // NOI18N
        buttonSubmit_1955201182.setText("Submit");
        buttonSubmit_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSubmit_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmit_1955201182ActionPerformed(evt);
            }
        });

        buttonClear_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/btn-clear.png"))); // NOI18N
        buttonClear_1955201182.setText("Clear");
        buttonClear_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClear_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClear_1955201182ActionPerformed(evt);
            }
        });

        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/btn-close.png"))); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inut Data Yang Terpapar COVID-19");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/stayhome.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(textFieldNama_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(textFieldAlamat_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(textFieldNoHp_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(radioButtonLaki2_1955201182)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonPerempuan_1955201182))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(comboBoxStatus_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(buttonSubmit_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonClear_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(textFieldNama_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(textFieldAlamat_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(textFieldNoHp_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(radioButtonLaki2_1955201182)
                    .addComponent(radioButtonPerempuan_1955201182))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(comboBoxStatus_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSubmit_1955201182)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonClear_1955201182)
                        .addComponent(btnKeluar)))
                .addGap(38, 38, 38))
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

        setSize(new java.awt.Dimension(472, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void buttonClear_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClear_1955201182ActionPerformed
        clear();
    }//GEN-LAST:event_buttonClear_1955201182ActionPerformed

    private void radioButtonLaki2_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonLaki2_1955201182ActionPerformed
        if(radioButtonLaki2_1955201182.isSelected()){
            radioButtonPerempuan_1955201182.setSelected(false);
            jenisKelamin= "Laki-Laki";
        }
    }//GEN-LAST:event_radioButtonLaki2_1955201182ActionPerformed

    private void radioButtonPerempuan_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPerempuan_1955201182ActionPerformed
        if(radioButtonPerempuan_1955201182.isSelected()){
            radioButtonLaki2_1955201182.setSelected(false);
            jenisKelamin = "Perempuan";
        }
    }//GEN-LAST:event_radioButtonPerempuan_1955201182ActionPerformed

    private void buttonSubmit_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmit_1955201182ActionPerformed
        submit();
    }//GEN-LAST:event_buttonSubmit_1955201182ActionPerformed

    private void textFieldNoHp_1955201182KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNoHp_1955201182KeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldNoHp_1955201182KeyTyped

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
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton buttonClear_1955201182;
    private javax.swing.JButton buttonSubmit_1955201182;
    private javax.swing.JComboBox<String> comboBoxStatus_1955201182;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioButtonLaki2_1955201182;
    private javax.swing.JRadioButton radioButtonPerempuan_1955201182;
    private javax.swing.JTextField textFieldAlamat_1955201182;
    private javax.swing.JTextField textFieldNama_1955201182;
    private javax.swing.JTextField textFieldNoHp_1955201182;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        ImageIcon icon = new ImageIcon("src/com/covid19/icon/saveHealth.png");
        setIconImage(icon.getImage());
    }
}
