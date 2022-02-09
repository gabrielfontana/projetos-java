/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexercicioarrayprod;

/**
 *
 * @author gabri
 */
public class CorrecaoExercicioArrayProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaProdutos lp = new ListaProdutos(10);
        
        lp.add(new Produto(1, "Rebimboca", 1, 7));
        lp.add(new Produto(2, "Parafuseta", 1.5, 6));
        lp.add(new Produto(3, "Roda", 10, 8));
        lp.add(new Produto(4, "Calota", 0.5, 20));
                
        lp.listagemGeral("Listagem Geral");
                
        lp.listagemReposicao("Listagem para Reposição", 8);
    }
    
}
