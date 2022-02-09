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


public interface Sorteable extends Printable
{
    // void print();  
    
    // Contrato: Este método compara o objeto interno com o objeto
    // recebido pelo parâmetro.
    
    // retorna -1 se o objeto interno é menor que obj
    //          0 se são iguais
    //          1 se o objeto interno é maior que obj
    
    int compare(Object obj);
    
    int compareRef(Object obj);
}
