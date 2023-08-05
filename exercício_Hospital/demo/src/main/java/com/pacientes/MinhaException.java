package com.pacientes;

public class MinhaException extends Exception {
    public MinhaException() {
        super();
    }

    public MinhaException(String mensagem) {
        super(mensagem);
    }
}