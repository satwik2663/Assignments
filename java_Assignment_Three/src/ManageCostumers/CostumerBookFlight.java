
package ManageCostumers;

import Business.Airliner;
import Business.Costumer;
import Business.CostumerDirectory;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Window;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class CostumerBookFlight extends javax.swing.JPanel {
    private JPanel rightPanel;
    private String to;
    private String from;
    private TravelAgency travelagency;
    private ArrayList<Flight> flight = new ArrayList<Flight>();
    private CostumerDirectory costumerdir;
    //private ArrayList<Integer> window_al;
    public static int count = 0;
    
    //public CostumerBookFlight(JPanel rightPanel,Airliner airlineSelect,String to,String from,TravelAgency travelagency) 
    public CostumerBookFlight(JPanel rightPanel,String to,String from,TravelAgency travelagency,CostumerDirectory costumerdir){
        initComponents();
        this.rightPanel = rightPanel;
        this.to = to;
        this.from = from;
        this.travelagency = travelagency;
        this.costumerdir = costumerdir; 
        
        //window_al = new ArrayList<Integer>();
        From_To_Label.setText("showing flight between : " + from + "  and  " + to);
        //costumer = new Costumer();
        criteria_match();
    }
    public void criteria_match()
    {
        DefaultTableModel dtm = (DefaultTableModel)table_filtered.getModel();
        dtm.setRowCount(0);
        for(Airliner A : travelagency.getAirliner())
        {
            for(Flight F : A.getFlight())
            {
                if(F.getTo().equalsIgnoreCase(to) && F.getFrom().equalsIgnoreCase(from))
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0]=F;
                    row[1]=F.getFrom();
                    row[2]=F.getPrice();
                    row[3]= A;
                    dtm.addRow(row);
                    flight.add(F);
                                        
                }
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        From_To_Label = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_filtered = new javax.swing.JTable();
        View_button = new java.awt.Button();
        label1 = new java.awt.Label();
        Book = new java.awt.Button();
        WIndow_label = new java.awt.TextField();
        Ile_label = new java.awt.TextField();
        label2 = new java.awt.Label();
        SeatChangeCombo = new javax.swing.JComboBox();
        CostumerName_TextField = new java.awt.TextField();
        label3 = new java.awt.Label();
        Back = new java.awt.Button();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        date_TextField = new com.toedter.calendar.JDateChooser();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        window_label = new java.awt.TextField();

        setBackground(new java.awt.Color(56, 0, 66));

        From_To_Label.setAlignment(java.awt.Label.CENTER);
        From_To_Label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        From_To_Label.setForeground(new java.awt.Color(255, 153, 0));

        table_filtered.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        table_filtered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "To", "From", "Price", "Airline Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_filtered);

        View_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        View_button.setLabel("View seats available");
        View_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_buttonActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("Window Seats Available : ");

        Book.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Book.setLabel("Book");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });

        WIndow_label.setEditable(false);
        WIndow_label.setEnabled(false);
        WIndow_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        WIndow_label.setForeground(new java.awt.Color(255, 153, 0));

        Ile_label.setEditable(false);
        Ile_label.setEnabled(false);
        Ile_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Ile_label.setForeground(new java.awt.Color(255, 153, 0));

        label2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("Ile Seats Available : ");

        SeatChangeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seat Type", "Window", "Ile","Middle"}));

        CostumerName_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("Costumer Name : ");

        Back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back.setLabel("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setText("Pick Preferred seats");

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("COSTUMER DETAILS");

        date_TextField.setMinSelectableDate(new java.util.Date(-62135747882000L));

        label6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 153, 0));
        label6.setText("Date of Birth ");

        label7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 153, 0));
        label7.setText("Middle Seats Available : ");

        window_label.setEditable(false);
        window_label.setEnabled(false);
        window_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        window_label.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(From_To_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(View_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(window_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WIndow_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SeatChangeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CostumerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(From_To_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WIndow_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(window_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SeatChangeCombo)
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CostumerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(View_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void View_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_buttonActionPerformed
        int selectedRow = table_filtered.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row to display the information","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Flight flight = (Flight) table_filtered.getValueAt(selectedRow,0);
            
            WIndow_label.setText(String.valueOf(flight.getWindow()));
            
            Ile_label.setText(String.valueOf(flight.getIle()));
            
            window_label.setText(String.valueOf(flight.getMiddle()));
               
        }
    
    }//GEN-LAST:event_View_buttonActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        
        
           
        
        int selectedRow = table_filtered.getSelectedRow();
        Flight flight = (Flight) table_filtered.getValueAt(selectedRow,0);
        
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row to display the information","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (SeatChangeCombo.getSelectedItem() == "Seat Type")
        {
            JOptionPane.showMessageDialog(null,"Please select the seat type","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
                
                   
        //window
        else if (SeatChangeCombo.getSelectedItem() == "Window")
        {
            if(CostumerName_TextField.getText().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the costumer details to proceed to book","Missing Costumer details!!!",JOptionPane.ERROR_MESSAGE);
            }
            else if(flight.getWindow() == 0)
                {
                    
                   JOptionPane.showMessageDialog(null,"Cannot book tickets as no seat avaialble","Error!!!",JOptionPane.INFORMATION_MESSAGE);
                   return;
                }
            
            else
            {
                
                
                Costumer costumer = costumerdir.addCostumer();
                costumer.setName(CostumerName_TextField.getText());
                costumer.setDate(date_TextField.getDate());
                
                
                //DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                //String date = fmt.format(this.date_TextField.getDate());
                //date_TextField.setDateFormatString(dd-MM-yy);
                
                JOptionPane.showMessageDialog(null,"Tickets Booked Successfully","Congrats!!!",JOptionPane.INFORMATION_MESSAGE);
                
                //Flight flight = (Flight) table_filtered.getValueAt(selectedRow,0);           
                
                int d = flight.reduceWIndow(flight.getWindow());
                
                
                
                
                
                
                WIndow_label.setText(String.valueOf(d)); 
                
                Airliner a = (Airliner)table_filtered.getValueAt(selectedRow, 3);
                String from = flight.getFrom();
                String to = flight.toString();
                String name = costumer.getName();
                Date date = costumer.getDate();
                //String age = costumer.getDate();
                String seat = "window";
                String flight_name = flight.toString();
                Float price = flight.getPrice();
                
                
                FinalConfirmationJPanel final_conf = new FinalConfirmationJPanel(rightPanel,to,from,name,seat,a, price,date,flight);                
                rightPanel.add("Final Confirmation", final_conf);
                CardLayout layout = (CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
                
            }
            
                    
        }
        
        //Ile
        else if (SeatChangeCombo.getSelectedItem() == "Ile")
        {
            if(CostumerName_TextField.getText().equalsIgnoreCase("") || date_TextField.getDate() == null)
            {
                JOptionPane.showMessageDialog(null,"Please enter the costumer details to proceed to book","Missing Costumer details!!!",JOptionPane.ERROR_MESSAGE);
            }
            else if(flight.getIle()== 0)
                {
                    
                   JOptionPane.showMessageDialog(null,"Cannot book tickets as no seat avaialble","Error!!!",JOptionPane.INFORMATION_MESSAGE);
                   return;}
            else
            {
                Costumer costumer = costumerdir.addCostumer();
                costumer.setName(CostumerName_TextField.getText());
                costumer.setDate(date_TextField.getDate());
                //DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                //String date = fmt.format(this.date_TextField.getDate());
                
                //costumer.setName(CostumerName_TextField.getText());
                //costumer.setDate(date);
                JOptionPane.showMessageDialog(null,"Tickets BOoked Successfully","Congrats!!!",JOptionPane.INFORMATION_MESSAGE);
                
                //Flight flight = (Flight) table_filtered.getValueAt(selectedRow,0);           
                
                int d = flight.reduceIle(flight.getIle());            
                Ile_label.setText(String.valueOf(d)); 
                
                Airliner a = (Airliner)table_filtered.getValueAt(selectedRow, 3);
                String from = flight.getFrom();
                String to = flight.toString();
                String name = costumer.getName();
                Date date = costumer.getDate();
                //String age = costumer.getDate();
                String seat = "ile";
                String flight_name = flight.toString();
                Float price = flight.getPrice();
                
                
                FinalConfirmationJPanel final_conf = new FinalConfirmationJPanel(rightPanel,to,from,name,seat,a, price,date,flight);                
                rightPanel.add("Final Confirmation", final_conf);
                CardLayout layout = (CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
                
            }
        }
        
        //MIDDLE
        else if (SeatChangeCombo.getSelectedItem() == "Middle")
        {
            if(CostumerName_TextField.getText().equalsIgnoreCase("") || date_TextField.getDate() == null)
            {
                JOptionPane.showMessageDialog(null,"Please enter the costumer details to proceed to book","Missing Costumer details!!!",JOptionPane.ERROR_MESSAGE);
            }
            else if(flight.getMiddle()== 0)
                {
                    
                   JOptionPane.showMessageDialog(null,"Cannot book tickets as no seat avaialble","Error!!!",JOptionPane.INFORMATION_MESSAGE);
                   return;
                }
            else
            {
                Costumer costumer = costumerdir.addCostumer();
                costumer.setName(CostumerName_TextField.getText());
                costumer.setDate(date_TextField.getDate());
                //DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                //String date = fmt.format(this.date_TextField.getDate());
                
                //costumer.setName(CostumerName_TextField.getText());
                //costumer.setDate(date);
               
                JOptionPane.showMessageDialog(null,"Tickets BOoked Successfully","Congrats!!!",JOptionPane.INFORMATION_MESSAGE);
                
                //Flight flight = (Flight) table_filtered.getValueAt(selectedRow,0);           
                
                int d = flight.reducemiddle(flight.getMiddle());            
                Ile_label.setText(String.valueOf(d)); 
                
                Airliner a = (Airliner)table_filtered.getValueAt(selectedRow, 3);
                String from = flight.getFrom();
                String to = flight.toString();
                String name = costumer.getName();
                Date date = costumer.getDate();
                //String age = costumer.getDate();
                String seat = "middle";
                String flight_name = flight.toString();
                Float price = flight.getPrice();
                
                
                FinalConfirmationJPanel final_conf = new FinalConfirmationJPanel(rightPanel,to,from,name,seat,a, price,date,flight); 
                //FinalConfirmationJPanel final_conf = new FinalConfirmationJPanel(rightPanel,flight,seat,a,costumer);
                rightPanel.add("Final Confirmation", final_conf);
                CardLayout layout = (CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
                
            }
        }
         
    }//GEN-LAST:event_BookActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Back;
    private java.awt.Button Book;
    private java.awt.TextField CostumerName_TextField;
    private java.awt.Label From_To_Label;
    private java.awt.TextField Ile_label;
    private javax.swing.JComboBox SeatChangeCombo;
    private java.awt.Button View_button;
    private java.awt.TextField WIndow_label;
    private com.toedter.calendar.JDateChooser date_TextField;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTable table_filtered;
    private java.awt.TextField window_label;
    // End of variables declaration//GEN-END:variables
}
