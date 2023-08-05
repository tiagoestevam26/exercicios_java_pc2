package com.pacientes.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.pacientes.MinhaException;

public class Hospital {
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    private static String relatorioFinal = "";
    private static int qutHomens=0;
    private static int qutPacientes=0;
    private static double mediaIdade;
    private static int qutMulheres=0;
    private static int qutPessoasIdade=0;
    private static int maisVelho = 0;
    private static int maisBaixa = 0;
    private static int cont = 0;

    public static boolean podeSerConvertidoParaInt(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean podeSerConvertidoParaDouble(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    


    public static void inserirPaciente(Paciente paciente) throws MinhaException{
        
        
        if(podeSerConvertidoParaInt(paciente.getCodigo())
        && podeSerConvertidoParaDouble(paciente.getPeso())
        && podeSerConvertidoParaInt(paciente.getIdade())
        && podeSerConvertidoParaDouble(paciente.getAltura())){
            pacientes.add(paciente);
            qutPacientes++;
            if(paciente.getGenero().equals("Masculino")){
                qutHomens++;
            }
        }else{
            throw new MinhaException("Voce colocou alguma informação errada!");
        }
    }

    public static String gerarTudo(){
        for (Paciente pac : pacientes) {

            if(pac.getGenero().equals("Masculino")){
                mediaIdade += Integer.parseInt(pac.getIdade());
            }

            if(pac.getGenero().equals("Feminino") 
            && 1.6 < Double.parseDouble(pac.getAltura())
            && Double.parseDouble(pac.getAltura()) < 1.7 
            && Double.parseDouble(pac.getPeso())> 70){
                qutMulheres++;
            }

            if(18< Double.parseDouble(pac.getIdade()) 
            && Double.parseDouble(pac.getIdade())< 25){
                qutPessoasIdade++;
            }

            if(Double.parseDouble(pac.getIdade()) > Double.parseDouble(pacientes.get(maisVelho).getIdade())){
                maisVelho=cont;
            }

            if(Double.parseDouble(pac.getAltura()) < Double.parseDouble(pacientes.get(maisBaixa).getAltura())
            && pac.getGenero().equals("Feminino")){
                maisBaixa=cont;
            }
            cont++;
        }
        mediaIdade = mediaIdade/qutHomens;
         
        relatorioFinal="Quantidade de pacientes: "+ Integer.toString(qutPacientes) + " Media idade homens: "+ Double.toString(mediaIdade)+ " Quantidade mulheres ente 1,60 e 1,70 e +70kg: "+ Integer.toString(qutMulheres)+" Quantidade pessoas entre 18 e 25 anos: "+ Integer.toString(qutPessoasIdade)+ " Nome paciente mais velho: "+ pacientes.get(maisVelho).getNome()+" Nome mulher mais baixa: "+ pacientes.get(maisBaixa).getNome();

        return (relatorioFinal);
    }


}