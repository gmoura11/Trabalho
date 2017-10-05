package com.doctum.oo;

import java.util.Calendar;

public class Pessoa {
    
    private String nome;
    private double altura;
    private double peso;
    private Calendar dataNascimento = Calendar.getInstance();
    private Calendar hoje = Calendar.getInstance();

    public Pessoa (String nome, double altura, double peso, int dia, int mes, int ano){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public Calendar getHoje() {
        return hoje;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }

    public void setHoje(Calendar hoje) {
        this.hoje = hoje;
    }
    
    public int idade(){
        
        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        
        if(hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)){
            idade--;
        }
        else{
            if(hoje.get(Calendar.MONTH)== dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH)< dataNascimento.get(Calendar.DAY_OF_MONTH)){
                idade--;
            }
        }
        return idade;
    }
    
    public double imc(){
        return peso/(altura*altura);
    }
    
}