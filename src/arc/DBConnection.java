/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samtho
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("con.mysql.jdbc.Driver");
            System.out.println("Connected to database");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Connection failed" +cnfe);
        }
        String url = "jdbc:mysql://localhost/:3306/ARC";
        try{
            DBConnection = DriverManager.getConnection(url,"root","");
            System.out.println("Database Connection"); 
        }
        catch(SQLException ex){
            System.out.println("No Connection" +ex);
        }
        return DBConnection;
        }
    }
    
    

