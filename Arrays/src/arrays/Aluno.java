/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author gabri
 */
public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, String sobrenome, String ra) {
        super(nome, sobrenome);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + " " + super.toString() + '}';
    }
}
