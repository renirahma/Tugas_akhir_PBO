/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Putri Usriyatul
 */
public class login_koneksi {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if(koneksi == null){
            Driver driver = new Driver();
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/urutanrs? zeroDateTimeBehavior=convertToNull", "root", "");
        }
        return koneksi;
    
    }
}