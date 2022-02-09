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
public class CodigoExistenteException extends Exception {

    @Override
    public String toString() {
        return "Produto com código repetido";
    }
}
