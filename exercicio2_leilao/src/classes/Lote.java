package classes;

public class Lote {
    private Produto[] produtos = new Produto[10];
    private int posicao = 0;

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void inserirProduto(Produto produto){
        this.produtos[posicao] = produto;
        this.posicao++;
    }
}