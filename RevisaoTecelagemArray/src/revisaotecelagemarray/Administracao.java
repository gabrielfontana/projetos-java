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
public class Administracao extends Funcionario {

    private int faltas;

    public Administracao(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        faltas = 0;
    }

    public int getFaltas() {
        return faltas;
    }

    public void registrarFalta() {
        faltas++;
    }

    private double desconto() {
        return (getSalBase() / 30) * faltas;
    }

    @Override
    public double salarioLiquido() {
        return getSalBase() - desconto();
    }

    @Override
    public void novoMes() {
        faltas = 0;
    }

    @Override
    public void hollerith() {
        System.out.println(
                "\nNome: " + getNome()
                + "\nRG: " + getRg()
                + "\nSalário base: " + getSalBase()
                + "\nFaltas: " + faltas
                + "\nDesconto por faltas: " + desconto()
                + "\nSalário líquido: " + salarioLiquido()
        );
    }
}
