/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaointerface;

import lib.Lista;

/**
 *
 * @author gabri
 */
public class RevisaoInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1, aluno2;
        Professor prof1, prof2;
        Lista lista = new Lista(5);

        try {
            aluno1 = new Aluno("0011556", "123.456.789-00", 16);
            aluno2 = new Aluno("0058788", "987.654.321-00", 17);
            prof1 = new Professor(1445, "147.258.369-00", 45);
            prof2 = new Professor(6541, "369.258.147-00", 55);
            
            lista.adicionar(aluno1);
            lista.adicionar(aluno2);
            lista.adicionar(prof1);
            lista.adicionar(prof2);
            
            System.out.println("\nAluno");
            System.out.format("\n| %-14s | %-4s | %-7s |\n", "CPF", "Idade", "RA");
            lista.exibirAluno();
            
            System.out.println("\nProfessor");
            System.out.format("\n| %-14s | %-4s | %-7s |\n", "CPF", "Idade", "Matrícula");
            lista.exibirProfessor();
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }
    }
}
