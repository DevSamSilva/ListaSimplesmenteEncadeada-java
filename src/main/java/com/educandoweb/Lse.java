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

    public void percorrer(){
        No atual = inicio;

        while (atual != null){
            System.out.println("[" + atual.valor + "]");
            atual = atual.proximo;
        }
    }

    public int somarElementos(){
        int soma = 0;
        No atual = inicio;

        while (atual != null){
            soma += atual.valor;
            atual = atual.proximo;
        }

        return soma;
    }

    public void removerOcorrencia(int valor){
        while (inicio != null && inicio.valor == valor){
            inicio = inicio.proximo;
        }
        No atual = inicio;

        while (atual != null && atual.proximo != null){
            if (atual.proximo.valor == valor){
                atual.proximo = atual.proximo.proximo;
            }
            atual = atual.proximo;
        }
    }

    public boolean elementosRepetidos(){
        No atual = inicio;

        while (atual != null){
            No comparador = atual;

            while (comparador.proximo != null) {
                if (comparador.proximo.valor == atual.valor) {
                    return true;
                }
                comparador = comparador.proximo;
            }

            atual = atual.proximo;
        }
        return  false;
    }

    public void removerRepetidos(){
        No atual = inicio;
        while (atual != null){
            No comparador = atual;
            while (comparador.proximo != null){
                if (comparador.proximo.valor == atual.valor){
                    comparador.proximo = comparador.proximo.proximo;
                } else {
                    comparador = comparador.proximo;
                }
            }
            atual = atual.proximo;
        }
    }

    @Override
    public String toString() {
        return "Lse{" +
                "inicio=" + inicio +
                '}';
    }
}
