package com.doctum.occ;

public class Principal
{

    public static void main(String[] args)
    {
        
        int[] conjuntoA = {1, 3, 5};
        int[] conjuntoB = {8, 2};
        int[] conjuntoC = new int[20];
        int[] conjuntoD = new int[11];
        
        for(int i = 0 ; i < 20; i++){
            conjuntoC[i]=i+1;
        }
        for(int i = 0 ; i < 11; i++){
            conjuntoD[i]=i*10;
        }
        
        System.out.println("4 pertence ao  A: " + OperacaoComConjuntos.pertence(4,conjuntoA));
        System.out.println("2 pertence ao  B : " + OperacaoComConjuntos.pertence(2,conjuntoB));
        System.out.println("3 pertence ao  C: " + OperacaoComConjuntos.pertence(3,conjuntoC));
        System.out.println("9 pertence ao  B: " + OperacaoComConjuntos.pertence(9,conjuntoB));
        System.out.println("7 pertence ao  A: " + OperacaoComConjuntos.pertence(7,conjuntoA));
        System.out.println("5 pertence ao  C: " + OperacaoComConjuntos.pertence(5,conjuntoC));
        System.out.println("18 pertence ao C: " + OperacaoComConjuntos.pertence(18,conjuntoC));
        System.out.println("13 pertence ao C: " + OperacaoComConjuntos.pertence(13,conjuntoC));
        System.out.println("30 pertence ao C: " + OperacaoComConjuntos.pertence(30,conjuntoC));
        System.out.println("15 pertence ao D: " + OperacaoComConjuntos.pertence(15,conjuntoD));
        System.out.println("60 pertence ao D: " + OperacaoComConjuntos.pertence(60,conjuntoD));
        System.out.println("95 pertence ao D: " + OperacaoComConjuntos.pertence(95,conjuntoD));
    }
    
}