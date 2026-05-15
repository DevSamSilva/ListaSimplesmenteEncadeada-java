package com.educandoweb;

public class Lse {
    No inicio;

    public void adicionarNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public void inserirNoFinal(int valor){
        No novoNo = new No(valor);

        if(inicio == null){
            inicio = novoNo;
        }

        No atual = inicio.proximo;

        while (atual.proximo != null){
            atual = atual.proximo;
        }

        atual.proximo = novoNo;
    }

    @Override
    public String toString() {
        return "Lse{" +
                "inicio=" + inicio +
                '}';
    }
}
