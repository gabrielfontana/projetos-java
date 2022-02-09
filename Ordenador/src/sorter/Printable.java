/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author Usuario
 */
public interface Printable {
    // Contrato: Este método deve imprimir os atributos que vão 
    // ser impressos na listagem. A impressão deve, de preferência, utilizar 
    // apenas uma linha para que a listagem tenha uma apresentação melhor.
    // Sugestão: use tabulações para separar os campos.

    void print();

    void printMakeRef();
}
