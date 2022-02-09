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
public class Corrente extends Conta {
    //Atributos
    private double limiteCheque;
    private double juros;

    //Construtor
    public Corrente(String cpf, double saldo, double limiteCheque) {
        super(cpf, saldo);
        this.limiteCheque = limiteCheque;
        juros = 0;
    }
    
    //Setters
    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
    
    //Métodos
    @Override
    public boolean sacar(double valor) {
        if (valor > saldo + limiteCheque) {
            return false;
        }
        saldo -= valor;
        saques += valor;
        return true;
    }

    @Override
    public void atualizar(double taxa) {
        if (saldo < 0) {
            double calcularTaxa = saldo * (taxa / 100);
            juros += calcularTaxa;
        }
    }

    @Override
    public void fecharMes() {
        saldo += juros;
        juros = 0;
        saques = 0;
        depositos = 0;
    }

    @Override
    public void demonstrativo() {
        System.out.println(
                "\n" + "Tipo de conta: Corrente"
                + "\n" + "CPF: " + cpf
                + "\n" + "Saldo atual: " + saldo
                + "\n" + "Juros acumulados: " + juros
                + "\n" + "Saldo futuro: " + (saldo + juros)
                + "\n" + "Limite de cheque especial: " + limiteCheque
                + "\n" + "Total de depósitos: " + depositos
                + "\n" + "Total de saques: " + saques
        );
    }
}
