/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo;

import lib.*;

/**
 *
 * @author gabri
 */
public class Produto implements Printable{
    private int cod;
    private String descr;

    public Produto(int cod, String descr) {
        this.cod = cod;
        this.descr = descr;
    }

    @Override
    public void print() {
        System.out.println(cod + " " + descr);
    }        
}
