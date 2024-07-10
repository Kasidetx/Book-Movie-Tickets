package movieticket;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MovieBookingProgram extends javax.swing.JFrame {

    public MovieBookingProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ExitBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FilmSelect = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TimeSelect = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TypeSeatSelect = new javax.swing.JComboBox<>();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        ConfirmBTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movie Booking Program");

        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Film");

        FilmSelect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FilmSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - Select - - -", "หลานม่า", "The First Omen", "กังฟูแพดด้า", "หอแต๋วแตก", "ABUGAIL" }));
        FilmSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FilmSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilmSelectActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Time");

        TimeSelect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TimeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - Select - - -", "11.00", "13.50", "14.30", "15.20", "16.00", "17.50", "18.30", "19.50", "20.30", "21.00", "22.50" }));
        TimeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeSelectActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Type Seat");

        TypeSeatSelect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TypeSeatSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - Select - - -", "Normal", "Premium", "Sofa" }));
        TypeSeatSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeSeatSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FilmSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TimeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TypeSeatSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FilmSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeSeatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Mobile :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Name :");

        txtEmail.setColumns(10);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtMobile.setColumns(10);
        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtLastName.setColumns(10);
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Last Name :");

        txtName.setColumns(10);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Price :");

        PriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PriceLabel.setText("Price");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PriceLabel)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PriceLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ConfirmBTN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConfirmBTN.setText("Confirm");
        ConfirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTNActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(71, 71, 71)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(ConfirmBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmBTN))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int price = 0;
    String NameMoviveSelect = "";
    String TimeSelectCombobox = "";
    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        int Exit = JOptionPane.showConfirmDialog(null, "Are u Sure", "Exit Program", JOptionPane.YES_NO_OPTION);
        if (Exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void TypeSeatSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeSeatSelectActionPerformed
        String PriceTC = JOptionPane.showInputDialog(null, "Input People : ", "INPUT", JOptionPane.PLAIN_MESSAGE);
        if (PriceTC != null && !PriceTC.isEmpty()) {
            int PriceCoverter = Integer.parseInt(PriceTC);
            if (TypeSeatSelect.getSelectedItem().equals("Normal")) {
                price = 270;
                PriceCoverter *= price;
            } else if (TypeSeatSelect.getSelectedItem().equals("Premium")) {
                price = 380;
                PriceCoverter *= price;
            } else if (TypeSeatSelect.getSelectedItem().equals("Sofa")) {
                price = 1000;
                PriceCoverter *= price;
            }
            PriceLabel.setText(PriceCoverter + "");
        } else {
            JOptionPane.showMessageDialog(null, "Please input number of people!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TypeSeatSelectActionPerformed

    private void ConfirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBTNActionPerformed
        String Name, LastName, Email, Mobile;
        Name = txtName.getText();
        LastName = txtLastName.getText();
        Email = txtEmail.getText();
        Mobile = txtMobile.getText();
        SaveSeat("NameMovie : "+NameMoviveSelect +"\nName : "+ Name +"\nLastName : "+ LastName +"\nEmail : "+ Email +"\nMobile : "+ Mobile +"\nTime : "+ TimeSelectCombobox);
    }//GEN-LAST:event_ConfirmBTNActionPerformed

    private void FilmSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilmSelectActionPerformed
        if (FilmSelect.getSelectedItem().equals("หลานม่า")) {
            NameMoviveSelect = "หลานม่า";
        }
        if (FilmSelect.getSelectedItem().equals("The First Omen")) {
            NameMoviveSelect = "The First Omen";
        }
        if (FilmSelect.getSelectedItem().equals("กังฟูแพดด้า")) {
            NameMoviveSelect = "กังฟูแพดด้า";
        }
        if (FilmSelect.getSelectedItem().equals("หอแต๋วแตก")) {
            NameMoviveSelect = "หอแต๋วแตก";
        }
        if (FilmSelect.getSelectedItem().equals("ABIGAIL")) {
            NameMoviveSelect = "ABIGAIL";
        }
    }//GEN-LAST:event_FilmSelectActionPerformed

    private void TimeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeSelectActionPerformed
        if (TimeSelect.getSelectedItem().equals("11.00")) {
            TimeSelectCombobox = "11.00";
        }
        if (TimeSelect.getSelectedItem().equals("13.50")) {
            TimeSelectCombobox = "13.50";
        }
        if (TimeSelect.getSelectedItem().equals("14.30")) {
            TimeSelectCombobox = "14.30";
        }
        if (TimeSelect.getSelectedItem().equals("15.20")) {
            TimeSelectCombobox = "15.20";
        }
        if (TimeSelect.getSelectedItem().equals("16.00")) {
            TimeSelectCombobox = "16.00";
        }
        if (TimeSelect.getSelectedItem().equals("17.50")) {
            TimeSelectCombobox = "17.50";
        }
        if (TimeSelect.getSelectedItem().equals("18.30")) {
            TimeSelectCombobox = "18.30";
        }
        if (TimeSelect.getSelectedItem().equals("19.50")) {
            TimeSelectCombobox = "19.50";
        }
        if (TimeSelect.getSelectedItem().equals("20.30")) {
            TimeSelectCombobox = "20.30";
        }
        if (TimeSelect.getSelectedItem().equals("21.00")) {
            TimeSelectCombobox = "21.00";
        }
        if (TimeSelect.getSelectedItem().equals("22.50")) {
            TimeSelectCombobox = "22.50";
        }
    }//GEN-LAST:event_TimeSelectActionPerformed

    private void SaveSeat(String bookedSeat) {
        try {
            if (DatePicker.getDate() != null) {
                FileWriter writer = new FileWriter("CheckList.txt", true);
                writer.write(bookedSeat + "\n");
                writer.close();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please select a date.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error while saving ticket data: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieBookingProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBTN;
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JComboBox<String> FilmSelect;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JComboBox<String> TimeSelect;
    private javax.swing.JComboBox<String> TypeSeatSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
