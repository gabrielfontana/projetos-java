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
public abstract class Funcionario {
    protected String nome, rg;
    protected double salarioBase;

    //Construtor
    public Funcionario(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }    
    
    //Métodos
    public abstract double salarioLiquido();
    
    public void hollerith() {
        System.out.println(
            "\nNome: " + nome +
            "\nRG: " + rg +
            "\nSalário base: " + salarioBase
        );
    }
    
    public abstract void novoMes();
}
