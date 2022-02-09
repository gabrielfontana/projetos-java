/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author gabri
 */
public abstract class Pessoa {
    protected String nome;
    protected String rg;

    //Construtores
    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
    
    public Pessoa(Pessoa p){
        nome = p.nome;
        rg = p.rg;
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
    public void print(){
        System.out.println("\nNome: " + nome + "\nRG: " + rg);
    }
}
