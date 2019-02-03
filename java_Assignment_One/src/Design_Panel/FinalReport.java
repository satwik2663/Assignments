package Design_Panel;

import Design_Panel_Class.FinalReportClass;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FinalReport extends javax.swing.JPanel {

    FinalReportClass F1;
    Image img;
    public FinalReport(FinalReportClass F1) 
    {
        initComponents();
        this.F1 = F1;
        display(F1);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        displayFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        displayLastName = new javax.swing.JTextField();
        displayDateOfBirth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        displayPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        displayHeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        displayWeight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        displaySSN = new javax.swing.JTextField();
        displayStreetAddress = new javax.swing.JTextField();
        displayCity = new javax.swing.JTextField();
        displayState = new javax.swing.JTextField();
        displayZipCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        displaySavingBankName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        displaySavingAccountNumber = new javax.swing.JTextField();
        displaySavingRoutingNumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        displaySavingAccountType = new javax.swing.JTextField();
        displaySavingAccountBalance = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        displayLicenseNumber = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        displayIssueDate = new javax.swing.JTextField();
        displayValidUpto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        displayCheckingAccountBalance = new javax.swing.JTextField();
        displayCheckingAccountType = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        displayCheckingRoutingNumber = new javax.swing.JTextField();
        displayCheckingAccountNumber = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        displayCheckingBankName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        displayBloodGroup = new javax.swing.JTextField();
        displayAllergyThree = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        displayMedicalRecordNumber = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        displayAllergyTwo = new javax.swing.JTextField();
        displayAllergyOne = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        label_photo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 33, 89));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        jButton1.setBackground(new java.awt.Color(85, 55, 118));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        displayFirstName.setEditable(false);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("FIRST NAME");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("LAST NAME");

        displayLastName.setEditable(false);

        displayDateOfBirth.setEditable(false);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("PHONE NUMBER");

        displayPhoneNumber.setEditable(false);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DATE OF BIRTH");

        displayHeight.setEditable(false);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("WEIGHT");

        displayWeight.setEditable(false);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("HEIGHT");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("SSN");

        displaySSN.setEditable(false);

        displayStreetAddress.setEditable(false);

        displayCity.setEditable(false);

        displayState.setEditable(false);

        displayZipCode.setEditable(false);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("ZIP CODE");

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("STATE");

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("CITY");

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("STREET NAME");

        jLabel12.setBackground(new java.awt.Color(85, 55, 118));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("ADDRESS");

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("BANK NAME");

        jLabel14.setBackground(new java.awt.Color(85, 55, 118));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("SAVING ACCOUNT");

        displaySavingBankName.setEditable(false);

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ACCOUNT NUMBER");

        displaySavingAccountNumber.setEditable(false);

        displaySavingRoutingNumber.setEditable(false);

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("ROUTING NUMBER");

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("ACCOUNT TYPE");

        displaySavingAccountType.setEditable(false);

        displaySavingAccountBalance.setEditable(false);

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("ACCOUNT BALANCE");

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("LICENSE NUMBER");

        displayLicenseNumber.setEditable(false);

        jLabel20.setBackground(new java.awt.Color(85, 55, 118));
        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 51));
        jLabel20.setText("LICENSE");

        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("VALID UPTO");

        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("ISSUE DATE ");

        displayIssueDate.setEditable(false);

        displayValidUpto.setEditable(false);

        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("ACCOUNT BALANCE");

        displayCheckingAccountBalance.setEditable(false);

        displayCheckingAccountType.setEditable(false);

        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("ACCOUNT TYPE");

        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("ROUTING NUMBER");

        displayCheckingRoutingNumber.setEditable(false);

        displayCheckingAccountNumber.setEditable(false);

        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("ACCOUNT NUMBER");

        displayCheckingBankName.setEditable(false);

        jLabel27.setBackground(new java.awt.Color(85, 55, 118));
        jLabel27.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 51));
        jLabel27.setText("CHECKING ACCOUNT");

        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("BANK NAME");

        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("BLOOD GROUP");

        displayBloodGroup.setEditable(false);

        displayAllergyThree.setEditable(false);

        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("ALLERGY 3");

        displayMedicalRecordNumber.setEditable(false);

        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("MEDICALNUMBER");

        displayAllergyTwo.setEditable(false);

        displayAllergyOne.setEditable(false);

        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("ALLERGY 1");

        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("ALLERGY 2");

        jLabel34.setBackground(new java.awt.Color(85, 55, 118));
        jLabel34.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 51));
        jLabel34.setText("MEDICAL");

        jLabel35.setBackground(new java.awt.Color(54, 33, 89));
        jLabel35.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 51));
        jLabel35.setText("DEMOGRAPHIC INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displayAllergyThree))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayAllergyOne)
                                    .addComponent(displayAllergyTwo)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displayMedicalRecordNumber))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displayBloodGroup))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayIssueDate)
                                    .addComponent(displayValidUpto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displayLicenseNumber))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displaySavingAccountBalance)
                                    .addComponent(displaySavingAccountType)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displaySavingRoutingNumber)
                                    .addComponent(displaySavingAccountNumber)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displaySavingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayState)
                                    .addComponent(displayZipCode)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayStreetAddress)
                                    .addComponent(displayCity)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displaySSN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayHeight)
                                    .addComponent(displayWeight)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayPhoneNumber)
                                    .addComponent(displayDateOfBirth)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(displayFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                                    .addComponent(displayLastName)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayCheckingAccountBalance)
                                    .addComponent(displayCheckingAccountType)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayCheckingRoutingNumber)
                                    .addComponent(displayCheckingAccountNumber)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(displayCheckingBankName))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(displayLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(displayPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaySSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCity, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(displaySavingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaySavingRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(displaySavingAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaySavingAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(displaySavingAccountType, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(displayCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCheckingRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCheckingAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCheckingAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCheckingAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(displayLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayValidUpto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(displayBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(displayMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayAllergyOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayAllergyTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(displayAllergyThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane2)
                        .addGap(236, 236, 236))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(619, 619, 619)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(label_photo, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
         {
            TextArea.print();
         } 
        catch (PrinterException ex) 
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void display(FinalReportClass F1) //Display the fields on the final report
    {
    
    String picture = F1.getLicense().getlPhoto();
    if(picture!=null)
    {
        File finalImage = new File(picture);
        try
            { 
                img = ImageIO.read(finalImage);
                Image image = img.getScaledInstance(150,150,Image.SCALE_SMOOTH);
                label_photo.setIcon(new ImageIcon(img));
    }
    catch(Exception e)
    {
    }
          
    }
    
    
    displayFirstName.setText(F1.getDemographic().getaFirstName());
    displayLastName.setText(F1.getDemographic().getaLastName());
    displayPhoneNumber.setText(F1.getDemographic().getaPhoneNumber());
    displayDateOfBirth.setText(F1.getDemographic().getaDateOfBirth());
    displayHeight.setText(F1.getDemographic().getaHeight());
    displayWeight.setText(F1.getDemographic().getaWeight());
    displaySSN.setText(F1.getDemographic().getaSsn());

    displayStreetAddress.setText(F1.getAddress().getaStreet());
    displayCity.setText(F1.getAddress().getaCity());
    displayState.setText(F1.getAddress().getaState());
    displayZipCode.setText(F1.getAddress().getaZip());

    displaySavingBankName.setText(F1.getSavingAccount().getBankName());
    displaySavingRoutingNumber.setText(F1.getSavingAccount().getRoutingNumber());
    displaySavingAccountNumber.setText(F1.getSavingAccount().getAccountNumber());
    displaySavingAccountBalance.setText(F1.getSavingAccount().getAccountBalance());
    displaySavingAccountType.setText(F1.getSavingAccount().getAccountType());


    displayCheckingBankName.setText(F1.getCheckingAccount().getBankName());
    displayCheckingRoutingNumber.setText(F1.getCheckingAccount().getRoutingNumber());
    displayCheckingAccountNumber.setText(F1.getCheckingAccount().getAccountNumber());
    displayCheckingAccountBalance.setText(F1.getCheckingAccount().getAccountBalance());
    displayCheckingAccountType.setText(F1.getCheckingAccount().getAccountType()); 

    displayLicenseNumber.setText(F1.getLicense().getlLicenseNumber());
    displayIssueDate.setText(F1.getLicense().getlDateOfIsuue());
    displayValidUpto.setText(F1.getLicense().getlDateOfExpiration());
    displayBloodGroup.setText(F1.getLicense().getlBloodType());

    displayMedicalRecordNumber.setText(F1.getMedical().getmMedicalRecordNumber());
    displayAllergyOne.setText(F1.getMedical().getmAllergy_1());
    displayAllergyTwo.setText(F1.getMedical().getmAllergy_2());
    displayAllergyThree.setText(F1.getMedical().getmAllergy_3());
    print();
    }
    
    public void print() //Method to Print the Final report displayed
    {
    TextArea.append(
                
                "\t---- DEMOGRAPHIC INFORMATION ---- \n\n" +
                "First Name :\t\t" + F1.getDemographic().getaFirstName()+ "\n"+
                "Last Name :\t\t" + F1.getDemographic().getaLastName()+ "\n"+
                "Phone Number: \t" + F1.getDemographic().getaPhoneNumber()+ "\n"+
                "Date Of Birth: \t\t" + F1.getDemographic().getaDateOfBirth()+ "\n"+
                "Height: \t\t" + F1.getDemographic().getaHeight()+ "\n"+
                "Weight: \t\t" + F1.getDemographic().getaWeight()+ "\n" +
                "Social Security Number :\t" + F1.getDemographic().getaSsn()+ "\n\n" +
               
                "\t---- ADDRESS INFORMATION ----\n\n" + 
                        "Street Address: \t" + F1.getAddress().getaStreet()+ "\n"+
                        "City: \t\t" + F1.getAddress().getaCity()+ "\n"+
                        "State: \t\t" + F1.getAddress().getaState()+ "\n"+
                        "Zip Code: \t\t" + F1.getAddress().getaZip()+ "\n\n"+    
                        
                "\t ---- SAVING ACCOUNT INFORMATION ---- \n\n" + 
                        "Bank Name: \t\t" + F1.getSavingAccount().getBankName()+ "\n"+
                "Routing Number: \t" + F1.getSavingAccount().getRoutingNumber()+ "\n"+
                "Account Number: \t" + F1.getSavingAccount().getAccountNumber()+ "\n"+
                "Account Balance: \t" + F1.getSavingAccount().getAccountBalance()+ "\n"+
                        "Account Type: \t" + F1.getSavingAccount().getAccountType()+ "\n\n"+
                
                "\t ---- CHECKING ACCOUNT INFORMATION ----\n\n" + 
                        "Bank Name: \t\t" + F1.getCheckingAccount().getBankName()+ "\n"+
                "Routing Number: \t" + F1.getCheckingAccount().getRoutingNumber()+ "\n"+
                "Account Number: \t" + F1.getCheckingAccount().getAccountNumber()+ "\n"+
                "Account Balance: \t" + F1.getCheckingAccount().getAccountBalance()+ "\n"+
                        "Account Type: \t" + F1.getCheckingAccount().getAccountType() + "\n\n"+ 
                
                "\t ---- DRIVER LICENSE INFORMATION ----\n\n" + 
                "License Number: \t" +F1.getLicense().getlLicenseNumber()+ "\n"+
                "Issue Date: \t\t" + F1.getLicense().getlDateOfIsuue()+ "\n"+
                "Valid Till: \t\t" + F1.getLicense().getlDateOfExpiration()+ "\n"+
                "Blood Group: \t\t" + F1.getLicense().getlBloodType()+ "\n\n"+ 
                
                "\t---- MEDICAL RECORD INFORMATION ---- \n\n" + 
                "Medical Record Number: \t" + F1.getMedical().getmMedicalRecordNumber()+ "\n"+
                "Allergy One: \t\t" + F1.getMedical().getmAllergy_1()+ "\n" +
                "Allergy Two: \t\t" + F1.getMedical().getmAllergy_2()+ "\n" +
                "Allergy Three: \t\t" + F1.getMedical().getmAllergy_3() + "\n\n"
                );         
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField displayAllergyOne;
    private javax.swing.JTextField displayAllergyThree;
    private javax.swing.JTextField displayAllergyTwo;
    private javax.swing.JTextField displayBloodGroup;
    private javax.swing.JTextField displayCheckingAccountBalance;
    private javax.swing.JTextField displayCheckingAccountNumber;
    private javax.swing.JTextField displayCheckingAccountType;
    private javax.swing.JTextField displayCheckingBankName;
    private javax.swing.JTextField displayCheckingRoutingNumber;
    private javax.swing.JTextField displayCity;
    private javax.swing.JTextField displayDateOfBirth;
    private javax.swing.JTextField displayFirstName;
    private javax.swing.JTextField displayHeight;
    private javax.swing.JTextField displayIssueDate;
    private javax.swing.JTextField displayLastName;
    private javax.swing.JTextField displayLicenseNumber;
    private javax.swing.JTextField displayMedicalRecordNumber;
    private javax.swing.JTextField displayPhoneNumber;
    private javax.swing.JTextField displaySSN;
    private javax.swing.JTextField displaySavingAccountBalance;
    private javax.swing.JTextField displaySavingAccountNumber;
    private javax.swing.JTextField displaySavingAccountType;
    private javax.swing.JTextField displaySavingBankName;
    private javax.swing.JTextField displaySavingRoutingNumber;
    private javax.swing.JTextField displayState;
    private javax.swing.JTextField displayStreetAddress;
    private javax.swing.JTextField displayValidUpto;
    private javax.swing.JTextField displayWeight;
    private javax.swing.JTextField displayZipCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_photo;
    // End of variables declaration//GEN-END:variables
}
