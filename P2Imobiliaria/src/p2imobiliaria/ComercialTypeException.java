/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2imobiliaria;

/**
 *
 * @author gabri
 */
//Gabriel Fontana Junqueira Araújo - RA: 0040482011019
public class ComercialTypeException extends RuntimeException{
    @Override
    public String toString() {
        return "Não é possível vender imóvel do tipo comércio!";
    }
}
