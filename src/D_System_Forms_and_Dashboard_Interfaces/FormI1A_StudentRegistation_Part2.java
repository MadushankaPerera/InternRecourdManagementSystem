package D_System_Forms_and_Dashboard_Interfaces;

import A_DataBase.DBconnect;
import B_System_Loggin_Inerfaces.StudentRegistation_Part1;
import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author perer
 */
public class FormI1A_StudentRegistation_Part2 extends javax.swing.JInternalFrame {

    public FormI1A_StudentRegistation_Part2() {
        initComponents();

        String sidpart_1 = B_System_Loggin_Inerfaces.StudentRegistation_Part1.sliitID_number.getText().toString();
        stSliitID_txt.setText(sidpart_1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        back_Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stSliitID_txt = new javax.swing.JTextField();
        stNameInitial_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        stMobileNumber_txt = new javax.swing.JTextField();
        stHomeNumber_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        stEmail_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        stSupervisorEmail_txt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        reset_btn = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        sID_lbl = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        fullName_lbl = new javax.swing.JLabel();
        mobileNumber_lbl = new javax.swing.JLabel();
        homeNumber_lbl = new javax.swing.JLabel();
        sEmail_lbl = new javax.swing.JLabel();
        supervisorEmail_lbl = new javax.swing.JLabel();
        stYearselection = new javax.swing.JComboBox<>();
        stClaenderYear_jDateChooser1 = new com.toedter.calendar.JDateChooser();
        stPeriodYear_jDateChooser2 = new com.toedter.calendar.JDateChooser();
        stStartdate_jDateChooser3 = new com.toedter.calendar.JDateChooser();
        stSpecialization_jComboBox1 = new javax.swing.JComboBox<>();
        optionstudent_txt = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 0, 151));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Form I-1A-Student Registation Part-2");

        back_Btn.setBackground(new java.awt.Color(255, 255, 255));
        back_Btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous - 32.png"))); // NOI18N
        back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_Btn)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Current Year of Registration at SLIIT");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SLIIT Student Identification Number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Which period of the year are you planning to complete or completed your second year?");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Which calendar year have you completed or planning to complete your second year?");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Specialization");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Student Name with Initials");

        stSliitID_txt.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Student Mobile Phone Number");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Student Home Phone Number");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("What is the date you started or plan to start your internship?");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Student E-Mail (Enter One Primary E-mail Address that you use)");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Specify Supervisor E-Mail address for the supervisor to fill his/her information");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        reset_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(reset_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78)
                .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144)
                .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-24.png"))); // NOI18N
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        stYearselection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stYearselection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year 1st Semester", "1st Year 2nd Semester", " ", "2nd Year 1st Semester", "2nd Year 2nd Semester", " ", "3rd Year 1st Semester", "3rd Year 2nd Semester", " ", "4th Year 1st Semester", "4th Year 2nd Semester" }));

        stClaenderYear_jDateChooser1.setDateFormatString("dd-MM-yyyy");

        stPeriodYear_jDateChooser2.setDateFormatString("dd-MM-yyyy");

        stStartdate_jDateChooser3.setDateFormatString("dd-MM-yyyy");

        stSpecialization_jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stSpecialization_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology.", " ", "Computer systems & network engineering.", " ", "Software Engineering.", " ", "Information Systems Engineering.", " ", "Cyber Security.", " ", "Interactive Media.", " ", "Data Science.", " ", "Bachelor of Information Technology – Curtin University." }));

        optionstudent_txt.setEditable(false);
        optionstudent_txt.setBackground(new java.awt.Color(255, 255, 255));
        optionstudent_txt.setForeground(new java.awt.Color(255, 255, 255));
        optionstudent_txt.setText("student");
        optionstudent_txt.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stSpecialization_jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stStartdate_jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stPeriodYear_jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stClaenderYear_jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stYearselection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(573, 573, 573)
                                .addComponent(sID_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(714, 714, 714))
                            .addComponent(stSliitID_txt)
                            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(optionstudent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(568, 568, 568))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(551, 551, 551))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(899, 899, 899))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(696, 696, 696)
                                .addComponent(fullName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(317, 317, 317)
                                .addComponent(mobileNumber_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(677, 677, 677)
                                .addComponent(homeNumber_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .addGap(450, 450, 450)
                                .addComponent(sEmail_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(680, 680, 680))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(355, 355, 355)
                                .addComponent(supervisorEmail_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(stSupervisorEmail_txt)
                            .addComponent(stEmail_txt)
                            .addComponent(stHomeNumber_txt)
                            .addComponent(stMobileNumber_txt)
                            .addComponent(stNameInitial_txt, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(search_txt))
                    .addComponent(optionstudent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sID_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stSliitID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stYearselection, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stClaenderYear_jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stPeriodYear_jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stSpecialization_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullName_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stNameInitial_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobileNumber_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stMobileNumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeNumber_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stHomeNumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sEmail_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stEmail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stStartdate_jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supervisorEmail_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stSupervisorEmail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void droa(){
//    
//        Integer dropdown_part1 = B_System_Loggin_Inerfaces.StudentRegistation_Part1.yearSelectionDropDown.getSelectedIndex();
//        stYearselection.setSelectedIndex(dropdown_part1);
//    }

    private void back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BtnActionPerformed

        if (sd == null) {

            MainDesktoppane.removeAll();
            B_System_Loggin_Inerfaces.LogginPage lp = new B_System_Loggin_Inerfaces.LogginPage();
            MainDesktoppane.add(lp).setVisible(true);

            lp.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            lp.setLocation(0, 0);

        } else {

            MainDesktoppane.removeAll();
            MainDesktoppane.add(sd).setVisible(true);

            sd.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            sd.setLocation(0, 0);
        }
    }//GEN-LAST:event_back_BtnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed

        stSliitID_txt.setText("");
        stYearselection.setSelectedItem(""); //to dropdown
        stClaenderYear_jDateChooser1.setToolTipText(""); //calender 1
        stPeriodYear_jDateChooser2.setToolTipText(""); //calender 2
        stSpecialization_jComboBox1.setSelectedItem(""); //dropdown
        stNameInitial_txt.setText("");
        stMobileNumber_txt.setText("");
        stHomeNumber_txt.setText("");
        stEmail_txt.setText("");
        stStartdate_jDateChooser3.setToolTipText("");
        stSupervisorEmail_txt.setText("");

    }//GEN-LAST:event_reset_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        String stID = stSliitID_txt.getText().trim();
        String stCurrentyear = stYearselection.getSelectedItem().toString().trim(); //to dropdown

        SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
        String staddDate1 = dateFormate.format(stClaenderYear_jDateChooser1.getDate()).trim(); //date 1
        String staddDate2 = dateFormate.format(stPeriodYear_jDateChooser2.getDate()).trim(); //date 2

        String stSpeci = stSpecialization_jComboBox1.getSelectedItem().toString().trim(); //drop down
        String stNameInitial = stNameInitial_txt.getText().trim();
        String stMobile = stMobileNumber_txt.getText().trim();
        String stHome = stHomeNumber_txt.getText().trim();
        String stEmail = stEmail_txt.getText().trim();

        String staddDate3 = dateFormate.format(stStartdate_jDateChooser3.getDate()).trim(); //date 3
        String stSuEmail = stSupervisorEmail_txt.getText().trim();

        String optionStudent = optionstudent_txt.getText().trim();

        try {

            if (stID.equals("") || stCurrentyear.equals("") || staddDate1.equals("") || staddDate2.equals("") || stSpeci.equals("") || stNameInitial.equals("") || stMobile.equals("") || stHome.equals("") || stEmail.equals("") || staddDate3.equals("") || stSuEmail.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the FIELDS");
            }

            A_DataBase.DBconnect.connect().createStatement().executeUpdate("INSERT INTO studentregistation_formi1a_part_2(sliitID, currentYear, calenderYear, periodYear, specialization, fName, "
                    + "mobileNumber, homeMobileNumber, sEmail, startDate, supervisoEmail, options) "
                    + "VALUE ('" + stID + "','" + stCurrentyear + "','" + staddDate1 + "','" + staddDate2 + "','" + stSpeci + "' ,'" + stNameInitial + "' ,'" + stMobile + "' ,"
                    + "'" + stHome + "', '" + stEmail + "', '" + staddDate3 + "', '" + stSuEmail + "', '" + optionStudent + "')");

            stSliitID_txt.setText("");
            stYearselection.setSelectedItem("");
            stClaenderYear_jDateChooser1.setToolTipText("");
            stPeriodYear_jDateChooser2.setToolTipText("");
            stSpecialization_jComboBox1.setSelectedItem("");
            stNameInitial_txt.setText("");
            stMobileNumber_txt.setText("");
            stHomeNumber_txt.setText("");
            stEmail_txt.setText("");
            stStartdate_jDateChooser3.setToolTipText("");
            stSupervisorEmail_txt.setText("");

            try {

                String itnumber = "@my.sliit.lk";
                String password_part1 = B_System_Loggin_Inerfaces.StudentRegistation_Part1.jPasswordField1.getText().toString();

                A_DataBase.DBconnect.connect().createStatement().executeUpdate("INSERT INTO login(userName, password, options) VALUE ('" + stID + itnumber + "','" + password_part1 + "','" + optionStudent + "')");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

            JOptionPane.showMessageDialog(null, "SUBMIT Successful");

            if (sd == null) {

                MainDesktoppane.removeAll();
                B_System_Loggin_Inerfaces.LogginPage lp = new B_System_Loggin_Inerfaces.LogginPage();
                MainDesktoppane.add(lp).setVisible(true);

                lp.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
                lp.setLocation(0, 0);

            } else {

                MainDesktoppane.removeAll();
                MainDesktoppane.add(sd).setVisible(true);

                sd.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
                sd.setLocation(0, 0);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "SUBMIT unSuccessful");
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_submit_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        int u = JOptionPane.showConfirmDialog(null, "If you really want to UPDATE?");

        if (u == 0) {

            String stID = stSliitID_txt.getText().trim();
            String stCurrentyear = stYearselection.getSelectedItem().toString(); //to dropdown

            SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
            String staddDate1 = dateFormate.format(stClaenderYear_jDateChooser1.getDate()); //date 1
            String staddDate2 = dateFormate.format(stPeriodYear_jDateChooser2.getDate()); //date 2

            String stSpeci = stSpecialization_jComboBox1.getSelectedItem().toString(); //drop down
            String stNameInitial = stNameInitial_txt.getText().trim();
            String stMobile = stMobileNumber_txt.getText().trim();
            String stHome = stHomeNumber_txt.getText().trim();
            String stEmail = stEmail_txt.getText().trim();

            String staddDate3 = dateFormate.format(stStartdate_jDateChooser3.getDate()); //date 3
            String stSuEmail = stSupervisorEmail_txt.getText().trim();

            try {

                A_DataBase.DBconnect.connect().createStatement().executeUpdate("UPDATE studentregistation_formi1a_part_2 SET sliitID = '" + stID + "', currentYear = '" + stCurrentyear + "',"
                        + " calenderYear = '" + staddDate1 + "', periodYear = '" + staddDate2 + "' ,specialization = '" + stSpeci + "' ,"
                        + "fName = '" + stNameInitial + "' , mobileNumber = '" + stMobile + "' ,  homeMobileNumber = '" + stHome + "', sEmail = '" + stEmail + "', startDate = '" + staddDate3 + "',supervisoEmail = '" + stSuEmail + "'  WHERE sliitID = '" + stID + "'");

                stSliitID_txt.setText("");
                stYearselection.setSelectedItem("");
                stClaenderYear_jDateChooser1.setToolTipText("");
                stPeriodYear_jDateChooser2.setToolTipText("");
                stSpecialization_jComboBox1.setSelectedItem("");
                stNameInitial_txt.setText("");
                stMobileNumber_txt.setText("");
                stHomeNumber_txt.setText("");
                stEmail_txt.setText("");
                stStartdate_jDateChooser3.setToolTipText("");
                stSupervisorEmail_txt.setText("");

                search_txt.setText("");

                JOptionPane.showMessageDialog(null, "Update Successfully");

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Update Unsuccessfully");
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Have a Good Day!");
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        search();
    }//GEN-LAST:event_search_txtKeyReleased

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        search();
    }//GEN-LAST:event_search_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        int p = JOptionPane.showConfirmDialog(null, "If you really want to the DELETE");

        if (p == 0) {

            String sid = stSliitID_txt.getText();
            try {
                DBconnect.connect().createStatement().executeUpdate("DELETE FROM studentregistation_formi1a_part_2 WHERE sliitID = '" + sid + "'");
                JOptionPane.showMessageDialog(null, "DELETE Successfull");

                stSliitID_txt.setText("");
                stYearselection.setSelectedItem("");
                stClaenderYear_jDateChooser1.setToolTipText("");
                stPeriodYear_jDateChooser2.setToolTipText("");
                stSpecialization_jComboBox1.setSelectedItem("");
                stNameInitial_txt.setText("");
                stMobileNumber_txt.setText("");
                stHomeNumber_txt.setText("");
                stEmail_txt.setText("");
                stStartdate_jDateChooser3.setToolTipText("");
                stSupervisorEmail_txt.setText("");

                search_txt.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cancel The Request");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txtActionPerformed

    //To existing object checker
    B_System_Loggin_Inerfaces.LogginPage sd;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel fullName_lbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeNumber_lbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobileNumber_lbl;
    private javax.swing.JTextField optionstudent_txt;
    private javax.swing.JButton reset_btn;
    private javax.swing.JLabel sEmail_lbl;
    private javax.swing.JLabel sID_lbl;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    private com.toedter.calendar.JDateChooser stClaenderYear_jDateChooser1;
    private javax.swing.JTextField stEmail_txt;
    private javax.swing.JTextField stHomeNumber_txt;
    private javax.swing.JTextField stMobileNumber_txt;
    private javax.swing.JTextField stNameInitial_txt;
    private com.toedter.calendar.JDateChooser stPeriodYear_jDateChooser2;
    private javax.swing.JTextField stSliitID_txt;
    private javax.swing.JComboBox<String> stSpecialization_jComboBox1;
    private com.toedter.calendar.JDateChooser stStartdate_jDateChooser3;
    private javax.swing.JTextField stSupervisorEmail_txt;
    private javax.swing.JComboBox<String> stYearselection;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel supervisorEmail_lbl;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables

    private void search() {

        try {
            ResultSet rs = A_DataBase.DBconnect.connect().createStatement().executeQuery("select * from studentregistation_formi1a_part_2 where  sliitID ='" + search_txt.getText() + "'");
            if (rs.next()) {

                stSliitID_txt.setText(rs.getString("sliitID"));
                stYearselection.setSelectedItem(rs.getString("currentYear")); //drop down
                stClaenderYear_jDateChooser1.setToolTipText(rs.getString("calenderYear"));
                stPeriodYear_jDateChooser2.setToolTipText(rs.getString("periodYear")); //calender
                stSpecialization_jComboBox1.setSelectedItem(rs.getString("specialization")); //drop down
                stNameInitial_txt.setText(rs.getString("fName"));
                stMobileNumber_txt.setText(rs.getString("mobileNumber"));
                stHomeNumber_txt.setText(rs.getString("homeMobileNumber"));
                stEmail_txt.setText(rs.getString("sEmail"));
                stStartdate_jDateChooser3.setToolTipText(rs.getString("startDate"));//calender
                stSupervisorEmail_txt.setText(rs.getString("supervisoEmail"));

            } else {
                search_txt.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
