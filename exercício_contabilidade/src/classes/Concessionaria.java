package classes;

public class Concessionaria extends Conta {
    
    public Concessionaria(int dia, int mes, double valor){
        super(dia, mes, valor);
    }
    
    public double getValorAPagar(int diaPagto, int mesPagto){
        return valor;
    }
}