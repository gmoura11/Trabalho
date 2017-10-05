package com.doctum.dbo;

public class Principal
{
    public static void main(String[] args)
    {
        ContaCorrente cc1 = new ContaCorrente(1, "Victor", 10000);
        
        System.out.println("Conta corrente: " + cc1.getNumero() + ", " + cc1.getNome());
        System.out.println("Saldo a depositar: " + cc1.getSaldo());
        cc1.depositar(1000);
        System.out.println("Novo saldo da conta: " + cc1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc2 = new ContaCorrente(2, "Gabriel", 7000);
        
        System.out.println("Conta corrente: " + cc2.getNumero() + ", " + cc2.getNome());
        System.out.println("Saldo a depositar: " + cc2.getSaldo());
        cc2.depositar(1500);
        System.out.println("Saldo para sacar: " + cc2.getSaldo());
        cc2.sacar(1000);
        System.out.println("Novo saldo da conta: " + cc2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc3 = new ContaCorrente(3, "Vanda", 30000);
        
        System.out.println("Conta corrente: " + cc3.getNumero() + ", " + cc3.getNome());
        System.out.println("Saldo para sacar: " + cc3.getSaldo());
        cc3.sacar(790);
        System.out.println("Novo saldo da conta: " + cc3.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial(1, "Victor", 5000, 10000);
        
        System.out.println("Conta corrente especial: " + cce1.getNumero() + ", " + cce1.getNome() + ", Limite: " + cce1.getLimite());
        System.out.println("Saldo a depositar: " + cce1.getSaldo());
        cce1.depositar(3000);
        System.out.println("Saldo para sacar: " + cce1.getSaldo());
        cce1.sacar(2000);
        System.out.println("Novo saldo da conta: " + cce1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce2 = new ContaCorrenteEspecial(2, "Gabriel", 3000, 5000);
        
        System.out.println("Conta corrente especial: " + cce2.getNumero() + ", " + cce2.getNome() + ", Limite: " + cce2.getLimite());
        System.out.println("Saldo a depositar: " + cce2.getSaldo());
        cce2.depositar(1500);
        System.out.println("Saldo para sacar: " + cce2.getSaldo());
        cce2.sacar(1000);
        System.out.println("Novo saldo da conta: " + cce2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce3 = new ContaCorrenteEspecial(3, "Vanda", 10000, 30000);
        
        System.out.println("Conta corrente especial: " + cce3.getNumero() + ", " + cce3.getNome() + ", Limite: " + cce3.getLimite());
        System.out.println("Saldo a depositar: " + cce3.getSaldo());
        cce3.depositar(5000);
        System.out.println("Saldo para sacar: " + cce3.getSaldo());
        cce3.sacar(2500);
        System.out.println("Novo saldo da conta: " + cce3.getSaldo());
        
        System.out.println("\n");     
    }    
}
