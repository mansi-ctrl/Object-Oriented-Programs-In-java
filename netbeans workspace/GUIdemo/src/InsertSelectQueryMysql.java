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
import javax.swing.JOptionPane;

public class InsertSelectQueryMysql {

    public static void main(String args[]) {
        Connection con = null;
        try {
            //LOAD THE JDBC DRIVER FOR MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            //OBTAIN DATABASE CONNECTION
            String dbURL = "jdbc:mysql://localhost:3306/test";
            con = DriverManager.getConnection(dbURL, "root", "");
            //id1101599_db2
            //https://databases.000webhost.com
            Statement stmt = con.createStatement();
            int customerId = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter customer id"));
            String customerName = JOptionPane.showInputDialog(null, "Enter customer name");
            String customerCity=JOptionPane.showInputDialog(null, "Enter City Name");
            
            
            //JOptionPane.showInputDialog(frame, "What's your name?");
            //String insertString = "INSERT INTO tbl_customer VALUES (1, '" + "ram" + "')";
            String insertString = "INSERT INTO tbl_customer VALUES (" + customerId 
                    + ", '" + customerName +"','"+customerCity + "')";
            System.out.println(insertString);
            int i = stmt.executeUpdate(insertString);
            System.out.println("Return value from insert query" + i);

            //Executing SQL Queries using Statement Object
            String selectQuery
                    = "SELECT customer_id, customer_name ,customer_city FROM tbl_customer";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("customer_id " + "  " + " customer_name" +"  " +"customer_city ");
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("customer_name");
                String city=rs.getString("customer_city");
                System.out.println(id + "  " + name +" "+city);
            }

            //con.commit();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception caught --> " + e);
        }

    }
}