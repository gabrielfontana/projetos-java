/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraclasse;

/**
 *
 * @author gabri
 */
public class PrimeiraClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1, p2;
        
        //variável de referência = operador de instanciação Construtor da classe
        p1 = new Pessoa(); //p1 -> variável de referência                
        p1.setNome("Zé");
        p1.setSobrenome("Carioca");       
        
        //variável de referência = operador de instanciação Construtor da classe
        p2 = new Pessoa(); //p2 -> variável de referência
        p2.setNome("Mickey");
        p2.setSobrenome("Mouse");  
        
        p1.print();
        p2.print();
        
        //Copia o endereço do objeto
        p2 = p1;
                
        p1.setNome("Sr. José");
        p1.print();
        
        p2.print();
    }
    
}
