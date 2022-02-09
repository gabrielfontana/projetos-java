/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaobanco;

/**
 *
 * @author gabri
 */
public class RevisaoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CLASSE Poupanca");

        Poupanca p1 = new Poupanca("113.301.485-90", 700);
        p1.sacar(2500);
        p1.sacar(500);
        p1.depositar(1300);
        p1.atualizar(10);
        p1.demonstrativo();
        p1.fecharMes();
        p1.demonstrativo();

        System.out.println("\nCLASSE Corrente");

        Corrente c1 = new Corrente("400.817.910-50", 1000, 500);
        c1.sacar(1600);
        c1.sacar(1500);
        c1.depositar(200);
        c1.atualizar(20);
        c1.demonstrativo();
        c1.fecharMes();
        c1.setLimiteCheque(550);
        c1.depositar(500);
        c1.atualizar(10);
        c1.demonstrativo();
    }
}
