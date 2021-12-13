/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_System_Loggin_Inerfaces;

import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;

/**
 *
 * @author perer
 */
public class RegistationType extends javax.swing.JInternalFrame {

    public RegistationType() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        mainText = new javax.swing.JLabel();
        backbtn2 = new javax.swing.JButton();
        BodyPanel = new javax.swing.JPanel();
        Supervisor = new javax.swing.JButton();
        student = new javax.swing.JButton();
        studentImage = new javax.swing.JLabel();
        supervisorImage = new javax.swing.JLabel();
        bottemPanel_line = new javax.swing.JPanel();

        setVisible(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        TopPanel.setBackground(new java.awt.Color(0, 0, 153));

        mainText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainText.setForeground(new java.awt.Color(255, 255, 255));
        mainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainText.setText("SELECT REGISTRATION TYPE");
        mainText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backbtn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous - 32.png"))); // NOI18N
        backbtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn2)
                .addGap(18, 18, 18)
                .addComponent(mainText, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backbtn2))
                    .addComponent(mainText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        Supervisor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Supervisor.setText("SUPERVISOR");
        Supervisor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorActionPerformed(evt);
            }
        });

        student.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student.setText("STUDENT");
        student.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        studentImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graduated-128.png"))); // NOI18N

        supervisorImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supervisorImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supervisorCombined.png"))); // NOI18N

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentImage, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addGap(124, 124, 124)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Supervisor, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(supervisorImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(170, 170, 170))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentImage)
                    .addComponent(supervisorImage))
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottemPanel_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114)
                .addComponent(bottemPanel_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.SupervisorReg suReg = new B_System_Loggin_Inerfaces.SupervisorReg();
        MainDesktoppane.add(suReg).setVisible(true);

        suReg.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        suReg.setLocation(0, 0);

    }//GEN-LAST:event_SupervisorActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed

        MainDesktoppane.removeAll();
       StudentRegistation_Part1 sReg = new StudentRegistation_Part1();
        MainDesktoppane.add(sReg).setVisible(true);

        sReg.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        sReg.setLocation(0, 0);

    }//GEN-LAST:event_studentActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.LogginPage lpage = new B_System_Loggin_Inerfaces.LogginPage();
        MainDesktoppane.add(lpage).setVisible(true);

        lpage.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        lpage.setLocation(0, 0);

    }//GEN-LAST:event_backbtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JButton Supervisor;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton backbtn2;
    private javax.swing.JPanel bottemPanel_line;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainText;
    private javax.swing.JButton student;
    private javax.swing.JLabel studentImage;
    private javax.swing.JLabel supervisorImage;
    // End of variables declaration//GEN-END:variables
}
