/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoexcecoesestacionamento;

/**
 *
 * @author gabri
 */
public class RevisaoExcecoesEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprio p1, p2;
        Consignado c1, c2;
        ListaCarros lc = new ListaCarros(5);

        try {
            p1 = new Proprio(1, "acb 1234", 1990, "Fiat 147", 5000, "01/03/2021");
            p2 = new Proprio(2, "ghb 1344", 2010, "Siena", 15000, "01/05/2021");
            c1 = new Consignado(3, "sje 2933", 2018, "HB20", "José", 40000);
            c2 = new Consignado(4, "rew 2233", 2020, "Renegade", "João", 70000);

            lc.add(p1);
            lc.add(p2);
            lc.add(c1);
            lc.add(c2);

            lc.venderCarro(1, "Joca", 10000);
            lc.venderCarro(4, "Zeca", 90000);
            
            //lc.listagem("LISTA GERAL\n", true, true);
            //lc.listagem("CARROS DISPONÍVEIS\n", false, true);
            //lc.listagem("CARROS VENDIDOS\n", false, false);
        } catch (ListIsFullException e) {
            System.out.println("ListIsFullException: " + e);
        } catch (RepeatedCodeException e) {
            System.out.println("RepeatedCodeException: " + e);
        } catch (EmptyLicensePlateException e) {
            System.out.println("EmptyLicensePlateException: " + e);
        } catch (NegativeOfferException e) {
            System.out.println("NegativeOfferException: " + e);
        }
    }
}
