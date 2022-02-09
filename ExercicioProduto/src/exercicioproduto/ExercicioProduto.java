/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioproduto;

/**
 *
 * @author gabri
 */
public class ExercicioProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1;        
        p1 = new Produto(1, 5, "Shampoo", 0.5);
        p1.print();
        
        Produto p2;
        p2 = new Produto(p1);
        p2.print();
        
        p2.setCodigo(2);
        p2.setQtd(6);
        p2.setDescricao("Sabonete");
        p2.setPeso(0.6);
        
        p1.print();
        p2.print();
    }
    
}
