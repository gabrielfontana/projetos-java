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
public class Professor extends Pessoa{
    private String disciplina;

    public Professor(int cod, String nome, String rg, String disciplina) {
        super(cod, nome, rg);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
        
    @Override
    public String toString() {
        return super.toString() + "\t" + disciplina;
    }            
}
