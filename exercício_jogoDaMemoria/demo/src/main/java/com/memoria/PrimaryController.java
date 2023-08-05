package com.memoria;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;

import com.memoria.classes.Jogo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class PrimaryController implements Initializable{

    @FXML
    private ToggleButton botao1;

    @FXML
    private ToggleButton botao10;

    @FXML
    private ToggleButton botao11;

    @FXML
    private ToggleButton botao12;

    @FXML
    private ToggleButton botao13;

    @FXML
    private ToggleButton botao14;

    @FXML
    private ToggleButton botao15;

    @FXML
    private ToggleButton botao16;

    @FXML
    private ToggleButton botao17;

    @FXML
    private ToggleButton botao18;

    @FXML
    private ToggleButton botao19;

    @FXML
    private ToggleButton botao2;

    @FXML
    private ToggleButton botao20;

    @FXML
    private ToggleButton botao21;

    @FXML
    private ToggleButton botao22;

    @FXML
    private ToggleButton botao23;

    @FXML
    private ToggleButton botao24;

    @FXML
    private ToggleButton botao25;

    @FXML
    private ToggleButton botao26;

    @FXML
    private ToggleButton botao27;

    @FXML
    private ToggleButton botao28;

    @FXML
    private ToggleButton botao29;

    @FXML
    private ToggleButton botao3;

    @FXML
    private ToggleButton botao30;

    @FXML
    private ToggleButton botao31;

    @FXML
    private ToggleButton botao32;

    @FXML
    private ToggleButton botao33;

    @FXML
    private ToggleButton botao34;

    @FXML
    private ToggleButton botao35;

    @FXML
    private ToggleButton botao36;

    @FXML
    private ToggleButton botao37;

    @FXML
    private ToggleButton botao38;

    @FXML
    private ToggleButton botao39;

    @FXML
    private ToggleButton botao4;

    @FXML
    private ToggleButton botao40;

    @FXML
    private ToggleButton botao41;

    @FXML
    private ToggleButton botao42;

    @FXML
    private ToggleButton botao43;

    @FXML
    private ToggleButton botao44;

    @FXML
    private ToggleButton botao45;

    @FXML
    private ToggleButton botao46;

    @FXML
    private ToggleButton botao47;

    @FXML
    private ToggleButton botao48;

    @FXML
    private ToggleButton botao49;

    @FXML
    private ToggleButton botao5;

    @FXML
    private ToggleButton botao50;

    @FXML
    private ToggleButton botao51;

    @FXML
    private ToggleButton botao52;

    @FXML
    private ToggleButton botao53;

    @FXML
    private ToggleButton botao54;

    @FXML
    private ToggleButton botao55;

    @FXML
    private ToggleButton botao56;

    @FXML
    private ToggleButton botao57;

    @FXML
    private ToggleButton botao58;

    @FXML
    private ToggleButton botao59;

    @FXML
    private ToggleButton botao6;

    @FXML
    private ToggleButton botao60;

    @FXML
    private ToggleButton botao7;

    @FXML
    private ToggleButton botao8;

    @FXML
    private ToggleButton botao9;

    @FXML
    private Button botaoNovo;

    @FXML
    private Button botaoSair;

    @FXML
    private Label textoPontos;

    private ToggleButton[] botoes;
    private ArrayList<Integer> numbers;
    private int botoesSelecionados = 0;
    private Jogo jogo;

    @FXML
    void clicouJogo(ActionEvent event) {

        for(int i=0; i<60;i++){
            if(((ToggleButton) event.getSource()).getId() == botoes[i].getId()){
                if (botoes[i].isSelected()) {
                    botoes[i].setTextFill(Color.BLACK);
                    botoes[i].setText(String.valueOf(jogo.getNumeros().get(i)));
                    botoesSelecionados++;
                    if(botoesSelecionados==1){
                        jogo.setNum1(i);
                    }
                    if(botoesSelecionados==2){
                        jogo.setNum2(i);
                        if(jogo.conferePar(jogo.getNumeros().get(jogo.getNum1()), jogo.getNumeros().get(jogo.getNum2())) 
                            && jogo.getNum1() != jogo.getNum2()){
                            botoes[jogo.getNum1()].setStyle("-fx-background-color: lightgreen;");;
                            botoes[jogo.getNum2()].setStyle("-fx-background-color: lightgreen;");;
                            jogo.setPontos(jogo.getPontos()+1);
                            textoPontos.setText("Voce tem "+ jogo.getPontos() +" pontos!!!");
                        }
                    }
                    if(botoesSelecionados>2){
                        botoesSelecionados=1;
                        if(jogo.conferePar(jogo.getNumeros().get(jogo.getNum1()), jogo.getNumeros().get(jogo.getNum2()))
                            && jogo.getNum1() != jogo.getNum2()){
                            jogo.setNum1(i);
                        }else{
                            botoes[jogo.getNum1()].setTextFill(Color.RED);
                            botoes[jogo.getNum2()].setTextFill(Color.RED);
                            botoes[jogo.getNum1()].setText("?");
                            botoes[jogo.getNum1()].setSelected(false);
                            botoes[jogo.getNum2()].setText("?");
                            botoes[jogo.getNum2()].setSelected(false);
                            jogo.setNum1(i);
                        }
                    }
                } 

            }
        }

        

        
    }

    @FXML
    void clicouNovo(ActionEvent event) {
        jogo.novoJogo();
        for (ToggleButton bot : botoes) {
            bot.setSelected(false);
            bot.setStyle(null);
            bot.setText("?");
            bot.setTextFill(Color.RED);
        }
    }

    @FXML
    void clicouSair(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        jogo = new Jogo();
        jogo.setPontos(0);
        this.botoes = new ToggleButton[]{botao1,botao2,botao3,botao4,botao5,botao6,
            botao7,botao8,botao9,botao10,botao11,botao12,
            botao13,botao14,botao15,botao16,botao17,botao18,
            botao19,botao20,botao21,botao22,botao23,botao24,
            botao25,botao26,botao27,botao28,botao29,botao30,
            botao31,botao32,botao33,botao34,botao35,botao36,
            botao37,botao38,botao39,botao40,botao41,botao42,
            botao43,botao44,botao45,botao46,botao47,botao48,
            botao49,botao50,botao51,botao52,botao53,botao54,
            botao55,botao56,botao57,botao58,botao59,botao60};

        numbers = new ArrayList<>();
        jogo.setNumeros(numbers);
        jogo.novoJogo();
     

    }
}


  