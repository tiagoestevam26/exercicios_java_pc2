package com.pacientes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.pacientes.classes.Hospital;
import com.pacientes.classes.Paciente;

import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CadastroController implements Initializable{

    @FXML
    private Button BotaoRelatorio;

    @FXML
    private Button BotaoSair;

    @FXML
    private Button botaoNovo;

    @FXML
    private TextField fieldAltura;

    @FXML
    private TextField fieldCodigo;

    @FXML
    private TextField fieldIdade;

    @FXML
    private TextField fieldNome;

    @FXML
    private TextField fieldPeso;

    @FXML
    private ChoiceBox<String> seletorGenero;


    @FXML
    void clicouIncluir(ActionEvent event) {
        Paciente paciente = new Paciente(fieldCodigo.getText(), fieldNome.getText(), fieldPeso.getText(), fieldIdade.getText(), fieldAltura.getText(), seletorGenero.getValue());
        
        try{
            Hospital.inserirPaciente(paciente);
            fieldAltura.setText("");
            fieldCodigo.setText("");
            fieldAltura.setText("");
            fieldIdade.setText("");
            fieldPeso.setText("");
            fieldNome.setText("");
        }
        catch(MinhaException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        
        
        

    }

    @FXML
    void clicouRelatorio(ActionEvent event) throws IOException {
        App.setRoot("relatorio");
    }

    @FXML
    void clicouSair(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        String[] generos = {"Masculino", "Feminino", "Nao-binarie"};
        seletorGenero.getItems().addAll(generos);
    }

}
