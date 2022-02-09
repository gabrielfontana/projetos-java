/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotecelagem;

/**
 *
 * @author gabri
 */
public class Vendedor extends Funcionario {
    private double vendas;

    //Construtor
    public Vendedor(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        vendas = 0;
    }
    
    //Getters
    public double getVendas() {
        return vendas;
    }
    
    //Setters
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
            
    //Métodos
    public void registrarVenda(double valor) {
        vendas += valor;
    }

    @Override
    public double salarioLiquido() {
        return salarioBase + vendas * 0.03;
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Comissão: " + vendas * 0.03 +
            "\nSalário líquido: " + salarioLiquido()
        );
    }

    @Override
    public void novoMes() {
        vendas = 0;
    }    
}
