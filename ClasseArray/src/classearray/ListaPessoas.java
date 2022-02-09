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
//Classe especializada em manipular a lista de pessoas
public class ListaPessoas {
    private Pessoa lista[];
    private int count;
    
    public ListaPessoas(int capMax) {
        lista = new Pessoa[capMax]; //capMax: quanto cabe no array
        count = 0; //count: quanto tem no array
    }
    
    public boolean addPessoa(Pessoa p) {
        if(count >= lista.length) {
            return false;
        }
        lista[count] = p;
        count++;
        return true;
    }
    
    public void print() {
        //O for deve ir até count, pois pode haver muitas posições vazias
        for(int i = 0; i < count; i++) {
            lista[i].print();
        }
    }
}
