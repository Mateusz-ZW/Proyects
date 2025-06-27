/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestionhotel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mateo
 */
public class FormPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
   @FXML private Button bReservas;
   @FXML private Button bSalir;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void handleBReservas(ActionEvent e)throws IOException {
        Stage stage=(Stage) bReservas.getScene().getWindow();
        Parent root=FXMLLoader.load(getClass().getResource("FormPrincipal.fxml"));
        if(e.getSource()==bReservas){
            stage=(Stage) bReservas.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("FXML.fxml"));
        }
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void handleBSalir(ActionEvent e)throws IOException {
        Platform.exit();
        System.exit(0);
    }
    
}
