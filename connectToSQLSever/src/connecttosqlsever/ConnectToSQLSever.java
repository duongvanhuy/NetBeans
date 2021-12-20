/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connecttosqlsever;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ConnectToSQLSever {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
//            String connectionUrl = "jdbc:sqlserver://localhost;database=Hine;";  
//            String userName = "sa";
//            String pass ="duonghuy261";
//           
//            Connection con =  (Connection) DriverManager.getConnection(connectionUrl, userName, pass);
//             System.out.println("ket noi");
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
var server = "DESKTOP-V3UDUKA\\SQLEXPRESS";
var user  = "sa";
var pass = "123456";
var nameDataBase = "QLSinhVien";
var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setURL(server);
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setDatabaseName(nameDataBase);
         ds.setServerName(server);
         ds.setPortNumber(port);
        try {
            Connection con =  (Connection) ds.getConnection();
            System.out.println("kp");
           
                    
        } catch (Exception e) {
        }
            

    }
    
}
