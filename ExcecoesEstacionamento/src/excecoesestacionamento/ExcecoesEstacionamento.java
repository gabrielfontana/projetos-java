/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoesestacionamento;

/**
 *
 * @author gabri
 */
public class ExcecoesEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis precisam ser declaradas fora do bloco try
        //Variáveis só existem dentro do bloco onde foram declaradas
        Proprio p1, p2;
        Consignado c1, c2;
        ListaCarros lc = new ListaCarros(5);

        try {
            p1 = new Proprio(1, "ABC-1234", "Fiat 147", 1990, 5000, "01/03/2021");
            p2 = new Proprio(2, "GHB-1344", "Siena", 2010, 15000, "01/05/2021");
            c1 = new Consignado(3, "GRT-5477", "HB20", 2018, "José", 40000);
            c2 = new Consignado(4, "FSQ-987", "Renegade", 2020, "João", 70000);

            lc.add(p1);
            lc.add(p2);
            lc.add(c1);
            lc.add(c2);

            //lc.venderCarro(1, "Joca", -10000);
            lc.venderCarro(2, "Zeca", 90000);

            lc.listagem("Lista geral", true, true);
            //lc.listagem("Carros disponíveis", false, true);
            //lc.listagem("Carros vendidos", false, false);
        } catch (ListaLotadaException | CodigoRepetidoException | PlacaEmBrancoException | OfertaNegativaException exc) {
            System.out.println(exc);
        }
    }
}
