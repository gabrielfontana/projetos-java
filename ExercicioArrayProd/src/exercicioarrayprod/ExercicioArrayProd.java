/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarrayprod;

/**
 *
 * @author gabri
 */
public class ExercicioArrayProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaProdutos lp = new ListaProdutos(3);
        lp.add(new Produto(1, "Arroz", 5, 10));
        lp.add(new Produto(2, "Feijão", 2, 5));
        lp.add(new Produto(3, "Sal", 1, 7));
        lp.listagemGeral("Listagem Geral\n");
        lp.listagemReposicao("Listagem Reposição\n", 5);
        lp.acrescentar(1, 10);
        lp.retirar(3, 5);
        lp.listagemGeral("Acrescentar e Retirar\n");
    }    
}
