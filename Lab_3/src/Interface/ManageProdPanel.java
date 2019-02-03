
package Interface;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageProdPanel extends javax.swing.JPanel {

    private ProductDirectory prodDir;
    private JPanel rightPanel;

    ManageProdPanel(JPanel rightPanel,ProductDirectory prodDir) {
        initComponents();
        this.prodDir=prodDir;
        this.rightPanel = rightPanel;
        populate();
    }
    
    public void populate(){
        
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Product a : prodDir.getProductDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAvailNum();
            row[2]=a.getPrice();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        lblManage = new javax.swing.JLabel();
        lblSearchAccNo = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tblDirectory.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Name ", "Availablity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        lblManage.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblManage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManage.setText("Manage Products");

        lblSearchAccNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSearchAccNo.setText("Search by Product Name");

        btnDelete.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDelete.setText("Delete Product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDelete1.setText("View");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnDelete2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDelete2.setText("Back");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        btnDelete3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDelete3.setText("Search");
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete1)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearchAccNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete3)))
                .addContainerGap(402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchAccNo)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(271, 271, 271))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
                prodDir.deleteProduct(prod);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow<0)
        {
            //JOptionPane.showMessageDialog(null, "Please select a row to display the information");
            JOptionPane.showMessageDialog(null,"Please select a row to display the information","Error",JOptionPane.ERROR_MESSAGE);
            /*if(txtsearch.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please select a row to continue or search any query to continue");
            }  
            else
            {
                for(Product P : prodDir.getProductDirectory())
                {
                    if(txtsearch.getText().equals(P.getName()))
                    {                  
                        ViewPanel vPanel = new ViewPanel(rightPanel,P,prodDir);
                        rightPanel.add("ViewPanel", vPanel);
                        CardLayout layout = (CardLayout)rightPanel.getLayout();
                        layout.next(rightPanel);
                    }
                    else
                    {
                        ErrorLabel.setText("Nothing match with the search query");
                    }
                }
                
            }*/
        }
        else
        {
            Product prod = (Product) tblDirectory.getValueAt(selectedRow,0);
            ViewPanel vPanel = new ViewPanel(rightPanel,prod,prodDir);
            rightPanel.add("ViewPanel", vPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
            
            
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);

    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tblDirectory.getSelectionModel().clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        Product P = prodDir.searchProduct(txtsearch.getText());
        if(txtsearch.getText().equals(""))
            {
                //JOptionPane.showMessageDialog(null, "Please search any query to continue");
                JOptionPane.showMessageDialog(null,"Please search any query to continue","Error",JOptionPane.ERROR_MESSAGE);
            }               
        else 
            {
                if(P != null)
                {
                /*for(Product P : prodDir.getProductDirectory())
                {
                    if(txtsearch.getText().equals(P.getName()))
                    {      */            
                ViewPanel vPanel = new ViewPanel(rightPanel,P,prodDir);
                rightPanel.add("ViewPanel", vPanel);
                CardLayout layout = (CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
                }
                else
                {
                    //JOptionPane.showMessageDialog(null, "No Match Found"); 
                    JOptionPane.showMessageDialog(null,"No Match Found","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
             
    }//GEN-LAST:event_btnDelete3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblSearchAccNo;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
