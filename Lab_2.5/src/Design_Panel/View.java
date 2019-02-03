
package Design_Panel;

import MainClass.MainFrame;
import Panel_Class.VitalSign;
import Panel_Class.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JPanel {
    
    VitalSignHistory vitalSignHistory;
    
    public View(VitalSignHistory vitalSignHistory) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
        populateTable();
    }
    public void populateTable()
    {
              
        DefaultTableModel defaultTableModel = (DefaultTableModel)VitalSign_JTable.getModel();
        defaultTableModel.setRowCount(0);
        
        if(MainClass.MainFrame.max_bloodPressure == 0.0 && MainClass.MainFrame.min_bloodPressure == 0.0)
        {
            for(VitalSign vitalSign : vitalSignHistory.getVital())
            {
                Object row[] = new Object[2];
                row[0] = vitalSign;
                row[1] = vitalSign.getBloodPressure();
                defaultTableModel.addRow(row);
            } 
            
            
        }
        else
        {
          for(VitalSign vitalSign : vitalSignHistory.getVital())
        {
            if(vitalSign.getBloodPressure()>= MainClass.MainFrame.max_bloodPressure || vitalSign.getBloodPressure() <= MainClass.MainFrame.min_bloodPressure)
            {
                Object row[] = new Object[2];
                row[0] = vitalSign;
                row[1] = vitalSign.getBloodPressure();
                defaultTableModel.addRow(row);  
            } 
        }
        
        MainClass.MainFrame.max_bloodPressure = 0.0;
        MainClass.MainFrame.min_bloodPressure = 0.0;
        
        
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        temperature_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bloodpressure_TextField = new javax.swing.JTextField();
        pulse_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Delete_Button = new javax.swing.JButton();
        View_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VitalSign_JTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Temperature");

        temperature_TextField.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Blood Pressure");

        bloodpressure_TextField.setEditable(false);

        pulse_TextField.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Pulse");

        date_TextField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Date");

        Delete_Button.setBackground(new java.awt.Color(85, 55, 118));
        Delete_Button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Delete_Button.setForeground(new java.awt.Color(204, 204, 204));
        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        View_Button.setBackground(new java.awt.Color(85, 55, 118));
        View_Button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        View_Button.setForeground(new java.awt.Color(204, 204, 204));
        View_Button.setText("View");
        View_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ButtonActionPerformed(evt);
            }
        });

        VitalSign_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "BP"
            }
        ));
        jScrollPane2.setViewportView(VitalSign_JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(pulse_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(bloodpressure_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(temperature_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(View_Button)
                        .addGap(30, 30, 30)
                        .addComponent(Delete_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_Button)
                    .addComponent(Delete_Button))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperature_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodpressure_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulse_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void View_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_ButtonActionPerformed
        int selection = VitalSign_JTable.getSelectedRow();
        if(selection >= 0)
        {
            VitalSign vitalSign = (VitalSign)VitalSign_JTable.getValueAt(selection, 0);
            temperature_TextField.setText(String.valueOf(vitalSign.getTemperature()));
            pulse_TextField.setText(String.valueOf(vitalSign.getPulse()));
            date_TextField.setText(String.valueOf(vitalSign.getDate()));
            bloodpressure_TextField.setText(String.valueOf(vitalSign.getBloodPressure()));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please make a selection from the table");
        }
    }//GEN-LAST:event_View_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        int selection = VitalSign_JTable.getSelectedRow();
        if(selection >= 0)
        {
            VitalSign vitalSign = (VitalSign)VitalSign_JTable.getValueAt(selection, 0);
            vitalSignHistory.deleteVitals(vitalSign);
            JOptionPane.showMessageDialog(null, "Object deleted");
            populateTable();
            temperature_TextField.setText(String.valueOf(""));
            pulse_TextField.setText(String.valueOf(""));
            date_TextField.setText("");
            bloodpressure_TextField.setText(String.valueOf(""));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please make a selection from the table");
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton View_Button;
    private javax.swing.JTable VitalSign_JTable;
    private javax.swing.JTextField bloodpressure_TextField;
    private javax.swing.JTextField date_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pulse_TextField;
    private javax.swing.JTextField temperature_TextField;
    // End of variables declaration//GEN-END:variables
}
