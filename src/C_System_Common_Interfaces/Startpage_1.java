package C_System_Common_Interfaces;

import B_System_Loggin_Inerfaces.LogginPage;
import static C_System_Common_Interfaces.IRMS_STARTER_Page.MainDesktoppane;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author perer
 */
public class Startpage_1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Main_Page
     */
    public Startpage_1() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Top = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        welcomeLable = new javax.swing.JLabel();
        Bottum = new javax.swing.JPanel();
        copyRight = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximizable(true);
        setTitle("Welcome Page");
        setMaximumSize(new java.awt.Dimension(754, 566));
        setMinimumSize(new java.awt.Dimension(754, 566));
        setName(""); // NOI18N

        Top.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SLIIT.png"))); // NOI18N

        welcomeLable.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        welcomeLable.setForeground(new java.awt.Color(51, 102, 255));
        welcomeLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLable.setText("Welcome ! To the SLIIT Intern Record Management System");

        Bottum.setBackground(new java.awt.Color(255, 255, 255));

        copyRight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        copyRight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        copyRight.setText("Copyright 2021 © Group-08. All Rights Reserved.");

        javax.swing.GroupLayout BottumLayout = new javax.swing.GroupLayout(Bottum);
        Bottum.setLayout(BottumLayout);
        BottumLayout.setHorizontalGroup(
            BottumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BottumLayout.setVerticalGroup(
            BottumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyRight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go - 32.png"))); // NOI18N
        jButton1.setText("Let's Start .......");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 233, 41, 247);
        jPanel1.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bottum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(welcomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bottum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MainDesktoppane.removeAll();
        starterPage_2 s2 = new starterPage_2();
        MainDesktoppane.add(s2).setVisible(true);

        s2.setSize(MainDesktoppane.getWidth(), MainDesktoppane.getHeight()); //Set InternalFram to Full size
        s2.setLocation(0, 0);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bottum;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel copyRight;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel welcomeLable;
    // End of variables declaration//GEN-END:variables

}
