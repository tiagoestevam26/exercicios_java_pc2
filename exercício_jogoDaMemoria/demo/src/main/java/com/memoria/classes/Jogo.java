package com.memoria.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jogo {

    private ArrayList<Integer> numeros = new ArrayList<>();;
    private int num1;
    private int num2;    
    private int pontos;
    private int contador=0;

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean conferePar(int num1, int num2){
        if(num1 == num2){
            return true;
        }else{
            return false;
        }
    }

    public void novoJogo(){

        for (int i = 0; i < 2; i++) {
            for(int j = 1; j<=30;j++){
                numeros.add(j);
            }
        
        }
        
        Collections.shuffle(numeros, new Random());

        for(int i=0;i<10;i++){
            for(int j=0;j<6;j++){
                System.out.print(numeros.get(contador) + " ");
                contador++;
            }
            System.out.print("\n");

        }  
    }

}