/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioescola;

/**
 *
 * @author gabri
 */
public class ExercicioEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("CLASSE Pessoa");
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("João da Silva", "26.008.345-8");        
        p1.Mostrar();
        p2.Mostrar();
        
        System.out.println("\nCLASSE Aluno");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Ana Beatriz", "21.985.792-1", "45123", "Diurno");
        a1.Mostrar();
        a2.Mostrar();
        
        System.out.println("\nCLASSE Funcionario");
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Mário Luís Fernandes", "35.918.987-8", 11.50, 220);
        f1.Mostrar();
        f2.Mostrar();
        
        System.out.println("\nCLASSE Professor");
        Professor prof1 = new Professor();
        Professor prof2 = new Professor("Jaqueline Ester Martins", "62.510.951-7", 13.75, 220, "Humanas");
        prof1.Mostrar();
        prof2.Mostrar();
        
        System.out.println("\nMÉTODO Trancar()");
        Aluno a3 = new Aluno("Thiago Oliveira", "61.621.145-3", "45654", "Noturno");
        a3.Mostrar();
        a3.Trancar();
        a3.Mostrar();
        
        System.out.println("\nMÉTODO Destrancar()");
        a3.Mostrar();
        a3.Destrancar();
        a3.Mostrar();
        
        System.out.println("\nMÉTODO Formar()");
        a3.Mostrar();
        a3.Formar();
        a3.Mostrar();
        
        System.out.println("\nMÉTODO Desistir()");
        Aluno a4 = new Aluno("Fernanda Lima", "44.112.677-1", "45544", "Diurno");
        a4.Mostrar();
        a4.Desistir();
        a4.Mostrar();
    }    
}
