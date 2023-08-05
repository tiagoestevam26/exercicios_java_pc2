package classes;

import java.util.ArrayList;

import Intefaces.Passivo;

public class ControlePagamento {
    ArrayList<Passivo> pagamentos;

    

    public ControlePagamento() {
        this.pagamentos = new ArrayList<Passivo>();
    }

    public void addPagamento(Passivo pagamento){
        pagamentos.add(pagamento);
    }

    public void imprimeTudo(int dia, int mes){
        double total = 0;
        for (Passivo pagamento : pagamentos) {
            System.out.println("Conta de: " + pagamento.getValorAPagar(dia, mes));
            total = total + pagamento.getValorAPagar(dia, mes);
        }
        System.out.println("O total a pagar eh: " + total);
    }
    
    
    
    


    



}