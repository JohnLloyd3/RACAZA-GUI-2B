/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import admin.admindashboard;
import adoption.adoptpet;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class petspage extends javax.swing.JFrame {

   
    public petspage() {
        initComponents();
        loadPets();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        acc_id = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        WELCOME3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petstable = new javax.swing.JTable();
        deletepet = new javax.swing.JButton();
        addpet = new javax.swing.JButton();
        editpet = new javax.swing.JButton();
        viewpet = new javax.swing.JButton();
        adoptpet = new javax.swing.JButton();
        sortpets = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 159, 207));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_id.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel2.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 801, 280, 42));

        jlabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel.setText("Current User:");
        jPanel2.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 738, 280, 45));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGOUT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 663, 280, 44));

        backbtn.setBackground(new java.awt.Color(142, 177, 217));
        backbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backbtn.setText("BACK");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 280, 45));

        WELCOME3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        WELCOME3.setForeground(new java.awt.Color(255, 255, 255));
        WELCOME3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WELCOME3.setText("PET'S PAGE");
        jPanel2.add(WELCOME3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 280, 70));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 650));

        petstable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        petstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(petstable);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 640, 400));

        deletepet.setBackground(new java.awt.Color(102, 153, 255));
        deletepet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deletepet.setForeground(new java.awt.Color(255, 255, 255));
        deletepet.setText("Delete Pet");
        deletepet.setBorder(null);
        deletepet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletepetMouseClicked(evt);
            }
        });
        deletepet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletepetActionPerformed(evt);
            }
        });
        background.add(deletepet, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 140, 50));

        addpet.setBackground(new java.awt.Color(102, 153, 255));
        addpet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addpet.setForeground(new java.awt.Color(255, 255, 255));
        addpet.setText("Add Pet");
        addpet.setBorder(null);
        addpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpetMouseClicked(evt);
            }
        });
        addpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpetActionPerformed(evt);
            }
        });
        background.add(addpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 50));

        editpet.setBackground(new java.awt.Color(102, 153, 255));
        editpet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editpet.setForeground(new java.awt.Color(255, 255, 255));
        editpet.setText("Edit Pet");
        editpet.setBorder(null);
        editpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editpetMouseClicked(evt);
            }
        });
        editpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpetActionPerformed(evt);
            }
        });
        background.add(editpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, 50));

        viewpet.setBackground(new java.awt.Color(102, 153, 255));
        viewpet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewpet.setForeground(new java.awt.Color(255, 255, 255));
        viewpet.setText("View Pet");
        viewpet.setBorder(null);
        viewpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpetMouseClicked(evt);
            }
        });
        viewpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpetActionPerformed(evt);
            }
        });
        background.add(viewpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, 50));

        adoptpet.setBackground(new java.awt.Color(102, 153, 255));
        adoptpet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adoptpet.setForeground(new java.awt.Color(255, 255, 255));
        adoptpet.setText("Adopt a Pet");
        adoptpet.setBorder(null);
        adoptpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adoptpetMouseClicked(evt);
            }
        });
        adoptpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptpetActionPerformed(evt);
            }
        });
        background.add(adoptpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 140, 50));

        sortpets.setBackground(new java.awt.Color(255, 255, 255));
        sortpets.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sortpets.setForeground(new java.awt.Color(0, 0, 0));
        sortpets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter Pets", "Available", "Pending", "Adopted" }));
        sortpets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortpetsActionPerformed(evt);
            }
        });
        background.add(sortpets, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 140, 50));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {
//GEN-FIRST:event_backbtnMouseClicked
        new admindashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void deletepetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletepetMouseClicked

    }//GEN-LAST:event_deletepetMouseClicked

    private void deletepetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletepetActionPerformed
        int selectedRow = petstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet to delete!");
            return;
        }
        int petId = Integer.parseInt(petstable.getValueAt(selectedRow, 0).toString());
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this pet?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                dbConnector dbc = new dbConnector();
                String sql = "DELETE FROM pets WHERE pet_id = ?";
                java.sql.PreparedStatement pst = dbc.getConnection().prepareStatement(sql);
                pst.setInt(1, petId);
                int result = pst.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Pet deleted successfully!");
                    loadPets();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete pet!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error deleting pet: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_deletepetActionPerformed

    private void addpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addpetMouseClicked

    private void addpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpetActionPerformed
        new addpet().setVisible(true);
      
    }//GEN-LAST:event_addpetActionPerformed

    private void editpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editpetMouseClicked

    private void editpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpetActionPerformed
        int selectedRow = petstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet to edit!");
            return;
        }
        
        int petId = Integer.parseInt(petstable.getValueAt(selectedRow, 0).toString());
        new editpet(petId).setVisible(true);
        
    }//GEN-LAST:event_editpetActionPerformed

    private void viewpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewpetMouseClicked

    private void viewpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpetActionPerformed
        int selectedRow = petstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet to view!");
            return;
        }
        int petId = Integer.parseInt(petstable.getValueAt(selectedRow, 0).toString());
        new viewpet(petId).setVisible(true);
    }//GEN-LAST:event_viewpetActionPerformed

    private void adoptpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adoptpetMouseClicked
       
    }//GEN-LAST:event_adoptpetMouseClicked

    private void adoptpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptpetActionPerformed
        int selectedRow = petstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet to adopt!");
            return;
        }
        String status = petstable.getValueAt(selectedRow, 7).toString();
        if (status.equals("Pending Adoption Approval")) {
            JOptionPane.showMessageDialog(this, "This pet is already pending adoption approval.");
            return;
        }
        if (status.equals("Adopted")) {
            JOptionPane.showMessageDialog(this, "This pet has already been adopted.");
            return;
        }
        int petId = Integer.parseInt(petstable.getValueAt(selectedRow, 0).toString());
        new adoption.adoptpet(petId).setVisible(true);
    }//GEN-LAST:event_adoptpetActionPerformed

    private void sortpetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortpetsActionPerformed
        String selectedStatus = sortpets.getSelectedItem().toString();
        filterPets(selectedStatus);
    }//GEN-LAST:event_sortpetsActionPerformed

    // Load pets from the database and display in the table
    private void loadPets() {
        String[] columns = {"ID", "Name", "Species", "Breed", "Age", "Gender", "Color", "Status"};
        DefaultTableModel model = new DefaultTableModel(null, columns) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 8) return ImageIcon.class;
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM pets");
            while (rs.next()) {
                String imagePath = rs.getString("image_path");
                if (imagePath == null || imagePath.trim().isEmpty()) {
                    imagePath = "src/images/petdefault.png";
                }
                ImageIcon icon = new ImageIcon(imagePath);
                // Resize image for table
                Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
                model.addRow(new Object[] {
                    rs.getInt("pet_id"),
                    rs.getString("name"),
                    rs.getString("species"),
                    rs.getString("breed"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("color"),
                    rs.getString("status"),
                    icon
                });
            }
            petstable.setModel(model);
            petstable.setRowHeight(40);
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading pets: " + e.getMessage());
        }
    }
    private void filterPets(String status) {
        String[] columns = {"ID", "Name", "Species", "Breed", "Age", "Gender", "Color", "Status"};
        DefaultTableModel model = new DefaultTableModel(null, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String sql = "SELECT * FROM pets";
        if (!status.equals("Filter Pets")) {
            if (status.equalsIgnoreCase("Pending")) {
                sql += " WHERE status = 'Pending Adoption Approval'";
            } else if (status.equalsIgnoreCase("Available")) {
                sql += " WHERE status = 'Available'";
            } else if (status.equalsIgnoreCase("Adopted")) {
                sql += " WHERE status = 'Adopted'";
            }
        }

        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData(sql);
            while (rs.next()) {
                String imagePath = rs.getString("image_path");
                if (imagePath == null || imagePath.trim().isEmpty()) {
                    imagePath = "src/images/petdefault.png";
                }
                ImageIcon icon = new ImageIcon(imagePath);
                // Resize image for table
                Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
                model.addRow(new Object[]{
                    rs.getInt("pet_id"),
                    rs.getString("name"),
                    rs.getString("species"),
                    rs.getString("breed"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("color"),
                    rs.getString("status"),
                    icon
                });
            }
            petstable.setModel(model);
            petstable.setRowHeight(40);
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading pets: " + e.getMessage());
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(petspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petspage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WELCOME3;
    private javax.swing.JLabel acc_id;
    private javax.swing.JButton addpet;
    private javax.swing.JButton adoptpet;
    private javax.swing.JLabel backbtn;
    private javax.swing.JPanel background;
    private javax.swing.JButton deletepet;
    private javax.swing.JButton editpet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable petstable;
    private javax.swing.JComboBox<String> sortpets;
    private javax.swing.JButton viewpet;
    // End of variables declaration//GEN-END:variables
}
