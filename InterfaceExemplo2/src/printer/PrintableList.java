/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

/**
 *
 * @author gabri
 */
public class PrintableList {
    //Lista de itens totalizáveis, ou seja, uma lista de objetos que implementam
    //a interface TotalizableItem (objetos que são instâncias da classe que implementou).

    //Lista que aceita somente objetos que sejam instâncias da interface TotalizableItem.
    
    //Um objeto ser instância de uma interface significa que a classe que gerou
    //aquele objeto implementa aquela interface.
    private TotalizableItem[] list;
    private int count;

    public PrintableList(int capMax) {
        list = new TotalizableItem[capMax];
        count = 0;
    }

    public boolean addItem(TotalizableItem item) {
        if (count >= list.length) {
            return false;
        }
        list[count] = item;
        count++;
        return true;
    }

    public void printAll() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            list[i].printItem();
            total += list[i].totalizableValue();
        }
        System.out.println("\nTotal de valores: " + total);
    }
}
