/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author Usuario
 */
// Esta classe manipula um array de objetos que são instância de 
// Sorteable. A classe é capaz de ordenar a lista e imprimir
// uma listagem dos objetos adicionados.
public class Array {

    private Sorteable[] list;
    private int count;

    public Array(int capMax) {
        list = new Sorteable[capMax];
        count = 0;
    }

    public boolean add(Sorteable s) {
        if (count >= list.length) {
            return false;
        }
        list[count] = s;
        count++;
        return true;
    }

    public void printAll() {
        System.out.println("+--------------------------------+");
        for (int i = 0; i < count; i++) {
            list[i].print();
        }
        System.out.println("+--------------------------------+\n");
    }

    public void printRef() {
        System.out.println("+--------------------------------+");
        for (int i = 0; i < count; i++) {
            list[i].printMakeRef();
        }
        System.out.println("+--------------------------------+\n");
    }

    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (list[i].compare(list[j]) > 0) {
                    Sorteable tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void sortRef() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (list[i].compareRef(list[j]) > 0) {
                    Sorteable tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }
}
