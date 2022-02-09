/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoescalc;

/**
 *
 * @author gabri
 */
public class ExcecoesCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        System.out.println("20 + 56 = " + Calc.sum(20, 56));
        System.out.println("30 - 16 = " + Calc.sub(30, 16));
        System.out.println("20 * 56 = " + Calc.mult(20, 56));
        System.out.println("20 / 0 = " + Calc.div(20, 0));            
    }    
}
