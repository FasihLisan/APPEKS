/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import HOME.Home;
import Main.*;
import java.awt.Color;

/**
 *
 * @author riza5
 */
public class Tentang_bc extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Tentang_bc() {
        initComponents();
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
        MENU = new komponen.JPANEL();
        gmbr_Logo = new javax.swing.JPanel();
        DASHBOARD = new komponen.JPANEL();
        dsb_logo = new javax.swing.JPanel();
        dsb_label = new javax.swing.JLabel();
        VISUALISASI = new komponen.JPANEL();
        vs_logo = new javax.swing.JPanel();
        vs_label = new javax.swing.JLabel();
        TENTANG = new komponen.JPANEL();
        ttg_logo = new javax.swing.JPanel();
        ttg_label = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        LABEL = new javax.swing.JLabel();
        BODY = new komponen.JPANEL();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(16, 21, 51));

        MENU.setForeground(new java.awt.Color(47, 53, 103));
        MENU.setRoundTopLeft(30);
        MENU.setRoundqBottomLeft(30);
        MENU.setRoundqBottomRight(30);
        MENU.setRoundqTopRight(30);

        gmbr_Logo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout gmbr_LogoLayout = new javax.swing.GroupLayout(gmbr_Logo);
        gmbr_Logo.setLayout(gmbr_LogoLayout);
        gmbr_LogoLayout.setHorizontalGroup(
            gmbr_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        gmbr_LogoLayout.setVerticalGroup(
            gmbr_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        DASHBOARD.setForeground(new java.awt.Color(47, 53, 103));
        DASHBOARD.setRoundTopLeft(15);
        DASHBOARD.setRoundqBottomLeft(15);
        DASHBOARD.setRoundqBottomRight(15);
        DASHBOARD.setRoundqTopRight(15);
        DASHBOARD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DASHBOARDMouseExited(evt);
            }
        });

        dsb_logo.setBackground(new java.awt.Color(255, 255, 255));
        dsb_logo.setForeground(new java.awt.Color(47, 53, 103));

        javax.swing.GroupLayout dsb_logoLayout = new javax.swing.GroupLayout(dsb_logo);
        dsb_logo.setLayout(dsb_logoLayout);
        dsb_logoLayout.setHorizontalGroup(
            dsb_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        dsb_logoLayout.setVerticalGroup(
            dsb_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        dsb_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dsb_label.setForeground(new java.awt.Color(255, 255, 255));
        dsb_label.setText("DASHBOARD ");

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(dsb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsb_label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dsb_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(dsb_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VISUALISASI.setBackground(new java.awt.Color(47, 53, 103));
        VISUALISASI.setForeground(new java.awt.Color(47, 53, 103));
        VISUALISASI.setRoundTopLeft(15);
        VISUALISASI.setRoundqBottomLeft(15);
        VISUALISASI.setRoundqBottomRight(15);
        VISUALISASI.setRoundqTopRight(15);
        VISUALISASI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VISUALISASIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VISUALISASIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VISUALISASIMouseExited(evt);
            }
        });

        vs_logo.setBackground(new java.awt.Color(255, 255, 255));
        vs_logo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout vs_logoLayout = new javax.swing.GroupLayout(vs_logo);
        vs_logo.setLayout(vs_logoLayout);
        vs_logoLayout.setHorizontalGroup(
            vs_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        vs_logoLayout.setVerticalGroup(
            vs_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        vs_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        vs_label.setForeground(new java.awt.Color(255, 255, 255));
        vs_label.setText("VISUALISASI");

        javax.swing.GroupLayout VISUALISASILayout = new javax.swing.GroupLayout(VISUALISASI);
        VISUALISASI.setLayout(VISUALISASILayout);
        VISUALISASILayout.setHorizontalGroup(
            VISUALISASILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VISUALISASILayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(vs_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vs_label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        VISUALISASILayout.setVerticalGroup(
            VISUALISASILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(VISUALISASILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vs_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TENTANG.setBackground(new java.awt.Color(47, 53, 103));
        TENTANG.setForeground(new java.awt.Color(255, 255, 255));
        TENTANG.setRoundTopLeft(15);
        TENTANG.setRoundqBottomLeft(15);
        TENTANG.setRoundqBottomRight(15);
        TENTANG.setRoundqTopRight(15);
        TENTANG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TENTANGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TENTANGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TENTANGMouseExited(evt);
            }
        });

        ttg_logo.setBackground(new java.awt.Color(47, 53, 103));
        ttg_logo.setForeground(new java.awt.Color(47, 53, 103));

        javax.swing.GroupLayout ttg_logoLayout = new javax.swing.GroupLayout(ttg_logo);
        ttg_logo.setLayout(ttg_logoLayout);
        ttg_logoLayout.setHorizontalGroup(
            ttg_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        ttg_logoLayout.setVerticalGroup(
            ttg_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        ttg_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ttg_label.setForeground(new java.awt.Color(47, 53, 103));
        ttg_label.setText("TENTANG");

        javax.swing.GroupLayout TENTANGLayout = new javax.swing.GroupLayout(TENTANG);
        TENTANG.setLayout(TENTANGLayout);
        TENTANGLayout.setHorizontalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TENTANGLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ttg_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TENTANGLayout.setVerticalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ttg_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TENTANGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttg_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LOGO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setText("APPEKS");

        javax.swing.GroupLayout MENULayout = new javax.swing.GroupLayout(MENU);
        MENU.setLayout(MENULayout);
        MENULayout.setHorizontalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(gmbr_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MENULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VISUALISASI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TENTANG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MENULayout.setVerticalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gmbr_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(DASHBOARD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(VISUALISASI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TENTANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LABEL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LABEL.setForeground(new java.awt.Color(255, 255, 255));
        LABEL.setText("TENTANG");

        BODY.setForeground(new java.awt.Color(47, 53, 103));
        BODY.setRoundTopLeft(30);
        BODY.setRoundqBottomLeft(30);
        BODY.setRoundqBottomRight(30);
        BODY.setRoundqTopRight(30);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(47, 53, 103));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Proses dalam sistem komunikasi wireless :\n1. Pengirim memasukan pesan teks dan mengirimkan pesan tersebut.\n2. Pesan tersebut akan dikonversi menjadi bentuk binary menggunakan ADC\n3. Data binary akan dimodulasikan melalui antena\n4. Sinyal yang keluar akan dibawa oleh carier untuk dikirim ke penerima dan berbentuk sinyal informasi.\n5. Saat sinyal mencapai ke penerima, sinyal informasi akan di demodulasi menjadi binary menggunakan DAC\n6. Pesan yang diterima akan sesuai dengan pesan saat dikirim");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1150, 1150, 1150)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1334, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout BODYLayout = new javax.swing.GroupLayout(BODY);
        BODY.setLayout(BODYLayout);
        BODYLayout.setHorizontalGroup(
            BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BODYLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        BODYLayout.setVerticalGroup(
            BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BODYLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WIRELESS");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMMUNICATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(LABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LABEL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VISUALISASIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseEntered
        VISUALISASI.setForeground(new Color(255,255,255));
        vs_logo.setBackground(new Color(47, 53, 103));
        vs_label.setForeground(new Color(47, 53, 103));
        
       TENTANG.setForeground(new Color(47, 53, 103));
        ttg_logo.setBackground(new Color(255,255,255));
        ttg_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_VISUALISASIMouseEntered

    private void VISUALISASIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseExited
        VISUALISASI.setForeground(new Color(47, 53, 103));
        vs_logo.setBackground(new Color(255,255,255));
        vs_label.setForeground(new Color(255,255,255));
        
        TENTANG.setForeground(new Color(255,255,255));
        ttg_logo.setBackground(new Color(47, 53, 103));
        ttg_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_VISUALISASIMouseExited

    private void TENTANGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseEntered
       
    }//GEN-LAST:event_TENTANGMouseEntered

    private void TENTANGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseExited
        
    }//GEN-LAST:event_TENTANGMouseExited

    private void DASHBOARDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseEntered
        DASHBOARD.setForeground(new Color(255,255,255));
        dsb_logo.setBackground(new Color(47, 53, 103));
        dsb_label.setForeground(new Color(47, 53, 103));
        
        TENTANG.setForeground(new Color(47, 53, 103));
        ttg_logo.setBackground(new Color(255,255,255));
        ttg_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_DASHBOARDMouseEntered

    private void DASHBOARDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseExited
         DASHBOARD.setForeground(new Color(47, 53, 103));
        dsb_logo.setBackground(new Color(255,255,255));
        dsb_label.setForeground(new Color(255,255,255));
        
       TENTANG.setForeground(new Color(255,255,255));
        ttg_logo.setBackground(new Color(47, 53, 103));
        ttg_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_DASHBOARDMouseExited

    private void DASHBOARDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_DASHBOARDMouseClicked

    private void VISUALISASIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseClicked
        Visualisasi_bc vs = new Visualisasi_bc();
        vs.setVisible(true);
        vs.pack();
        vs.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_VISUALISASIMouseClicked

    private void TENTANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseClicked
        Tentang_bc tt = new Tentang_bc();
        tt.setVisible(true);
        tt.pack();
        tt.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_TENTANGMouseClicked

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
            java.util.logging.Logger.getLogger(Tentang_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tentang_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tentang_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tentang_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tentang_bc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponen.JPANEL BODY;
    private komponen.JPANEL DASHBOARD;
    private javax.swing.JLabel LABEL;
    private javax.swing.JLabel LOGO;
    private komponen.JPANEL MENU;
    private komponen.JPANEL TENTANG;
    private komponen.JPANEL VISUALISASI;
    private javax.swing.JLabel dsb_label;
    private javax.swing.JPanel dsb_logo;
    private javax.swing.JPanel gmbr_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel ttg_label;
    private javax.swing.JPanel ttg_logo;
    private javax.swing.JLabel vs_label;
    private javax.swing.JPanel vs_logo;
    // End of variables declaration//GEN-END:variables
}