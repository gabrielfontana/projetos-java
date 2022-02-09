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
public class Estoque {

    private Produto list[];
    private int count;

    public Estoque(int capMax) {
        list = new Produto[capMax];
        count = 0;
    }

    private int indexOf(int cod) {
        for (int i = 0; i < count; i++) {
            if (cod == list[i].getCod()) {
                return i;
            }
        }

        return -1;
    }

    public boolean add(Produto p) throws NullInstanceVariableException, ListIsFullException, RepeatedCodeException {
        if (p == null) {
            throw new NullInstanceVariableException();
        }
        if (count >= list.length) {
            throw new ListIsFullException();
        }
        if (indexOf(p.getCod()) >= 0) {
            throw new RepeatedCodeException();
        }

        list[count] = p;
        count++;
        return true;
    }

    public void listagemGeral(String title) {
        System.out.println(title);
        Produto.printCab();
        double acp = 0;
        for (int i = 0; i < count; i++) {
            list[i].print();
            acp += list[i].pesoTotal();
        }
        System.out.println("Peso total do estoque: " + acp);
        System.out.println();
    }

    public void listagemReposicao(String title, int qtdMin) {
        System.out.println(title);
        Produto.printCab();
        double acp = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getQtd() <= qtdMin) {
                list[i].print();
                acp += list[i].pesoTotal();
            }
        }
        System.out.println("Peso total do estoque: " + acp);
        System.out.println();
    }

    public boolean acrescentar(int cod, int qtd) {
        int index = indexOf(cod);
        if (index < 0) {
            throw new NonExistentCodeException();
        }

        list[index].acrescentar(qtd);

        return true;
    }

    public boolean retirar(int cod, int qtd) {
        int index = indexOf(cod);
        if (index < 0) {
            throw new NonExistentCodeException();
        }

        return list[index].retirar(qtd);
    }

    public boolean remover(int cod) {
        int index = indexOf(cod);
        if (index < 0) {
            throw new NonExistentCodeException();
        }

        for (int i = index; i < count - 1; i++) {
            list[i] = list[i + 1];
        }

        count--;
        return true;
    }
}
