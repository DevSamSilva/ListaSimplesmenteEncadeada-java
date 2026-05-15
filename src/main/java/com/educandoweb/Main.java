package com.educandoweb;

public class Main {
    public static void main(String[] args) {
        Lse lse1 = new Lse();
        lse1.adicionarNoInicio(2);
        lse1.adicionarNoInicio(1);
        lse1.inserirNoFinal(3);
        lse1.inserirNoFinal(3);
        System.out.println(lse1);
        lse1.percorrer();
        System.out.println(lse1.somarElementos());

        lse1.removerOcorrencia(2);

        System.out.println(lse1);
        System.out.println(lse1.elementosRepetidos());


    }


}
