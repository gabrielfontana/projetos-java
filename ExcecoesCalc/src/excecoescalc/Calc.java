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
public class Calc {
    public static int sum(int op1, int op2) {
        return op1 + op2;
    }

    public static int sub(int op1, int op2) {
        return op1 - op2;
    }

    public static int mult(int op1, int op2) {
        return op1 * op2;
    }

    public static int div(int op1, int op2) {      
        int result = 0;        
        try{
            result = op1 / op2;
        }
        catch(ArithmeticException exc){
            System.out.println("Não é possível dividir por 0");
        }
        return result;
    }
}
