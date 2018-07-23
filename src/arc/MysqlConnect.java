/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arc;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Samtho
 */
public class MysqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
    try{
        Class.forName("conn.mysql.jdbc.Driver");
       
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/arc","root","");
        JOptionPane.showMessageDialog(null, "connected to data base");
        return conn; 
    }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
    return null;
    
}
    
}
}
