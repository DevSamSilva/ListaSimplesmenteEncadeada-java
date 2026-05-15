package com.educandoweb;

public class Lse {
    No inicio;

    public void adicionarNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    @Override
    public String toString() {
        return "Lse{" +
                "inicio=" + inicio +
                '}';
    }
}
