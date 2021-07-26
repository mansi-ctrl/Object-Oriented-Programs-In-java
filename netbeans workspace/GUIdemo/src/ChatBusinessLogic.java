/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChatBusinessLogic {

    public ChatBusinessLogic() {
        Connection conn=null; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //OBTAIN DATABASE CONNECTION
            String dbURL = "jdbc:mysql://localhost:3306/project";
            conn = DriverManager.getConnection(dbURL, "root", "");
           Statement stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Exception e = " + e);
        }
    }

    public boolean sendMessage(String msg) {
        String insertQuery = "INSERT INTO tbl_message(message_text) VALUES ('" + msg + "')";
        System.out.println(insertQuery);
        int returnValue = 0;
        Statement stmt = null;
        try {
            returnValue = stmt.executeUpdate(insertQuery);
        } catch (Exception ex) {
            System.out.println("Exception = " + ex);
        }
        System.out.println("Return value from insert query = " + returnValue);
        if (returnValue == 1) {
            return true;
        } else {
            return false;
        }
    }

    String receiveMessage() {
        String msg = null;
        int i = 0;
        Statement stmt = null;
        
        String selectQuery = "SELECT * from tbl_message order by message_id DESC LIMIT 1";
        try {
            ResultSet rs = stmt.executeQuery(selectQuery);
            if (rs.next()) {
                msg = rs.getString("message_text");
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }
        return msg;
    }

    protected void finalize() {
        Statement stmt = null;
        Connection conn = null;
        try {
            
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Exception ex = " + ex);
        }
    }
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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String msg = null;
                new ChatBusinessLogic().sendMessage(msg);
               new ChatBusinessLogic().receiveMessage();
        //.setVisible(true);
            }
        });
    }

}
