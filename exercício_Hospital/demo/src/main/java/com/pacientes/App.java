/* Professora eu fiz tudo, faltou a parte de ordenar por idade, mas eu fui tentar fazer e tinha que mudar o codigo todo ia dar um trabalheira ai eu desisti.
 * Outra coisa, eu n separei em package pq eu fui separar e tava dando erra: chama InvocationTargetException. N sabia consertar ent voltei atras.
 * Mas de resto ta funcionando direitinho, amei fazer aprendi a usar exception e agr sou profissional em javafx!!!
 * Mtttt obgd, titi
 */


package com.pacientes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

import com.pacientes.classes.Hospital;

/**
 * JavaFX App
 */
public class App extends Application {


    private static Scene scene;

    public Hospital hospitalTiti = new Hospital();


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("cadastro"), 500, 500);
        stage.setScene(scene);
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