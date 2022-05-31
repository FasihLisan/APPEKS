
package VISUALISASI;

import Backup.*;
import VISUALISASI.*;
import HOME.Home;
import Backup.*;
import Main.*;
import TEORI.Teori;
import config.koneksi;
import java.awt.Color;

public class Visualisasi extends javax.swing.JFrame {
    private koneksi db = new koneksi();
    int id_pesan = 1;
    int id_biner = 1;
    
    public Visualisasi() {
        initComponents();
        gmbrModulasi.setVisible(false);
        gmbrDemodulasi.setVisible(false);
    }


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
        tr_logo = new javax.swing.JPanel();
        tr_label = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        LABEL = new javax.swing.JLabel();
        tr = new javax.swing.JLabel();
        tr2 = new javax.swing.JLabel();
        panel_pengirim = new javax.swing.JPanel();
        txt_pesan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adc = new javax.swing.JTextArea();
        btnAdc = new javax.swing.JButton();
        btnModulasi = new javax.swing.JButton();
        antenaPengirim = new antena_pengirim();
        ;
        gmbrModulasi = new ModulasiWave();
        panel_penerima = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_pesanOutput = new javax.swing.JTextField();
        btnDAC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_adc1 = new javax.swing.JTextArea();
        btnDemodulasi = new javax.swing.JButton();
        antenaPenerima = new antena_penerima();
        ;
        gmbrDemodulasi = new DemodulasiWave();
        ;
        btnOutput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

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
        dsb_label.setText("Home");

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
        VISUALISASI.setForeground(new java.awt.Color(255, 255, 255));
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

        vs_logo.setBackground(new java.awt.Color(47, 53, 103));
        vs_logo.setForeground(new java.awt.Color(47, 53, 103));

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
        vs_label.setForeground(new java.awt.Color(47, 53, 103));
        vs_label.setText("Visualisasi");

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
        TENTANG.setForeground(new java.awt.Color(47, 53, 103));
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

        tr_logo.setBackground(new java.awt.Color(255, 255, 255));
        tr_logo.setForeground(new java.awt.Color(47, 53, 103));

        javax.swing.GroupLayout tr_logoLayout = new javax.swing.GroupLayout(tr_logo);
        tr_logo.setLayout(tr_logoLayout);
        tr_logoLayout.setHorizontalGroup(
            tr_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        tr_logoLayout.setVerticalGroup(
            tr_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        tr_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tr_label.setForeground(new java.awt.Color(255, 255, 255));
        tr_label.setText("Teori");

        javax.swing.GroupLayout TENTANGLayout = new javax.swing.GroupLayout(TENTANG);
        TENTANG.setLayout(TENTANGLayout);
        TENTANGLayout.setHorizontalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TENTANGLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tr_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tr_label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TENTANGLayout.setVerticalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tr_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TENTANGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tr_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        LABEL.setText("VISUALISASI");

        tr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tr.setForeground(new java.awt.Color(255, 255, 255));
        tr.setText("WIRELESS");

        tr2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tr2.setForeground(new java.awt.Color(255, 255, 255));
        tr2.setText("COMMUNICATION");

        panel_pengirim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pengirim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panel_pengirim.setOpaque(false);

        txt_pesan.setBackground(new java.awt.Color(255, 255, 255));
        txt_pesan.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_pesan.setForeground(new java.awt.Color(0, 0, 0));
        txt_pesan.setBorder(null);
        txt_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Input Pesan");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("=");

        txt_adc.setEditable(false);
        txt_adc.setBackground(new java.awt.Color(255, 255, 255));
        txt_adc.setColumns(20);
        txt_adc.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txt_adc.setForeground(new java.awt.Color(0, 0, 0));
        txt_adc.setLineWrap(true);
        txt_adc.setRows(5);
        txt_adc.setWrapStyleWord(true);
        txt_adc.setBorder(null);
        txt_adc.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txt_adc);

        btnAdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_adc.png"))); // NOI18N
        btnAdc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdcMouseExited(evt);
            }
        });
        btnAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcActionPerformed(evt);
            }
        });

        btnModulasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_modulasi.png"))); // NOI18N
        btnModulasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModulasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModulasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModulasiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout antenaPengirimLayout = new javax.swing.GroupLayout(antenaPengirim);
        antenaPengirim.setLayout(antenaPengirimLayout);
        antenaPengirimLayout.setHorizontalGroup(
            antenaPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        antenaPengirimLayout.setVerticalGroup(
            antenaPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gmbrModulasi.setBackground(new java.awt.Color(255, 255, 255));
        gmbrModulasi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout gmbrModulasiLayout = new javax.swing.GroupLayout(gmbrModulasi);
        gmbrModulasi.setLayout(gmbrModulasiLayout);
        gmbrModulasiLayout.setHorizontalGroup(
            gmbrModulasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gmbrModulasiLayout.setVerticalGroup(
            gmbrModulasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_pengirimLayout = new javax.swing.GroupLayout(panel_pengirim);
        panel_pengirim.setLayout(panel_pengirimLayout);
        panel_pengirimLayout.setHorizontalGroup(
            panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pengirimLayout.createSequentialGroup()
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pesan)
                            .addGroup(panel_pengirimLayout.createSequentialGroup()
                                .addComponent(btnAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addComponent(gmbrModulasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_pengirimLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addGroup(panel_pengirimLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnModulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(antenaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_pengirimLayout.setVerticalGroup(
            panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pengirimLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txt_pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addComponent(btnAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(antenaPengirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(gmbrModulasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_penerima.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Penerima", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panel_penerima.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ouput Pesan");

        txt_pesanOutput.setBackground(new java.awt.Color(255, 255, 255));
        txt_pesanOutput.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_pesanOutput.setBorder(null);
        txt_pesanOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesanOutputActionPerformed(evt);
            }
        });

        btnDAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_dac.png"))); // NOI18N
        btnDAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDACMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDACMouseExited(evt);
            }
        });
        btnDAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDACActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel4.setText("=");

        txt_adc1.setEditable(false);
        txt_adc1.setBackground(new java.awt.Color(255, 255, 255));
        txt_adc1.setColumns(20);
        txt_adc1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txt_adc1.setForeground(new java.awt.Color(0, 0, 0));
        txt_adc1.setLineWrap(true);
        txt_adc1.setRows(5);
        txt_adc1.setWrapStyleWord(true);
        txt_adc1.setBorder(null);
        txt_adc1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txt_adc1);

        btnDemodulasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_demodulasi.png"))); // NOI18N
        btnDemodulasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDemodulasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDemodulasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDemodulasiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout antenaPenerimaLayout = new javax.swing.GroupLayout(antenaPenerima);
        antenaPenerima.setLayout(antenaPenerimaLayout);
        antenaPenerimaLayout.setHorizontalGroup(
            antenaPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        antenaPenerimaLayout.setVerticalGroup(
            antenaPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        gmbrDemodulasi.setBackground(new java.awt.Color(255, 255, 255));
        gmbrDemodulasi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout gmbrDemodulasiLayout = new javax.swing.GroupLayout(gmbrDemodulasi);
        gmbrDemodulasi.setLayout(gmbrDemodulasiLayout);
        gmbrDemodulasiLayout.setHorizontalGroup(
            gmbrDemodulasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gmbrDemodulasiLayout.setVerticalGroup(
            gmbrDemodulasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        btnOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_output.png"))); // NOI18N
        btnOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOutputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOutputMouseExited(evt);
            }
        });
        btnOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_penerimaLayout = new javax.swing.GroupLayout(panel_penerima);
        panel_penerima.setLayout(panel_penerimaLayout);
        panel_penerimaLayout.setHorizontalGroup(
            panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_penerimaLayout.createSequentialGroup()
                .addGroup(panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gmbrDemodulasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_penerimaLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDAC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_penerimaLayout.createSequentialGroup()
                                .addComponent(txt_pesanOutput)
                                .addGap(18, 18, 18)
                                .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_penerimaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(antenaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDemodulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_penerimaLayout.setVerticalGroup(
            panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_penerimaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnDAC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addComponent(txt_pesanOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_penerimaLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addGroup(panel_penerimaLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(4, 4, 4)
                .addGroup(panel_penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addComponent(btnDemodulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gmbrDemodulasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_penerimaLayout.createSequentialGroup()
                        .addComponent(antenaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tr)
                            .addComponent(tr2))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel_pengirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_penerima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tr)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LABEL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_pengirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_penerima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
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
        
    }//GEN-LAST:event_VISUALISASIMouseEntered

    private void VISUALISASIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseExited
        
    }//GEN-LAST:event_VISUALISASIMouseExited

    private void TENTANGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseEntered
        TENTANG.setForeground(new Color(255,255,255));
        tr_logo.setBackground(new Color(47, 53, 103));
        tr_label.setForeground(new Color(47, 53, 103));
        
        VISUALISASI.setForeground(new Color(47, 53, 103));
        vs_logo.setBackground(new Color(255,255,255));
        vs_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_TENTANGMouseEntered

    private void TENTANGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseExited
        TENTANG.setForeground(new Color(47, 53, 103));
        tr_logo.setBackground(new Color(255,255,255));
        tr_label.setForeground(new Color(255,255,255));
        
        VISUALISASI.setForeground(new Color(255,255,255));
        vs_logo.setBackground(new Color(47, 53, 103));
        vs_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_TENTANGMouseExited

    private void DASHBOARDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseEntered
        DASHBOARD.setForeground(new Color(255,255,255));
        dsb_logo.setBackground(new Color(47, 53, 103));
        dsb_label.setForeground(new Color(47, 53, 103));
        
        VISUALISASI.setForeground(new Color(47, 53, 103));
        vs_logo.setBackground(new Color(255,255,255));
        vs_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_DASHBOARDMouseEntered

    private void DASHBOARDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseExited
         DASHBOARD.setForeground(new Color(47, 53, 103));
        dsb_logo.setBackground(new Color(255,255,255));
        dsb_label.setForeground(new Color(255,255,255));
        
        VISUALISASI.setForeground(new Color(255,255,255));
        vs_logo.setBackground(new Color(47, 53, 103));
        vs_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_DASHBOARDMouseExited

    private void DASHBOARDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_DASHBOARDMouseClicked

    private void VISUALISASIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseClicked
        Visualisasi vs = new Visualisasi();
        vs.setVisible(true);
        vs.pack();
        vs.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_VISUALISASIMouseClicked

    private void TENTANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseClicked
        Teori tt = new Teori();
        tt.setVisible(true);
        tt.pack();
        tt.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_TENTANGMouseClicked

    private void txt_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesanActionPerformed

    private void btnAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdcActionPerformed

    private void txt_pesanOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesanOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesanOutputActionPerformed

    private void btnDACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDACActionPerformed

    private void btnAdcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseClicked
       
    }//GEN-LAST:event_btnAdcMouseClicked

    private void btnAdcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseEntered
       btnAdc.setSize(119, 52);
    }//GEN-LAST:event_btnAdcMouseEntered

    private void btnAdcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseExited
       btnAdc.setSize(117, 50);
    }//GEN-LAST:event_btnAdcMouseExited

    private void btnModulasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModulasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModulasiMouseClicked

    private void btnModulasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModulasiMouseEntered
       btnModulasi.setSize(188, 51);
    }//GEN-LAST:event_btnModulasiMouseEntered

    private void btnModulasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModulasiMouseExited
        btnModulasi.setSize(186, 49);
    }//GEN-LAST:event_btnModulasiMouseExited

    private void btnDemodulasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDemodulasiMouseEntered
        btnDemodulasi.setSize(237, 51);
    }//GEN-LAST:event_btnDemodulasiMouseEntered

    private void btnDemodulasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDemodulasiMouseExited
       btnDemodulasi.setSize(235, 49);
    }//GEN-LAST:event_btnDemodulasiMouseExited

    private void btnDemodulasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDemodulasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDemodulasiMouseClicked

    private void btnOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutputActionPerformed

    private void btnDACMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDACMouseEntered
       btnDAC.setSize(119, 52);
    }//GEN-LAST:event_btnDACMouseEntered

    private void btnDACMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDACMouseExited
        btnDAC.setSize(117, 50);
    }//GEN-LAST:event_btnDACMouseExited

    private void btnOutputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseEntered
        btnOutput.setSize(119, 52);
    }//GEN-LAST:event_btnOutputMouseEntered

    private void btnOutputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutputMouseExited
        btnOutput.setSize(117, 50);
    }//GEN-LAST:event_btnOutputMouseExited

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
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Visualisasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponen.JPANEL DASHBOARD;
    private javax.swing.JLabel LABEL;
    private javax.swing.JLabel LOGO;
    private komponen.JPANEL MENU;
    private komponen.JPANEL TENTANG;
    private komponen.JPANEL VISUALISASI;
    private javax.swing.JPanel antenaPenerima;
    private javax.swing.JPanel antenaPengirim;
    private javax.swing.JButton btnAdc;
    private javax.swing.JButton btnDAC;
    private javax.swing.JButton btnDemodulasi;
    private javax.swing.JButton btnModulasi;
    private javax.swing.JButton btnOutput;
    private javax.swing.JLabel dsb_label;
    private javax.swing.JPanel dsb_logo;
    private javax.swing.JPanel gmbrDemodulasi;
    private javax.swing.JPanel gmbrModulasi;
    private javax.swing.JPanel gmbr_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_penerima;
    private javax.swing.JPanel panel_pengirim;
    private javax.swing.JLabel tr;
    private javax.swing.JLabel tr2;
    private javax.swing.JLabel tr_label;
    private javax.swing.JPanel tr_logo;
    private javax.swing.JTextArea txt_adc;
    private javax.swing.JTextArea txt_adc1;
    private javax.swing.JTextField txt_pesan;
    private javax.swing.JTextField txt_pesanOutput;
    private javax.swing.JLabel vs_label;
    private javax.swing.JPanel vs_logo;
    // End of variables declaration//GEN-END:variables
}
