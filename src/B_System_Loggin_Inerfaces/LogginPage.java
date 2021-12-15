package B_System_Loggin_Inerfaces;

import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;
import C_System_Common_Interfaces.starterPage_2;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import A_DataBase.DBconnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author perer
 */
public class LogginPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form login
     */
    public LogginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        Registerbtn = new javax.swing.JButton();
        forgetPassword_lbl = new javax.swing.JLabel();
        backbtn1 = new javax.swing.JButton();
        valemail_lbl = new javax.swing.JLabel();
        valPassword_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bottemPanel_line = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setMaximumSize(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SYSTEM LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Password :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("E-Mail       :");

        username_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_txt.setMaximumSize(new java.awt.Dimension(6, 20));
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_txtKeyReleased(evt);
            }
        });

        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_txtKeyReleased(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(255, 255, 255));
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setText("Log in");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        Registerbtn.setBackground(new java.awt.Color(255, 255, 255));
        Registerbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registerbtn.setText("Register");
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });

        forgetPassword_lbl.setForeground(new java.awt.Color(0, 0, 255));
        forgetPassword_lbl.setText("Forgot Password?");
        forgetPassword_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPassword_lblMouseClicked(evt);
            }
        });

        backbtn1.setBackground(new java.awt.Color(255, 255, 255));
        backbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backbtn1.setText("BACK");
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });

        valemail_lbl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        valemail_lbl.setForeground(new java.awt.Color(255, 51, 51));
        valemail_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        valPassword_lbl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        valPassword_lbl.setForeground(new java.awt.Color(204, 51, 0));
        valPassword_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginimages.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(forgetPassword_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valemail_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valPassword_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(valemail_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(valPassword_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(forgetPassword_lbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bottemPanel_line.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout bottemPanel_lineLayout = new javax.swing.GroupLayout(bottemPanel_line);
        bottemPanel_line.setLayout(bottemPanel_lineLayout);
        bottemPanel_lineLayout.setHorizontalGroup(
            bottemPanel_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottemPanel_lineLayout.setVerticalGroup(
            bottemPanel_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottemPanel_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bottemPanel_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

        //Validations for LogginPage
        if (username_txt.getText().trim().isEmpty() && password_txt.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Pleas fill the fileds");
        } else if (username_txt.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Pleas fill the SLIIT Student Number");
        } else if (password_txt.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Pleas fill Your Password");
        }
        try {

            //DataBase connected
            ResultSet rs = A_DataBase.DBconnect.connect().createStatement().executeQuery("Select * from login where userName='" + username_txt.getText() + "' and password='" + password_txt.getText() + "'");

            if (rs.next()) {

                String s1 = rs.getString("options");

                if (s1.equalsIgnoreCase("admin")) {

                    MainDesktoppane.removeAll();
                    D_System_Forms_and_Dashboard_Interfaces.AdminDashboard adl = new D_System_Forms_and_Dashboard_Interfaces.AdminDashboard();
                    MainDesktoppane.add(adl).setVisible(true);

                    adl.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
                    adl.setLocation(0, 0);

                    JOptionPane.showMessageDialog(null, "Welcome Mr/Ms " + username_txt.getText() + " to SLIIT IRMS");

                }
                if (s1.equalsIgnoreCase("supervisor")) {

                    MainDesktoppane.removeAll();
                    D_System_Forms_and_Dashboard_Interfaces.Supervisor_DashBoard stu = new D_System_Forms_and_Dashboard_Interfaces.Supervisor_DashBoard();
                    MainDesktoppane.add(stu).setVisible(true);

                    stu.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
                    stu.setLocation(0, 0);

                    JOptionPane.showMessageDialog(null, "Welcome Mr/Ms " + username_txt.getText() + " to SLIIT IRMS System");

                }

                if (s1.equalsIgnoreCase("student")) {

                    MainDesktoppane.removeAll();
                    D_System_Forms_and_Dashboard_Interfaces.Student_DashBoard stD = new D_System_Forms_and_Dashboard_Interfaces.Student_DashBoard();
                    MainDesktoppane.add(stD).setVisible(true);

                    stD.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
                    stD.setLocation(0, 0);

                    JOptionPane.showMessageDialog(null, "Welcome " + username_txt.getText());

                }

            } else {

//                if (!equals(s1)) {
//                    JOptionPane.showMessageDialog(null, "You are not eligible to Login in to the System!");
//                }

                username_txt.setText("");
                password_txt.setText("");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_loginbtnActionPerformed

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.RegistationType rType = new B_System_Loggin_Inerfaces.RegistationType();
        MainDesktoppane.add(rType).setVisible(true);

        rType.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        rType.setLocation(0, 0);

    }//GEN-LAST:event_RegisterbtnActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed

        if (s3 == null) {

            MainDesktoppane.removeAll();
            C_System_Common_Interfaces.starterPage_2 S2 = new C_System_Common_Interfaces.starterPage_2();
            MainDesktoppane.add(S2).setVisible(true);

            S2.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            S2.setLocation(0, 0);

        } else {

            MainDesktoppane.removeAll();
            MainDesktoppane.add(s3).setVisible(true);

            s3.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
            s3.setLocation(0, 0);
        }
    }//GEN-LAST:event_backbtn1ActionPerformed

    private void forgetPassword_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPassword_lblMouseClicked
        //   forget password 
    }//GEN-LAST:event_forgetPassword_lblMouseClicked

    private void username_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyReleased

//        //for Validation SLIIT emailID
        String PATTERN = "^[a-zA-Z0-9]{0,10}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z0-9]{0,5}[.][a-zA-Z0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(username_txt.getText());

        if (!match.matches()) {
            valemail_lbl.setText("Enterd SLIIT ID is Incorrect! ");

        } else {
            valemail_lbl.setText(null);
        }

 //for Validation SLIIT email
//        String PATTERN = "^[a-zA-Z0-9]{0,10}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z0-9]{0,5}[.][a-zA-Z0-9]{0,2}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(sliitEmail_address.getText());
//
//        if (!match.matches()) {
//            valEmail_lbl.setText("Enterd SLIIT E-Mail is Incorrect! ");
//
//        } else {
//            valEmail_lbl.setText(null);
//        }
    }//GEN-LAST:event_username_txtKeyReleased

    private void password_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyReleased

        //for Validation SLIIT password
        String PATTERN = "^[a-zA-Z0-9]{0,2}[a-zA-Z0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(password_txt.getText());

        if (match.matches()) {
            valPassword_lbl.setText("Chack");
            valPassword_lbl.setForeground(Color.red);

        } else if (!match.matches()) {
            valPassword_lbl.setText("Done");
            valPassword_lbl.setForeground(Color.blue);

        } else {
            valPassword_lbl.setText(null);
        }
    }//GEN-LAST:event_password_txtKeyReleased

    //To existing object checker
    starterPage_2 s3;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registerbtn;
    private javax.swing.JButton backbtn1;
    private javax.swing.JPanel bottemPanel_line;
    private javax.swing.JLabel forgetPassword_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField username_txt;
    private javax.swing.JLabel valPassword_lbl;
    private javax.swing.JLabel valemail_lbl;
    // End of variables declaration//GEN-END:variables

    //   private void loging() {     //also working
//        if (username_txt.getText().trim().isEmpty() && password_txt.getText().trim().isEmpty()) {
//
//            JOptionPane.showMessageDialog(null, "Pleas fill the fileds");
//        } else if (username_txt.getText().trim().isEmpty()) {
//
//            JOptionPane.showMessageDialog(null, "Pleas fill the E-Mail");
//        } else if (password_txt.getText().trim().isEmpty()) {
//
//            JOptionPane.showMessageDialog(null, "Pleas fill the Password");
//        }
//        try {
//
//            //DataBase connected
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/intern_managment_system", "root", "");
//
//            String sql = "Select * from login where userName=? and password=?";
//            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1, username_txt.getText());
//            pst.setString(2, password_txt.getText());
//
//            ResultSet rs = pst.executeQuery();
//
//            if (rs.next()) {
//
//                JOptionPane.showMessageDialog(null, "Loging Sucessfull");
//
//                MainDesktoppane.removeAll();
//                D_System_Forms_Interfaces.DashBoard d = new D_System_Forms_Interfaces.DashBoard();
//                MainDesktoppane.add(d).setVisible(true);
//                
//                d.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
//                d.setLocation(0, 0);
//
//            } else {
//
//                //JOptionPane.showMessageDialog(null, "Loging Faild");
//                username_txt.setText("");
//                password_txt.setText("");
//
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
}
