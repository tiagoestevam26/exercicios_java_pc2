package classes;

public class Titulo extends Conta {

    public Titulo(int dia, int mes, double valor){
        super(dia, mes, valor);
    }
    
    public double getValorAPagar(int diaPagto, int mesPagto){
        if(mesPagto <= this.mes && diaPagto <= this.dia){
          return valor;
        }
        return valor + (valor/10);
    }

}