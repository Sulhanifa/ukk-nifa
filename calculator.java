/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lubab
 */
public class calculator extends javax.swing.JFrame {

  String angka;
  double total, angka1, angka2;
  int pilih;
    public calculator() {
        initComponents();
        angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        btnAngka7 = new javax.swing.JButton();
        btnPlusMin = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setBackground(new java.awt.Color(0, 204, 51));

        btnAngka7.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });

        btnPlusMin.setBackground(new java.awt.Color(0, 153, 153));
        btnPlusMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlusMin.setText("+/-");
        btnPlusMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinActionPerformed(evt);
            }
        });

        btnAngka8.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(0, 153, 153));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapus.setText("C");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnAngka9.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });

        btnPersen.setBackground(new java.awt.Color(0, 153, 153));
        btnPersen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPersen.setText("%");
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(0, 153, 153));
        btnBagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnAngka4.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });

        btnAngka1.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });

        btnAngka0.setBackground(new java.awt.Color(153, 0, 0));
        btnAngka0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });

        btnAngka5.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });

        btnAngka2.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });

        btnAngka6.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });

        btnAngka3.setBackground(new java.awt.Color(153, 153, 0));
        btnAngka3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(0, 153, 153));
        btnKali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnKurang.setBackground(new java.awt.Color(0, 153, 153));
        btnKurang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKoma.setBackground(new java.awt.Color(0, 153, 153));
        btnKoma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKoma.setText(",");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 153, 153));
        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSamadengan.setBackground(new java.awt.Color(0, 153, 153));
        btnSamadengan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlusMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAngka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSamadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        angka +=".";
        display.setText(angka);
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        switch(pilih){
            case 1:
                angka2=Double.parseDouble(angka);
                total=angka1+angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 2:
                angka2=Double.parseDouble(angka);
                total=angka1-angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 3:
                angka2=Double.parseDouble(angka);
                total=angka1*angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 4:
                angka2=Double.parseDouble(angka);
                total=angka1/angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;    
        }
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        angka +="6";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        angka +="9";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka9ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         display.setText("");
         angka1=0;
         angka2=0;
         total=0;
         angka="";
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
        angka +="0";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
        angka +="1";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        angka +="2";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        angka +="3";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
        angka +="4";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
        angka +="5";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        angka +="7";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        angka +="8";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
        angka2=Double.parseDouble(angka);
        total=angka2/100;
        angka=Double.toString(total);
        display.setText(angka);
    }//GEN-LAST:event_btnPersenActionPerformed

    private void btnPlusMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinActionPerformed
        angka2=Double.parseDouble(angka);
        total=0-angka2;
        angka=Double.toString(total);
        display.setText(angka);
    }//GEN-LAST:event_btnPlusMinActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnPlusMin;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
