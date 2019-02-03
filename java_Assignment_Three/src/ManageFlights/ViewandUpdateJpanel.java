/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageFlights;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewandUpdateJpanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private Airliner airliner;
    private Flight flight;

    public ViewandUpdateJpanel(JPanel rightPanel,Flight flight,Airliner airliner) {
        initComponents();
        this.rightPanel = rightPanel;
        this.flight = flight;
        this.airliner = airliner;
        ViewflightFrom_textField.setText(flight.getFrom());
        ViewflightTo_textField.setText(flight.getTo());
        ViewflightPrice_textField.setText(String.valueOf(flight.getPrice()));
        middleSeat_textField.setText(String.valueOf(flight.getMiddle()));
        aisleSeat_textField.setText(String.valueOf(flight.getIle()));
        windowSeat_textField.setText(String.valueOf(flight.getWindow()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        ViewflightTo_textField = new java.awt.TextField();
        label3 = new java.awt.Label();
        ViewflightPrice_textField = new java.awt.TextField();
        label1 = new java.awt.Label();
        ViewflightFrom_textField = new java.awt.TextField();
        Back = new java.awt.Button();
        Update = new java.awt.Button();
        Save = new java.awt.Button();
        windowSeat_textField = new java.awt.TextField();
        label4 = new java.awt.Label();
        middleSeat_textField = new java.awt.TextField();
        label5 = new java.awt.Label();
        aisleSeat_textField = new java.awt.TextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("To");

        ViewflightTo_textField.setEditable(false);
        ViewflightTo_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ViewflightTo_textField.setName(""); // NOI18N

        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("Price");

        ViewflightPrice_textField.setEditable(false);
        ViewflightPrice_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("From");

        ViewflightFrom_textField.setEditable(false);
        ViewflightFrom_textField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        Back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back.setLabel("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Update.setLabel("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Save.setEnabled(false);
        Save.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Save.setLabel("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        windowSeat_textField.setEditable(false);
        windowSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setText("Window Seat");

        middleSeat_textField.setEditable(false);
        middleSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 153, 0));
        label5.setText("Middle Seat");

        aisleSeat_textField.setEditable(false);
        aisleSeat_textField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 153, 0));
        label6.setText("Aisle Seat");

        label7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 153, 0));
        label7.setText("ENTER THE FLIGHT DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(middleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(windowSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(aisleSeat_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewflightTo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewflightPrice_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(ViewflightFrom_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(552, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewflightFrom_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewflightTo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewflightPrice_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        ViewflightFrom_textField.setEditable(true);
        ViewflightTo_textField.setEditable(true);
        ViewflightPrice_textField.setEditable(true);
        middleSeat_textField.setEditable(true);
        aisleSeat_textField.setEditable(true);
        windowSeat_textField.setEditable(true);
        Save.setEnabled(true);
        Update.setEnabled(false);
    }//GEN-LAST:event_UpdateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(ViewflightFrom_textField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Flight from field cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(ViewflightTo_textField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Flight to field s cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            Float.parseFloat(ViewflightPrice_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in Number of flights","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            Integer.parseInt(windowSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in Window Seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            Integer.parseInt(aisleSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in aisle Seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
           Integer.parseInt(middleSeat_textField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in middle Seat","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        flight.setFrom(ViewflightFrom_textField.getText());
        flight.setTo(ViewflightTo_textField.getText());
        flight.setPrice(Float.parseFloat(ViewflightPrice_textField.getText()));
        flight.setMiddle(Integer.parseInt(middleSeat_textField.getText()));
        flight.setIle(Integer.parseInt(aisleSeat_textField.getText()));
        flight.setWindow(Integer.parseInt(windowSeat_textField.getText()));
        JOptionPane.showMessageDialog(null,"Update successfully","SUCCESS!!!",JOptionPane.INFORMATION_MESSAGE);
        Save.setEnabled(false);
        Update.setEnabled(true);

        System.err.println(airliner.getAddress());
        System.err.println(airliner.getName());
        System.err.println(airliner.getNumber_Of_flights());
        
        ViewflightFrom_textField.setEditable(false);
        ViewflightTo_textField.setEditable(false);
        ViewflightPrice_textField.setEditable(false);
        middleSeat_textField.setEditable(false);
        aisleSeat_textField.setEditable(false);
        windowSeat_textField.setEditable(false);
    }//GEN-LAST:event_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back;
    private java.awt.Button Save;
    private java.awt.Button Update;
    private java.awt.TextField ViewflightFrom_textField;
    private java.awt.TextField ViewflightPrice_textField;
    private java.awt.TextField ViewflightTo_textField;
    private java.awt.TextField aisleSeat_textField;
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
