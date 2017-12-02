/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Putri Usriyatul
 */
public class FXMLOutputController implements Initializable {

    @FXML
    private JFXTextField dataNama;

    @FXML
    private JFXTextField dataAddress;

    @FXML
    private JFXTextField dataNumber;

    @FXML
    private JFXTextField dataUsia;

    @FXML
    private JFXTextField Dokter;

    @FXML
    private AnchorPane antrian;

    @FXML
    private JFXTextField nomer;
    @FXML
    private JFXButton keluar;

    
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    }   
    @FXML
    void Keluar(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocumentController.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 735, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.setResizable(false);
            stage.show();
    }

    void setdata(String nama, String alamat, String hp, String age, String dokter, int jumlahPengantri) {
        dataNama.setText(nama);
        dataAddress.setText(alamat);
        dataNumber.setText(hp);
        dataUsia.setText(age);
        Dokter.setText(dokter);
        nomer.setText(String.valueOf(jumlahPengantri));
    }

}
