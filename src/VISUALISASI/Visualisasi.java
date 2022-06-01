
package VISUALISASI;

import VISUALISASI.*;
import HOME.Home;
import TEORI.Teori;
import config.koneksi;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Visualisasi extends javax.swing.JFrame {
    private koneksi db = new koneksi();
    int id_pesan = 1;
    int id_biner = 1;
    
    public Visualisasi() {
        initComponents();
        jPanel3.setVisible(false);
        jPanel8.setVisible(false);
        txt_pesan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txt_output2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txt_adc.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txt_dac2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
    
     public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();

    }

    public static String prettyBinary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MENU = new komponen.JPANEL();
        DASHBOARD = new komponen.JPANEL();
        dsb_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VISUALISASI = new komponen.JPANEL();
        vs_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TENTANG = new komponen.JPANEL();
        tr_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        logo = new komponen.JPANEL();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        LABEL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BODY = new komponen.JPANEL();
        panel_penerima2 = new javax.swing.JPanel();
        txt_output2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_dac2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_dac2 = new javax.swing.JTextArea();
        btn_demodulasi2 = new javax.swing.JButton();
        jPanel8 = new DemodulasiWave();
        jLabel15 = new javax.swing.JLabel();
        btn_output = new javax.swing.JButton();
        panel_pengirim = new javax.swing.JPanel();
        txt_pesan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_adc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adc = new javax.swing.JTextArea();
        btn_modulasi = new javax.swing.JButton();
        jPanel3 = new ModulasiWave();
        jLabel17 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(16, 21, 51));

        MENU.setForeground(new java.awt.Color(47, 53, 103));
        MENU.setPreferredSize(new java.awt.Dimension(331, 690));
        MENU.setRoundTopLeft(30);
        MENU.setRoundqBottomLeft(30);
        MENU.setRoundqBottomRight(30);
        MENU.setRoundqTopRight(30);

        DASHBOARD.setForeground(new java.awt.Color(47, 53, 103));
        DASHBOARD.setPreferredSize(new java.awt.Dimension(278, 59));
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

        dsb_label.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        dsb_label.setForeground(new java.awt.Color(255, 255, 255));
        dsb_label.setText("Home");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/Home_icon.png"))); // NOI18N

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsb_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addComponent(dsb_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        VISUALISASI.setBackground(new java.awt.Color(255, 255, 255));
        VISUALISASI.setForeground(new java.awt.Color(255, 255, 255));
        VISUALISASI.setPreferredSize(new java.awt.Dimension(278, 59));
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

        vs_label.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        vs_label.setText("Visualisasi");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/Message_icon.png"))); // NOI18N

        javax.swing.GroupLayout VISUALISASILayout = new javax.swing.GroupLayout(VISUALISASI);
        VISUALISASI.setLayout(VISUALISASILayout);
        VISUALISASILayout.setHorizontalGroup(
            VISUALISASILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VISUALISASILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vs_label, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        VISUALISASILayout.setVerticalGroup(
            VISUALISASILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_label, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addGroup(VISUALISASILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tr_label.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        tr_label.setForeground(new java.awt.Color(255, 255, 255));
        tr_label.setText("Teori");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/Activity_1.png"))); // NOI18N

        javax.swing.GroupLayout TENTANGLayout = new javax.swing.GroupLayout(TENTANG);
        TENTANG.setLayout(TENTANGLayout);
        TENTANGLayout.setHorizontalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TENTANGLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tr_label, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TENTANGLayout.setVerticalGroup(
            TENTANGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tr_label, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TENTANGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LOGO.setBackground(new java.awt.Color(255, 255, 255));
        LOGO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 81, 81));
        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setText("APPEKS");

        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setPreferredSize(new java.awt.Dimension(70, 70));
        logo.setRoundTopLeft(100);
        logo.setRoundqBottomLeft(100);
        logo.setRoundqBottomRight(100);
        logo.setRoundqTopRight(100);
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/side_bar_logo.png"))); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("<html>Apliksi Pembelajaran Proses Sistem Komunikasi Wireless</html>");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/logout_icon.png"))); // NOI18N

        btn_logout.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 81, 81));
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MENULayout = new javax.swing.GroupLayout(MENU);
        MENU.setLayout(MENULayout);
        MENULayout.setHorizontalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MENULayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DASHBOARD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MENULayout.createSequentialGroup()
                                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LOGO)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(MENULayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(VISUALISASI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TENTANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MENULayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_logout)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        MENULayout.setVerticalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENULayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MENULayout.createSequentialGroup()
                        .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(DASHBOARD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(VISUALISASI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TENTANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        LABEL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LABEL.setForeground(new java.awt.Color(255, 255, 255));
        LABEL.setText("Visualisasi");

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>WIRELESS COMMUNICATION</html>");

        BODY.setForeground(new java.awt.Color(47, 53, 103));
        BODY.setRoundTopLeft(30);
        BODY.setRoundqBottomLeft(30);
        BODY.setRoundqBottomRight(30);
        BODY.setRoundqTopRight(30);

        panel_penerima2.setBackground(new java.awt.Color(255, 255, 255));
        panel_penerima2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Penerima", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        panel_penerima2.setForeground(new java.awt.Color(255, 255, 255));
        panel_penerima2.setOpaque(false);

        txt_output2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_output2.setBorder(null);
        txt_output2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_output2ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Output Pesan");

        btn_dac2.setBackground(new java.awt.Color(47, 53, 103));
        btn_dac2.setForeground(new java.awt.Color(47, 53, 103));
        btn_dac2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_dac.png"))); // NOI18N
        btn_dac2.setBorder(null);
        btn_dac2.setBorderPainted(false);
        btn_dac2.setContentAreaFilled(false);
        btn_dac2.setDefaultCapable(false);
        btn_dac2.setFocusPainted(false);
        btn_dac2.setFocusable(false);
        btn_dac2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dac2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dac2MouseExited(evt);
            }
        });
        btn_dac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dac2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("=");

        txt_dac2.setEditable(false);
        txt_dac2.setColumns(20);
        txt_dac2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txt_dac2.setLineWrap(true);
        txt_dac2.setRows(5);
        txt_dac2.setWrapStyleWord(true);
        txt_dac2.setBorder(null);
        txt_dac2.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_dac2.setFocusable(false);
        txt_dac2.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(txt_dac2);

        btn_demodulasi2.setBackground(new java.awt.Color(47, 53, 103));
        btn_demodulasi2.setForeground(new java.awt.Color(47, 53, 103));
        btn_demodulasi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_demodulasi.png"))); // NOI18N
        btn_demodulasi2.setBorder(null);
        btn_demodulasi2.setBorderPainted(false);
        btn_demodulasi2.setContentAreaFilled(false);
        btn_demodulasi2.setFocusPainted(false);
        btn_demodulasi2.setFocusable(false);
        btn_demodulasi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_demodulasi2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_demodulasi2MouseExited(evt);
            }
        });
        btn_demodulasi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demodulasi2ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(47, 53, 103));
        jPanel8.setForeground(new java.awt.Color(47, 53, 103));
        jPanel8.setPreferredSize(new java.awt.Dimension(537, 186));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/antena_penerima.png"))); // NOI18N

        btn_output.setBackground(new java.awt.Color(47, 53, 103));
        btn_output.setForeground(new java.awt.Color(47, 53, 103));
        btn_output.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_output.png"))); // NOI18N
        btn_output.setBorderPainted(false);
        btn_output.setContentAreaFilled(false);
        btn_output.setFocusPainted(false);
        btn_output.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_outputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_outputMouseExited(evt);
            }
        });
        btn_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_penerima2Layout = new javax.swing.GroupLayout(panel_penerima2);
        panel_penerima2.setLayout(panel_penerima2Layout);
        panel_penerima2Layout.setHorizontalGroup(
            panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_penerima2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_penerima2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_penerima2Layout.createSequentialGroup()
                        .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_penerima2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(btn_demodulasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_penerima2Layout.createSequentialGroup()
                                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_output2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(10, 10, 10)
                                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_dac2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(btn_output, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        panel_penerima2Layout.setVerticalGroup(
            panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_penerima2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(7, 7, 7)
                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_output)
                    .addComponent(txt_output2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_penerima2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_dac2))
                    .addGroup(panel_penerima2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14))
                    .addGroup(panel_penerima2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_penerima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_demodulasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        panel_pengirim.setBackground(new java.awt.Color(255, 255, 255));
        panel_pengirim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Penerima", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        panel_pengirim.setForeground(new java.awt.Color(255, 255, 255));
        panel_pengirim.setOpaque(false);

        txt_pesan.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_pesan.setBorder(null);
        txt_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesanActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Pesan");

        btn_adc.setBackground(new java.awt.Color(47, 53, 103));
        btn_adc.setForeground(new java.awt.Color(47, 53, 103));
        btn_adc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_adc.png"))); // NOI18N
        btn_adc.setAlignmentY(0.0F);
        btn_adc.setBorder(null);
        btn_adc.setBorderPainted(false);
        btn_adc.setContentAreaFilled(false);
        btn_adc.setFocusable(false);
        btn_adc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_adcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_adcMouseExited(evt);
            }
        });
        btn_adc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adcActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("=");

        txt_adc.setEditable(false);
        txt_adc.setColumns(20);
        txt_adc.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txt_adc.setLineWrap(true);
        txt_adc.setRows(5);
        txt_adc.setWrapStyleWord(true);
        txt_adc.setBorder(null);
        txt_adc.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txt_adc);

        btn_modulasi.setBackground(new java.awt.Color(47, 53, 103));
        btn_modulasi.setForeground(new java.awt.Color(47, 53, 103));
        btn_modulasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_modulasi.png"))); // NOI18N
        btn_modulasi.setBorder(null);
        btn_modulasi.setBorderPainted(false);
        btn_modulasi.setContentAreaFilled(false);
        btn_modulasi.setFocusable(false);
        btn_modulasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modulasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modulasiMouseExited(evt);
            }
        });
        btn_modulasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modulasiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(47, 53, 103));
        jPanel3.setForeground(new java.awt.Color(47, 53, 103));
        jPanel3.setAlignmentX(1.0F);
        jPanel3.setPreferredSize(new java.awt.Dimension(537, 186));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/antena_pengirim.png"))); // NOI18N

        javax.swing.GroupLayout panel_pengirimLayout = new javax.swing.GroupLayout(panel_pengirim);
        panel_pengirim.setLayout(panel_pengirimLayout);
        panel_pengirimLayout.setHorizontalGroup(
            panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pengirimLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pesan)
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addComponent(btn_adc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panel_pengirimLayout.createSequentialGroup()
                                .addComponent(btn_modulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panel_pengirimLayout.setVerticalGroup(
            panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pengirimLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(txt_pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pengirimLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adc))
                .addGap(18, 18, 18)
                .addGroup(panel_pengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modulasi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komponen/btn_reset.png"))); // NOI18N
        btn_reset.setBorder(null);
        btn_reset.setBorderPainted(false);
        btn_reset.setContentAreaFilled(false);
        btn_reset.setDefaultCapable(false);
        btn_reset.setFocusPainted(false);
        btn_reset.setFocusable(false);
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetMouseExited(evt);
            }
        });
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BODYLayout = new javax.swing.GroupLayout(BODY);
        BODY.setLayout(BODYLayout);
        BODYLayout.setHorizontalGroup(
            BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BODYLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BODYLayout.createSequentialGroup()
                        .addComponent(panel_pengirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(panel_penerima2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        BODYLayout.setVerticalGroup(
            BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BODYLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pengirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_penerima2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_reset)
                .addGap(25, 25, 25))
        );

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
                        .addComponent(LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
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

    private void VISUALISASIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseEntered
       
    }//GEN-LAST:event_VISUALISASIMouseEntered

    private void VISUALISASIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VISUALISASIMouseExited
       
    }//GEN-LAST:event_VISUALISASIMouseExited

    private void TENTANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseClicked
        Teori tt = new Teori();
        tt.setVisible(true);
        tt.pack();
        tt.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_TENTANGMouseClicked

    private void TENTANGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseEntered
        VISUALISASI.setForeground(new Color(47, 53, 103));

        vs_label.setForeground(new Color(255,255,255));
        dsb_label.setForeground(new Color(255,255,255));

        TENTANG.setForeground(new Color(255,255,255));

        tr_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_TENTANGMouseEntered

    private void TENTANGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENTANGMouseExited
        VISUALISASI.setForeground(new Color(255,255,255));

        vs_label.setForeground(new Color(47, 53, 103));
        dsb_label.setForeground(new Color(255,255,255));

        TENTANG.setForeground(new Color(47, 53, 103));

        tr_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_TENTANGMouseExited

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_logout.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        btn_logout.setForeground(new Color(0xFF5151));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void txt_output2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_output2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_output2ActionPerformed

    private void btn_dac2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dac2MouseEntered
        btn_dac2.setSize(130,60);
    }//GEN-LAST:event_btn_dac2MouseEntered

    private void btn_dac2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dac2MouseExited
        btn_dac2.setSize(130,55);
    }//GEN-LAST:event_btn_dac2MouseExited

    private void btn_dac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dac2ActionPerformed

        try {
            String sql = "SELECT biner_pesan from biner where id_biner="+id_biner+"";
            PreparedStatement ps = db.koneksidb().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            txt_dac2.setText(rs.getString("biner_pesan"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal melakukakn demodulasi"+e);
        }
    }//GEN-LAST:event_btn_dac2ActionPerformed

    private void btn_demodulasi2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_demodulasi2MouseEntered
        btn_demodulasi2.setSize(286,60);
    }//GEN-LAST:event_btn_demodulasi2MouseEntered

    private void btn_demodulasi2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_demodulasi2MouseExited
        btn_demodulasi2.setSize(286,55);
    }//GEN-LAST:event_btn_demodulasi2MouseExited

    private void btn_demodulasi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demodulasi2ActionPerformed
        jPanel8.setVisible(true);
    }//GEN-LAST:event_btn_demodulasi2ActionPerformed

    private void btn_outputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_outputMouseEntered
        btn_output.setSize(130,60);
    }//GEN-LAST:event_btn_outputMouseEntered

    private void btn_outputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_outputMouseExited
        btn_output.setSize(130,55);
    }//GEN-LAST:event_btn_outputMouseExited

    private void btn_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outputActionPerformed
        String biner = txt_dac2.getText();
        String[] parts = biner.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            int val = Integer.parseInt(part, 2);
            String c = Character.toString((char)val);
            sb.append(c);
        }
        txt_output2.setText(sb.toString());
    }//GEN-LAST:event_btn_outputActionPerformed

    private void txt_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesanActionPerformed

    private void btn_adcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adcMouseEntered
        btn_adc.setSize(129,60);
    }//GEN-LAST:event_btn_adcMouseEntered

    private void btn_adcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adcMouseExited
        btn_adc.setSize(129,57);
    }//GEN-LAST:event_btn_adcMouseExited

    private void btn_adcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adcActionPerformed
        String pesan = txt_pesan.getText();
        String result = convertStringToBinary(pesan);

        //insert pesan
        try {
            String query = "insert into pesan (pesan) values ('"+txt_pesan.getText()+"')";
            PreparedStatement ps = db.koneksidb().prepareStatement(query);
            ps.execute();

            //set biner
            txt_adc.setText(prettyBinary(result, 8, " "));

            //find id
            String query1 = "SELECT max(pesan.id_pesan) as id_pesan FROM pesan";
            PreparedStatement ps1 = db.koneksidb().prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            rs1.next();
            id_pesan = rs1.getInt("id_pesan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "insert pesan gagal"+e);
        }
        //insert detile pesan pengirim
        try {
            String query = "insert into detile_pengirim_pesan (id_pesan,id_pengirim) values ("+(id_pesan)+",1)";
            PreparedStatement ps = db.koneksidb().prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "insert detile_pesan gagal"+e);
        }

        //convert to biner
        try {
            String query = "insert into biner (biner_pesan) values ('"+txt_adc.getText()+"')";
            PreparedStatement ps = db.koneksidb().prepareStatement(query);
            ps.execute();

            //id_biner
            String query1 = "SELECT max(biner.id_biner) as id_biner FROM biner";
            PreparedStatement ps1 = db.koneksidb().prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            rs1.next();
            //find biner id
            id_biner = rs1.getInt("id_biner");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "insert to biner gagal"+e);
        }

        //insert detile biner
        try {
            String query = "insert into detile_biner (id_biner,id_pesan) values ("+id_biner+","+id_pesan+")";
            PreparedStatement ps = db.koneksidb().prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "insert detile_binaey gagal"+e);
        }
    }//GEN-LAST:event_btn_adcActionPerformed

    private void btn_modulasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modulasiMouseEntered
        btn_modulasi.setSize(235,60);
    }//GEN-LAST:event_btn_modulasiMouseEntered

    private void btn_modulasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modulasiMouseExited
        btn_modulasi.setSize(235,55);
    }//GEN-LAST:event_btn_modulasiMouseExited

    private void btn_modulasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modulasiActionPerformed
        jPanel3.setVisible(true);
    }//GEN-LAST:event_btn_modulasiActionPerformed

    private void btn_resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseEntered
        btn_reset.setSize(130, 60);
    }//GEN-LAST:event_btn_resetMouseEntered

    private void btn_resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseExited
        btn_reset.setSize(130, 56);
    }//GEN-LAST:event_btn_resetMouseExited

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_pesan.setText("");
        txt_adc.setText("");
        jPanel3.setVisible(false);
        jPanel8.setVisible(false);
        txt_dac2.setText("");
        txt_output2.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void DASHBOARDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseEntered
        VISUALISASI.setForeground(new Color(47, 53, 103));

        vs_label.setForeground(new Color(255,255,255));

        DASHBOARD.setForeground(new Color(255,255,255));

        dsb_label.setForeground(new Color(47, 53, 103));
    }//GEN-LAST:event_DASHBOARDMouseEntered

    private void DASHBOARDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOARDMouseExited
        VISUALISASI.setForeground(new Color(255,255,255));

        vs_label.setForeground(new Color(47, 53, 103));

        DASHBOARD.setForeground(new Color(47, 53, 103));

        dsb_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_DASHBOARDMouseExited

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
    private komponen.JPANEL BODY;
    private komponen.JPANEL DASHBOARD;
    private javax.swing.JLabel LABEL;
    private javax.swing.JLabel LOGO;
    private komponen.JPANEL MENU;
    private komponen.JPANEL TENTANG;
    private komponen.JPANEL VISUALISASI;
    private javax.swing.JButton btn_adc;
    private javax.swing.JButton btn_dac;
    private javax.swing.JButton btn_dac1;
    private javax.swing.JButton btn_dac2;
    private javax.swing.JButton btn_demodulasi;
    private javax.swing.JButton btn_demodulasi1;
    private javax.swing.JButton btn_demodulasi2;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_modulasi;
    private javax.swing.JButton btn_output;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel dsb_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private komponen.JPANEL logo;
    private javax.swing.JPanel panel_penerima;
    private javax.swing.JPanel panel_penerima1;
    private javax.swing.JPanel panel_penerima2;
    private javax.swing.JPanel panel_pengirim;
    private javax.swing.JLabel tr_label;
    private javax.swing.JTextArea txt_adc;
    private javax.swing.JTextArea txt_dac;
    private javax.swing.JTextArea txt_dac1;
    private javax.swing.JTextArea txt_dac2;
    private javax.swing.JTextField txt_output;
    private javax.swing.JTextField txt_output1;
    private javax.swing.JTextField txt_output2;
    private javax.swing.JTextField txt_pesan;
    private javax.swing.JLabel vs_label;
    // End of variables declaration//GEN-END:variables
}
