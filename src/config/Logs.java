/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Logs {
     private static dbConnector db = new dbConnector();


    public static void logAction(int userID, String action) {
        System.out.println("logAction called with userID: " + userID + ", action: " + action);
        String queryCheck = "SELECT u_id FROM tbl_user WHERE u_id = ?";
        String queryInsert = "INSERT INTO logs (userID, action, date_time) VALUES (?, ?, NOW())";
        try (Connection con = db.getConnection()) {
            // Check if user exists
            try (PreparedStatement pstCheck = con.prepareStatement(queryCheck)) {
                pstCheck.setInt(1, userID);
                try (ResultSet rs = pstCheck.executeQuery()) {
                    if (!rs.next()) {
                        System.err.println("Failed to log action: User ID " + userID + " does not exist.");
                        return;
                    } else {
                        System.out.println("User ID " + userID + " exists.");
                    }
                }
            }
            // Insert log
            try (PreparedStatement pstInsert = con.prepareStatement(queryInsert)) {
                pstInsert.setInt(1, userID);
                pstInsert.setString(2, action);
                int rows = pstInsert.executeUpdate();
                System.out.println("Inserted log rows: " + rows);
            }
        } catch (SQLException e) {
            System.err.println("Failed to log action: " + e.getMessage());
        }
    }
}
