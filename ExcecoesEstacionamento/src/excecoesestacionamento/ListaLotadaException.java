/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoesestacionamento;

/**
 *
 * @author gabri
 */
public class ListaLotadaException extends Exception {

    @Override
    public String toString() {
        return "A lista de carros está lotada!";
    }
}
