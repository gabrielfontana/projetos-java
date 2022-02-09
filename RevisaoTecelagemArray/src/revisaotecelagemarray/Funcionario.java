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
public abstract class Funcionario {

    private String nome;
    private String rg;
    private double salBase;

    public Funcionario(String nome, String rg, double salBase) {
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public double getSalBase() {
        return salBase;
    }

    public abstract double salarioLiquido();

    public abstract void novoMes();

    public abstract void hollerith();
}
