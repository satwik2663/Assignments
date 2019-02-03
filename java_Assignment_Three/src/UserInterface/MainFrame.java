package UserInterface;

import Business.CostumerDirectory;
import Business.TravelAgency;
import ManageAirlines.ManagAirlineJPanel;
import ManageCostumers.ManageCostumerJPanel;
import ManageFlights.ManageFlightsJpanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class MainFrame extends javax.swing.JFrame {
    private TravelAgency travelagency;
    private CostumerDirectory costumerdir;

    public MainFrame() {
        initComponents();
        travelagency = new TravelAgency();
        costumerdir = new CostumerDirectory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        manageFlights_button = new java.awt.Button();
        manageAirlines_button = new java.awt.Button();
        manageCostumers_button = new java.awt.Button();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(56, 0, 66));
        leftPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        manageFlights_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageFlights_button.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        manageFlights_button.setLabel("Manage Flights");
        manageFlights_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageFlights_buttonMouseClicked(evt);
            }
        });
        manageFlights_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFlights_buttonActionPerformed(evt);
            }
        });

        manageAirlines_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAirlines_button.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        manageAirlines_button.setLabel("Manage Airlines");
        manageAirlines_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageAirlines_buttonMouseClicked(evt);
            }
        });
        manageAirlines_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlines_buttonActionPerformed(evt);
            }
        });

        manageCostumers_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCostumers_button.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        manageCostumers_button.setLabel("Manage Costumer");
        manageCostumers_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCostumers_buttonMouseClicked(evt);
            }
        });
        manageCostumers_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCostumers_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(manageCostumers_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(manageFlights_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageAirlines_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(manageAirlines_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(manageFlights_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(manageCostumers_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(56, 0, 66));
        rightPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        rightPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        rightPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        rightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1197, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlines_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlines_buttonActionPerformed
          
        ManagAirlineJPanel manage_airline = new ManagAirlineJPanel(rightPanel,travelagency);
        rightPanel.add("ManagAirlineJPanel",manage_airline);
        CardLayout Layout = (CardLayout)rightPanel.getLayout();
        Layout.next(rightPanel);
    }//GEN-LAST:event_manageAirlines_buttonActionPerformed

    private void manageFlights_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFlights_buttonActionPerformed
        ManageFlightsJpanel manage_flights = new ManageFlightsJpanel(rightPanel,travelagency);
        rightPanel.add("ManagFlightsJPanel",manage_flights);
        CardLayout Layout = (CardLayout)rightPanel.getLayout();
        Layout.next(rightPanel);
    }//GEN-LAST:event_manageFlights_buttonActionPerformed

    private void manageCostumers_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCostumers_buttonActionPerformed
        ManageCostumerJPanel manage_costumers = new ManageCostumerJPanel(rightPanel,travelagency,costumerdir);
        //ManageCostumerJPanel manage_costumers = new ManageCostumerJPanel(rightPanel);
        rightPanel.add("ManagFlightsJPanel",manage_costumers);
        CardLayout Layout = (CardLayout)rightPanel.getLayout();
        Layout.next(rightPanel);
    }//GEN-LAST:event_manageCostumers_buttonActionPerformed

    private void manageAirlines_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAirlines_buttonMouseClicked
        manageAirlines_button.setBackground(Color.YELLOW);
        manageFlights_button.setBackground(Color.WHITE);
        manageCostumers_button.setBackground(Color.WHITE); 
    }//GEN-LAST:event_manageAirlines_buttonMouseClicked

    private void manageFlights_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFlights_buttonMouseClicked
        manageAirlines_button.setBackground(Color.WHITE);
        manageFlights_button.setBackground(Color.YELLOW);
        manageCostumers_button.setBackground(Color.WHITE); 
    }//GEN-LAST:event_manageFlights_buttonMouseClicked

    private void manageCostumers_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCostumers_buttonMouseClicked
        manageAirlines_button.setBackground(Color.WHITE);
        manageFlights_button.setBackground(Color.WHITE);
        manageCostumers_button.setBackground(Color.YELLOW); 
    }//GEN-LAST:event_manageCostumers_buttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private java.awt.Button manageAirlines_button;
    private java.awt.Button manageCostumers_button;
    private java.awt.Button manageFlights_button;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
