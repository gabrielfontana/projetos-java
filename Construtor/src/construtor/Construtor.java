/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtor;

/**
 *
 * @author gabri
 */
public class Construtor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1, p2;
        
        p1 = new Pessoa("Zé", "Carioca");
        p1.print();
        p1.setNome("Sr. José");
        p1.print();
        
        p2 = new Pessoa("Mickey", "Mouse");
        p2.print();
    }
    
}
