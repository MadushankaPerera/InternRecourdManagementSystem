/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_System_Common_Interfaces;

import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;

/**
 *
 * @author perer
 */
public class starterPage_2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form starterPage_2
     */
    public starterPage_2() {
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

        mainPnel = new javax.swing.JPanel();
        TopPanel_Line = new javax.swing.JPanel();
        buttonList = new javax.swing.JPanel();
        studentButton1 = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();
        supervisorButton = new javax.swing.JButton();
        studentImage = new javax.swing.JLabel();
        adminImage = new javax.swing.JLabel();
        supervisorImage = new javax.swing.JLabel();
        bottemPanel_line = new javax.swing.JPanel();

        mainPnel.setBackground(new java.awt.Color(255, 255, 255));

        TopPanel_Line.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout TopPanel_LineLayout = new javax.swing.GroupLayout(TopPanel_Line);
        TopPanel_Line.setLayout(TopPanel_LineLayout);
        TopPanel_LineLayout.setHorizontalGroup(
            TopPanel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TopPanel_LineLayout.setVerticalGroup(
            TopPanel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        buttonList.setBackground(new java.awt.Color(255, 255, 255));

        studentButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentButton1.setText("STUDENT");
        studentButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButton1ActionPerformed(evt);
            }
        });

        AdminButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AdminButton.setText("ADMIN");
        AdminButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        supervisorButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supervisorButton.setText("SUPERVISORS");
        supervisorButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supervisorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisorButtonActionPerformed(evt);
            }
        });

        studentImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graduated-128.png"))); // NOI18N

        adminImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin- 128.png"))); // NOI18N

        supervisorImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supervisorImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supervisorCombined.png"))); // NOI18N

        javax.swing.GroupLayout buttonListLayout = new javax.swing.GroupLayout(buttonList);
        buttonList.setLayout(buttonListLayout);
        buttonListLayout.setHorizontalGroup(
            buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonListLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(studentImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(adminImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supervisorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(supervisorImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        buttonListLayout.setVerticalGroup(
            buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonListLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentImage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supervisorImage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supervisorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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

        javax.swing.GroupLayout mainPnelLayout = new javax.swing.GroupLayout(mainPnel);
        mainPnel.setLayout(mainPnelLayout);
        mainPnelLayout.setHorizontalGroup(
            mainPnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottemPanel_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TopPanel_Line, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPnelLayout.setVerticalGroup(
            mainPnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopPanel_Line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bottemPanel_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButton1ActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.LogginPage hmi = new B_System_Loggin_Inerfaces.LogginPage();
        MainDesktoppane.add(hmi).setVisible(true);

        hmi.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        hmi.setLocation(0, 0);

    }//GEN-LAST:event_studentButton1ActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.LogginPage hmi = new B_System_Loggin_Inerfaces.LogginPage();
        MainDesktoppane.add(hmi).setVisible(true);

        hmi.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        hmi.setLocation(0, 0);

    }//GEN-LAST:event_AdminButtonActionPerformed

    private void supervisorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorButtonActionPerformed

        MainDesktoppane.removeAll();
        B_System_Loggin_Inerfaces.LogginPage hmi = new B_System_Loggin_Inerfaces.LogginPage();
        MainDesktoppane.add(hmi).setVisible(true);

        hmi.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        hmi.setLocation(0, 0);

    }//GEN-LAST:event_supervisorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JPanel TopPanel_Line;
    private javax.swing.JLabel adminImage;
    private javax.swing.JPanel bottemPanel_line;
    private javax.swing.JPanel buttonList;
    private javax.swing.JPanel mainPnel;
    private javax.swing.JButton studentButton1;
    private javax.swing.JLabel studentImage;
    private javax.swing.JButton supervisorButton;
    private javax.swing.JLabel supervisorImage;
    // End of variables declaration//GEN-END:variables
}
