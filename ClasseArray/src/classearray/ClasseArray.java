/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classearray;

/**
 *
 * @author gabri
 */
public class ClasseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPessoas lp = new ListaPessoas(10);        
        lp.addPessoa(new Pessoa("Zé", "Carioca"));
        lp.addPessoa(new Pessoa("Pato", "Donald"));
        lp.print();        
    }
    
}
