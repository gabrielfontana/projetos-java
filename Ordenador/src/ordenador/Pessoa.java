/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import sorter.*;

/**
 *
 * @author gabri
 */
public class Pessoa implements Sorteable {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }        

    @Override
    public void print() {
        System.out.println(toString());
    }
    
    @Override
    public int compare(Object obj) {
        if(!(obj instanceof Pessoa)) return 0;
        Pessoa p = (Pessoa) obj;
        return toString().compareTo(p.toString());
    }
    
    //-----------------------------------------------
    
    public String makeRef() {
        return sobrenome + ", " + nome;
    }
    
    @Override
    public void printMakeRef() {
        System.out.println(makeRef());
    }
    
    @Override
    public int compareRef(Object obj) {
        if(!(obj instanceof Pessoa)) return 0;
        Pessoa p = (Pessoa) obj;
        return makeRef().compareTo(p.makeRef());
    }
}
