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
public class ListaFuncionario {

    private Funcionario[] lista;
    private int count;

    public ListaFuncionario(int capMax) {
        lista = new Funcionario[capMax];
        count = 0;
    }

    public boolean addFunc(Funcionario f) {
        if (count >= lista.length) {
            return false;
        }
        lista[count] = f;
        count++;
        return true;
    }

    public void relatorioAdministracao() {
        double acumuladorSalario = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Administracao) {
                lista[i].hollerith();
                acumuladorSalario += lista[i].salarioLiquido();
            }
        }
        System.out.println("\nTOTAL DE SALÁRIOS DOS FUNCIONÁRIOS: " + acumuladorSalario);
    }

    public void relatorioVendas() {
        double acumuladorVendas = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Vendas) {
                lista[i].hollerith();
                Vendas v = (Vendas) lista[i];
                acumuladorVendas += v.getTotVendas();
            }
        }
        System.out.println("\nTOTAL DE VENDAS DOS FUNCIONÁRIOS: " + acumuladorVendas);
    }

    public void relatorioProducao() {
        int acumuladorHorasDiurnas = 0;
        int acumuladorHorasNoturnas = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Producao) {
                lista[i].hollerith();
                Producao p = (Producao) lista[i];
                acumuladorHorasDiurnas += p.getHorasDiurnas();
                acumuladorHorasNoturnas += p.getHorasNoturnas();
            }
        }
        System.out.println(
                "\nTOTAL DE HORAS DIURNAS DOS FUNCIONÁRIOS: " + acumuladorHorasDiurnas
                + "\nTOTAL DE HORAS NOTURNAS DOS FUNCIONÁRIOS: " + acumuladorHorasNoturnas
        );
    }
}
