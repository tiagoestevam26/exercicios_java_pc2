package classes;

import Intefaces.Passivo;

public class Assalariado extends Empregado {
    
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numID, double horasExtras) {
        super(nome, sobrenome, numID);
        this.horasExtras = horasExtras;
    }

    public double getValorAPagar(int diaPagto, int mesPagto){
        double valor;
        valor = (horasExtras * Passivo.HORA)+Passivo.SALARIO;
        return valor;
    }


}