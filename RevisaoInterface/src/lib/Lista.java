/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import revisaointerface.Aluno;
import revisaointerface.Professor;

/**
 *
 * @author gabri
 */
public class Lista {

    private Printable[] lista;
    private int count;

    public Lista(int capMax) {
        lista = new Printable[capMax];
        count = 0;
    }

    public boolean adicionar(Printable p) {
        if (count >= lista.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        lista[count] = p;
        count++;
        return true;
    }

    public void exibirAluno() {
        for (int i = 0; i < count; i++) {
            if(lista[i] instanceof Aluno){                
                lista[i].print();
            }            
        }
    }
    
    public void exibirProfessor() {
        for (int i = 0; i < count; i++) {
            if(lista[i] instanceof Professor){                
                lista[i].print();
            }            
        }
    }
}
