package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import servicos.TextFileApps;

public class Jogo {
    private String palavra;
    private List<String> palavrasDoJogo;
    private int numTentativas;
    private boolean venceu;

    public Jogo(String nomeDoArquivo) {
        TextFileApps filezinhoApps = new TextFileApps();
                
        this.venceu = false;
        this.palavra = "";
        this.numTentativas = 15;
        this.palavrasDoJogo = filezinhoApps.readTextFile(nomeDoArquivo);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public List<String> getPalavrasDoJogo() {
        return palavrasDoJogo;
    }

    public void setPalavrasDoJogo(List<String> palavrasDoJogo) {
        this.palavrasDoJogo = palavrasDoJogo;
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public void setNumTentativas(int numTentativas) {
        this.numTentativas = numTentativas;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public boolean verificaFimJogo(String finalWord){
        if (numTentativas > 0 && palavra.equals(finalWord.toLowerCase())) {
            this.venceu = true;
        }

        return venceu;
    }

    public ArrayList<Integer> verificaLetra(String letra){
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        int index = palavra.indexOf(letra.toLowerCase());

        while (index != -1) {
            result.add(index);
            index = palavra.indexOf(letra.toLowerCase(), index + 1);
        }

        if (result.size() < 1) {
            this.numTentativas -= 1;
        }

        return result;
    }

    public void sorteiaPalavre(){

        Random random = new Random();

        int wordID = random.nextInt(palavrasDoJogo.size());

        this.palavra = palavrasDoJogo.get(wordID);

    }


}