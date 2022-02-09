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
public class P2Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaImoveis lista = new ListaImoveis(10);
        Comercial c1, c2;
        Residencial r1, r2, r3;

        try {
            c1 = new Comercial(1, "Rua 1", 33861510, "José", "Escritório");
            c2 = new Comercial(2, "Rua 2", 14588710, "Fernando", "Loja");
            r1 = new Residencial(3, "Rua 3", 69557145, "Ana", 1, 2);
            r2 = new Residencial(4, "Rua 4", 97713753, "Patricia", 3, 1);
            r3 = new Residencial(5, "Rua 5", 58741452, "Luis", 3, 1);

            lista.cadastrarImovel(c1);
            lista.cadastrarImovel(c2);
            lista.cadastrarImovel(r1);
            lista.cadastrarImovel(r2);
            lista.cadastrarImovel(r3);

            lista.alugarImovel(2, "Kaio");
            lista.alugarImovel(3, "Luana");
            lista.venderImovel(3, "Luana");
            lista.venderImovel(4, "Carlos");

            lista.listarImoveis("DISPONÍVEL ALUGUEL", true, false);
            System.out.println("\n----------------------------------------\n");
            lista.listarImoveis("RESIDENCIAIS", false, true);
            System.out.println("\n----------------------------------------\n");
            lista.listarImoveis("TODOS", false, false);
            System.out.println("\n----------------------------------------\n");

        } catch (ListIsFullException e) {
            System.out.println("ListIsFullException: " + e);
        } catch (RepeatedCodeException e) {
            System.out.println("RepeatedCodeException: " + e);
        } catch (NonExistentCodeException e) {
            System.out.println("NonExistentCodeException: " + e);
        } catch (RentalUnavailability e) {
            System.out.println("RentalUnavailability: " + e);
        } catch (ComercialTypeException e) {
            System.out.println("ComercialTypeException: " + e);
        } catch (AlreadySoldException e) {
            System.out.println("AlreadySoldException: " + e);
        }
    }
}
