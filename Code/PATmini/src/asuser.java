/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.*; // For JFrame, JButton, JTextField, JOptionPane, etc.
import java.awt.*; // For layout managers and AWT components
import java.sql.Connection; // For database connections
import java.sql.DriverManager; // For managing the database connection
import java.sql.PreparedStatement; // For precompiled SQL statements
import java.sql.ResultSet; // For accessing the results of a query
import java.sql.SQLException;
// For SQL database interaction
import java.sql.*;
import patmini.usersession;

/**
 *
 * @author Varunkumar lysetti
 */
public class asuser extends javax.swing.JFrame {

    /**
     * Creates new form asuser
     */
    public asuser() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        q6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Q.3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 50, 20));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Q.2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        q3.setEditable(false);
        q3.setBackground(new java.awt.Color(153, 153, 255));
        q3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 302, 41));

        q2.setEditable(false);
        q2.setBackground(new java.awt.Color(153, 153, 255));
        q2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 302, 41));

        q5.setEditable(false);
        q5.setBackground(new java.awt.Color(153, 153, 255));
        q5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 302, 41));

        q4.setEditable(false);
        q4.setBackground(new java.awt.Color(153, 153, 255));
        q4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 302, 41));

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Q.4");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 340, 40, 20));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Q.5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 406, 40, 30));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Q.1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        q1.setEditable(false);
        q1.setBackground(new java.awt.Color(153, 153, 255));
        q1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 143, 302, 41));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("ASSIGNMENT QUESTIONS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 306, 20));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        q6.setBackground(new java.awt.Color(153, 153, 255));
        q6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6ActionPerformed(evt);
            }
        });
        getContentPane().add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 81, 302, 41));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 88, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picsart_24-09-01_22-01-15-634.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  // Database connection details
    String url = "jdbc:mysql://localhost:3306/pat"; 
    String user = "root"; 
    String password = "pat@admin#0987"; 

    // Get the value from text field q6
    String assignmentName = q6.getText(); 

    // Debugging: Print the assignment name
    System.out.println("Assignment Name: " + assignmentName);

    String query = "SELECT q1, q2, q3, q4, q5 FROM assignques WHERE name = ?"; 

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pst = conn.prepareStatement(query)) {

        pst.setString(1, assignmentName);
        
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                q1.setText(rs.getString("q1"));
                q2.setText(rs.getString("q2"));
                q3.setText(rs.getString("q3"));
                q4.setText(rs.getString("q4"));
                q5.setText(rs.getString("q5"));
                
                // Debugging: Print logged-in username
                System.out.println("Logged in username: " + usersession.loggedInUsername);
                String insertQuery = "INSERT INTO asseen (name) VALUES (usersession.loggedInUsername)";
              
            } else {
                JOptionPane.showMessageDialog(this, "No assignment found with that name.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching questions: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    private void q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q6ActionPerformed

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
            java.util.logging.Logger.getLogger(asuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    // End of variables declaration//GEN-END:variables
}
