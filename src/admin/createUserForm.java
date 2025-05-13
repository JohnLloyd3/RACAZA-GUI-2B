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
        // Initially, password field enabled for adding new user
        passwordfield.setEnabled(true);
        // Disable password field if update button is enabled (update mode)
        if (update.isEnabled()) {
            passwordfield.setEnabled(false);
        }
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

        jPanel1 = new javax.swing.JPanel();
        lll1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        navigation2 = new javax.swing.JPanel();
        registrationformtext2 = new javax.swing.JLabel();
        resfntext = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        resfntext1 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        reslntext = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        resps1 = new javax.swing.JLabel();
        resemailtext = new javax.swing.JLabel();
        resusrntext = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        attext1 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        attext = new javax.swing.JLabel();
        uss = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        WELCOME4 = new javax.swing.JLabel();
        resuidtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(123, 159, 207));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lll1.setBackground(new java.awt.Color(123, 159, 207));
        lll1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supp logo (1)-modified.png"))); // NOI18N
        lll1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Love . Care . Protect");
        lll1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Support Us!");
        lll1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 270, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("About Us!");
        lll1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 270, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Join Us!");
        lll1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 270, -1));

        navigation2.setBackground(new java.awt.Color(123, 159, 207));
        navigation2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationformtext2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 48)); // NOI18N
        registrationformtext2.setForeground(new java.awt.Color(255, 255, 255));
        registrationformtext2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationformtext2.setText("REGISTRATION FORM");
        navigation2.add(registrationformtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 20, 1000, 60));

        lll1.add(navigation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1000, 140));

        jPanel1.add(lll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 272, 740));

        resfntext.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resfntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resfntext.setText("User ID:");
        jPanel1.add(resfntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 78, 360, 30));

        uid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 86, 360, 40));

        resfntext1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resfntext1.setForeground(new java.awt.Color(0, 0, 0));
        resfntext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resfntext1.setText("First Name:");
        jPanel1.add(resfntext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 126, 360, 20));

        fn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 146, 360, 40));

        reslntext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reslntext.setForeground(new java.awt.Color(0, 0, 0));
        reslntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reslntext.setText("Last Name:");
        jPanel1.add(reslntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 186, 360, 20));

        ln.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 206, 360, 40));

        em.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 266, 360, 40));

        resps1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resps1.setForeground(new java.awt.Color(0, 0, 0));
        resps1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resps1.setText("Password:");
        jPanel1.add(resps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 366, 360, 20));

        resemailtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resemailtext.setForeground(new java.awt.Color(0, 0, 0));
        resemailtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resemailtext.setText("Email:");
        jPanel1.add(resemailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 246, 360, 20));

        resusrntext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resusrntext.setForeground(new java.awt.Color(0, 0, 0));
        resusrntext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resusrntext.setText("Username:");
        jPanel1.add(resusrntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 306, 360, -1));

        us.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 326, 360, 40));

        passwordfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 386, 360, 40));

        attext1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attext1.setForeground(new java.awt.Color(0, 0, 0));
        attext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attext1.setText("Account Type:");
        jPanel1.add(attext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 426, 360, 20));

        ut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel1.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 446, 360, 50));

        attext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attext.setForeground(new java.awt.Color(0, 0, 0));
        attext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attext.setText("User Status:");
        jPanel1.add(attext, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 496, 360, 30));

        uss.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        uss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        uss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ussActionPerformed(evt);
            }
        });
        jPanel1.add(uss, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 526, 360, 50));

        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 606, 110, 40));

        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 606, 110, 40));

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 606, 110, 40));

        refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 666, 110, 40));

        cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 666, 110, 40));

        clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 666, 110, 40));

        WELCOME4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        WELCOME4.setForeground(new java.awt.Color(255, 255, 255));
        WELCOME4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WELCOME4.setText("Create User ");
        jPanel1.add(WELCOME4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 0, 475, 60));

        resuidtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resuidtext.setForeground(new java.awt.Color(0, 0, 0));
        resuidtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resuidtext.setText("User ID:");
        jPanel1.add(resuidtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 66, 360, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm usf =new usersForm();
        usf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cancelActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(fn.getText().isEmpty()||ln.getText().isEmpty()
            ||em.getText().isEmpty()||us.getText().isEmpty()
            ||passwordfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (passwordfield.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            passwordfield.setText("");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE tbl_user SET u_firstname = '"+fn.getText()+"',u_lastname = '"
                +ln.getText()+"',u_email='"+em.getText()+"'"
                + ", u_username ='"+us.getText()+"',u_password = '"+passwordfield.getText()+"'"
                + ",u_type = '"+ut.getSelectedItem()+"',u_status = '"+uss.getSelectedItem()+"'WHERE u_id = '"+uid.getText()+"' ");
            usersForm uf = new  usersForm();
            uf.setVisible(true);
            this.dispose();
        }
        // Disable password field when updating
        passwordfield.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed

    }//GEN-LAST:event_passwordfieldActionPerformed

    private void ussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ussActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ussActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed

    }//GEN-LAST:event_usActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if(uid.getText().isEmpty()||ln.getText().isEmpty()
            ||em.getText().isEmpty()||us.getText().isEmpty()
            ||passwordfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if (passwordfield.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            passwordfield.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user (u_firstname, u_lastname, u_email,"
                + " u_username, u_password, u_type, u_status) "
                + "VALUES ('"+ uid.getText() + "','" + ln.getText() + "','" + em.getText()
                + "','" + us.getText() + "','" + passwordfield.getText() + "','" +
                uss.getSelectedItem() + "','"+uss.getSelectedItem()+"')")>0){

            JOptionPane.showMessageDialog(null, "Registraation Succes!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
        // Enable password field when adding new user
        passwordfield.setEnabled(true);
    }//GEN-LAST:event_addActionPerformed
    
    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed

    }//GEN-LAST:event_lnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed

    }//GEN-LAST:event_emActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed

    }//GEN-LAST:event_uidActionPerformed
    
    

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
    private javax.swing.JLabel WELCOME4;
    public javax.swing.JButton add;
    private javax.swing.JLabel attext;
    private javax.swing.JLabel attext1;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lll1;
    public javax.swing.JTextField ln;
    private javax.swing.JPanel navigation2;
    public javax.swing.JPasswordField passwordfield;
    public javax.swing.JButton refresh;
    private javax.swing.JLabel registrationformtext2;
    private javax.swing.JLabel resemailtext;
    private javax.swing.JLabel resfntext;
    private javax.swing.JLabel resfntext1;
    private javax.swing.JLabel reslntext;
    private javax.swing.JLabel resps1;
    private javax.swing.JLabel resuidtext;
    private javax.swing.JLabel resusrntext;
    public javax.swing.JTextField uid;
    public javax.swing.JButton update;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> uss;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}