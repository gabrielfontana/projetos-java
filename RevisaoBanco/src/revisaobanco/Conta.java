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
public abstract class Conta {
    //Atributos
    protected String cpf;
    protected double saldo;
    protected double saques;
    protected double depositos;

    //Construtor
    public Conta(String cpf, double saldo) {
        this.cpf = cpf;
        this.saldo = saldo;
        saques = 0;
        depositos = 0;
    }

    //Métodos    
    public void depositar(double valor) {
        saldo += valor;
        depositos += valor;
    }

    public abstract boolean sacar(double valor);

    public abstract void atualizar(double taxa);

    public abstract void fecharMes();

    public abstract void demonstrativo();
}
