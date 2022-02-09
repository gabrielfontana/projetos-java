/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno;

/**
 *
 * @author gabri
 */
public class ExercicioAluno{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Aluno a1;
        
        a1 = new Aluno("Gabriel", "2011019");        
        a1.setMedia(10);
        a1.setFaltas(0);
        a1.print();
    }    
}
