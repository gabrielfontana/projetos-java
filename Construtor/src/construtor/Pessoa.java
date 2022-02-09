/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtor;

/**
 *
 * @author gabri
 */
public class Pessoa {
    private String nome, sobrenome;    
    
    //Construtor
    public Pessoa(String vNome, String vSobrenome){
        setNome(vNome);
        if(!vSobrenome.isEmpty()) sobrenome = vSobrenome;
    }
    
    //Getters -> Os atributos são privados, porém possuem acesso de leitura
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    //Setters -> Permissão de escrita
    public final void setNome(String vNome) {
        if(!vNome.isEmpty()) nome = vNome;        
    }

    public void setSobrenome(String vSobrenome) {
        if(!vSobrenome.isEmpty()) sobrenome = vSobrenome; 
    }
    
    //Método
    public void print(){
        System.out.println(nome + " " + sobrenome);
    }
}
