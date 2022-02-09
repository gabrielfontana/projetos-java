/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexerciciotecelagem;

/**
 *
 * @author gabri
 */
public class Vendas extends Funcionario{
    //Atributos
    private double totVendas;
    
    //Construtor
    public Vendas(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        totVendas = 0;        
    }
    
    //Getters
    public double getTotVendas() {
        return totVendas;
    }    
    
    //Métodos
    public void registrarVenda(double valor) {
        totVendas += valor;
    }
    
    public double comissao() {
        return totVendas * 0.03;
    }
    
    @Override
    public double salarioLiquido() {
       return getSalBase() + comissao();
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Total de vendas: " + totVendas +
            "\nValor da comissão: " + comissao()
        );
    }

    @Override
    public void novoMes() {
       totVendas = 0;
    }    
} //Vendas
