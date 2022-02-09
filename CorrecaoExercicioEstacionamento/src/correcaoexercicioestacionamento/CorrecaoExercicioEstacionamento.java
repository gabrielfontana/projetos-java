/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexercicioestacionamento;

/**
 *
 * @author gabri
 */
public class CorrecaoExercicioEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprio p1 = new Proprio(1, "ECG-5478", "Corsa", 2010, 25000, "01/04/2021");
        p1.imprimeDados();
        p1.venderCarro("João da Silva", 28000);
        p1.imprimeDados();
    }    
}
