/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotecelagem;

/**
 *
 * @author gabri
 */
public class ExercicioTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CLASSE Administracao");
        Administracao a1 = new Administracao("Marcos Silva", "15.511.120-3", 3000);        
        
        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        
        a1.novoMes();
        a1.hollerith();

        System.out.println("\nCLASSE Producao");
        Producao p1 = new Producao("Ana Carolina", "12.907.761-6", 50);
        
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        p1.novoMes();
        p1.hollerith();
        
        System.out.println("\nCLASSE Vendedor");
        Vendedor v1 = new Vendedor("João Oliveira", "48.539.325-6", 2000);
        
        v1.registrarVenda(10000);
        v1.registrarVenda(10000);
        v1.hollerith();
        
        v1.novoMes();
        v1.hollerith();
    }
}
