
package ManageFlights;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddFlightJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private Airliner airliner;
    public AddFlightJPanel(JPanel rightPanel,Airliner airliner) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner = airliner;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        flightFrom_textField = new java.awt.TextField();
        label2 = new java.awt.Label();
        flightTo_textField = new java.awt.TextField();
        label3 = new java.awt.Label();
        flightPrice_textField = new java.awt.TextField();
        Save = new java.awt.Button();
        Back = new java.awt.Button();
        windowSeat_textField = new java.awt.TextField();
        label4 = new java.awt.Label();
        middleSeat_textField = new java.awt.TextField();
        label5 = new java.awt.Label();
        aisleSeat_textField = new java.awt.TextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("Flight From");

        flightFrom_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("Flight To");

        flightTo_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        flightTo_textField.setName(""); // NOI18N

        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("Price");

        flightPrice_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        Save.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Save.setLabel("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back.setLabel("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        windowSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setText("Window Seat");

        middleSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 153, 0));
        label5.setText("Middle Seat");

        aisleSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 153, 0));
        label6.setText("Aisle Seat");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 153, 0));
        label7.setText("ADD FLIGHT DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(aisleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(middleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(windowSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(flightTo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(flightPrice_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(flightFrom_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(566, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(flightFrom_textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flightTo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightPrice_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(windowSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aisleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        
        if(flightFrom_textField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Flight from Name cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(flightTo_textField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Flight to cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            Float.parseFloat(flightPrice_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in Price","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            Integer.parseInt(windowSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in window seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            Integer.parseInt(aisleSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in aisle seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            Integer.parseInt(middleSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in window seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Flight flight = airliner.addFlight(); 
        flight.setFrom(flightFrom_textField.getText());
        flight.setTo(flightTo_textField.getText());
        flight.setPrice(Float.parseFloat(flightPrice_textField.getText()));
        flight.setWindow(Integer.parseInt(windowSeat_textField.getText()));
        flight.setIle(Integer.parseInt(aisleSeat_textField.getText()));
        flight.setMiddle(Integer.parseInt(middleSeat_textField.getText()));
        
        JOptionPane.showMessageDialog(null, "Creation Successfully"); 
        
           
        flightFrom_textField.setText("");
        flightTo_textField.setText("");
        flightPrice_textField.setText("");
        windowSeat_textField.setText("");
        aisleSeat_textField.setText("");
        middleSeat_textField.setText("");
        
        int a = airliner.getNumber_Of_flights();
        --a;
        airliner.setNumber_Of_flights(a);
    }//GEN-LAST:event_SaveActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        Component[] components = rightPanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof FlightDetailsJpanel)
            {
                FlightDetailsJpanel panel = (FlightDetailsJpanel)c;
                panel.populate();
            }
        }
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back;
    private java.awt.Button Save;
    private java.awt.TextField aisleSeat_textField;
    private java.awt.TextField flightFrom_textField;
    private java.awt.TextField flightPrice_textField;
    private java.awt.TextField flightTo_textField;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.TextField middleSeat_textField;
    private java.awt.TextField windowSeat_textField;
    // End of variables declaration//GEN-END:variables
}
