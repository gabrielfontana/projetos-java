/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaotecelagemarray;

/**
 *
 * @author gabri
 */
public class Vendas extends Funcionario {

    private double totVendas;

    public Vendas(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        totVendas = 0;
    }

    public double getTotVendas() {
        return totVendas;
    }

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
    public void novoMes() {
        totVendas = 0;
    }

    @Override
    public void hollerith() {
        System.out.println(
                "\nNome: " + getNome()
                + "\nRG: " + getRg()
                + "\nSalário base: " + getSalBase()
                + "\nTotal de vendas: " + totVendas
                + "\nComissão: " + comissao()
                + "\nSalário líquido: " + salarioLiquido()
        );
    }
}
