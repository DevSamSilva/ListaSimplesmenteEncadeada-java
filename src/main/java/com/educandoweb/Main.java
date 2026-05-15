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
        lse1.removerRepetidos();
        System.out.println(lse1);


        Lse lse2 = new Lse();
        lse2.adicionarNoInicio(2);
        lse2.adicionarNoInicio(1);
        lse2.inserirNoFinal(3);
        lse2.inserirNoFinal(3);
        lse2.inserirNoFinal(3);


        System.out.println(lse2);
        lse2.removerRepetidos();
        System.out.println(lse2);

        Lse lse3 = new Lse();
        lse3.adicionarNoInicio(2);
        lse3.adicionarNoInicio(1);
        lse3.inserirNoFinal(3);
        lse3.inserirNoFinal(3);
        lse3.inserirNoFinal(3);

        Lse lse4 = lse3.clonar();

        System.out.println(lse4);
        lse4.inverter();

        System.out.println(lse4);
        lse4.imprimeInvertido(lse4.inicio);

        System.out.println("==============");

        lse4.imprimirPares();

        lse4.removerImpares();
        System.out.println(lse4);


    }


}
