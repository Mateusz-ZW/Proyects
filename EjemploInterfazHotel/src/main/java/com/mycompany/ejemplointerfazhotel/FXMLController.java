/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package com.mycompany.ejemplointerfazhotel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author mateo
 */
public class FXMLController implements Initializable{
   
    /**
     * Initializes the controller class.
     */
     
    @FXML private CheckBox checkBox;
    @FXML private Label labelAviso;
    @FXML private ComboBox comboBox; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Esto es para añadir los diferentes tipos de habitaciones 
        comboBox.getItems().addAll("Doble de uso individual","Doble","Junior Suite","Suite");
        labelAviso.setVisible(false);
    }
    //Esto es para darle una funcionalidad al checkbox
    public void handleCheckBox(){
        if(checkBox.isSelected()){
            labelAviso.setVisible(true);
            
        }
        else{
            labelAviso.setVisible(false);
        }
    }

}
