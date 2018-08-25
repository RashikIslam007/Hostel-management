

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MyDB{
    private static String url = "jdbc:mysql://localhost:3306/hostel";      /// medical hoilo db er nam,,, nijer db r nam dibi aikhane
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = ""; 
    private static Connection con;
    private static String urlstring;
    
    public static Connection getCon() throws ClassNotFoundException, SQLException
    {
        try {
            Class.forName(driverName);
            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
                System.out.println("connected...");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
    public static void closeConnection() {
        try {
            Class.forName(driverName);
            try {
                con.close();
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to close database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException 
    {
      getCon();
    }
}
