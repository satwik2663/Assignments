package MainClass;

import Panel_Class.VitalSignHistory;
import Design_Panel.Create;
import Design_Panel.View;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class MainFrame extends javax.swing.JFrame {
    
    public static Double max_bloodPressure, min_bloodPressure=0.0;
    
    private VitalSignHistory vitalSignHistory;
    public MainFrame() {
        initComponents();
        //max_bloodPressure = 0.0;
        min_TextField.setText("0.0");
        min_bloodPressure = Double.parseDouble(min_TextField.getText());
        max_TextField.setText("0.0");
        max_bloodPressure = Double.parseDouble(min_TextField.getText());
        vitalSignHistory = new VitalSignHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        address_button = new javax.swing.JButton();
        address_button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        min_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        max_TextField = new javax.swing.JTextField();
        Abnormal_button = new javax.swing.JButton();
        Validation_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        address_button.setBackground(new java.awt.Color(85, 55, 118));
        address_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        address_button.setForeground(new java.awt.Color(204, 204, 204));
        address_button.setText("Enter Details");
        address_button.setBorder(null);
        address_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address_buttonMouseClicked(evt);
            }
        });
        address_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_buttonActionPerformed(evt);
            }
        });

        address_button1.setBackground(new java.awt.Color(85, 55, 118));
        address_button1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        address_button1.setForeground(new java.awt.Color(204, 204, 204));
        address_button1.setText("Display Products");
        address_button1.setBorder(null);
        address_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address_button1MouseClicked(evt);
            }
        });
        address_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_button1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(85, 55, 118));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Min BP : ");
        jLabel1.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(85, 55, 118));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Max BP:");
        jLabel2.setBorder(null);

        Abnormal_button.setBackground(new java.awt.Color(85, 55, 118));
        Abnormal_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Abnormal_button.setForeground(new java.awt.Color(204, 204, 204));
        Abnormal_button.setText("Abnormal");
        Abnormal_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Abnormal_buttonMouseClicked(evt);
            }
        });
        Abnormal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abnormal_buttonActionPerformed(evt);
            }
        });

        Validation_Label.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Validation_Label.setForeground(new java.awt.Color(255, 0, 51));
        Validation_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Validation_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(min_TextField)
                                    .addComponent(max_TextField)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Abnormal_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(address_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(address_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Validation_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Abnormal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainPanel.setLeftComponent(jPanel4);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        MainPanel.setRightComponent(jPanel1);

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void address_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_buttonActionPerformed
        Create C = new Create(vitalSignHistory);
        MainPanel.setRightComponent(C);
    }//GEN-LAST:event_address_buttonActionPerformed

    private void address_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_button1ActionPerformed
        View V = new View(vitalSignHistory);
        MainPanel.setRightComponent(V);
    }//GEN-LAST:event_address_button1ActionPerformed

    private void Abnormal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abnormal_buttonActionPerformed
       
        //max_bloodPressure = Double.parseDouble(max_TextField.getText());
        //min_bloodPressure = Double.parseDouble(min_TextField.getText());
        try {
                max_bloodPressure = Double.parseDouble(max_TextField.getText());
                min_bloodPressure = Double.parseDouble(min_TextField.getText());
            } catch (NumberFormatException ex) {
            Validation_Label.setText("Please enter valid number!!");
         }
        if(min_bloodPressure > max_bloodPressure)
        {
            MainPanel.setRightComponent(jPanel1);
            Validation_Label.setText("Please enter valid number!!");
        }
        else if(max_bloodPressure == 0.0)
        {
            MainPanel.setRightComponent(jPanel1);
            Validation_Label.setText("Please enter valid number!!");
        }
        else if(max_bloodPressure != 0.0)// && (min_bloodPressure > max_bloodPressure)) // != 0.0)
        {
              Validation_Label.setText("");
              View V = new View(vitalSignHistory);
              MainPanel.setRightComponent(V);
              
        }
        
       
        
    }//GEN-LAST:event_Abnormal_buttonActionPerformed

    private void address_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_buttonMouseClicked
        address_button.setBorder(new LineBorder(Color.YELLOW,3));
        address_button1.setBorder(new LineBorder(Color.WHITE,0));
        Abnormal_button.setBorder(new LineBorder(Color.WHITE,0));
    }//GEN-LAST:event_address_buttonMouseClicked

    private void address_button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_button1MouseClicked
        address_button.setBorder(new LineBorder(Color.WHITE,0));
        address_button1.setBorder(new LineBorder(Color.YELLOW,3));
        Abnormal_button.setBorder(new LineBorder(Color.WHITE,0));
    }//GEN-LAST:event_address_button1MouseClicked

    private void Abnormal_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Abnormal_buttonMouseClicked
        address_button.setBorder(new LineBorder(Color.WHITE,0));
        address_button1.setBorder(new LineBorder(Color.WHITE,0));
        Abnormal_button.setBorder(new LineBorder(Color.YELLOW,3));
    }//GEN-LAST:event_Abnormal_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abnormal_button;
    private javax.swing.JSplitPane MainPanel;
    private javax.swing.JLabel Validation_Label;
    private javax.swing.JButton address_button;
    private javax.swing.JButton address_button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField max_TextField;
    private javax.swing.JTextField min_TextField;
    // End of variables declaration//GEN-END:variables
}
