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
public class Aluno extends Pessoa {
    private String ra;
    
    //Construtores
    public Aluno(String ra, String nome, String rg) {
        super(nome, rg); //chamada ao construtor da classe Pessoa
        this.ra = ra;
    }
    
    public Aluno(Aluno a){
        super(a);
        ra = a.ra;
    }
                
    //Getters
    public String getRa() {
        return ra;
    }

    //Setters
    public void setRa(String ra) {
        this.ra = ra;
    }    
}
