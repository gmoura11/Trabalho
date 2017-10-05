package com.doctum.dbo;

public class ContaCorrenteEspecial extends ContaCorrente
{    
    private double limite;
    
    public ContaCorrenteEspecial(int numero, String nome, double saldo, double limite)
    {
        super(numero, nome, saldo);
        this.limite=limite;
    }

    public double getLimite()
    {
        return limite;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }
    
    @Override
    
    public void sacar(double VSaque)
    {
        if(VSaque > 0)
        {
            if(VSaque <= this.limite)
            {
                this.setSaldo(this.getSaldo()- VSaque);
                System.out.println("Efetuado com sucesso!");
            }
            else
            {
                System.out.println("Saque inválido!");
            }
        }
        else
        {
            System.out.println("Saque inválido!");
        }
    }
}