package classes;

public class Leilao {
    private Lote[] lotes = new Lote[10];
    private int posicao = 0;

    public Lote[] getLotes() {
        return lotes;
    }

    public void setLotes(Lote[] lotes) {
        this.lotes = lotes;
    }

    public void inserirLote(Lote lote){
        lotes[posicao] = lote;
        this.posicao++;
    }

    public void receberLance(int numLote, String descricaoProduto, Lance lance){
        Produto[] produtinhos = lotes[numLote].getProdutos();

        for(int i=0;i<produtinhos.length;i++){
            if(produtinhos[i]!=null){
                if(produtinhos[i].getDescricao().equals(descricaoProduto)){
                    produtinhos[i].verificarMaiorLance(lance);
                }
            }
        }
    }

    public void listarProdutos(){
        System.out.println("Os produtos sao: ");
        for(int i = 0; i < lotes.length; i++) {
            if(lotes[i] != null) {
                Produto[] produtinhes = lotes[i].getProdutos();
                for(int j = 0; j < produtinhes.length; j++) {
                    if(produtinhes[j] != null) {
                        System.out.println(produtinhes[j].getDescricao());
                    }
                } 
            }
        }
    }

    public void encerrarLeilao() {
        for(int i = 0; i < lotes.length; i++) {
            if(lotes[i] != null) {
                Produto[] produtinhes = lotes[i].getProdutos();
                for(int j = 0; j < produtinhes.length; j++) {
                    if(produtinhes[j] != null) {
                        System.out.println("O produto " + produtinhes[j].getDescricao() + " foi vendido para " + produtinhes[j].getMaiorLance().getPessoa().getNome() + " por uma bagatela de " + produtinhes[j].getMaiorLance().getValor() + "!!!!!!!");
                    }
                } 
            }
        }
    }
    

}
