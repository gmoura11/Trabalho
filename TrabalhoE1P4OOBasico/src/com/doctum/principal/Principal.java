package com.doctum.principal;

import com.doctum.oo.Compra;
import com.doctum.oo.Cachorro;
import com.doctum.oo.Retangulo;
import com.doctum.oo.Pessoa;

public class Principal {


    public static void main(String[] args) {
        
        
        Compra co1 = new Compra(5000,10);
        
        System.out.println("-- Compra --");
        System.out.println("Total da compra feita: " + co1.getValorTotal());
        System.out.println("Numero de parcelas escolhidas: " + co1.getNumeroParcelas());
        System.out.println("Valor das parcelas: " + co1.valorParcela() + "\n");
        
        Cachorro c1 = new Cachorro("Athena", 0.25);
        
        System.out.println("-- Cachorro --");
        System.out.println("Nome do cachorro(a): " + c1.getNome());
        System.out.println("Tamanho do cachorro(a): " + c1.getTamanho());
        c1.brincar();
        c1.latir();
        System.out.println("Total de cachorro(s) criado(s) " + Cachorro.mostrarQuantidade() + "\n" );

        Retangulo r1 = new Retangulo(50,100);
        
        System.out.println("-- Retangulo --");
        System.out.println("Base do retangulo: " + r1.getBase());
        System.out.println("Altura do retangulo: " + r1.getAltura());
        System.out.println("Area do retangulo: " + r1.area());
        System.out.println("Perimetro do retangulo: " + r1.perimetro());
        System.out.println("É um quadrado? " + r1.eQuadrado() + "\n");
        
        
        Pessoa p1 = new Pessoa("Victor", 1.70, 80, 26, 02, 1996);
        
        System.out.println("-- Pessoa --");
        System.out.println("Nome da pessoa: " + p1.getNome());
        System.out.println("Altura da pessoa: " + p1.getAltura());
        System.out.println("Peso da pessoa: " + p1.getPeso());
        System.out.println("Idade da pessa: " + p1.idade());
        System.out.println("IMC da pessoa: " + p1.imc());
    }    
}