/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

public class ViewPanel extends javax.swing.JPanel {

    private ProductDirectory prodDir;
    private Product product;
    private JPanel rightPanel;
    ViewPanel(JPanel rightPanel,Product prod, ProductDirectory accDir) {
        initComponents();
        this.product=prod;
        this.prodDir = accDir;
        this.rightPanel = rightPanel;
        txtAvailablity.setText(String.valueOf(prod.getAvailNum()));
        txtPrice.setText(String.valueOf(prod.getPrice()));
        txtProdName.setText(prod.getName());
        txtDesc.setText(prod.getDescription());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrice = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        txtPrice.setEditable(false);

        txtProdName.setEditable(false);

        txtAvailablity.setEditable(false);

        lblBankName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblBankName.setText("Price*");

        lblRoutingNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRoutingNo.setText("Product Name*");

        lblAccNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblAccNo.setText("Availablity*");

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead.setText("View Product");

        btnUpdate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Description");

        txtDesc.setEditable(false);

        back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoutingNo)
                            .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankName)
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAvailablity)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back))
                    .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHead)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(back)
                    .addComponent(btnSave))
                .addGap(0, 335, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEditable(true);
            txtPrice.setEditable(true);
            txtProdName.setEditable(true);
            txtDesc.setEditable(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        Component[] components = rightPanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManageProdPanel)
            {
                ManageProdPanel panel = (ManageProdPanel)c;
                panel.populate();
            }
        }
    }//GEN-LAST:event_backActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
       btnSave.setEnabled(true);
       btnUpdate.setEnabled(false);
       if(txtProdName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Product Name cannot be empty");
            return;
        }
       try{
       Double.parseDouble(txtPrice.getText());
       }catch(NumberFormatException e)
       {
          //JOptionPane.showMessageDialog(null, "Enter the correct value for price");
          JOptionPane.showMessageDialog(null,"Enter an numeric value in Price","Price Error",JOptionPane.ERROR_MESSAGE);
          return;
       }
       try{
       Integer.parseInt(txtAvailablity.getText());
       }catch(NumberFormatException e)
       {
          //JOptionPane.showMessageDialog(null, "Enter the correct value for availability"); 
          JOptionPane.showMessageDialog(null,"Enter an numeric value in Availability","Availability Error",JOptionPane.ERROR_MESSAGE);
          return;
       }
       product.setName(txtProdName.getText());
       product.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
       product.setPrice(Double.parseDouble(txtPrice.getText()));
       product.setDescription(txtDesc.getText());
        
       JOptionPane.showMessageDialog(null, "Product updated successfully");
       txtAvailablity.setEditable(false);
       txtPrice.setEditable(false);
       txtProdName.setEditable(false);
       txtDesc.setEditable(false);
       btnSave.setEnabled(false);
       btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
