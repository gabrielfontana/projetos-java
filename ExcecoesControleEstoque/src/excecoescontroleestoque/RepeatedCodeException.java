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
public class RepeatedCodeException extends Exception {

    @Override
    public String toString() {
        return "Produto com código repetido!";
    }
}
