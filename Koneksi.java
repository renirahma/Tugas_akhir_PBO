/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Putri Usriyatul
 */
public class Koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url = "jdbc:mysql//localhost/urutanrs";
            String nama="root";
            String alamat="";
            String hp="";
            String age="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, nama, alamat);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        }catch(Exception e){
            System.out.println("Koneksi gagal" +e.getMessage());
        }
    }
}
