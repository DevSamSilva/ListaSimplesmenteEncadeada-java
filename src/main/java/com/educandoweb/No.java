package com.educandoweb;

public class No {
    int valor;
    No proximo;

    public No(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
