/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaointerface;

import lib.Printable;

/**
 *
 * @author gabri
 */
public abstract class Pessoa implements Printable {
    private String cpf;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        
    public void setIdade(int idade) {
        this.idade = idade;
    }
        
    public Pessoa(String cpf, int idade) {
        this.cpf = cpf;
        this.idade = idade;
    }        
}
