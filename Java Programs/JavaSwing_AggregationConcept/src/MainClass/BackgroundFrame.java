package MainClass;

import Design_Panel.Address;
import Design_Panel.CheckingAccount;
import Design_Panel.Demographic;
import Design_Panel.FinalReport;
import Design_Panel.License;
import Design_Panel.Medical;
import Design_Panel.SavingAccount;
import Design_Panel_Class.FinalReportClass;


public class BackgroundFrame extends javax.swing.JFrame {

    FinalReportClass F1; //Created a Reference Variable for FinalReportClass Class
    public BackgroundFrame() {
        initComponents();
        F1  = new FinalReportClass(); //Created an object for the frame class with referece variable F1
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        demographic_button = new javax.swing.JButton();
        address_button = new javax.swing.JButton();
        saving_button = new javax.swing.JButton();
        checking_button = new javax.swing.JButton();
        license_button = new javax.swing.JButton();
        medical_button = new javax.swing.JButton();
        report_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        demographic_button.setBackground(new java.awt.Color(85, 55, 118));
        demographic_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        demographic_button.setForeground(new java.awt.Color(204, 204, 204));
        demographic_button.setText("DEMOGRAPHIC INFORMATION");
        demographic_button.setBorder(null);
        demographic_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demographic_buttonActionPerformed(evt);
            }
        });

        address_button.setBackground(new java.awt.Color(85, 55, 118));
        address_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        address_button.setForeground(new java.awt.Color(204, 204, 204));
        address_button.setText("ADDRESS INFORMATION");
        address_button.setBorder(null);
        address_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_buttonActionPerformed(evt);
            }
        });

        saving_button.setBackground(new java.awt.Color(85, 55, 118));
        saving_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        saving_button.setForeground(new java.awt.Color(204, 204, 204));
        saving_button.setText("SAVING ACCOUNT");
        saving_button.setBorder(null);
        saving_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saving_buttonActionPerformed(evt);
            }
        });

        checking_button.setBackground(new java.awt.Color(85, 55, 118));
        checking_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        checking_button.setForeground(new java.awt.Color(204, 204, 204));
        checking_button.setText("CHECKING ACCOUNT");
        checking_button.setBorder(null);
        checking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checking_buttonActionPerformed(evt);
            }
        });

        license_button.setBackground(new java.awt.Color(85, 55, 118));
        license_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        license_button.setForeground(new java.awt.Color(204, 204, 204));
        license_button.setText("DRIVER INFROMATION");
        license_button.setBorder(null);
        license_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                license_buttonActionPerformed(evt);
            }
        });

        medical_button.setBackground(new java.awt.Color(85, 55, 118));
        medical_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        medical_button.setForeground(new java.awt.Color(204, 204, 204));
        medical_button.setText("MEDICAL RECORD");
        medical_button.setBorder(null);
        medical_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medical_buttonActionPerformed(evt);
            }
        });

        report_button.setBackground(new java.awt.Color(85, 55, 118));
        report_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        report_button.setForeground(new java.awt.Color(204, 204, 204));
        report_button.setText("REPORT");
        report_button.setBorder(null);
        report_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(medical_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(license_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(checking_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(saving_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(address_button, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(demographic_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(demographic_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(address_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(saving_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(checking_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(license_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(medical_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(report_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        MainPanel.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );

        MainPanel.setRightComponent(jPanel3);

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_buttonActionPerformed
       FinalReport R = new FinalReport(F1);
       MainPanel.setRightComponent(R);
    }//GEN-LAST:event_report_buttonActionPerformed

    private void demographic_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demographic_buttonActionPerformed
        Demographic D = new Demographic(F1);
        MainPanel.setRightComponent(D);
    }//GEN-LAST:event_demographic_buttonActionPerformed

    private void address_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_buttonActionPerformed
        Address A = new Address(F1);
        MainPanel.setRightComponent(A);    
           
    }//GEN-LAST:event_address_buttonActionPerformed

    private void saving_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saving_buttonActionPerformed
        SavingAccount S = new SavingAccount(F1);
        MainPanel.setRightComponent(S);
    }//GEN-LAST:event_saving_buttonActionPerformed

    private void checking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checking_buttonActionPerformed
        CheckingAccount C = new CheckingAccount(F1);
        MainPanel.setRightComponent(C);
    }//GEN-LAST:event_checking_buttonActionPerformed

    private void license_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_license_buttonActionPerformed
        License L = new License(F1);
        MainPanel.setRightComponent(L);
    }//GEN-LAST:event_license_buttonActionPerformed

    private void medical_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medical_buttonActionPerformed
        Medical M = new Medical(F1);
        MainPanel.setRightComponent(M);
    }//GEN-LAST:event_medical_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(BackgroundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackgroundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackgroundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackgroundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackgroundFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane MainPanel;
    private javax.swing.JButton address_button;
    private javax.swing.JButton checking_button;
    private javax.swing.JButton demographic_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton license_button;
    private javax.swing.JButton medical_button;
    private javax.swing.JButton report_button;
    private javax.swing.JButton saving_button;
    // End of variables declaration//GEN-END:variables
}
