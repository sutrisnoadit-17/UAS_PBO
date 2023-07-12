package com.mycompany.uas_kalkulator;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Container;
import java.text.DecimalFormat;
import javax.swing.JFrame;

/**
 *
 * @author Antasena
 */
public class UAS_Kalkulator extends javax.swing.JFrame {

    public UAS_Kalkulator() {
       
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlusMinus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnClearHistori = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAkar = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnPangkat2 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnBagiX = new javax.swing.JButton();
        txtHasil = new javax.swing.JLabel();
        txtHistori = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalklulator UAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btnPlusMinus.setBackground(new java.awt.Color(78, 80, 82));
        btnPlusMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlusMinus.setText("±");
        btnPlusMinus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPlusMinus.setBorderPainted(false);
        btnPlusMinus.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(78, 80, 82));
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn0.setBorderPainted(false);
        btn0.setPreferredSize(new java.awt.Dimension(79, 40));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnKoma.setBackground(new java.awt.Color(78, 80, 82));
        btnKoma.setForeground(new java.awt.Color(255, 255, 255));
        btnKoma.setText(".");
        btnKoma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKoma.setBorderPainted(false);
        btnKoma.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnSamadengan.setBackground(new java.awt.Color(118, 185, 237));
        btnSamadengan.setForeground(new java.awt.Color(255, 255, 255));
        btnSamadengan.setText("=");
        btnSamadengan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSamadengan.setBorderPainted(false);
        btnSamadengan.setPreferredSize(new java.awt.Dimension(79, 40));
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(78, 80, 82));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setBorderPainted(false);
        btn1.setPreferredSize(new java.awt.Dimension(79, 40));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(78, 80, 82));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setBorderPainted(false);
        btn4.setPreferredSize(new java.awt.Dimension(79, 40));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(78, 80, 82));
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn7.setBorderPainted(false);
        btn7.setOpaque(true);
        btn7.setPreferredSize(new java.awt.Dimension(79, 40));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnClearHistori.setBackground(new java.awt.Color(51, 51, 51));
        btnClearHistori.setForeground(new java.awt.Color(255, 255, 255));
        btnClearHistori.setText("CE");
        btnClearHistori.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClearHistori.setBorderPainted(false);
        btnClearHistori.setPreferredSize(new java.awt.Dimension(79, 40));
        btnClearHistori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearHistoriActionPerformed(evt);
            }
        });

        btnPersen.setBackground(new java.awt.Color(51, 51, 51));
        btnPersen.setForeground(new java.awt.Color(255, 255, 255));
        btnPersen.setText("%");
        btnPersen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPersen.setBorderPainted(false);
        btnPersen.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(78, 80, 82));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setBorderPainted(false);
        btn2.setPreferredSize(new java.awt.Dimension(79, 40));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(78, 80, 82));
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setBorderPainted(false);
        btn5.setPreferredSize(new java.awt.Dimension(79, 40));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(78, 80, 82));
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn8.setBorderPainted(false);
        btn8.setPreferredSize(new java.awt.Dimension(79, 40));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClear.setBorderPainted(false);
        btnClear.setPreferredSize(new java.awt.Dimension(79, 40));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAkar.setBackground(new java.awt.Color(51, 51, 51));
        btnAkar.setForeground(new java.awt.Color(255, 255, 255));
        btnAkar.setText("√");
        btnAkar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAkar.setBorderPainted(false);
        btnAkar.setPreferredSize(new java.awt.Dimension(79, 40));
        btnAkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkarActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(78, 80, 82));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setBorderPainted(false);
        btn3.setPreferredSize(new java.awt.Dimension(79, 40));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(78, 80, 82));
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn6.setBorderPainted(false);
        btn6.setPreferredSize(new java.awt.Dimension(79, 40));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(78, 80, 82));
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn9.setBorderPainted(false);
        btn9.setPreferredSize(new java.awt.Dimension(79, 40));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(51, 51, 51));
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("Bakspace");
        btnDel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDel.setBorderPainted(false);
        btnDel.setPreferredSize(new java.awt.Dimension(79, 40));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnPangkat2.setBackground(new java.awt.Color(51, 51, 51));
        btnPangkat2.setForeground(new java.awt.Color(255, 255, 255));
        btnPangkat2.setText("x²");
        btnPangkat2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPangkat2.setBorderPainted(false);
        btnPangkat2.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPangkat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPangkat2ActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(51, 51, 51));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("+");
        btnTambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTambah.setBorderPainted(false);
        btnTambah.setPreferredSize(new java.awt.Dimension(79, 40));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setBackground(new java.awt.Color(51, 51, 51));
        btnKurang.setForeground(new java.awt.Color(255, 255, 255));
        btnKurang.setText("─");
        btnKurang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKurang.setBorderPainted(false);
        btnKurang.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(51, 51, 51));
        btnKali.setForeground(new java.awt.Color(255, 255, 255));
        btnKali.setText("×");
        btnKali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKali.setBorderPainted(false);
        btnKali.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(51, 51, 51));
        btnBagi.setForeground(new java.awt.Color(255, 255, 255));
        btnBagi.setText("÷");
        btnBagi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBagi.setBorderPainted(false);
        btnBagi.setPreferredSize(new java.awt.Dimension(79, 40));
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnBagiX.setBackground(new java.awt.Color(51, 51, 51));
        btnBagiX.setForeground(new java.awt.Color(255, 255, 255));
        btnBagiX.setText("1/x");
        btnBagiX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBagiX.setBorderPainted(false);
        btnBagiX.setPreferredSize(new java.awt.Dimension(79, 40));
        btnBagiX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiXActionPerformed(evt);
            }
        });

        txtHasil.setBackground(new java.awt.Color(204, 255, 255));
        txtHasil.setFont(new java.awt.Font("Book Antiqua", 1, 48)); // NOI18N
        txtHasil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHasil.setText("0");

        txtHistori.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        txtHistori.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtHistori.setPreferredSize(new java.awt.Dimension(0, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPersen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnBagiX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClearHistori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPangkat2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAkar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(12, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSamadengan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHistori, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHistori, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearHistori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagiX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPangkat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("kalk");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double nilai1;
    String operator = "";
      
    
    public void tambahAngka(String a){
        if(txtHasil.getText().equals("0")){
            txtHasil.setText(a);
        }else{
            txtHasil.setText(txtHasil.getText()+a);
        }

    }
    
    public void setNilai(double a){
        nilai1 = a;
    }
    
    public String hilangkanKoma(double a){
        DecimalFormat df = new DecimalFormat("###.#");
        return  df.format(a);
    }

    public boolean cekOperator(){
        return !operator.equals("") ;
    }
    
    public void kalkulasikanNilai(){
        if(operator.equals("+")){
            nilai1 = nilai1+Double.parseDouble(txtHasil.getText());
        }else if(operator.equals("-")){
            nilai1 = nilai1-Double.parseDouble(txtHasil.getText());
        }else if(operator.equals("*")){
            nilai1 = nilai1*Double.parseDouble(txtHasil.getText());
        }else if(operator.equals("/")){
            nilai1 = nilai1/Double.parseDouble(txtHasil.getText());
        }
    }
    
    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        tambahAngka("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        tambahAngka("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        tambahAngka("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        tambahAngka("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        tambahAngka("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        tambahAngka("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        tambahAngka("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        tambahAngka("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        tambahAngka("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        tambahAngka("2");
    }//GEN-LAST:event_btn2ActionPerformed

    
    
    private void btnClearHistoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearHistoriActionPerformed
        txtHistori.setText("");
    }//GEN-LAST:event_btnClearHistoriActionPerformed


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtHistori.setText("");
        txtHasil.setText("0");
        nilai1 = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        operator = "+";
        txtHistori.setText(hilangkanKoma(nilai1)+operator);
        txtHasil.setText("0");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        operator = "-";
        txtHistori.setText(hilangkanKoma(nilai1)+operator);
        txtHasil.setText("0");
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        operator = "*";
        txtHistori.setText(hilangkanKoma(nilai1)+"x");
        txtHasil.setText("0");
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        operator = "/";
        txtHistori.setText(hilangkanKoma(nilai1)+"÷");
        txtHasil.setText("0");
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnBagiXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiXActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = 1/nilai1;
        txtHasil.setText(hilangkanKoma(nilai1));
    }//GEN-LAST:event_btnBagiXActionPerformed

    private void btnPangkat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPangkat2ActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = nilai1*nilai1;
        txtHasil.setText(hilangkanKoma(nilai1));
        txtHistori.setText("");
    }//GEN-LAST:event_btnPangkat2ActionPerformed

    private void btnAkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkarActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = Math.sqrt(nilai1);
        txtHasil.setText(hilangkanKoma(nilai1));
        txtHistori.setText("");
    }//GEN-LAST:event_btnAkarActionPerformed

    //Event untuk menghapus satu angka dari teks
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if(txtHasil.getText().length() > 1){
            StringBuffer str = new StringBuffer(txtHasil.getText());
            str = str.deleteCharAt(txtHasil.getText().length()-1);
            txtHasil.setText(String.valueOf(str));
            setNilai(Double.parseDouble(String.valueOf(str)));
        }else{
            tambahAngka("0");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
            operator = "";
            txtHistori.setText(txtHistori.getText()+txtHasil.getText());
            txtHasil.setText(hilangkanKoma(nilai1));
        }
    }//GEN-LAST:event_btnSamadenganActionPerformed

    
    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        double a = Double.parseDouble(txtHasil.getText());
        if(a<0){
            a = a+(a*-2);
            setNilai(a);
            txtHasil.setText(hilangkanKoma(nilai1));
        }else{
            a = a-(a+a);
            setNilai(a);
            txtHasil.setText(hilangkanKoma(nilai1));
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed

    
    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        txtHasil.setText(txtHasil.getText()+".");
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
        txtHistori.setText(txtHasil.getText()+"÷100");
        nilai1 = Double.parseDouble(txtHasil.getText())/100;
        txtHasil.setText(hilangkanKoma(nilai1));
    }//GEN-LAST:event_btnPersenActionPerformed

    public static void main(String args[]) {
   
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (operatortional) ">
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
            java.util.logging.Logger.getLogger(UAS_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UAS_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UAS_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UAS_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
             FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UAS_Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAkar;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnBagiX;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearHistori;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPangkat2;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel txtHasil;
    private javax.swing.JLabel txtHistori;
    // End of variables declaration//GEN-END:variables
}
