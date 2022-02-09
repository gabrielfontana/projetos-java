/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexerciciotecelagem;

/**
 *
 * @author gabri
 */
public class CorrecaoExercicioTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nCLASSE Administracao");
        Administracao adm = new Administracao("José", "15.810.230-7", 10000);
        adm.hollerith();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.hollerith();
        
        System.out.println("\nCLASSE Vendas");
        Vendas vd = new Vendas("Matheus", "23.111.441-8", 1000);
        vd.hollerith();
        vd.registrarVenda(120000);
        vd.hollerith();
        
        System.out.println("\nCLASSE Producao");
        Producao prd = new Producao("Maria", "88.974.155-2", 50);
        prd.hollerith();
        prd.registrarHorasDiurnas(100);
        prd.registrarHorasNoturnas(100);
        prd.hollerith();
    }    
}
