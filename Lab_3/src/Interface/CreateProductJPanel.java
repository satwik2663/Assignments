
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class CreateProductJPanel extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ProductDirectory prodDir;
    
    public CreateProductJPanel(JPanel rightPanel,ProductDirectory prodDir) {
        
        initComponents();
        this.prodDir = prodDir;
        this.rightPanel = rightPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead.setText("Create Product");

        lblRoutingNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRoutingNo.setText("Product Name*");

        lblAccNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblAccNo.setText("Availiblity*");

        lblBankName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblBankName.setText("Price*");

        lblBalance.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblBalance.setText("Description");

        btnCreate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCreate1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCreate1.setText("Back");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRoutingNo)
                                .addComponent(lblBalance)
                                .addComponent(lblAccNo))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCreate1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCreate))
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnCreate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(txtProdName.getText().equals(""))
        {
            //JOptionPane.showMessageDialog(null, "Product Name cannot be empty");
            JOptionPane.showMessageDialog(null,"Product Name cannot be empty","Product Name Error",JOptionPane.ERROR_MESSAGE);
            return;
        }/*
        else
        {
            for(Product P : prodDir.getProductDirectory())
                {
                    if(txtProdName.getText().equals(P.getName()))
                    {
                        JOptionPane.showMessageDialog(null, "Product Name already exists");
                        return;
                    }
                }
        }*/
        
        try
        {
            Double.parseDouble(txtPrice.getText());
        }
        catch(NumberFormatException e)   
        {
            //JOptionPane.showMessageDialog(null, "Enter an numeric value in Price");
            JOptionPane.showMessageDialog(null,"Enter an numeric value in Price","Price Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         try
         {
            Integer.parseInt(txtAvailablity.getText());
         }
         catch(NumberFormatException e)
         {
            //JOptionPane.showMessageDialog(null, "Enter an numeric value in Availability");
            JOptionPane.showMessageDialog(null,"Enter an numeric value in Availability","Availability Error",JOptionPane.ERROR_MESSAGE);
            return;
         }
         Product prod = prodDir.addProduct();
         prod.setName(txtProdName.getText());
         prod.setPrice(Double.parseDouble(txtPrice.getText()));
         prod.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
         prod.setDescription(txtDescription.getText());
            
         JOptionPane.showMessageDialog(null, "Product Created Successfully");
         txtProdName.setText("");
         txtAvailablity.setText("");
         txtPrice.setText("");
         txtDescription.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);

    }//GEN-LAST:event_btnCreate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
