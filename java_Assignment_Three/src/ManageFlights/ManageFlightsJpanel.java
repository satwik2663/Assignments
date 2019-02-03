
package ManageFlights;

import Business.Airliner;
import Business.TravelAgency;
import ManageAirlines.ViewAirlinerJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManageFlightsJpanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private TravelAgency travelagency;
    public ManageFlightsJpanel(JPanel rightPanel,TravelAgency travelagency ) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelagency = travelagency;
        
        for(Airliner A : travelagency.getAirliner())
        {
           AirlinerList.addItem(A); 
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AirlinerList = new javax.swing.JComboBox();
        Go = new java.awt.Button();
        label1 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        AirlinerList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AirlinerList.setMaximumRowCount(40);
        AirlinerList.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select Airliner"}));
        AirlinerList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 1, true));

        Go.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Go.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Go.setLabel("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("SELECT THE AIRLINER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AirlinerList, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AirlinerList, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(433, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        if(AirlinerList.getSelectedItem() == "Select Airliner")
        {
            JOptionPane.showMessageDialog(null,"Please select the airliner","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            Airliner selected_airline = (Airliner)AirlinerList.getSelectedItem();
            FlightDetailsJpanel flightDetails = new FlightDetailsJpanel(rightPanel,selected_airline);
            rightPanel.add("FlightDetails", flightDetails);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);  
        }
        
    }//GEN-LAST:event_GoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AirlinerList;
    private java.awt.Button Go;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
