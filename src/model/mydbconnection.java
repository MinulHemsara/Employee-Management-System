/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;


/**
 *
 * @author minul
 */
public class mydbconnection {
    
    
    public static Connection createConnection(){
        
        Connection con = null;   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return con;
    }
}
