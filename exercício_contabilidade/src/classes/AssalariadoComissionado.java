package classes;

import Intefaces.Passivo;

public class AssalariadoComissionado extends Comissionado {

    private double percentualBonus;

    public AssalariadoComissionado(String nome, String sobrenome, int numID, double valorVendas,
            double percentualBonus) {
        super(nome, sobrenome, numID, valorVendas);
        this.percentualBonus = percentualBonus;
    } 

    public double getValorAPagar(int diaPagto, int mesPagto){
        return (this.valorVendas * 0.06)+ (Passivo.SALARIO + ((percentualBonus/100) * Passivo.SALARIO));
    }

    
    
}