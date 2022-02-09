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
public class NegativeAmountException extends RuntimeException {

    @Override
    public String toString() {
        return "Quantidade negativa!";
    }
}
