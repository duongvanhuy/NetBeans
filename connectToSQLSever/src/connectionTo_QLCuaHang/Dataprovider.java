/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionTo_QLCuaHang;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/**
 *
 * @author dell
 */
public class Dataprovider {

//    public static void main(String[] args) {
//        var server = "DESKTOP-V3UDUKA\\SQLEXPRESS";
//        var user = "sa";
//        var pass = "123456";
//        var nameDataBase = "QLCuaHang";
//        var port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();
////        ds.setURL(server);
//        ds.setUser(user);
//        ds.setPassword(pass);
//        ds.setDatabaseName(nameDataBase);
//        ds.setServerName(server);
//        ds.setPortNumber(port);
//        try {
//            Dataprovider con = (Dataprovider) ds.getConnection();
//            System.out.println("kp");
//
//        } catch (Exception e) {
//        }
//          }
  
    
//        ds.setURL(server);
       public static Connection getSQLSeverConnection() throws ClassNotFoundException, SQLException {
               String hostName = "localhost";
        String sql_name = "DESKTOP-V3UDUKA\\SQLEXPRESS";
        String databaseName = "QLSinhVien";
        String userName = "sa";
        String passWord = "1234";
           Connection conn = null;
           try {
               // Khai báo class Driver cho DB SQLSever
//		Việc này cần thiết với java 5
//		Java 6 tự động tìm kiếm driver thích hợp
//		Nếu bạn dùng java 6, thì không cần thiết cho dòng này
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		
//		Cấu trúc URL Connection dành cho Sql Sever
//		ví dụ:
	     // jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
//		 String connectionURL = "jdbc:sqlserver://" + hostName + ":1433;"
//	             + databaseName + ";instance=" + sql_name;

	      conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien","sa","123456");
           } catch (Exception e) {
           }
		
	     return conn;
	}

    
}
