/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypolimorfico;

/**
 *
 * @author gabri
 */
public abstract class Pessoa {
    private int cod;
    private String nome;
    private String rg;

    public Pessoa(int cod, String nome, String rg) {
        this.cod = cod;
        this.nome = nome;
        this.rg = rg;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
        
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

    @Override
    public String toString() {
        return cod + "\t" + nome + "\t" + rg;
    }
    
    public void print() {
        System.out.println(toString());
    }
}
