
package com.mycompany.hospitalog;


public class LogFrame extends javax.swing.JFrame {

    
    public LogFrame() {
        initComponents();
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        Nametext = new javax.swing.JTextField();
        PWLabel = new javax.swing.JLabel();
        PWfield = new javax.swing.JPasswordField();
        LogButton = new javax.swing.JButton();
        RegButton = new javax.swing.JButton();
        Title = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Username.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Username.setText("Username:");

        Nametext.setActionCommand("<Not Set>");
        Nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametextActionPerformed(evt);
            }
        });

        PWLabel.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PWLabel.setText("Password:");

        PWfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWfieldActionPerformed(evt);
            }
        });

        LogButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        LogButton.setText("Login");
        LogButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogButtonActionPerformed(evt);
            }
        });

        RegButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        RegButton.setText("Register");
        RegButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegButtonActionPerformed(evt);
            }
        });

        Title.setAlignment(java.awt.Label.CENTER);
        Title.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        Title.setMinimumSize(new java.awt.Dimension(122, 50));
        Title.setText("Hospital Admin Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PWLabel)
                            .addComponent(Username)
                            .addComponent(LogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nametext)
                                    .addComponent(PWfield, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(RegButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(Nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWLabel)
                    .addComponent(PWfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegButton)
                    .addComponent(LogButton))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametextActionPerformed
        
    }//GEN-LAST:event_NametextActionPerformed

    private void LogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogButtonActionPerformed
            
    }//GEN-LAST:event_LogButtonActionPerformed

    private void PWfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWfieldActionPerformed
        
    }//GEN-LAST:event_PWfieldActionPerformed

    private void RegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegButtonActionPerformed
        RegForm rf = new RegForm();
        rf.show();
        dispose();
    }//GEN-LAST:event_RegButtonActionPerformed

    
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogButton;
    private javax.swing.JTextField Nametext;
    private javax.swing.JLabel PWLabel;
    private javax.swing.JPasswordField PWfield;
    private javax.swing.JButton RegButton;
    private java.awt.Label Title;
    private javax.swing.JLabel Username;
    // End of variables declaration//GEN-END:variables
}
