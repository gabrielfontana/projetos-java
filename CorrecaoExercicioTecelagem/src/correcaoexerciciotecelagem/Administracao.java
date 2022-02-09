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
public class Administracao extends Funcionario {
    //Atributos
    private int faltas;

    //Construtor
    public Administracao(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        faltas = 0;
    }
    
    //Getters
    public int getFaltas() {
        return faltas;
    }
    
    //Métodos
    public void registrarFalta() {
        faltas++;
    }
    
    public double descontoFaltas() {
        return (getSalBase() / 30) * faltas;
    }

    @Override
    public double salarioLiquido() {
        return getSalBase() - descontoFaltas();
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.print(
            "Quantidade de faltas: " + faltas +
            "\nDesconto por faltas: "
        );
        System.out.format("%.2f\n", descontoFaltas());
    }

    @Override
    public void novoMes() {
        faltas = 0;
    }
} //Administracao
