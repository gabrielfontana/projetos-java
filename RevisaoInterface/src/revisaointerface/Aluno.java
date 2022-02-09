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
public class Aluno extends Pessoa {

    private String ra;

    public Aluno(String ra, String cpf, int idade) {
        super(cpf, idade);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public void print() {
        System.out.printf("| %-14s | %5d | %7s |\n", getCpf(), getIdade(), ra);
    }
}
