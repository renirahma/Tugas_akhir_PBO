/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Putri Usriyatul
 */
public class FXMLHalamanAwalController implements Initializable {
    @FXML
    private JFXButton Oke;
    @FXML
    private JFXRadioButton dok1;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private JFXRadioButton dok2;
    @FXML
    private JFXRadioButton dok3;
    @FXML
    private JFXRadioButton dok4;
    @FXML
    private JFXRadioButton dok5;
    @FXML
    private JFXTextField dataNama;
    @FXML
    private JFXTextField dataAddress;
    @FXML
    private JFXTextField dataNumber;
    @FXML
    private JFXTextField dataUsia;
    
    String nama, alamat, hp, age,dokter,a,b,c,d,e;
    int jumlahPengantri = 0;
    
    //implementasi antrian dalam java menggunakan class:
    //  LinkedList
    static LinkedList antrian2 = new LinkedList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        
    }
    void Kirim(){
        nama = dataNama.getText();
        alamat = dataAddress.getText();
        hp = dataNumber.getText();
        age = dataUsia.getText();
        a = dok1.getText();
        b = dok2.getText();
        c = dok3.getText();
        d = dok4.getText();
        e = dok5.getText();
        
        if(dok1.isSelected()){
            dokter = a;
             
        //batas bawah
        int min = (int)(Math.random() * 9);
        
        //jika batas bawah adalah nol, maka antrian masih kosong, maka keluar
        if(min == 0)
            return;
        
        //batas atas antrian
        int max = min + (int)(Math.random() * 9);
        
        //menentukan jumlah pengantri
        jumlahPengantri = max - min;
                
        //menambahkan tiap nomor ke dalam antrian
        int i;
        for (i = min; i < max; i++)
            antrian2.add(i);
        
        
        }else if(dok2.isSelected()){
            dokter = b;
            //batas bawah
        int min = (int)(Math.random() * 9);
        
        //jika batas bawah adalah nol, maka antrian masih kosong, maka keluar
        if(min == 0)
            return;
        
        //batas atas antrian
        int max = min + (int)(Math.random() * 9);
        
        //menentukan jumlah pengantri
        jumlahPengantri = max - min;
                
        //menambahkan tiap nomor ke dalam antrian
        int i;
        for (i = min; i < max; i++)
            antrian2.add(i);
        
        
        }else if(dok3.isSelected()){
            dokter = c;
            //batas bawah
        int min = (int)(Math.random() * 9);
        
        //jika batas bawah adalah nol, maka antrian masih kosong, maka keluar
        if(min == 0)
            return;
        
        //batas atas antrian
        int max = min + (int)(Math.random() * 9);
        
        //menentukan jumlah pengantri
        jumlahPengantri = max - min;
                
        //menambahkan tiap nomor ke dalam antrian
        int i;
        for (i = min; i < max; i++)
            antrian2.add(i);
        
        
        }else if(dok4.isSelected()){
            dokter = d;
            //batas bawah
        int min = (int)(Math.random() * 9);
        
        //jika batas bawah adalah nol, maka antrian masih kosong, maka keluar
        if(min == 0)
            return;
        
        //batas atas antrian
        int max = min + (int)(Math.random() * 9);
        
        //menentukan jumlah pengantri
        jumlahPengantri = max - min;
                
        //menambahkan tiap nomor ke dalam antrian
        int i;
        for (i = min; i < max; i++)
            antrian2.add(i);
        
        
        }else if(dok5.isSelected()){
            dokter = e;
            //batas bawah
        int min = (int)(Math.random() * 9);
        
        //jika batas bawah adalah nol, maka antrian masih kosong, maka keluar
        if(min == 0)
            return;
        
        //batas atas antrian
        int max = min + (int)(Math.random() * 9);
        
        //menentukan jumlah pengantri
        jumlahPengantri = max - min;
                
        //menambahkan tiap nomor ke dalam antrian
        int i;
        for (i = min; i < max; i++)
            antrian2.add(i);
        }
    }
        
    void setdata(String nama, String alamat, String hp, String age) {
        
        dataNama.setText(nama);
        dataAddress.setText(alamat);
        dataNumber.setText(hp);
        dataUsia.setText(age);
    }
 

    @FXML
    private void OKE(ActionEvent event) throws IOException {
        Kirim();
        ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLOutput.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 735, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.setResizable(false);
            stage.show();
            
          
            FXMLOutputController Data = new FXMLOutputController();
            Data = fxmlLoader.getController();
            
            Data.setdata(nama, alamat, hp, age,dokter,jumlahPengantri);
    }

   
   

    
    
    }
    

