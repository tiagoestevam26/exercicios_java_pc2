package classes;

import Intefaces.Passivo;

public abstract class Empregado implements Passivo{
    protected String nome;
    protected String sobrenome;
    protected int numID;


    public Empregado(String nome, String sobrenome, int numID) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numID = numID;
    }
   
}
