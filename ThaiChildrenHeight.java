package MiniProject;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ThaiChildrenHeight extends javax.swing.JFrame {

    public ThaiChildrenHeight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoFemale = new javax.swing.JRadioButton();
        rdoMale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thai Children Height");

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("วัดความสูงเด็กไทย");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("เพศ");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("หญิง");

        buttonGroup1.add(rdoMale);
        rdoMale.setText("ชาย");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("อายุ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ปี");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ความสูง");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("เซนติเมตร");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalculate.setText("คำนวณ");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ผลการวัดความสูง");

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tarResult.setColumns(20);
        tarResult.setRows(5);
        jScrollPane1.setViewportView(tarResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(txtage)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(182, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoFemale)
                                .addGap(18, 18, 18)
                                .addComponent(rdoMale))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoFemale)
                    .addComponent(rdoMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnExit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMaleActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do u want to Exit");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Clear() {
        txtage.setText("");
        txtHeight.setText("");
        tarResult.setText("");
        buttonGroup1.clearSelection();
    }

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        String age = txtage.getText();
        String heiht = txtHeight.getText();

        String height = txtHeight.getText();

        int ages = Integer.valueOf(age);
        int hei = Integer.valueOf(height);
        if (rdoMale.isSelected()) {
            Males(ages, hei);
        } else {
            Female(ages, hei);
        }


    }//GEN-LAST:event_btnCalculateActionPerformed

    public void Female(int ages, int hei) throws HeadlessException {
        switch (ages) {
            case 5:
                if (hei <= 105) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 115 && hei <= 120) {
                    tarResult.setText("สูง");
                } else if (hei >= 106 && hei <= 114) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 6:
                if (hei <= 110) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 118 && hei <= 123) {
                    tarResult.setText("สูง");
                } else if (hei >= 111 && hei <= 117) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 7:
                if (hei <= 117) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 123 && hei <= 132) {
                    tarResult.setText("สูง");
                } else if (hei >= 118 && hei <= 122) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 8:
                if (hei <= 123) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 137 && hei <= 145) {
                    tarResult.setText("สูง");
                } else if (hei >= 124 && hei <= 136) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 9:
                if (hei <= 128) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 145 && hei <= 150) {
                    tarResult.setText("สูง");
                } else if (hei >= 129 && hei <= 144) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 10:
                if (hei <= 132) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 147 && hei <= 152) {
                    tarResult.setText("สูง");
                } else if (hei >= 133 && hei <= 146) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 11:
                if (hei <= 137) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 153 && hei <= 162) {
                    tarResult.setText("สูง");
                } else if (hei >= 138 && hei <= 152) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 12:
                if (hei <= 145) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 157 && hei <= 165) {
                    tarResult.setText("สูง");
                } else if (hei >= 146 && hei <= 156) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 13:
                if (hei <= 149) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 163 && hei <= 168) {
                    tarResult.setText("สูง");
                } else if (hei >= 150 && hei <= 162) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 14:
                if (hei <= 152) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 165 && hei <= 170) {
                    tarResult.setText("สูง");
                } else if (hei >= 153 && hei <= 164) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 15:
                if (hei <= 155) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 167 && hei <= 175) {
                    tarResult.setText("สูง");
                } else if (hei >= 156 && hei <= 166) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 16:
                if (hei <= 157) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 170 && hei <= 173) {
                    tarResult.setText("สูง");
                } else if (hei >= 158 && hei <= 169) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 17:
                if (hei <= 157) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 171 && hei <= 173) {
                    tarResult.setText("สูง");
                } else if (hei >= 158 && hei <= 170) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 18:
                if (hei <= 158) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 172 && hei <= 175) {
                    tarResult.setText("สูง");
                } else if (hei >= 159 && hei <= 171) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 19:
                if (hei <= 159) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 172 && hei <= 177) {
                    tarResult.setText("สูง");
                } else if (hei >= 160 && hei <= 171) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 20:
                if (hei <= 160) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 172 && hei >= 179) {
                    tarResult.setText("สูง");
                } else if (hei >= 161 && hei <= 171) {
                    tarResult.setText("สมส่วน");
                }
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่");
                break;
        }
    }

    public void Males(int ages, int hei) throws HeadlessException {

        switch (ages) {
            case 5:
                if (hei <= 105) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 115 && hei <= 120) {
                    tarResult.setText("สูง");
                } else if (hei >= 106 && hei <= 114) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 6:
                if (hei <= 112) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 118 && hei <= 125) {
                    tarResult.setText("สูง");
                } else if (hei >= 113 && hei <= 117) {
                    tarResult.setText("สมส่วน");
                }
                break;

            case 7:
                if (hei <= 117) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 125 && hei <= 132) {
                    tarResult.setText("สูง");
                } else if (hei >= 118 && hei <= 124) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 8:
                if (hei <= 122) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 136 && hei <= 145) {
                    tarResult.setText("สูง");
                } else if (hei >= 123 && hei <= 136) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 9:
                if (hei <= 126) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 142 && hei <= 152) {
                    tarResult.setText("สูง");
                } else if (hei >= 132 && hei <= 141) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 10:
                if (hei <= 136) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 146 && hei <= 158) {
                    tarResult.setText("สูง");
                } else if (hei >= 137 && hei <= 145) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 11:
                if (hei <= 136) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 158 && hei <= 163) {
                    tarResult.setText("สูง");
                } else if (hei >= 137 && hei <= 157) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 12:
                if (hei <= 142) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 162 && hei <= 168) {
                    tarResult.setText("สูง");
                } else if (hei >= 143 && hei <= 162) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 13:
                if (hei <= 146) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 165 && hei <= 170) {
                    tarResult.setText("สูง");
                } else if (hei >= 147 && hei <= 164) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 14:
                if (hei <= 150) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 172 && hei <= 175) {
                    tarResult.setText("สูง");
                } else if (hei >= 151 && hei <= 171) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 15:
                if (hei <= 157) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 177 && hei <= 185) {
                    tarResult.setText("สูง");
                } else if (hei >= 158 && hei <= 176) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 16:
                if (hei <= 160) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 181 && hei <= 187) {
                    tarResult.setText("สูง");
                } else if (hei >= 161 && hei <= 180) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 17:
                if (hei <= 163) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 183 && hei <= 189) {
                    tarResult.setText("สูง");
                } else if (hei >= 164 && hei <= 182) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 18:
                if (hei <= 165) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 185 && hei <= 189) {
                    tarResult.setText("สูง");
                } else if (hei >= 166 && hei <= 184) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 19:
                if (hei <= 165) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 187 && hei <= 190) {
                    tarResult.setText("สูง");
                } else if (hei >= 166 && hei <= 186) {
                    tarResult.setText("สมส่วน");
                }
                break;
            case 20:
                if (hei <= 161) {
                    tarResult.setText("เตี้ย");
                } else if (hei >= 188 && hei <= 192) {
                    tarResult.setText("สูง");
                } else if (hei >= 162 && hei <= 187) {
                    tarResult.setText("สมส่วน");
                }
                break;

            default:
                JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่");
                break;
        }

        //tarResult.setText(age + "\t" + heiht);
    }

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
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThaiChildrenHeight().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextArea tarResult;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables
}
