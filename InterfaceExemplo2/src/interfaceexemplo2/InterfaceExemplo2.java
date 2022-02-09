/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo2;

import printer.*;

/**
 *
 * @author gabri
 */
public class InterfaceExemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintableList lista = new PrintableList(5);
        lista.addItem(new Pessoa("João", "Silva", 1500));
        lista.addItem(new Pessoa("Fernando", "Amaral", 1500));
        lista.addItem(new Pessoa("Ana", "Oliveira", 2000));
        
        lista.printAll();
    }    
}
