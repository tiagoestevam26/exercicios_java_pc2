package classes;

import Intefaces.Passivo;

public class Terceirizado extends Empregado{

    private double horasTrabalhadas;
      
    public Terceirizado(String nome, String sobrenome, int numID, double horasTrabalhadas) {
        super(nome, sobrenome, numID);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorAPagar(int diaPagto, int mesPagto){
        double valor;
        valor = this.horasTrabalhadas * Passivo.HORA;
        return valor;
    }
    

}