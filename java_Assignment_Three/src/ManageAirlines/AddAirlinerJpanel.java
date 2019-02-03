
package ManageAirlines;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddAirlinerJpanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private TravelAgency travelagency;
    public AddAirlinerJpanel(JPanel rightPanel,TravelAgency travelagency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelagency = travelagency;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new java.awt.Button();
        Save = new java.awt.Button();
        airlineName_TextField = new javax.swing.JTextField();
        airlineAddress_TextField = new javax.swing.JTextField();
        airlineFlightsCount_TextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label3 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        Back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back.setLabel("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Save.setLabel("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        airlineName_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        airlineAddress_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        airlineFlightsCount_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("Airliner Name");

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("Number Of Flight Available");

        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setText("Airliner Address");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("ADD AIRLINERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(airlineAddress_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlineFlightsCount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlineName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airlineName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airlineAddress_TextField)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlineFlightsCount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(419, Short.MAX_VALUE))
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

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(airlineName_TextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Airliner Name cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(airlineAddress_TextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Airliner Address cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            Integer.parseInt(airlineFlightsCount_TextField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid value in Number of flights","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Airliner airliner = travelagency.addAirliner();
        airliner.setName(airlineName_TextField.getText());
        airliner.setAddress(airlineAddress_TextField.getText());
        airliner.setNumber_Of_flights(Integer.parseInt(airlineFlightsCount_TextField.getText()));
        JOptionPane.showMessageDialog(null,"Airliner created successfully","SUCCESS!!!",JOptionPane.INFORMATION_MESSAGE);; 
        
        airlineName_TextField.setText("");
        airlineAddress_TextField.setText("");
        airlineFlightsCount_TextField.setText("");
                
    }//GEN-LAST:event_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back;
    private java.awt.Button Save;
    private javax.swing.JTextField airlineAddress_TextField;
    private javax.swing.JTextField airlineFlightsCount_TextField;
    private javax.swing.JTextField airlineName_TextField;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
