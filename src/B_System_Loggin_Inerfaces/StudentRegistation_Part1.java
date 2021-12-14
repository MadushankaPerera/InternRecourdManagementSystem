package B_System_Loggin_Inerfaces;

import A_DataBase.DBconnect;
import D_System_Forms_and_Dashboard_Interfaces.FormI1A_StudentRegistation_Part2;
import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;
import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.ColorType;
import jdk.nashorn.internal.parser.TokenType;
import sun.security.util.Password;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author perer
 */
public class StudentRegistation_Part1 extends javax.swing.JInternalFrame {

    public StudentRegistation_Part1() {
        initComponents();

        nextPage_btn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        Back_btn = new javax.swing.JButton();
        studentReg_lbl = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sliitID_number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sliitEmail_address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yearSelectionDropDown = new javax.swing.JComboBox<>();
        BottomPanel = new javax.swing.JPanel();
        submite_btn = new javax.swing.JButton();
        nextPage_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        valID_lbl = new javax.swing.JLabel();
        valEmail_lbl = new javax.swing.JLabel();
        valDropdown_lbl = new javax.swing.JLabel();
        valPassword_lbl = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        optionstudent_txt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        TopPanel.setBackground(new java.awt.Color(0, 0, 151));

        Back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous - 32.png"))); // NOI18N
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        studentReg_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentReg_lbl.setForeground(new java.awt.Color(255, 255, 255));
        studentReg_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentReg_lbl.setText("STUDENT REGISTATION PART - I");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_btn)
                .addGap(18, 18, 18)
                .addComponent(studentReg_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentReg_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SLIIT Student Identification Number :");

        sliitID_number.setPreferredSize(new java.awt.Dimension(6, 35));
        sliitID_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sliitID_numberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sliitID_numberKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SLIIT Student e-Mail address :");

        sliitEmail_address.setPreferredSize(new java.awt.Dimension(6, 35));
        sliitEmail_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sliitEmail_addressKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Currently Studing Year :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Create Password :");

        yearSelectionDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year 1st Semester", "1st Year 2nd Semester", " ", "2nd Year 1st Semester", "2nd Year 2nd Semester", " ", "3rd Year 1st Semester", "3rd Year 2nd Semester", " ", "4th Year 1st Semester", "4th Year 2nd Semester" }));
        yearSelectionDropDown.setPreferredSize(new java.awt.Dimension(56, 35));
        yearSelectionDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearSelectionDropDownActionPerformed(evt);
            }
        });
        yearSelectionDropDown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yearSelectionDropDownKeyReleased(evt);
            }
        });

        BottomPanel.setBackground(new java.awt.Color(255, 255, 255));

        submite_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submite_btn.setText("Submit");
        submite_btn.setPreferredSize(new java.awt.Dimension(77, 35));
        submite_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submite_btnActionPerformed(evt);
            }
        });

        nextPage_btn.setBackground(new java.awt.Color(255, 153, 153));
        nextPage_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextPage_btn.setText("NEXT Page");
        nextPage_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPage_btnActionPerformed(evt);
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

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submite_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126)
                .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(163, 163, 163)
                .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(154, 154, 154)
                .addComponent(nextPage_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPage_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submite_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        valID_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valID_lbl.setForeground(new java.awt.Color(255, 51, 51));
        valID_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        valEmail_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valEmail_lbl.setForeground(new java.awt.Color(255, 51, 0));
        valEmail_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        valDropdown_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valDropdown_lbl.setForeground(new java.awt.Color(204, 51, 0));
        valDropdown_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        valPassword_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valPassword_lbl.setForeground(new java.awt.Color(204, 51, 0));
        valPassword_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        optionstudent_txt.setEditable(false);
        optionstudent_txt.setBackground(new java.awt.Color(255, 255, 255));
        optionstudent_txt.setForeground(new java.awt.Color(255, 255, 255));
        optionstudent_txt.setText("student");
        optionstudent_txt.setBorder(null);

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1)
                    .addComponent(yearSelectionDropDown, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliitEmail_address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliitID_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionstudent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(valID_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(237, 237, 237)
                        .addComponent(valEmail_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                        .addGap(385, 385, 385)
                        .addComponent(valPassword_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(375, 375, 375)
                        .addComponent(valDropdown_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optionstudent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliitID_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valEmail_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliitEmail_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valDropdown_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearSelectionDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valPassword_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextPage_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPage_btnActionPerformed

        if (stpye == null) {

            MainDesktoppane.removeAll();
            FormI1A_StudentRegistation_Part2 stpye2 = new FormI1A_StudentRegistation_Part2();
            MainDesktoppane.add(stpye2).setVisible(true);

            stpye2.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            stpye2.setLocation(0, 0);

        } else {

            MainDesktoppane.removeAll();
            MainDesktoppane.add(stpye).setVisible(true);

            stpye.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            stpye.setLocation(0, 0);
        }
    }//GEN-LAST:event_nextPage_btnActionPerformed

    private void submite_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submite_btnActionPerformed

        String sID = sliitID_number.getText().trim();
        String eMail = sliitEmail_address.getText().trim();
        String currentYeard = yearSelectionDropDown.getSelectedItem().toString(); //to dropdown
        String psw = jPasswordField1.getText().trim();
        String optionStudent = optionstudent_txt.getText().trim();

        try {

            A_DataBase.DBconnect.connect().createStatement().executeUpdate("INSERT INTO studentregistation_part_1(sliitID, sliitEmail, currentYear, createPassword, options) VALUE ('" + sID + "','" + eMail + "','" + currentYeard + "','" + psw + "','" + optionStudent + "')");
            JOptionPane.showMessageDialog(null, "SUBMIT Successful");

            sliitID_number.setText("");
            sliitEmail_address.setText("");
            yearSelectionDropDown.setSelectedItem("");
            jPasswordField1.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "SUBMIT UnsuccessfuL!");
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_submite_btnActionPerformed

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed

        if (rtp == null) {

            MainDesktoppane.removeAll();
            RegistationType rtype = new RegistationType();
            MainDesktoppane.add(rtype).setVisible(true);

            rtype.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            rtype.setLocation(0, 0);

        } else {

            MainDesktoppane.removeAll();
            MainDesktoppane.add(rtp).setVisible(true);

            rtp.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            rtp.setLocation(0, 0);
        }
    }//GEN-LAST:event_Back_btnActionPerformed

    private void sliitID_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sliitID_numberKeyReleased

        //for Validation SLIIT id index
        String PATTERN = "^[a-zA-Z0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(sliitID_number.getText());

        if (!match.matches()) {
            valID_lbl.setText("Enterd SLIIT ID is Incorrect! ");

        } else {
            valID_lbl.setText(null);
        }

        search(); //call search function
    }//GEN-LAST:event_sliitID_numberKeyReleased

    private void sliitEmail_addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sliitEmail_addressKeyReleased

        //for Validation SLIIT email
        String PATTERN = "^[a-zA-Z0-9]{0,10}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z0-9]{0,5}[.][a-zA-Z0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(sliitEmail_address.getText());

        if (!match.matches()) {
            valEmail_lbl.setText("Enterd SLIIT E-Mail is Incorrect! ");

        } else {
            valEmail_lbl.setText(null);
        }
    }//GEN-LAST:event_sliitEmail_addressKeyReleased

    private void yearSelectionDropDownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearSelectionDropDownKeyReleased

        //for Validation SLIIT current year dropdwn
        String PATTERN = "^[a-zA-Z0-9]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(yearSelectionDropDown.getSelectedItem().toString());

        if (!match.matches()) {
            valDropdown_lbl.setText("Select Current Year Incorrect! ");

        } else {
            valDropdown_lbl.setText(null);
        }
    }//GEN-LAST:event_yearSelectionDropDownKeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

        //for Validation SLIIT password
        String PATTERN = "^[a-zA-Z0-9]{0,2}[a-zA-Z0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(jPasswordField1.getText());

        if (match.matches()) {
            valPassword_lbl.setText("Weak Password");
            valPassword_lbl.setForeground(Color.red);

        } else if (!match.matches()) {
            valPassword_lbl.setText("Strong Password");
            valPassword_lbl.setForeground(Color.blue);

        } else {
            valPassword_lbl.setText(null);
        }

    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void yearSelectionDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearSelectionDropDownActionPerformed

        //NextButton enabale disable function
        String currentYeard = yearSelectionDropDown.getSelectedItem().toString(); //to dropdown

        if (currentYeard.equals("1st Year 1st Semester")) {
            nextPage_btn.setEnabled(false);
        } else if (currentYeard.equals("1st Year 2nd Semester")) {
            nextPage_btn.setEnabled(false);
        } else if (currentYeard.equals("2nd Year 1st Semester")) {
            nextPage_btn.setEnabled(false);
        } else if (currentYeard.equals("2nd Year 2nd Semester")) {
            nextPage_btn.setEnabled(false);
        } else if (currentYeard.equals("3rd Year 1st Semester")) {
            nextPage_btn.setEnabled(true);
        } else if (currentYeard.equals("3rd Year 2nd Semester")) {
            nextPage_btn.setEnabled(true);
        } else if (currentYeard.equals("4th Year 1st Semester")) {
            nextPage_btn.setEnabled(true);
        } else if (currentYeard.equals("4th Year 2nd Semester")) {
            nextPage_btn.setEnabled(true);
        }

    }//GEN-LAST:event_yearSelectionDropDownActionPerformed

    private void sliitID_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sliitID_numberKeyTyped
        search();
    }//GEN-LAST:event_sliitID_numberKeyTyped

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        int u = JOptionPane.showConfirmDialog(null, "If you really want to UPDATE?");

        if (u == 0) {

            String sId = sliitID_number.getText();
            String sEmail = sliitEmail_address.getText();
            String sYear = yearSelectionDropDown.getSelectedItem().toString();
            String pss = jPasswordField1.getText();
            String option = optionstudent_txt.getText();

            try {

                A_DataBase.DBconnect.connect().createStatement().executeUpdate("UPDATE studentregistation_part_1 SET sliitID = '" + sId + "', sliitEmail = '" + sEmail + "', currentYear = '" + sYear + "', createPassword = '" + pss + "' ,options = '" + option + "' WHERE sliitID = '" + sId + "'");
                JOptionPane.showMessageDialog(null, "Update Successfully");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Update Unsuccessfully");
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Have a Good Day!");
        }

    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        int p = JOptionPane.showConfirmDialog(null, "If you really want to the DELETE");

        if (p == 0) {

            String sid = sliitID_number.getText();
            try {
                DBconnect.connect().createStatement().executeUpdate("DELETE FROM studentregistation_part_1 WHERE sliitID = '" + sid + "'");
                JOptionPane.showMessageDialog(null, "DELETE Successfull");

                sliitID_number.setText(null);
                sliitEmail_address.setText(null);
                yearSelectionDropDown.setSelectedItem(null);
                jPasswordField1.setText("");
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cancel The Request");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    RegistationType rtp;
    FormI1A_StudentRegistation_Part2 stpye;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton nextPage_btn;
    private javax.swing.JTextField optionstudent_txt;
    private javax.swing.JTextField sliitEmail_address;
    public static javax.swing.JTextField sliitID_number;
    private javax.swing.JLabel studentReg_lbl;
    private javax.swing.JButton submite_btn;
    private javax.swing.JButton update_btn;
    private javax.swing.JLabel valDropdown_lbl;
    private javax.swing.JLabel valEmail_lbl;
    private javax.swing.JLabel valID_lbl;
    private javax.swing.JLabel valPassword_lbl;
    private javax.swing.JComboBox<String> yearSelectionDropDown;
    // End of variables declaration//GEN-END:variables

    private void search() {

        try {
            ResultSet rs = A_DataBase.DBconnect.connect().createStatement().executeQuery("select * from studentregistation_part_1 where  sliitID ='" + sliitID_number.getText() + "'");
            if (rs.next()) {

                sliitID_number.setText(rs.getString("sliitID"));
                sliitEmail_address.setText(rs.getString("sliitEmail"));

                yearSelectionDropDown.setSelectedItem(rs.getString("currentYear"));
                jPasswordField1.setText(rs.getString("createPassword"));

            } else {
                sliitID_number.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
