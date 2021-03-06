/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Teori.Teori;
import Visualisasi.visualisasi;
import java.awt.Color;

/**
 *
 * @author FASIH
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        panel_home = new javax.swing.JPanel();
        txt_home = new javax.swing.JLabel();
        panel_visualisasi = new javax.swing.JPanel();
        txt_visualisasi = new javax.swing.JLabel();
        panel_teori = new javax.swing.JPanel();
        txt_teori = new javax.swing.JLabel();
        jPanel2 = new panelGambar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_mulai_visualisasi = new javax.swing.JButton();
        txt_pelajari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_home.setBackground(new java.awt.Color(243, 247, 251));
        panel_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_homeMouseExited(evt);
            }
        });

        txt_home.setBackground(new java.awt.Color(243, 247, 251));
        txt_home.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_home.setText("Home");

        javax.swing.GroupLayout panel_homeLayout = new javax.swing.GroupLayout(panel_home);
        panel_home.setLayout(panel_homeLayout);
        panel_homeLayout.setHorizontalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_home, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        panel_homeLayout.setVerticalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_home, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        panel_visualisasi.setBackground(new java.awt.Color(255, 255, 255));
        panel_visualisasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_visualisasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_visualisasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_visualisasiMouseExited(evt);
            }
        });

        txt_visualisasi.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_visualisasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_visualisasi.setText("Visualisasi");

        javax.swing.GroupLayout panel_visualisasiLayout = new javax.swing.GroupLayout(panel_visualisasi);
        panel_visualisasi.setLayout(panel_visualisasiLayout);
        panel_visualisasiLayout.setHorizontalGroup(
            panel_visualisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_visualisasi, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        panel_visualisasiLayout.setVerticalGroup(
            panel_visualisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_visualisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_teori.setBackground(new java.awt.Color(255, 255, 255));
        panel_teori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_teoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_teoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_teoriMouseExited(evt);
            }
        });

        txt_teori.setBackground(new java.awt.Color(255, 255, 255));
        txt_teori.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_teori.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_teori.setText("Teori");

        javax.swing.GroupLayout panel_teoriLayout = new javax.swing.GroupLayout(panel_teori);
        panel_teori.setLayout(panel_teoriLayout);
        panel_teoriLayout.setHorizontalGroup(
            panel_teoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_teori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panel_teoriLayout.setVerticalGroup(
            panel_teoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_teori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_visualisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_teori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 753, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_teori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_visualisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(243, 247, 251));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to APPEKS");

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        jLabel3.setText("<html><p>APPEKS atau aplikasi pemebelajaran proses kominukasi sistem adalah aplikasi yang digunakan untuk menunjang pembelajaran khususnya sistem komunikasi, aplikasi ini terdapat teori tentang komunikasi sistem dan terdapat visulisasi proses komunikasi mulai dari informasi pengirim, adc, modulasi, demodulasi, dac hingga penerima.</p></html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_mulai_visualisasi.setBackground(new java.awt.Color(255, 255, 255));
        txt_mulai_visualisasi.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_mulai_visualisasi.setText("Mulai Visualisasi");
        txt_mulai_visualisasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_mulai_visualisasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_mulai_visualisasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_mulai_visualisasiMouseExited(evt);
            }
        });
        txt_mulai_visualisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mulai_visualisasiActionPerformed(evt);
            }
        });

        txt_pelajari.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_pelajari.setText("Pelajari teori");
        txt_pelajari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pelajariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_pelajariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_pelajariMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_mulai_visualisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_pelajari))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mulai_visualisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pelajari))
                .addContainerGap(390, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseEntered
        panel_home.setBackground(Color.decode("#F3F7FB"));
    }//GEN-LAST:event_panel_homeMouseEntered

    private void panel_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseExited
        panel_home.setBackground(Color.decode("#F3F7FB"));
    }//GEN-LAST:event_panel_homeMouseExited

    private void panel_visualisasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_visualisasiMouseEntered
        panel_visualisasi.setBackground(Color.decode("#F3F7FB"));
    }//GEN-LAST:event_panel_visualisasiMouseEntered

    private void panel_visualisasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_visualisasiMouseExited
        panel_visualisasi.setBackground(null);
    }//GEN-LAST:event_panel_visualisasiMouseExited

    private void panel_teoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_teoriMouseEntered
        panel_teori.setBackground(Color.decode("#F3F7FB"));
    }//GEN-LAST:event_panel_teoriMouseEntered

    private void panel_teoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_teoriMouseExited
        panel_teori.setBackground(null);
    }//GEN-LAST:event_panel_teoriMouseExited

    private void panel_visualisasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_visualisasiMouseClicked
        visualisasi vs = new visualisasi();
        vs.setVisible(true);
        vs.pack();
        vs.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_panel_visualisasiMouseClicked

    private void panel_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_panel_homeMouseClicked

    private void panel_teoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_teoriMouseClicked
        Teori ab = new Teori();
        ab.setVisible(true);
        ab.pack();
        ab.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_panel_teoriMouseClicked

    private void txt_mulai_visualisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mulai_visualisasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mulai_visualisasiActionPerformed

    private void txt_mulai_visualisasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mulai_visualisasiMouseClicked
        visualisasi vs = new visualisasi();
        vs.setVisible(true);
        vs.pack();
        vs.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_txt_mulai_visualisasiMouseClicked

    private void txt_pelajariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pelajariMouseClicked
        Teori ab = new Teori();
        ab.setVisible(true);
        ab.pack();
        ab.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_txt_pelajariMouseClicked

    private void txt_pelajariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pelajariMouseEntered
        txt_pelajari.setForeground(Color.red);
    }//GEN-LAST:event_txt_pelajariMouseEntered

    private void txt_pelajariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pelajariMouseExited
        txt_pelajari.setForeground(Color.black);
    }//GEN-LAST:event_txt_pelajariMouseExited

    private void txt_mulai_visualisasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mulai_visualisasiMouseEntered
        txt_mulai_visualisasi.setBackground(Color.red);
        txt_mulai_visualisasi.setForeground(Color.white);
    }//GEN-LAST:event_txt_mulai_visualisasiMouseEntered

    private void txt_mulai_visualisasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mulai_visualisasiMouseExited
        txt_mulai_visualisasi.setBackground(Color.white);
        txt_mulai_visualisasi.setForeground(Color.black);
    }//GEN-LAST:event_txt_mulai_visualisasiMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_teori;
    private javax.swing.JPanel panel_visualisasi;
    private javax.swing.JLabel txt_home;
    private javax.swing.JButton txt_mulai_visualisasi;
    private javax.swing.JLabel txt_pelajari;
    private javax.swing.JLabel txt_teori;
    private javax.swing.JLabel txt_visualisasi;
    // End of variables declaration//GEN-END:variables
}
