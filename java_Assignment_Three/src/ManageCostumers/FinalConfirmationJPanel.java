
package ManageCostumers;

import Business.Airliner;
import Business.Costumer;
import Business.Flight;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FinalConfirmationJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private Flight f;
    private String seats;

    public FinalConfirmationJPanel(JPanel rightPanel,String to,String from,String name,String seats, Airliner a, Float price,Date d, Flight f) {
     //public FinalConfirmationJPanel(JPanel rightPanel,Flight f, String seat, Airliner a, Costumer costumer) {
        
        initComponents();
        this.rightPanel = rightPanel;
        this.f=f;
        this.seats=seats;
        AirlineName_TextField.setText(a.toString());
        CostumerName_TextField.setText(name);
        From_TextField.setText(from);
        To_TextField.setText(to);
        Seat_TextField.setText(seats); 
        Price_TextField.setText(String.valueOf(price));
        CostumerDate_TextField.setValue(d);
        populateSeat(seats);
        
            
    }
    public void populateSeat(String seat)
    {
        if(seat.equals("window"))
        {
            Seat_number_TextFIeld.setText("W"+f.getW());
        }
        else if(seat.equals("ile"))
        {
            Seat_number_TextFIeld.setText("I"+f.getA());
        }
        else if(seat.equals("middle"))
        {
            Seat_number_TextFIeld.setText("M"+f.getM());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CostumerName_TextField = new javax.swing.JTextField();
        From_TextField = new javax.swing.JTextField();
        Seat_TextField = new javax.swing.JTextField();
        To_TextField = new javax.swing.JTextField();
        AirlineName_TextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        Price_TextField = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        Back = new java.awt.Button();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        CostumerDate_TextField = new javax.swing.JFormattedTextField();
        label9 = new java.awt.Label();
        Seat_number_TextFIeld = new javax.swing.JTextField();

        setBackground(new java.awt.Color(56, 0, 66));

        CostumerName_TextField.setEditable(false);
        CostumerName_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        From_TextField.setEditable(false);
        From_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        Seat_TextField.setEditable(false);
        Seat_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        To_TextField.setEditable(false);
        To_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        AirlineName_TextField.setEditable(false);
        AirlineName_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 0));
        label1.setText("Costumer Name");

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 153, 0));
        label2.setText("From");

        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 153, 0));
        label3.setText("To");

        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 153, 0));
        label4.setText("Seat");

        label5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 153, 0));
        label5.setText("Airline");

        Price_TextField.setEditable(false);
        Price_TextField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        label6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 153, 0));
        label6.setText("Price");

        Back.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Back.setLabel("Exit");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 153, 0));
        label7.setText("TICKETS BOOKED.....DETAILS BELOW!!");

        label8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 153, 0));
        label8.setText("Costumer DOB");

        CostumerDate_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        label9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 153, 0));
        label9.setText("Seat number");

        Seat_number_TextFIeld.setEditable(false);
        Seat_number_TextFIeld.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AirlineName_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addComponent(To_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addComponent(Seat_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addComponent(From_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addComponent(CostumerName_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addComponent(Price_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(234, 234, 234)
                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CostumerDate_TextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Seat_number_TextFIeld)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CostumerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CostumerDate_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(From_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(To_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(Seat_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addComponent(AirlineName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Seat_number_TextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        JOptionPane.showMessageDialog(null,"Thankyou for using the application","Thankyou",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);        
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirlineName_TextField;
    private java.awt.Button Back;
    private javax.swing.JFormattedTextField CostumerDate_TextField;
    private javax.swing.JTextField CostumerName_TextField;
    private javax.swing.JTextField From_TextField;
    private javax.swing.JTextField Price_TextField;
    private javax.swing.JTextField Seat_TextField;
    private javax.swing.JTextField Seat_number_TextFIeld;
    private javax.swing.JTextField To_TextField;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
