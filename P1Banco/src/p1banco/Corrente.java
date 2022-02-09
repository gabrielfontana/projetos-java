/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1banco;

/**
 *
 * @author Gabriel Fontana Junqueira Araújo - RA: 0040482011019
 */
public class Corrente extends Conta{
    //Atributos
    private double limiteCheque;
    private double acumuladorJuros;

    //Construtor
    public Corrente(String cpf, double saldo) {
        super(cpf, saldo);
        limiteCheque = 1000;
        acumuladorJuros = 0;
    }
    
    //Getters
    public double getLimiteCheque() {
        return limiteCheque;
    }

    public double getAcumuladorJuros() {
        return acumuladorJuros;
    }        
    
    //Métodos
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limiteCheque) {
            saldo -= valor;
            saques += valor;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void atualizar(double taxa) {
        if (saldo < 0){
            double calcTaxa = saldo * (taxa / 100);
            acumuladorJuros -= calcTaxa;
        }
    }

    @Override
    public void fecharMes() {
        saldo -= acumuladorJuros;
        acumuladorJuros = 0;
        saques = 0;
        depositos = 0;
    }
    
    public void alterarLimiteChequeEspecial(double valor) {
       limiteCheque = valor;
    }

    @Override
    public void demonstrativo() {
        System.out.println(
           "\n" + "Tipo de conta: Corrente" +
            "\n" + "CPF: " + cpf +
            "\n" + "Saldo atual: " + saldo +
            "\n" + "Juros acumulados: " + acumuladorJuros +
            "\n" + "Saldo futuro: " + (saldo - acumuladorJuros) +
            "\n" + "Limite de cheque especial: " + limiteCheque +
            "\n" + "Total de depósitos: " + depositos +
            "\n" + "Total de saques: " + saques
        );        
    } 
    
} //Corrente
