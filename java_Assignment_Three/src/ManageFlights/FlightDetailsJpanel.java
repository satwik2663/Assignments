
package ManageFlights;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import ManageAirlines.AddAirlinerJpanel;
import ManageAirlines.ViewAirlinerJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FlightDetailsJpanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    //private TravelAgency travelagency;
    private Airliner airliner;

    public FlightDetailsJpanel(JPanel rightPanel,Airliner a) {
        initComponents();
        FlightTable.setAutoCreateRowSorter(true);
        this.rightPanel = rightPanel;
        this.airliner = a;
        FlightNameJLabel.setText("ENTER THE DETAILS FOR AIRLINER : " + a.getName());
        populate();
    }
    public void populate(){
        
        DefaultTableModel dtm = (DefaultTableModel)FlightTable.getModel();
        dtm.setRowCount(0);
        
        for(Flight f : airliner.getFlight()){
            
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=f;
            row[1]=f.getFrom();
            row[2]=f.getPrice();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FlightNameJLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();
        DeleteFlight_Button = new java.awt.Button();
        createFlight = new java.awt.Button();
        Back_button = new java.awt.Button();
        viewUpdate_Button = new java.awt.Button();

        setBackground(new java.awt.Color(56, 0, 66));

        FlightNameJLabel.setAlignment(java.awt.Label.CENTER);
        FlightNameJLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        FlightNameJLabel.setForeground(new java.awt.Color(255, 153, 0));

        FlightTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "To", "From", "Price"
            }
        ));
        jScrollPane1.setViewportView(FlightTable);

        DeleteFlight_Button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteFlight_Button.setLabel("Delete Flight");
        DeleteFlight_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFlight_ButtonActionPerformed(evt);
            }
        });

        createFlight.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        createFlight.setLabel("Create Flight");
        createFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightActionPerformed(evt);
            }
        });

        Back_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back_button.setLabel("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        viewUpdate_Button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        viewUpdate_Button.setLabel("View/Update");
        viewUpdate_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUpdate_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(FlightNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewUpdate_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteFlight_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlightNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteFlight_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewUpdate_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void createFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightActionPerformed
        if(airliner.getNumber_Of_flights() <= 0)
        {
            JOptionPane.showMessageDialog(null,"Cannot add flights more flight as airliner has number of flights defined","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
        AddFlightJPanel add_flight = new AddFlightJPanel(rightPanel,airliner);
        rightPanel.add("add_flight",add_flight);
        CardLayout Layout = (CardLayout)rightPanel.getLayout();
        Layout.next(rightPanel);
        }
    }//GEN-LAST:event_createFlightActionPerformed

    private void viewUpdate_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUpdate_ButtonActionPerformed
        int selectedRow = FlightTable.getSelectedRow();
        if(selectedRow<0)
        {
            
            JOptionPane.showMessageDialog(null,"Please select a row to display the information","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Flight flight = (Flight) FlightTable.getValueAt(selectedRow,0);
            ViewandUpdateJpanel vPanel = new ViewandUpdateJpanel(rightPanel,flight,airliner);
            rightPanel.add("ViewPanel", vPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
            
            
        }
    }//GEN-LAST:event_viewUpdate_ButtonActionPerformed

    private void DeleteFlight_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFlight_ButtonActionPerformed
        int selectedRow = FlightTable.getSelectedRow();
       if(selectedRow<0)
        {
            
            JOptionPane.showMessageDialog(null,"Please select a row to delete","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Flight flight = (Flight) FlightTable.getValueAt(selectedRow,0);
            airliner.Remove(flight);  
            JOptionPane.showMessageDialog(null,"Flight has been deleted","Deleted",JOptionPane.INFORMATION_MESSAGE);
            populate();
        }
    }//GEN-LAST:event_DeleteFlight_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back_button;
    private java.awt.Button DeleteFlight_Button;
    private java.awt.Label FlightNameJLabel;
    private javax.swing.JTable FlightTable;
    private java.awt.Button createFlight;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Button viewUpdate_Button;
    // End of variables declaration//GEN-END:variables
}
