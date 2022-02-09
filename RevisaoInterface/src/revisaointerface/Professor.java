/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaointerface;

/**
 *
 * @author gabri
 */
public class Professor extends Pessoa {
    private int matricula;

    public Professor(int matricula, String cpf, int idade) {
        super(cpf, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }        
            
    @Override
    public void print() {
        System.out.printf("| %-14s | %5d | %9s |\n", getCpf(), getIdade(), matricula);
    }    
}
