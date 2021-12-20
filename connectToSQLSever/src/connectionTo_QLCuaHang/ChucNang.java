/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionTo_QLCuaHang;

//import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.Statement;

/**
 *
 * @author dell
 */
public class ChucNang {

    public List<NhanVien> layDanhSach() throws ClassNotFoundException,
            SQLException {
        List<NhanVien> lsNhanVien = new ArrayList();
        Connection conn = null;
        try {
            conn = (Connection) Dataprovider.getSQLSeverConnection();

//            Khai một công việc
//            Statement comm = (Statement) conn.createStatement();
            String strSQL = "Select DEPT_ID, DEPT_NAME, DEPY_NO, LOCATION from dbo.DEPARTMENT";
            PreparedStatement pr  = conn.prepareStatement(strSQL);

//             Thực hiện và trả về kết quả
           ResultSet rs = pr.executeQuery();

        } catch (Exception e) {
        }
        return lsNhanVien;
    }

}
