/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraclasse_v2;

/**
 *
 * @author gabri
 */
public class PrimeiraClasse_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1, p2, p3;
        
        //variável de referência = operador de instanciação Construtor da classe
        p1 = new Pessoa("Zé", "Carioca"); //p1 -> variável de referência                
        p1.print(); 
        
        //variável de referência = operador de instanciação Construtor da classe
        p2 = new Pessoa("Mickey", "Mouse"); //p2 -> variável de referência           
        p2.print();
        
        p3 = new Pessoa(p1);
        p3.print();
        
        p3.setNome("Sr José");        
        p1.print(); 
        p3.print();
    }
    
}
