/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodhub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 18010
 */
public class restaurantRegister extends javax.swing.JFrame {

    /**
     * Creates new form restaurantRegister
     */
    public restaurantRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public Connection connection;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterToownerLogin = new javax.swing.JButton();
        reTypePassRES = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        reSREGPass = new javax.swing.JPasswordField();
        resLocation = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        resName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterToownerLogin.setBackground(new java.awt.Color(0, 255, 255));
        RegisterToownerLogin.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        RegisterToownerLogin.setForeground(new java.awt.Color(0, 0, 139));
        RegisterToownerLogin.setText("Registration");
        RegisterToownerLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterToownerLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterToownerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterToownerLoginActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterToownerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 100, 50));

        reTypePassRES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(reTypePassRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 300, 40));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOCATION : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RESTAURANT NAME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        resID.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        resID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resIDActionPerformed(evt);
            }
        });
        getContentPane().add(resID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 330, 40));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASSWORD :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        reSREGPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reSREGPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSREGPassActionPerformed(evt);
            }
        });
        getContentPane().add(reSREGPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 330, 40));

        resLocation.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        resLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resLocationActionPerformed(evt);
            }
        });
        getContentPane().add(resLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 330, 40));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RE_TYPE PASSWORD : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        resName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        resName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resNameActionPerformed(evt);
            }
        });
        getContentPane().add(resName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 330, 40));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RESTAURANT ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1170, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterToownerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterToownerLoginActionPerformed
        // TODO add your handling code here:
        
        String Name= resName.getText();
        String ID= resID.getText();
        String Location= resLocation.getText();
        String Pass= reSREGPass.getText();
        String RePass= reTypePassRES.getText();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectfoodHUB;selectMethod=cursor", "sa", "123456");
                
            if (ID.equals("")) {
            JOptionPane.showMessageDialog(this, "Type Restaurant ID");              
            }
            else
            {
                
                Statement statement = connection.createStatement();
                String sql="INSERT INTO Restaurant VALUES ('"+ID+"','"+Name+"','"+Location+"','"+Pass+"')";
                
                PreparedStatement prepare=connection.prepareStatement(sql);
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registration Complete.");   
                dispose();
                userLogin home= new userLogin();
                home.show();
            }  
            connection.close();
        }catch(SQLException ex){
             Logger.getLogger(registrationUserPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
                dispose();            
                ownerLoginPage ownerLogin= new ownerLoginPage();
                ownerLogin.show();
       

    }//GEN-LAST:event_RegisterToownerLoginActionPerformed

    private void resIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resIDActionPerformed

    private void reSREGPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reSREGPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reSREGPassActionPerformed

    private void resLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resLocationActionPerformed

    private void resNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(restaurantRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurantRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurantRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurantRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurantRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterToownerLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField reSREGPass;
    private javax.swing.JPasswordField reTypePassRES;
    private javax.swing.JTextField resID;
    private javax.swing.JTextField resLocation;
    private javax.swing.JTextField resName;
    // End of variables declaration//GEN-END:variables
}
