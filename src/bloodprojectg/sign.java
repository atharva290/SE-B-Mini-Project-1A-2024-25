/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodprojectg;

import bloodprojectg.conn;
import bloodprojectg.login;
import javax.swing.JOptionPane;
public class sign extends javax.swing.JFrame {
 login loginframe= new login();
    /**
     * Creates new form sign
     */
    public sign() {
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

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        smail = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        smobile = new javax.swing.JTextField();
        ssuser = new javax.swing.JTextField();
        spass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        push = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        same_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1145, 612));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("SIGNUP");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 200, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Name");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Gmail");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Mobile");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 80, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Confirm Password");
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 220, -1));

        smail.setBackground(new java.awt.Color(255, 51, 51));
        smail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel.add(smail, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 250, 47));

        sname.setBackground(new java.awt.Color(255, 51, 51));
        sname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        panel.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 250, 47));

        smobile.setBackground(new java.awt.Color(255, 51, 51));
        smobile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel.add(smobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 250, 47));

        ssuser.setBackground(new java.awt.Color(255, 51, 51));
        ssuser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel.add(ssuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 250, 47));

        spass.setBackground(new java.awt.Color(255, 51, 51));
        spass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spassActionPerformed(evt);
            }
        });
        panel.add(spass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 250, 47));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 130, 40));

        push.setBackground(new java.awt.Color(255, 204, 204));
        push.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        push.setText("CREATE ACCOUNT");
        push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushActionPerformed(evt);
            }
        });
        panel.add(push, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 360, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Already Have An Account??");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, 31));

        same_pass.setBackground(new java.awt.Color(255, 51, 51));
        same_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        same_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                same_passActionPerformed(evt);
            }
        });
        panel.add(same_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 250, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   // TODO add your handling code here:
       loginframe.setVisible(true);
        loginframe.setLocationRelativeTo(null);  
        loginframe.pack();
        this.setVisible(false);   
         
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushActionPerformed
        
        if(sname.getText().isEmpty() || ssuser.getText().isEmpty() || spass.getText().isEmpty() || 
       smobile.getText().isEmpty() || smail.getText().isEmpty() || same_pass.getText().isEmpty()) {      
        JOptionPane.showMessageDialog(null, "Please fill all fields.");
        return;
        }
       
            
            
         if(evt.getSource()==push){
           String name=sname.getText();
            String username=ssuser.getText(); 
            String password=new String(spass.getPassword()); 
             String mobile=smobile.getText();
              String gmail=smail.getText();
              String samepass=new String(same_pass.getPassword());
               
              
              
              
              if(password.equals(samepass)){
            
              
 
 String query="insert into signup values('"+name+"','"+username+"','"+password+"','"+gmail+"','"+mobile+"')";
               try{
            conn c=new conn();
c.s.executeUpdate(query); 
 }catch(Exception e)
               {    
                    e.printStackTrace();
               }
int  a=JOptionPane.showConfirmDialog(null,"Signup !!","select",JOptionPane.YES_NO_OPTION);
     if(a==0){
        loginframe.setVisible(true);
        loginframe.setLocationRelativeTo(null);  
        loginframe.pack();
        this.setVisible(false); 
        
     }else{
         return;
     }
     
              
    }else{
                   JOptionPane.showMessageDialog(null, "Password don't match.");
        return;
               }
             
}
    }//GEN-LAST:event_pushActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void same_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_same_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_same_passActionPerformed

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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel;
    private javax.swing.JButton push;
    private javax.swing.JPasswordField same_pass;
    private javax.swing.JTextField smail;
    private javax.swing.JTextField smobile;
    private javax.swing.JTextField sname;
    private javax.swing.JPasswordField spass;
    private javax.swing.JTextField ssuser;
    // End of variables declaration//GEN-END:variables
}
