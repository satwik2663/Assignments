
package ManageCostumers;

import Business.Airliner;
import Business.CostumerDirectory;
import Business.Flight;
import Business.TravelAgency;
import ManageFlights.FlightDetailsJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManageCostumerJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private TravelAgency travelagency;
    private CostumerDirectory costumerdir;

    public ManageCostumerJPanel(JPanel rightPanel,TravelAgency travelagency,CostumerDirectory costumerdir ){
   //public ManageCostumerJPanel(JPanel rightPanel){
        initComponents();
        this.rightPanel = rightPanel;
        this.travelagency = travelagency;
        this.costumerdir = costumerdir;
        from_TextField.setText("");
        to_TextField.setText("");
        //search();
    }
    
    
    public void search()
    {
        /*for(Airliner A : travelagency.getAirliner())
        {
           airlineSelect.addItem(A); 
        }
        
        for(Airliner A : travelagency.getAirliner())
        {
            for(Flight F : A.getFlight())
            {
                From_Combo.addItem(F.getFrom());
            } 
        }
        for(Airliner A : travelagency.getAirliner())
        {
            for(Flight F : A.getFlight())
            {
                To_Combo.addItem(F.getTo());
            } 
        }*/
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        Search = new java.awt.Button();
        from_TextField = new java.awt.TextField();
        to_TextField = new java.awt.TextField();
        label3 = new java.awt.Label();

        setBackground(new java.awt.Color(56, 0, 66));

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("ARRIVAL");

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("DEPARTURE");

        Search.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Search.setLabel("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        from_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        to_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("FLIGHT SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(from_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(to_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(from_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        //String from = (String)From_Combo.getSelectedItem();
        //String to = (String)To_Combo.getSelectedItem();
        //Airliner airline_Select = (Airliner)airlineSelect.getSelectedItem();
        if(from_TextField.getText().equals("")) 
        {
             JOptionPane.showMessageDialog(null,"Please enter the Departure","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(to_TextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the Arrival","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String from = from_TextField.getText();
            String to = to_TextField.getText();
            CostumerBookFlight costumer_book = new CostumerBookFlight(rightPanel,to,from,travelagency,costumerdir);
            //CostumerBookFlight costumer_book = new CostumerBookFlight(rightPanel,airline_Select,to,from,travelagency);
            rightPanel.add("FlightDetails", costumer_book);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel); 
        }
        
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Search;
    private java.awt.TextField from_TextField;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.TextField to_TextField;
    // End of variables declaration//GEN-END:variables
}
