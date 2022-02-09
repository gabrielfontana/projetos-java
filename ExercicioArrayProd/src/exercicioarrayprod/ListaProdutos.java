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
public class ListaProdutos {
    private Produto lista[];
    private int count;
    
    public ListaProdutos(int capMax) {
        lista = new Produto[capMax]; //capMax: quanto cabe no array
        count = 0; //count: quanto tem no array
    }

    private int indexOf(int cod) {
        for(int i = 0; i < count; i++) {
            if(cod == lista[i].getCodigo()) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean add(Produto p) {
        if(count >= lista.length || indexOf(p.getCodigo()) != -1) {
            return false;
        }        
        lista[count] = p;
        count++;
        return true;        
    }
    
    public void listagemGeral(String title) {
        System.out.println(title);
        for(int i = 0; i < count; i++) {
            lista[i].imprimir();
        }
    }
    
    public void listagemReposicao(String title, int qtdMin) {
        System.out.println(title);
        for(int i = 0; i < count; i++) {
            if(lista[i].getQuantidade() <= qtdMin) {
                lista[i].imprimir();
            }
        }
    }
    
    public boolean acrescentar(int cod, int qtd) {
        if(indexOf(cod) == -1) {
            return false;
        }
        else {
            for(int i = 0; i < count; i++) {
                if(lista[i].getCodigo() == cod){
                    lista[i].acrescentar(qtd);
                }
            }
            return true;
        }
    }
    
    public boolean retirar (int cod, int qtd) {
        if(indexOf(cod) == -1) {
            return false;
        }
        for(int i = 0; i < count; i++){
            if(lista[i].getCodigo() == cod) {
                if(qtd > lista[i].getQuantidade()) {
                    return false;
                }
                lista[i].retirar(qtd);                
            }
        }
        return true;
    }
}
