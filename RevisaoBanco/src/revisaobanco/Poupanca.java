/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaobanco;

/**
 *
 * @author gabri
 */
public class Poupanca extends Conta {
    //Atributos
    private double rendimentos;
    
    //Construtor
    public Poupanca(String cpf, double saldo) {
        super(cpf, saldo);
        rendimentos = 0;
    }
    
    //Métodos
    @Override
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        saques += valor;
        return true;
    }

    @Override
    public void atualizar(double taxa) {
        double calcularTaxa = saldo * (taxa / 100);
        rendimentos += calcularTaxa;
    }

    @Override
    public void fecharMes() {
        saldo += rendimentos;
        rendimentos = 0;
        saques = 0;
        depositos = 0;
    }

    @Override
    public void demonstrativo() {
        System.out.println(
                "\n" + "Tipo de conta: Poupança"
                + "\n" + "CPF: " + cpf
                + "\n" + "Saldo atual: " + saldo
                + "\n" + "Rendimentos acumulados: " + rendimentos
                + "\n" + "Saldo futuro: " + (saldo + rendimentos)
                + "\n" + "Total de depósitos: " + depositos
                + "\n" + "Total de saques: " + saques
        );
    }
}
