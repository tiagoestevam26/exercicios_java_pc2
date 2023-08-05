import classes.Interpretadora;
import classes.SuporteTecnico;

import java.util.HashSet;

public class CallCenter {
    public static void main(String[] args) {
        Interpretadora interpreta = new Interpretadora();
        SuporteTecnico suporte = new SuporteTecnico();
        HashSet<String> palavras = new HashSet<String>();
        System.out.println("\nBem-vindo ao sistema de Suporte Técnico.\n");
        String entrada = "windows linux bug";
        System.out.println("O seu problema eh: " + entrada + "!!!!!!!!!\n");
        palavras = interpreta.interpreta(entrada);
        suporte.buscarSolucao(palavras);
        System.out.println("\nObrigado por utilizar nossos serviços!!!!!!!!!");

    }
}
