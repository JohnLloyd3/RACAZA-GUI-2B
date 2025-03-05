/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import racazagui.login;
import static racazagui.register.email;
import static racazagui.register.usname;

/**
 *
 * @author johnlloyd
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
        
       public boolean duplicateCheck(){
           dbConnector dbc = new dbConnector();
           try{
               String query = "SELECT * FROM tbl_user WHERE u_username = '" + us.getText() + "' OR u_password = '" + em.getText() + "'";  
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
               email = resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already used");
                    em.setText("");
                }
               usname = resultSet.getString("u_username");
               System.out.println(""+usname);
                if(usname.equals(us.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already used");
                    us.setText("");
                }
                return true;
            }else{
                return false;
            }
           }catch(SQLException ex){
               System.out.println(""+ex);
               return false;
       }
   
       }

        public boolean updateCheck(){
           dbConnector dbc = new dbConnector();
           try{
               String query = "SELECT * FROM tbl_user WHERE (u_username = '" + us.getText() + "' OR u_email = '" + em.getText() + "')AND u_id!= '"+uid.getText()+"'";  
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
               email = resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already used");
                    em.setText("");
                }
               usname = resultSet.getString("u_username");
               System.out.println(""+usname);
                if(usname.equals(us.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already used");
                    us.setText("");
                }
                return true;
            }else{
                return false;
            }
           }catch(SQLException ex){
               System.out.println(""+ex);
               return false;
       }
   
       }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgnavigation = new javax.swing.JPanel();
        registrationformtext = new javax.swing.JLabel();
        attext = new javax.swing.JLabel();
        resfntext = new javax.swing.JLabel();
        reslntext = new javax.swing.JLabel();
        resemailtext = new javax.swing.JLabel();
        resusrntext = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        resps1 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        uss = new javax.swing.JComboBox<>();
        ps = new javax.swing.JPasswordField();
        ut = new javax.swing.JComboBox<>();
        attext1 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        resfntext1 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rgnavigation.setBackground(new java.awt.Color(0, 0, 0));
        rgnavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationformtext.setFont(new java.awt.Font("HP Simplified Jpan", 0, 48)); // NOI18N
        registrationformtext.setForeground(new java.awt.Color(255, 255, 255));
        registrationformtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationformtext.setText("REGISTRATION FORM");
        rgnavigation.add(registrationformtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        getContentPane().add(rgnavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        attext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        attext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attext.setText("User Status:");
        getContentPane().add(attext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 450, 30));

        resfntext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resfntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resfntext.setText("User ID:");
        getContentPane().add(resfntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 450, 30));

        reslntext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reslntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reslntext.setText("Last Name:");
        getContentPane().add(reslntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 450, 20));

        resemailtext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resemailtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resemailtext.setText("Email:");
        getContentPane().add(resemailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 450, 20));

        resusrntext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resusrntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resusrntext.setText("Username:");
        getContentPane().add(resusrntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 348, 450, -1));

        uid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        getContentPane().add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 450, 40));

        em.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 450, 40));

        ln.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        getContentPane().add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 450, 40));

        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 120, 50));

        resps1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resps1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resps1.setText("Password:");
        getContentPane().add(resps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 450, 20));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        getContentPane().add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 110, 620, 690));

        us.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 450, 40));

        uss.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        uss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ussActionPerformed(evt);
            }
        });
        getContentPane().add(uss, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 450, 50));

        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        getContentPane().add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 450, 40));

        ut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        getContentPane().add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 450, 50));

        attext1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        attext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attext1.setText("Account Type:");
        getContentPane().add(attext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 450, 20));

        fn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 450, 40));

        resfntext1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resfntext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resfntext1.setText("First Name:");
        getContentPane().add(resfntext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 450, 20));

        clear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, 120, 50));

        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 650, 120, 50));

        delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 120, 50));

        refresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 120, 50));

        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 710, 120, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
    

    }//GEN-LAST:event_uidActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
       
    }//GEN-LAST:event_emActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
    
    }//GEN-LAST:event_lnActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if(uid.getText().isEmpty()||ln.getText().isEmpty()
            ||em.getText().isEmpty()||us.getText().isEmpty()
            ||ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (ps.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            ps.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user (u_firstname, u_lastname, u_email,"
                + " u_username, u_password, u_type, u_status) "
                + "VALUES ('"+ uid.getText() + "','" + ln.getText() + "','" + em.getText()
                + "','" + us.getText() + "','" + ps.getText() + "','" +
                uss.getSelectedItem() + "','"+uss.getSelectedItem()+"')")>0){

            JOptionPane.showMessageDialog(null, "Registraation Succes!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_addActionPerformed
    }
    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
       

    }//GEN-LAST:event_usActionPerformed

    private void ussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ussActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ussActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
      
        
    }//GEN-LAST:event_psActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(fn.getText().isEmpty()||ln.getText().isEmpty()
                ||em.getText().isEmpty()||us.getText().isEmpty()
                ||ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (ps.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
        ps.setText("");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");     
        }else{ 
         dbConnector dbc = new dbConnector();
         dbc.updateData("UPDATE tbl_user SET u_firstname = '"+fn.getText()+"',u_lastname = '"
             +ln.getText()+"',u_email='"+em.getText()+"'"
             + ", u_username ='"+us.getText()+"',u_password = '"+ps.getText()+"'"
             + ",u_type = '"+ut.getSelectedItem()+"',u_status = '"+uss.getSelectedItem()+"'WHERE u_id = '"+uid.getText()+"' ");    
         usersForm uf = new  usersForm();
         uf.setVisible(true);
         this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
  usersForm usf =new usersForm();
  usf.setVisible(true);
      this.dispose();
      
      
      
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JLabel attext;
    private javax.swing.JLabel attext1;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel logo1;
    public javax.swing.JPasswordField ps;
    public javax.swing.JButton refresh;
    private javax.swing.JLabel registrationformtext;
    private javax.swing.JLabel resemailtext;
    private javax.swing.JLabel resfntext;
    private javax.swing.JLabel resfntext1;
    private javax.swing.JLabel reslntext;
    private javax.swing.JLabel resps1;
    private javax.swing.JLabel resusrntext;
    private javax.swing.JPanel rgnavigation;
    public javax.swing.JTextField uid;
    public javax.swing.JButton update;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> uss;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
