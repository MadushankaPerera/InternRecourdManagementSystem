/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_System_Loggin_Inerfaces;

import A_DataBase.DBconnect;
import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author perer
 */
public class SupervisorReg extends javax.swing.JInternalFrame {

    /**
     * Creates new form supervisorRegform
     */
    public SupervisorReg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        back_Btn = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        password_txt = new javax.swing.JPasswordField();
        confirmePassword_txt = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supervisorName_txt = new javax.swing.JTextField();
        supervisorTitle_txt = new javax.swing.JTextField();
        email1_txt = new javax.swing.JTextField();
        email2_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        contactNumber_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        companyName_txt = new javax.swing.JTextField();
        val_name_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Reset_btn = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        val_SupervisorTitle_lbl = new javax.swing.JLabel();
        val_CompanyName_lbl = new javax.swing.JLabel();
        val_ContactNumber_lbl = new javax.swing.JLabel();
        val_SupervisorEmail1_lbl = new javax.swing.JLabel();
        val_SupervisorEmail2_lbl = new javax.swing.JLabel();
        val_pasword = new javax.swing.JLabel();
        val_ConfirmPassword = new javax.swing.JLabel();
        option_txt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 0, 151));

        jLabel9.setBackground(new java.awt.Color(0, 0, 151));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SUPERVISOR REGISTRATION");

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
                .addComponent(back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_Btn)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        body.setBackground(new java.awt.Color(255, 255, 255));

        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_txtKeyReleased(evt);
            }
        });

        confirmePassword_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmePassword_txtKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Confirm Password:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Password              :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Supervisor Email - I  :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Company Name     :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Supervisor Title     :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Name                    :");

        supervisorName_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supervisorName_txtKeyReleased(evt);
            }
        });

        supervisorTitle_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supervisorTitle_txtKeyReleased(evt);
            }
        });

        email1_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email1_txtKeyReleased(evt);
            }
        });

        email2_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email2_txtKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Supervisor Email - II :");

        contactNumber_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactNumber_txtKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Contact Number    :");

        companyName_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyName_txtKeyReleased(evt);
            }
        });

        val_name_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_name_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Reset_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset_btn.setText("Reset");
        Reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btnActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setText("Delete");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reset_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        val_SupervisorTitle_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_SupervisorTitle_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_SupervisorTitle_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_CompanyName_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_CompanyName_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_CompanyName_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_ContactNumber_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_ContactNumber_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_ContactNumber_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_SupervisorEmail1_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_SupervisorEmail1_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_SupervisorEmail1_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_SupervisorEmail2_lbl.setBackground(new java.awt.Color(0, 0, 0));
        val_SupervisorEmail2_lbl.setForeground(new java.awt.Color(255, 51, 0));
        val_SupervisorEmail2_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_pasword.setBackground(new java.awt.Color(0, 0, 0));
        val_pasword.setForeground(new java.awt.Color(255, 51, 0));
        val_pasword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        val_ConfirmPassword.setBackground(new java.awt.Color(0, 0, 0));
        val_ConfirmPassword.setForeground(new java.awt.Color(255, 51, 0));
        val_ConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        option_txt.setEditable(false);
        option_txt.setBackground(new java.awt.Color(255, 255, 255));
        option_txt.setForeground(new java.awt.Color(255, 255, 255));
        option_txt.setText("supervisor");
        option_txt.setBorder(null);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supervisorName_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(supervisorTitle_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(companyName_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(contactNumber_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(email1_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(email2_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(password_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(confirmePassword_txt, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(option_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(val_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_SupervisorTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_CompanyName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_ContactNumber_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_SupervisorEmail1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_SupervisorEmail2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(val_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(option_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(val_name_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supervisorName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_SupervisorTitle_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supervisorTitle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_CompanyName_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_ContactNumber_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactNumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_SupervisorEmail1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(val_SupervisorEmail2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(email2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_pasword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val_ConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmePassword_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BtnActionPerformed
        
        if (s3 == null) {
            
            MainDesktoppane.removeAll();
            B_System_Loggin_Inerfaces.RegistationType rtype = new B_System_Loggin_Inerfaces.RegistationType();
            MainDesktoppane.add(rtype).setVisible(true);
            
            rtype.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            rtype.setLocation(0, 0);
            
        } else {
            
            MainDesktoppane.removeAll();
            MainDesktoppane.add(s3).setVisible(true);
            
            s3.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            s3.setLocation(0, 0);
        }
    }//GEN-LAST:event_back_BtnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        
        String suName = supervisorName_txt.getText().trim();
        String suTitle = supervisorTitle_txt.getText().trim();
        String suCompanyName = companyName_txt.getText().trim();
        String suContactnumber = contactNumber_txt.getText().trim();
        String suEmail1 = email1_txt.getText().trim();
        String suEmail2 = email2_txt.getText().trim();
        String suPassword = password_txt.getText().trim();
        String suConformPassword = confirmePassword_txt.getText().trim();
        String option = option_txt.getText().trim();
        
        try {
            A_DataBase.DBconnect.connect().createStatement().executeUpdate("INSERT INTO supervisorregistation(supervisoerName, supervisorTitle, companyName, contactNumber, supervisorMail_1, supervisorMail_2, password, confirmPassword, options) VALUE ('" + suName + "','" + suTitle + "','" + suCompanyName + "','" + suContactnumber + "','" + suEmail1 + "' ,'" + suEmail2 + "' ,'" + suPassword + "' ,'" + suConformPassword + "', '"+option+"')");
            JOptionPane.showMessageDialog(null, "SUBMIT Successful");
            
            supervisorName_txt.setText("");
            supervisorTitle_txt.setText("");
            companyName_txt.setText("");
            contactNumber_txt.setText("");
            email1_txt.setText("");
            email2_txt.setText("");
            password_txt.setText("");
            confirmePassword_txt.setText("");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "SUBMIT unSuccessful");
        }
        

    }//GEN-LAST:event_submit_btnActionPerformed

    private void Reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btnActionPerformed

        supervisorName_txt.setText("");
        supervisorTitle_txt.setText("");
        companyName_txt.setText("");
        contactNumber_txt.setText("");
        email1_txt.setText("");
        email2_txt.setText(""); 
        password_txt.setText("");
        confirmePassword_txt.setText("");
       
    }//GEN-LAST:event_Reset_btnActionPerformed

    private void supervisorTitle_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supervisorTitle_txtKeyReleased

        //for Validation SLIIT supervisor Title
        String PATTERN = "^[a-zA-Z  .]{0,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(supervisorTitle_txt.getText());
        
        if (!match.matches()) {
            val_SupervisorTitle_lbl.setText("Enterd title is Incorrect! ");
            
        } else {
            val_SupervisorTitle_lbl.setText(null);
        }
    }//GEN-LAST:event_supervisorTitle_txtKeyReleased

    private void companyName_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyName_txtKeyReleased

        //for Validation SLIIT supervisor companyName
        String PATTERN = "^[a-zA-Z ./()]{0,200}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(companyName_txt.getText());
        
        if (!match.matches()) {
            val_CompanyName_lbl.setText("Enterd Company NameType Incorrect! ");
            
        } else {
            val_CompanyName_lbl.setText(null);
        }
    }//GEN-LAST:event_companyName_txtKeyReleased

    private void supervisorName_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supervisorName_txtKeyReleased

        //for Validation supervisorName
        String PATTERN = "^[a-zA-Z  .]{0,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(supervisorName_txt.getText());
        
        if (!match.matches()) {
            val_name_lbl.setText("Enterd Name type is Incorrect! ");
            
        } else {
            val_name_lbl.setText(null);
        }
    }//GEN-LAST:event_supervisorName_txtKeyReleased

    private void contactNumber_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumber_txtKeyReleased

        //for Validation SLIIT supervisor contactNumber
        String PATTERN = "^[0-9 +]{0,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(contactNumber_txt.getText());
        
        if (!match.matches()) {
            val_ContactNumber_lbl.setText("Enterd Contact Number Incorrect! ");
            
        } else {
            val_ContactNumber_lbl.setText(null);
        }
    }//GEN-LAST:event_contactNumber_txtKeyReleased

    private void email1_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email1_txtKeyReleased

        //for Validation supervisor SLIIT email - II
        String PATTERN = "[a-zA-Z0-9 .@]{0,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(email1_txt.getText());
        
        if (!match.matches()) {
            val_SupervisorEmail1_lbl.setText("Enterd SLIIT E-Mail is Incorrect! ");
            
        } else {
            val_SupervisorEmail1_lbl.setText(null);
        }
    }//GEN-LAST:event_email1_txtKeyReleased

    private void email2_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email2_txtKeyReleased

        //for Validation supervisor SLIIT email - II
        String PATTERN = "[a-zA-Z0-9 .@]{0,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(email2_txt.getText());
        
        if (!match.matches()) {
            val_SupervisorEmail2_lbl.setText("Enterd SLIIT E-Mail is Incorrect! ");
            
        } else {
            val_SupervisorEmail2_lbl.setText(null);
        }
    }//GEN-LAST:event_email2_txtKeyReleased

    private void password_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyReleased

        //for Validation SLIIT password
        String PATTERN = "^[a-zA-Z0-9]{0,2}[a-zA-Z0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(password_txt.getText());
        
        if (match.matches()) {
            val_pasword.setText("Week Password");
            val_pasword.setForeground(Color.red);
            
        } else if (!match.matches()) {
            val_pasword.setText("Strong Password");
            val_pasword.setForeground(Color.blue);
            
        } else {
            val_pasword.setText(null);
        }
    }//GEN-LAST:event_password_txtKeyReleased

    private void confirmePassword_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmePassword_txtKeyReleased

//        String vc = password_txt.getText();
//
//        if (confirmePassword_txt.equals(vc)) {
//            val_ConfirmPassword.setText("Password Matched");
//            val_ConfirmPassword.setForeground(Color.blue);
//        } else {
//            val_ConfirmPassword.setText("Passowrd NOT Match");
//            val_ConfirmPassword.setForeground(Color.RED);
//        }
//        
//        
        

//        try {
//            if (vc.equals(confirmePassword_txt)) {  //check filds
//
//                //for Validation SLIIT confiromPassword
//                String PATTERN = "^[a-zA-Z0-9]{0,30}$";
//                Pattern patt = Pattern.compile(PATTERN);
//                Matcher match = patt.matcher(confirmePassword_txt.getText());
//
//                if (!match.matches()) {
//                    val_ConfirmPassword.setText("Passowrd NOT Match");
//                    val_ConfirmPassword.setForeground(Color.RED);
//
//                } else if (match.matches()) {
//                    val_ConfirmPassword.setText("Password Matched");
//                    val_ConfirmPassword.setForeground(Color.blue);
//
//                } else {
//                    val_ConfirmPassword.setText("");
//                }
//            }
//        } catch (Exception e) {
//            val_ConfirmPassword.setText("Passowrd NOT Match");
//            val_ConfirmPassword.setForeground(Color.RED);
//        }

    }//GEN-LAST:event_confirmePassword_txtKeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //To existing object checker
    RegistationType s3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset_btn;
    private javax.swing.JButton back_Btn;
    private javax.swing.JPanel body;
    private javax.swing.JTextField companyName_txt;
    private javax.swing.JPasswordField confirmePassword_txt;
    private javax.swing.JTextField contactNumber_txt;
    private javax.swing.JTextField email1_txt;
    private javax.swing.JTextField email2_txt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField option_txt;
    public javax.swing.JPasswordField password_txt;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField supervisorName_txt;
    private javax.swing.JTextField supervisorTitle_txt;
    private javax.swing.JLabel val_CompanyName_lbl;
    private javax.swing.JLabel val_ConfirmPassword;
    private javax.swing.JLabel val_ContactNumber_lbl;
    private javax.swing.JLabel val_SupervisorEmail1_lbl;
    private javax.swing.JLabel val_SupervisorEmail2_lbl;
    private javax.swing.JLabel val_SupervisorTitle_lbl;
    private javax.swing.JLabel val_name_lbl;
    private javax.swing.JLabel val_pasword;
    // End of variables declaration//GEN-END:variables
}
