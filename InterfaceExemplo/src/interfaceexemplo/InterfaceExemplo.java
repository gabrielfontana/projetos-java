/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo;

import lib.*;

/**
 *
 * @author gabri
 */
public class InterfaceExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Televisão");
        
        Printer prt = new Printer();
        
        prt.printObj(p1);
    }
    
}
