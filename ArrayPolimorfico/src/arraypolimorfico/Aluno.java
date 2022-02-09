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
public class Aluno extends Pessoa {
    private String ra;
    private int faltas;

    public Aluno(int cod, String nome, String rg, String ra) {
        super(cod, nome, rg);
        this.ra = ra;
        faltas = 0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }        
    
    @Override
    public String toString() {
        return super.toString() + "\t" + ra + "\t" + faltas;        
    }
    
    public void addFalta() {
        faltas++;
    }
}
