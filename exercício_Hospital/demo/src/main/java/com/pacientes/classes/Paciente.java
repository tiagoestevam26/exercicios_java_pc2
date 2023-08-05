package com.pacientes.classes;

public class Paciente {
    private String codigo;
    private String nome;
    private String peso;
    private String genero;
    private String idade;
    private String altura;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Paciente(String string, String nome, String peso, String idade, String altura, String genero) {
        this.codigo = string;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
        this.genero = genero;
    }




    
}