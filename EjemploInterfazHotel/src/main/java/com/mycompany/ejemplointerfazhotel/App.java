package com.mycompany.ejemplointerfazhotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application  {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //Esto es para que se puedan ejecutar las dos ventanas 
        Parent root= FXMLLoader.load(getClass().getResource("FXMLController.fxml"));
        Parent root2= FXMLLoader.load(getClass().getResource("FormularioPrincipal.fxml"));
        //Si instanciamos la clase scene y ponemos que sea root2 pues primero se ejecutara el root2 cuando inicie la app
        Scene scene=new Scene(root2);
        stage.setScene(scene);
        //Para mostrar la ventana
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}