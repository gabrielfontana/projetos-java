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
public class Producao extends Funcionario {

    private int horasDiurnas;
    private int horasNoturnas;

    public Producao(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }

    public int getHorasDiurnas() {
        return horasDiurnas;
    }

    public int getHorasNoturnas() {
        return horasNoturnas;
    }

    public void registrarHorasDiurnas(int horas) {
        horasDiurnas += horas;
    }

    public void registrarHorasNoturnas(int horas) {
        horasNoturnas += horas;
    }

    public double valorHorasDiurnas() {
        return horasDiurnas * getSalBase();
    }

    public double valorHorasNoturnas() {
        return horasDiurnas * (getSalBase() * 1.3);
    }

    @Override
    public double salarioLiquido() {
        return valorHorasDiurnas() + valorHorasNoturnas();
    }

    @Override
    public void novoMes() {
        horasDiurnas = 0;
        horasNoturnas = 0;
    }

    @Override
    public void hollerith() {
        System.out.println(
                "\nNome: " + getNome()
                + "\nRG: " + getRg()
                + "\nSalário base: " + getSalBase()
                + "\nHoras diurnas: " + horasDiurnas
                + "\nValor horas diurnas: " + valorHorasDiurnas()
                + "\nHoras noturnas: " + horasNoturnas
                + "\nValor horas noturnas: " + valorHorasNoturnas()
                + "\nSalário líquido: " + salarioLiquido()
        );
    }
}
