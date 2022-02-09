/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import sorter.*;

/**
 *
 * @author Usuario
 */



public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {               
        Array a1 = new Array(5);
        
        a1.add(new Pessoa("José", "Silva"));
        a1.add(new Pessoa("Abel", "Ribeiro"));
        a1.add(new Pessoa("Zeferino", "Vaz"));
        a1.add(new Pessoa("Caio", "Junqueira"));
        
        a1.printAll();
        
        //----------
        
        a1.sort();
        
        a1.printAll();
        
        //----------
        
        a1.sortRef();
        
        a1.printRef();
    }    
}
