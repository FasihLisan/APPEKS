/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author FASIH
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi {

   private static Connection con;
   public static Connection koneksidb() throws SQLException{
       try {
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           con = DriverManager.getConnection("jdbc:mysql://localhost/APPEKS","root","");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"DAtabase Gagal "+e.getMessage());
       }
      
       return con;
   }
}
//cara koneksi di class lain
//
//----------library---------
//import config.koneksi;
//import java.sql.*;
//
//---------dalam class-----------
//private koneksi db = new koneksi();
//
//--------query pada tombol atau method-----------
//try {
//    String query = "SELECT * FROM shift";
//    Statement st = db.koneksidb().createStatement();

//    ResultSet rs = st.executeQuery(query); // jika menampilkan result untuk query select

//    st.executeQuery(query); // jika menampilkan result untuk query insert, update, delete
//
//    while (rs.next()) {                
//        cmb_shift.addItem(rs.getString("name"));
//    }
//
//} catch (SQLException e) {
//    JOptionPane.showMessageDialog(null, "DAtabase gagal terhubung"+e);
//}

