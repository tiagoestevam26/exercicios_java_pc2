package classes;

public class Comissionado extends Empregado{

    protected double valorVendas;

    public Comissionado(String nome, String sobrenome, int numID, double valorVendas) {
        super(nome, sobrenome, numID);
        this.valorVendas = valorVendas;
    }

    public double getValorAPagar(int diaPagto, int mesPagto){
        return valorVendas * 0.06;
    }
   
    
}