/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoescontroleestoque;

/**
 *
 * @author gabri
 */
public class ExcecoesControleEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1, p2, p3, p4;
        Estoque est = new Estoque(5);

        try {
            p1 = new Produto(1, "Roda de ferro", 10.5, 200);
            p2 = new Produto(2, "Roda de alumínio", 3.5, 100);
            p3 = new Produto(3, "Calota", 0.5, 300);
            p4 = new Produto(4, "Parafuso de roda", 0.1, 500);

            est.add(p1);
            est.add(p2);
            est.add(p3);
            est.add(p4);

            est.acrescentar(1, 100);
            est.retirar(1, 100);
            est.listagemGeral("LISTAGEM GERAL");
            est.listagemReposicao("LISTAGEM DE REPOSIÇÃO", 250);
            est.remover(4);
            est.listagemGeral("LISTAGEM GERAL");            
        } catch (NullInstanceVariableException e) {
            System.out.println("NullInstanceVariableException: " + e);
        } catch (ListIsFullException e) {
            System.out.println("ListIsFullException: " + e);
        } catch (RepeatedCodeException e) {
            System.out.println("RepeatedCodeException: " + e);
        } catch (NonExistentCodeException e) {
            System.out.println("NonExistentCodeException: " + e);
        } catch (NegativeAmountException e) {
            System.out.println("NegativeAmountException: " + e);
        }
    }
}
