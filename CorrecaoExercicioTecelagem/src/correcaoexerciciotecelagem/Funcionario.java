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
public abstract class Funcionario {
    //Atributos
    private String nome;
    private String rg;
    private double salBase;

    //Construtor
    public Funcionario(String nome, String rg, double salBase) {
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }   
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    //Métodos abstratos
    public abstract double salarioLiquido();
            
    public abstract void novoMes();   
    
    //Outros métodos
    public void hollerith() {
        System.out.print(
            "\nNome: " + nome +
            "\nRG: " + rg +
            "\nSalário base: " + salBase +
            "\nSalário líquido: "
        );
        System.out.format("%.2f\n", salarioLiquido());
    }
} //Funcionario
