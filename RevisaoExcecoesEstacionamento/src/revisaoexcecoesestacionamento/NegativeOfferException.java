/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoexcecoesestacionamento;

/**
 *
 * @author gabri
 */
public class NegativeOfferException extends Exception{

    @Override
    public String toString() {
        return "Não é possível realizar uma oferta com valor negativo!";
    }
}
