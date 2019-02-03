
package ManageAirlines;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewAirlinerJpanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private TravelAgency travelagency;
    private Airliner airliner;
    public ViewAirlinerJpanel(JPanel rightPanel,Airliner airliner,TravelAgency travelagency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelagency = travelagency;
        this.airliner = airliner;
        viewairlineName_TextField.setText(airliner.getName());
        viewairlineAddress_TextField.setText(airliner.getAddress());
        viewairlineFlightsCount_TextField.setText(String.valueOf(airliner.getNumber_Of_flights()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewairlineName_TextField = new javax.swing.JTextField();
        viewairlineAddress_TextField = new javax.swing.JTextField();
        viewairlineFlightsCount_TextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        Back = new java.awt.Button();
        Update = new java.awt.Button();
        Save = new java.awt.Button();
        label3 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        viewairlineName_TextField.setEditable(false);
        viewairlineName_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        viewairlineAddress_TextField.setEditable(false);
        viewairlineAddress_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        viewairlineFlightsCount_TextField.setEditable(false);
        viewairlineFlightsCount_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("Airline Name");

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setMinimumSize(new java.awt.Dimension(101, 27));
        label2.setText("Number Of Flights");

        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setMinimumSize(new java.awt.Dimension(101, 27));
        label4.setText("Address");

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

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("VIEW/UPDATE AIRLINERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewairlineName_TextField)
                                .addComponent(viewairlineAddress_TextField)
                                .addComponent(viewairlineFlightsCount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewairlineName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewairlineAddress_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewairlineFlightsCount_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        
        Component[] components = rightPanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManagAirlineJPanel)
            {
                ManagAirlineJPanel panel = (ManagAirlineJPanel)c;
                panel.populate();
            }
        }
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        viewairlineName_TextField.setEditable(true);
        viewairlineAddress_TextField.setEditable(true);
        viewairlineFlightsCount_TextField.setEditable(true);
        Save.setEnabled(true);
        Update.setEnabled(false);
    }//GEN-LAST:event_UpdateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(viewairlineName_TextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Airliner Name cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(viewairlineAddress_TextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Airliner Address cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            Integer.parseInt(viewairlineFlightsCount_TextField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in Number of flights","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        airliner.setName(viewairlineName_TextField.getText());
        airliner.setAddress(viewairlineAddress_TextField.getText());
        airliner.setNumber_Of_flights(Integer.parseInt(viewairlineFlightsCount_TextField.getText()));
        JOptionPane.showMessageDialog(null,"Update successfully","SUCCESS!!!",JOptionPane.INFORMATION_MESSAGE);
        Save.setEnabled(false);
        Update.setEnabled(true);
        
        System.err.println(airliner.getAddress());
        System.err.println(airliner.getName());
        System.err.println(airliner.getNumber_Of_flights());
        viewairlineName_TextField.setEditable(false);
        viewairlineAddress_TextField.setEditable(false);
        viewairlineFlightsCount_TextField.setEditable(false);
    }//GEN-LAST:event_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back;
    private java.awt.Button Save;
    private java.awt.Button Update;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField viewairlineAddress_TextField;
    private javax.swing.JTextField viewairlineFlightsCount_TextField;
    private javax.swing.JTextField viewairlineName_TextField;
    // End of variables declaration//GEN-END:variables
}
