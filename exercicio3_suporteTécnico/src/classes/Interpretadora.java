package classes;

import java.util.HashMap;
import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavras;

    public Interpretadora() {
        this.palavras = new HashSet<String>();
        ;
    }

    public HashSet interpreta(String frase) {
        String[] palavrasSeparadas = frase.split(" ");
        for (int i = 0; i < palavrasSeparadas.length; i++) {
            palavras.add(palavrasSeparadas[i]);
        }
        return palavras;
    }

}