package com.doctum.dbo;

public abstract class Conta
{    
    private int numero;
    private String nome;
    private double saldo;

    public int getNumero()
    {
        return numero;
    }
    
     protected void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getSaldo()
    {
        return saldo;
    }    

    protected void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
}