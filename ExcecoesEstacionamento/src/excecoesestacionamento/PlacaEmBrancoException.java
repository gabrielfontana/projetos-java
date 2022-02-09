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
public class PlacaEmBrancoException extends Exception {

    @Override
    public String toString() {
        return "Não é possível cadastrar um carro com a placa em branco";
    }
}
