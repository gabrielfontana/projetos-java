/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioescola;

/**
 *
 * @author gabri
 */
public class Pessoa {
    protected String nome;
    protected String rg;
    
    //Construtores
    public Pessoa() {
        nome = null;
        rg = null;
    }
    
    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
   
    //Getters
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }    
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nRG: " + rg; 
    }
    
    public void Mostrar() {
        System.out.println(toString());
    }
}
