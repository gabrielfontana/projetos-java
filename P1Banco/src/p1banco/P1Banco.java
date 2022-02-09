/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1banco;

/**
 *
 * @author Gabriel Fontana Junqueira Araújo - RA: 0040482011019
 */
public class P1Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CLASSE Corrente");
        Corrente cc1 = new Corrente("189.686.180-62", 1000);
        cc1.demonstrativo();
        
        cc1.depositar(3000);
        cc1.demonstrativo();
        
        cc1.sacar(5000);
        cc1.demonstrativo();
        
        cc1.atualizar(10);
        cc1.demonstrativo();
        
        cc1.fecharMes();
        cc1.demonstrativo();
        
        cc1.alterarLimiteChequeEspecial(5000);
        cc1.demonstrativo();
        
        System.out.println("\nCLASSE Poupanca");
        Poupanca cp1 = new Poupanca("488.889.910-00", 1000);
        cp1.demonstrativo();
        
        cp1.depositar(9000);
        cp1.demonstrativo();
        
        cp1.sacar(5000);
        cp1.demonstrativo();
        
        cp1.atualizar(10);
        cp1.demonstrativo();
        
        cp1.fecharMes();
        cp1.demonstrativo();
    }
    
}
