/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoescriacaoarrayprod;

/**
 *
 * @author gabri
 */
public class ListaProdutos {

    //Atributos
    private Produto lista[];
    private int count;

    //Construtor
    public ListaProdutos(int capMax) {
        lista = new Produto[capMax]; //capMax: quanto cabe no array
        count = 0; //count: quanto tem no array
    }

    //Métodos
    private int indexOf(int cod) {
        for (int i = 0; i < count; i++) {
            if (lista[i].getCod() == cod) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(Produto p) throws CodigoExistenteException {
        //Verifica se ainda tem espaço na lista
        if (count >= lista.length) {
            return false;
        }

        //Verifica se já existe um produto com o mesmo código
        if (indexOf(p.getCod()) > -1) {
            throw new CodigoExistenteException();
        }

        //Adiciona o produto na posição indicada por count
        lista[count] = p;
        count++;

        return true;
    }

    public void listagemGeral(String title) {
        double acumuladorPeso = 0;
        System.out.println("\n" + title);
        Produto.cabecalho();
        for (int i = 0; i < count; i++) {
            lista[i].imprimir();
            acumuladorPeso += lista[i].pesoTotal();
        }
        System.out.println("Peso total dos produtos: " + acumuladorPeso);
    }

    public void listagemReposicao(String title, int qtdMin) {
        double acumuladorPeso = 0;
        System.out.println("\n" + title);
        Produto.cabecalho();
        for (int i = 0; i < count; i++) {
            if (lista[i].getQtd() <= qtdMin) {
                lista[i].imprimir();
                acumuladorPeso += lista[i].pesoTotal();
            }
        }
        System.out.println("Peso total dos produtos: " + acumuladorPeso);
    }

    public boolean acrescentar(int cod, int qtd) {
        int index = indexOf(cod);

        //Produto não foi encontrado na lista
        if (index < 0) {
            return false;
        }

        //Acrescenta a quantidade informada
        lista[index].acrescentar(qtd);

        return true;
    }

    public boolean retirar(int cod, int qtd) {
        int index = indexOf(cod);

        //Produto não foi encontrado na lista
        if (index < 0) {
            return false;
        }

        //Retira a quantidade informada
        return lista[index].retirar(qtd);
    }
}
