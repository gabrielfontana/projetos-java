/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo2;

import printer.*;

/**
 *
 * @author gabri
 */
public class Pessoa implements TotalizableItem{
    private String nome;
    private String sobrenome;
    private double salario;

    public Pessoa(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void print(){
        System.out.println(nome + " " + sobrenome + "\t\t" + salario);
    }
    
    @Override
    public void printItem() {
        print();
    }    
    
    @Override
    public double totalizableValue() {
        return salario;
    }      
}
