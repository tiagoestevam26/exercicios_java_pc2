package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class SuporteTecnico {
    private HashMap<String, String> banco;
    private ArrayList<String> respostas;

    public SuporteTecnico() {
        this.banco = new HashMap<String, String>();
        this.respostas = new ArrayList<String>();
        preencherBanco();
        preencherRespostaPadrao();
    }

    private void preencherBanco() {
        banco.put("lento",
                "Penso que o problema est� relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Voc� tem algum\n problema com o software?");
        banco.put("performance",
                "A performance est� pr�xima do esperado nos testes que realizamos. Voc� est�\n executando algum outro processo em paralelo?");
        banco.put("bug",
                "Bom, voc� sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n j� est�o atuando no problema para solucion�-lo. Voc� poderia descrever seu problema\n com mais detalhes?");
        banco.put("buggy",
                "Bom, voc� sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n j� est�o atuando no problema para solucion�-lo. Voc� poderia descrever seu problema\n com mais detalhes?");
        banco.put("windows",
                "Este � um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. N�o h� nada que possamos fazer neste caso.");
        banco.put("macintosh",
                "Este � um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. N�o h� nada que possamos fazer neste caso.");
        banco.put("caro",
                "O pre�o do nosso produto � competitivo. Voc� j� fez uma pesquisa de mercado\n e comparou todas as caracter�sticas do nosso software com outras ofertas de mercado?");
        banco.put("instala��o",
                "A instala��o � simples e direta. N�s temos programas de instala��o previamente configurados\n que far�o todo o trabalho para voc�. Voc� j� leu as instru��es\n de instala��o?");
        banco.put("mem�ria",
                "Se voc� observar detalhadamente os requisitos m�nimos de sistema, voc� ver� que\n a mem�ria requerida � 1.5 giga byte. Voc� dever� adquirir\n mais mem�ria. Mais alguma coisa que deseja saber?");
        banco.put("linux",
                "N�s consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a vers�es incompat�veis. Voc� poderia ser\n mais preciso?");
        banco.put("danificaram",
                "Bom, nosso software n�o danificaria seu sistema. Deve ser algo espec�fico\n no seu sistema. Diga-me sobre sua configura��o.");
        banco.put("danificou",
                "Bom, nosso software n�o danificaria seu sistema. Deve ser algo espec�fico\n no seu sistema. Diga-me sobre sua configura��o.");
    }

    private void preencherRespostaPadrao() {
        respostas.add("Isso soa estranho. Voc� poderia descrever o problema com mais detalhes?");
        respostas.add(
                "Nenhum outro cliente detalhou um problema parecido com este. \n Qual � a sua configura��o de sistema?");
        respostas.add("Isso parece interessante. Diga-me mais a respeito...");
        respostas.add("Preciso de maiores informa��es a respeito.");
        respostas.add("Voc� j� verificou se existe algum conflito de DLL?");
        respostas.add("Isso est� descrito no manual. Voc� j� deu uma lida no manual que veio junto do seu software?");
        respostas.add(
                "Sua descri��o n�o foi satisfat�ria. Voc� j� procurou um t�cnico\n que poderia detalhar melhor este problema?");
        respostas.add("Isso n�o � um problema, � apenas uma caracter�stica do software!");
        respostas.add("Voc� poderia explicar melhor?");
    }

    public void buscarSolucao(HashSet<String> palavras) {
        int i = 0;
        for (String palavra : palavras) {
            if (banco.containsKey(palavra)) {
                System.out.println(banco.get(palavra));
                i = 1;
            }
        }
        if (i == 0) {
            buscarSolucaoAleatoria();
        }
    }

    public void buscarSolucaoAleatoria() {
        Random geradorDeNumero = new Random();
        int numeroAleatorio = geradorDeNumero.nextInt(9);
        System.out.println(respostas.get(numeroAleatorio));
    }

}