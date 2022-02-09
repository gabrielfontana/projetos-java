/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaotecelagemarray;

/**
 *
 * @author gabri
 */
public class RevisaoTecelagemArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("\nCLASSE Administracao");
//        Administracao adm = new Administracao("José", "15.810.230-7", 10000);
//        adm.hollerith();
//        adm.registrarFalta();
//        adm.registrarFalta();
//        adm.hollerith();
//        
//        System.out.println("\nCLASSE Vendas");
//        Vendas vd = new Vendas("Matheus", "23.111.441-8", 1000);
//        vd.hollerith();
//        vd.registrarVenda(120000);
//        vd.hollerith();
//        
//        System.out.println("\nCLASSE Producao");
//        Producao prd = new Producao("Maria", "88.974.155-2", 50);
//        prd.hollerith();
//        prd.registrarHorasDiurnas(100);
//        prd.registrarHorasNoturnas(100);
//        prd.hollerith();

        ListaFuncionario lf = new ListaFuncionario(6);

        Administracao a1 = new Administracao("João", "41.407.232-7", 10000);
        Administracao a2 = new Administracao("Pedro", "10.147.252-3", 12000);

        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();

        Producao p1 = new Producao("José", "35.114.727-5", 50);
        Producao p2 = new Producao("Joca", "45.160.327-8", 60);

        p1.registrarHorasDiurnas(50);
        p1.registrarHorasNoturnas(50);
        p2.registrarHorasDiurnas(25);
        p2.registrarHorasNoturnas(25);

        Vendas v1 = new Vendas("Maria", "15.030.647-7", 1200);
        Vendas v2 = new Vendas("Rita", "31.923.007-7", 1500);

        v1.registrarVenda(7000);
        v2.registrarVenda(3000);

        lf.addFunc(a1);
        lf.addFunc(a2);
        lf.addFunc(p1);
        lf.addFunc(p2);
        lf.addFunc(v1);
        lf.addFunc(v2);

        System.out.println("RELATÓRIO ADMINISTRAÇÃO");
        lf.relatorioAdministracao();
        System.out.println("\n--------------------------------------------------------------------------\n");

        System.out.println("RELATÓRIO VENDAS");
        lf.relatorioVendas();
        System.out.println("\n--------------------------------------------------------------------------\n");

        System.out.println("RELATÓRIO PRODUÇÃO");
        lf.relatorioProducao();
        System.out.println("\n--------------------------------------------------------------------------\n");
    }
}
