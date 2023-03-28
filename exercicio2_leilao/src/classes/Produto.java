package classes;

public class Produto {
    private String descricao;
    private Lance maiorLance;
    
    public Produto(String descricao, Lance maiorLance) {
        this.descricao = descricao;
        this.maiorLance = maiorLance;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    public void verificarMaiorLance(Lance lance){
        if (lance.getValor() > maiorLance.getValor()) {
            this.maiorLance = lance;
        }
    }
}
