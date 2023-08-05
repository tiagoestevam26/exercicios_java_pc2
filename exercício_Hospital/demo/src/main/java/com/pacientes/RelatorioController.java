package com.pacientes;

import java.io.IOException;

import com.pacientes.classes.Hospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class RelatorioController {

    @FXML
    private Button botaoGerar;

    @FXML
    private Button botaoVoltar;

    @FXML
    private AnchorPane texto;

    @FXML
    void clicouGerar(ActionEvent event) {
        Label label = new Label(Hospital.gerarTudo());
        label.setWrapText(true);
        label.setMaxWidth(200);

        texto.getChildren().add(label);


        AnchorPane.setTopAnchor(label, 20.0);
        AnchorPane.setLeftAnchor(label, 20.0);
        
        

    }

    @FXML
    void clicouVoltar(ActionEvent event) throws IOException {
        App.setRoot("cadastro");
    }

}
