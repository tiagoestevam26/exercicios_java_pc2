//package io.github.jiangdequan;

public class Carta {
    private int valor;
    private String naipe;

    public Carta() {
        this.valor = 0;
        this.naipe = "";
    }

    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public static int comparaValor(int carta1, int carta2) {
        if (carta1 > carta2) {
            return 1;
        } else if (carta1 < carta2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static boolean comparaNaipe(String carta1, String carta2) {
        if (carta1.equals(carta2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Carta primeiraCarta;
        Carta segundaCarta;
        primeiraCarta = new Carta(2, "paus");
        segundaCarta = new Carta(5, "ouros");
        System.out.println("Carta 1: " + primeiraCarta.valor + " de " + primeiraCarta.naipe);
        System.out.println("Carta 2: " + segundaCarta.valor + " de " + segundaCarta.naipe);
        System.out.println(comparaValor(primeiraCarta.valor, segundaCarta.valor));
        System.out.println("Tem o mesmo naipe? " + comparaNaipe(primeiraCarta.naipe, segundaCarta.naipe));
    }

}