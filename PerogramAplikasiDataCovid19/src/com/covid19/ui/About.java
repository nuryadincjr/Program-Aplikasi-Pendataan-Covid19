
package com.covid19.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
        icon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonKeluar_1955201182 = new javax.swing.JButton();
        lableImage_1955201182 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneAbout_1955201182 = new javax.swing.JTextPane();
        lableUrlAbout_1955201182 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informasi");

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

        lableImage_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/covid.png"))); // NOI18N
        lableImage_1955201182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textPaneAbout_1955201182.setEditable(false);
        textPaneAbout_1955201182.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textPaneAbout_1955201182AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(textPaneAbout_1955201182);

        lableUrlAbout_1955201182.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lableUrlAbout_1955201182.setForeground(new java.awt.Color(51, 255, 255));
        lableUrlAbout_1955201182.setText("pikobar.jabarprov.go.id");
        lableUrlAbout_1955201182.setToolTipText("https://pikobar.jabarprov.go.id");
        lableUrlAbout_1955201182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lableUrlAbout_1955201182.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableUrlAbout_1955201182MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi ini Bertujuan untuk mendata masyarakat kota Bandung yang terpapar virus ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Corona atau COVID-19 (Corona Virus Disease 2019). Untuk informasi lebih lanjut ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mengenai Penyebaran COVID-19 ini , khususnya daerah Provinsi Jawa Barat bisa ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("mengunjungi alamat link berikut : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableImage_1955201182)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lableUrlAbout_1955201182))
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonKeluar_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lableImage_1955201182)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lableUrlAbout_1955201182))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonKeluar_1955201182))
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

    private void buttonKeluar_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluar_1955201182ActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonKeluar_1955201182ActionPerformed

    private void lableUrlAbout_1955201182MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableUrlAbout_1955201182MouseClicked
        Menu.url("https://pikobar.jabarprov.go.id/");
    }//GEN-LAST:event_lableUrlAbout_1955201182MouseClicked

    private void textPaneAbout_1955201182AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textPaneAbout_1955201182AncestorAdded
        textPaneAbout_1955201182.setText("PEMBUAT\nNama\t\t: Nuryadin Abutani\nNPM\t\t: 1955201182\n"
                + "Jurusan\t\t: Teknik Informatika\nKelas\t\t: TIFRP 19D\nMata Kuliah\t: Algoritma & Pemrograman II\n"
                + "Studi\t\t: Smester 2\nTanggal buat\t: 10-04-2020\nPortofolio\t\t: ");
        myLink();
    }//GEN-LAST:event_textPaneAbout_1955201182AncestorAdded

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar_1955201182;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableImage_1955201182;
    private javax.swing.JLabel lableUrlAbout_1955201182;
    private javax.swing.JTextPane textPaneAbout_1955201182;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        ImageIcon icon = new ImageIcon("src/com/covid19/icon/saveHealth.png");
        setIconImage(icon.getImage());
    }
    
    public void myLink(){
        JLabel link = new JLabel("Abugrayhat.gitub.io");
        link.setFont(textPaneAbout_1955201182.getFont());
        link.setForeground(Color.BLUE.brighter());
        
        link.setCursor(new Cursor(Cursor.HAND_CURSOR));
        link.setToolTipText("https://abugrayhat.github.io/");
        link.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent me){
                 Menu.url("https://abugrayhat.github.io/");
           }
        });
        textPaneAbout_1955201182.insertComponent(link);
    }
}
