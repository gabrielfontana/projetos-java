/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

/**
 *
 * @author gabri
 */
public class ExercicioEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nCARRO PRÓPRIO");
        Proprio proprio1 = new Proprio(1, "NAX-1296", "2020", "Honda Civic", 104000, "2021");        
        
        proprio1.imprimeDados();        
        System.out.println("\nDisponibilidade: " + proprio1.disponivel());        
        System.out.println("\nOferta: " + proprio1.oferta(95000));        
        System.out.println("\nVender carro: " + proprio1.venderCarro("Thiago Oliveira", 95000));        
        proprio1.imprimeDados();
        
        System.out.println("\nCARRO CONSIGNADO");
        Consignado consignado1 = new Consignado(2, "GDS-8741", "2014", "Chevrolet Cruze", "João da Silva", 45900);
        
        consignado1.imprimeDados();
        System.out.println("\nDisponibilidade: " + consignado1.disponivel());
        System.out.println("\nOferta: " + consignado1.oferta(75000));
        System.out.println("\nVender carro: " + consignado1.venderCarro("Paulo Amaral", 75000));
        consignado1.imprimeDados();
    }
    
}
