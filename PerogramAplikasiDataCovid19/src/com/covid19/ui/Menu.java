package com.covid19.ui;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        icon();
    }

    private void delete(){
        try {
            DefaultTableModel dataTabel = (DefaultTableModel) tableData_1955201182.getModel();
            int SelectedRowIndex = tableData_1955201182.getSelectedRow();
            dataTabel.removeRow(SelectedRowIndex); 
        } catch (Exception e) {
        }
    }
    
    public static void exit(){
        JDialog.setDefaultLookAndFeelDecorated(true);
        
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar dari Aplikasi ?","Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
        } else if(response == JOptionPane.NO_OPTION){
        }
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        miDelete_1955201182 = new javax.swing.JMenuItem();
        toolBar_1955201182 = new javax.swing.JToolBar();
        buttonTambahData_1955201182 = new javax.swing.JButton();
        buttonHapus_1955201183 = new javax.swing.JButton();
        buttonKeluar_1955201182 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData_1955201182 = new javax.swing.JTable();
        menuBar_1955201182 = new javax.swing.JMenuBar();
        menuPilihan_1955201182 = new javax.swing.JMenu();
        menuItemTambahData_1955201182 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemkeluar_1955201182 = new javax.swing.JMenuItem();
        menuEdit_1955201182 = new javax.swing.JMenu();
        menuItemHapus_1955201182 = new javax.swing.JMenuItem();
        menuTentang_1955201182 = new javax.swing.JMenu();
        menuItemKontak_1955201182 = new javax.swing.JMenuItem();
        menuItemInformasi_1955201182 = new javax.swing.JMenuItem();

        miDelete_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-delet.png"))); // NOI18N
        miDelete_1955201182.setText("Hapus");
        miDelete_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDelete_1955201182_1955201182ActionPerformed(evt);
            }
        });
        popupMenu.add(miDelete_1955201182);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Data Warga yang Terpapar Covid-19");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        toolBar_1955201182.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toolBar_1955201182.setRollover(true);

        buttonTambahData_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/tb-add.png"))); // NOI18N
        buttonTambahData_1955201182.setToolTipText("Tambah Data (Ctrl+T)");
        buttonTambahData_1955201182.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        buttonTambahData_1955201182.setFocusable(false);
        buttonTambahData_1955201182.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTambahData_1955201182.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTambahData_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahData_1955201182ActionPerformed(evt);
            }
        });
        toolBar_1955201182.add(buttonTambahData_1955201182);

        buttonHapus_1955201183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/btn-delete.png"))); // NOI18N
        buttonHapus_1955201183.setToolTipText("Hapus Data (Delete)");
        buttonHapus_1955201183.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        buttonHapus_1955201183.setFocusable(false);
        buttonHapus_1955201183.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonHapus_1955201183.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHapus_1955201183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapus_1955201183ActionPerformed(evt);
            }
        });
        toolBar_1955201182.add(buttonHapus_1955201183);

        buttonKeluar_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/tb-exit.png"))); // NOI18N
        buttonKeluar_1955201182.setToolTipText("Keluar dari Aplikasi");
        buttonKeluar_1955201182.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        buttonKeluar_1955201182.setFocusable(false);
        buttonKeluar_1955201182.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonKeluar_1955201182.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonKeluar_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluar_1955201182ActionPerformed(evt);
            }
        });
        toolBar_1955201182.add(buttonKeluar_1955201182);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tableData_1955201182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableData_1955201182.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Alamat", "No HP", "Jenis Kelamin", "Status"
            }
        ));
        tableData_1955201182.setGridColor(new java.awt.Color(255, 0, 51));
        tableData_1955201182.setInheritsPopupMenu(true);
        tableData_1955201182.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tableData_1955201182.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableData_1955201182.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableData_1955201182MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData_1955201182);

        menuBar_1955201182.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuPilihan_1955201182.setMnemonic('P');
        menuPilihan_1955201182.setText("Pilihan");

        menuItemTambahData_1955201182.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuItemTambahData_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-add.png"))); // NOI18N
        menuItemTambahData_1955201182.setMnemonic('T');
        menuItemTambahData_1955201182.setText("Tambah Data");
        menuItemTambahData_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahData_1955201182ActionPerformed(evt);
            }
        });
        menuPilihan_1955201182.add(menuItemTambahData_1955201182);
        menuPilihan_1955201182.add(jSeparator1);

        menuItemkeluar_1955201182.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuItemkeluar_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-exit.png"))); // NOI18N
        menuItemkeluar_1955201182.setMnemonic('K');
        menuItemkeluar_1955201182.setText("Keluar Dari Program");
        menuItemkeluar_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemkeluar_1955201182ActionPerformed(evt);
            }
        });
        menuPilihan_1955201182.add(menuItemkeluar_1955201182);

        menuBar_1955201182.add(menuPilihan_1955201182);

        menuEdit_1955201182.setMnemonic('E');
        menuEdit_1955201182.setText("Edit");

        menuItemHapus_1955201182.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        menuItemHapus_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-delet.png"))); // NOI18N
        menuItemHapus_1955201182.setMnemonic('H');
        menuItemHapus_1955201182.setText("Hapus Data");
        menuItemHapus_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHapus_1955201182ActionPerformed(evt);
            }
        });
        menuEdit_1955201182.add(menuItemHapus_1955201182);

        menuBar_1955201182.add(menuEdit_1955201182);

        menuTentang_1955201182.setMnemonic('T');
        menuTentang_1955201182.setText("Tentang");

        menuItemKontak_1955201182.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuItemKontak_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-mail-send.png"))); // NOI18N
        menuItemKontak_1955201182.setMnemonic('K');
        menuItemKontak_1955201182.setText("Kontak");
        menuItemKontak_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemKontak_1955201182ActionPerformed(evt);
            }
        });
        menuTentang_1955201182.add(menuItemKontak_1955201182);

        menuItemInformasi_1955201182.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuItemInformasi_1955201182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/covid19/icon/mi-info.png"))); // NOI18N
        menuItemInformasi_1955201182.setMnemonic('I');
        menuItemInformasi_1955201182.setText("Informasi");
        menuItemInformasi_1955201182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInformasi_1955201182ActionPerformed(evt);
            }
        });
        menuTentang_1955201182.add(menuItemInformasi_1955201182);

        menuBar_1955201182.add(menuTentang_1955201182);

        setJMenuBar(menuBar_1955201182);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar_1955201182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar_1955201182, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(856, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();   
    }//GEN-LAST:event_formWindowClosing

    private void buttonKeluar_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluar_1955201182ActionPerformed
        exit();
    }//GEN-LAST:event_buttonKeluar_1955201182ActionPerformed

    private void menuItemkeluar_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemkeluar_1955201182ActionPerformed
        exit();
    }//GEN-LAST:event_menuItemkeluar_1955201182ActionPerformed

    private void menuItemTambahData_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahData_1955201182ActionPerformed
        new input().setVisible(true);
    }//GEN-LAST:event_menuItemTambahData_1955201182ActionPerformed

    private void buttonTambahData_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahData_1955201182ActionPerformed
        new input().setVisible(true);
    }//GEN-LAST:event_buttonTambahData_1955201182ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        tableData_1955201182.getSelectionModel().clearSelection();
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tableData_1955201182MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableData_1955201182MouseClicked
        if(evt.getButton()== MouseEvent.BUTTON3){
            popupMenu.show((Component)evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableData_1955201182MouseClicked

    private void menuItemHapus_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHapus_1955201182ActionPerformed
        delete();
    }//GEN-LAST:event_menuItemHapus_1955201182ActionPerformed

    private void miDelete_1955201182_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDelete_1955201182_1955201182ActionPerformed
        delete();
    }//GEN-LAST:event_miDelete_1955201182_1955201182ActionPerformed

    private void buttonHapus_1955201183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapus_1955201183ActionPerformed
        delete();
    }//GEN-LAST:event_buttonHapus_1955201183ActionPerformed

    private void menuItemInformasi_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInformasi_1955201182ActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_menuItemInformasi_1955201182ActionPerformed

    private void menuItemKontak_1955201182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemKontak_1955201182ActionPerformed
        try {
            url("https://mail.google.com/mail/u/0/?view=cm&fs=1&tf=1&source=mailto&su=Info+Aplikasi+Data+Covid19&to=abugrayhat@gmail.com");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menuItemKontak_1955201182ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus_1955201183;
    private javax.swing.JButton buttonKeluar_1955201182;
    private javax.swing.JButton buttonTambahData_1955201182;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar_1955201182;
    private javax.swing.JMenu menuEdit_1955201182;
    private javax.swing.JMenuItem menuItemHapus_1955201182;
    private javax.swing.JMenuItem menuItemInformasi_1955201182;
    private javax.swing.JMenuItem menuItemKontak_1955201182;
    private javax.swing.JMenuItem menuItemTambahData_1955201182;
    private javax.swing.JMenuItem menuItemkeluar_1955201182;
    private javax.swing.JMenu menuPilihan_1955201182;
    private javax.swing.JMenu menuTentang_1955201182;
    private javax.swing.JMenuItem miDelete_1955201182;
    private javax.swing.JPopupMenu popupMenu;
    public static javax.swing.JTable tableData_1955201182;
    private javax.swing.JToolBar toolBar_1955201182;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        ImageIcon icon = new ImageIcon("src/com/covid19/icon/saveHealth.png");
        setIconImage(icon.getImage());
    }

    public static void url(String url){
        Desktop de = Desktop.getDesktop();
        try {
            URI uri = new URI(url);
            
            if(Desktop.isDesktopSupported()){
                try {
                    de.browse(uri);
                } catch (IOException e) {
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
