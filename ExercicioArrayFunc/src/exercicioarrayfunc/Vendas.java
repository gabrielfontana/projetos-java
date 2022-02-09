/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarrayfunc;

/**
 *
 * @author Usuario
 */
public class Vendas extends Funcionario
{
    private double totVendas;

    public Vendas(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totVendas = 0;
    }
    
    public void registrarVenda(double valor)
    {
        totVendas += valor;
    }
    
    @Override
    public void novoMes()
    {
        totVendas = 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() + totVendas * 0.03;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("\nTotal de vendas: " + totVendas);
    }

    public double getTotVendas() 
    {
        return totVendas;
    }        
}
