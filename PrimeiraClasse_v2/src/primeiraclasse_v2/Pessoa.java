/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraclasse_v2;

/**
 *
 * @author gabri
 */
public class Pessoa {
    private String nome, sobrenome;    
    
    //Construtores
    
    //Construtor parametrizado
    public Pessoa(String nome, String sobrenome){
        setNome(nome);
        setSobrenome(sobrenome);
    }
    
    //Copy constructor ou construtor de cópia
    public Pessoa(Pessoa p){
        this(p.nome, p.sobrenome); //chamada de construtor da classe; só pode ser usado dentro de construtores

        //setNome(p.nome);
        //setSobrenome(p.sobrenome);
        
        //nome = p.nome;
        //sobrenome = p.sobrenome;
    }

    //Getters -> Os atributos são privados, porém possuem acesso de leitura
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    //Setters -> Permissão de escrita
    public final void setNome(String nome) {
        if(!nome.isEmpty()) this.nome = nome;        
    }

    public final void setSobrenome(String sobrenome) {
        if(!sobrenome.isEmpty()) this.sobrenome = sobrenome; 
    }
    
    //Método
    public void print(){
        System.out.println(nome + " " + sobrenome);
    }
}

