
package ManageAirlines;

import Business.Airliner;
import Business.TravelAgency;
import ManageCostumers.ManageCostumerJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManagAirlineJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private TravelAgency travelagency;
    public ManagAirlineJPanel(JPanel rightPanel, TravelAgency travelagency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelagency = travelagency; 
        populate();
    }
    public void populate(){
        
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : travelagency.getAirliner()){
            
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAddress();
            row[2]=a.getNumber_Of_flights();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Remove = new java.awt.Button();
        View = new java.awt.Button();
        button4 = new java.awt.Button();
        label1 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Number of flights"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        Remove.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Remove.setLabel("Remove Airliner");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        View.setLabel("View/Update Airline");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        button4.setLabel("Add Airliner");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("MANAGE AIRLINERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        AddAirlinerJpanel add_airliner = new AddAirlinerJpanel(rightPanel,travelagency);
        rightPanel.add("add_airliner",add_airliner);
        CardLayout Layout = (CardLayout)rightPanel.getLayout();
        Layout.next(rightPanel);
    }//GEN-LAST:event_button4ActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
       int selectedRow = Table.getSelectedRow();
       if(selectedRow<0)
        {
            
            JOptionPane.showMessageDialog(null,"Please select a row to display the information","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Airliner airliner = (Airliner) Table.getValueAt(selectedRow,0);
            ViewAirlinerJpanel vPanel = new ViewAirlinerJpanel(rightPanel,airliner,travelagency);
            rightPanel.add("ViewPanel", vPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
            
            
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
       int selectedRow = Table.getSelectedRow();
       if(selectedRow<0)
        {
            
            JOptionPane.showMessageDialog(null,"Please select a row to delete","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Airliner airliner = (Airliner) Table.getValueAt(selectedRow,0);
            travelagency.Remove(airliner);  
            JOptionPane.showMessageDialog(null,"Airline successfully deleted","Deleted",JOptionPane.INFORMATION_MESSAGE);
            populate();
        }
    }//GEN-LAST:event_RemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Remove;
    private javax.swing.JTable Table;
    private java.awt.Button View;
    private java.awt.Button button4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

