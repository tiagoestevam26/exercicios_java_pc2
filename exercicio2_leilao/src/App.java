import classes.Lance;
import classes.Leilao;
import classes.Lote;
import classes.Pessoa;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Muel", "316565465");
        Pessoa pessoa2 = new Pessoa("Titi", "316001565465");
        Lance lance = new Lance(pessoa, 100);
        Lance lance2 = new Lance(pessoa,1000);
        Lance lance3 = new Lance(pessoa2,10000);
        Produto produto = new Produto("notebook rosa da eliana", lance);
        Produto produto2 = new Produto("aviazinho", lance);
        Lote lote = new Lote();
        lote.inserirProduto(produto);
        lote.inserirProduto(produto2);
        Leilao leilao = new Leilao();
        leilao.inserirLote(lote);
        leilao.receberLance(0, produto.getDescricao(), lance);
        leilao.receberLance(0, produto.getDescricao(), lance2);
        leilao.receberLance(0, produto2.getDescricao(), lance3);
        leilao.encerrarLeilao();
        leilao.listarProdutos();

        

    }
}
