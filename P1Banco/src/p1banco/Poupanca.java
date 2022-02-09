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
public class Poupanca extends Conta{
    //Atributos
    private double acumuladorRendimentos;
    
    //Construtor
    public Poupanca(String cpf, double saldo) {
        super(cpf, saldo);
        acumuladorRendimentos = 0;
    }
    
    //Getters
    public double getAcumuladorRendimentos() {
        return acumuladorRendimentos;
    }
 
    //Métodos
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
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
        double calcTaxa = saldo * (taxa / 100);
        acumuladorRendimentos += calcTaxa;
    }

    @Override
    public void fecharMes() {
        saldo += acumuladorRendimentos;
        acumuladorRendimentos = 0;
        saques = 0;
        depositos = 0;
    }

    @Override
    public void demonstrativo() {
        System.out.println(
            "\n" + "Tipo de conta: Poupança" +
            "\n" + "CPF: " + cpf +            
            "\n" + "Saldo atual: " + saldo +
            "\n" + "Rendimentos acumulados: " + acumuladorRendimentos +
            "\n" + "Saldo futuro: " + (saldo + acumuladorRendimentos) +
            "\n" + "Total de depósitos: " + depositos +
            "\n" + "Total de saques: " + saques               
        );
    }  
    
} //Corrente
