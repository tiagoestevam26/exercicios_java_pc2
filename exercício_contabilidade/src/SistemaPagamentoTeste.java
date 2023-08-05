import classes.Assalariado;
import classes.AssalariadoComissionado;
import classes.Comissionado;
import classes.Concessionaria;
import classes.Conta;
import classes.ControlePagamento;
import classes.Empregado;
import classes.Terceirizado;
import classes.Titulo;

public class SistemaPagamentoTeste {


    public static void main(String[] args) throws Exception {
        ControlePagamento controle = new ControlePagamento();
        Conta pagamento = new Titulo(2, 10, 100);
        Conta pagamento2 = new Concessionaria(3, 12, 300);
        Empregado Jose = new Assalariado("jose", "silva", 0, 5);
        Empregado Guilherme = new Terceirizado("guilherme", "correa", 1, 16);
        Empregado Samuel = new Comissionado("samuel", "bernardes", 2, 60000);
        Empregado John = new AssalariadoComissionado("john", "martins", 3, 6000, 10);        controle.addPagamento(pagamento);
        controle.addPagamento(pagamento2);
        controle.addPagamento(Jose);
        controle.addPagamento(Guilherme);
        controle.addPagamento(Samuel);
        controle.addPagamento(John);
        controle.imprimeTudo(3, 10);
    }
}
