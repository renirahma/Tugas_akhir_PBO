/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author Putri Usriyatul
 */
public class FXMLDocumentController {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField address;

    @FXML
    private JFXTextField number;

    @FXML
    private JFXTextField usia;

    @FXML
    private JFXButton btnProses;

    @FXML
    private JFXButton btnClear;
    
    String nama,alamat,hp,age;
  
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    void Kirim(){
        //untuk validasi isian
         if(name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan nama Anda");
        }else if (address.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap isikan alamat Anda");
        }else if(number.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan nomor hp Anda");
        }else if(usia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan usia Anda");
        }
        //untuk pengambilan nilai isian
        nama = name.getText();
        alamat = address.getText();
        hp = number.getText();
        age = usia.getText();
        
    }
    
   
    @FXML
    void Proses(ActionEvent event) throws IOException, SQLException {
    Kirim();
     try{
       
        Connection connection;
        PreparedStatement stmt = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/urutanrs", "root", "");
            stmt= connection.prepareStatement("INSERT INTO tb_pasien VALUES ('"+nama+"', '"+alamat+"', '"+hp+"', '"+age+"')"); 
            int i = stmt.executeUpdate();
            if(i == 1){
                JOptionPane.showMessageDialog(null, "berhasil");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        
   
        ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHalamanAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 865, 535);
              
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.setResizable(false);
            stage.show();
        
    
            FXMLHalamanAwalController Data = new FXMLHalamanAwalController();
            Data = fxmlLoader.getController();
            
            Data.setdata(nama, alamat, hp, age);                
    }
    @FXML
    void Clear(ActionEvent event) {
        name.setText("");
        address.setText("");
        number.setText("");
        usia.setText("");
    }

    }


    


    
