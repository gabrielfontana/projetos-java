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

    //Getters
    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Métodos
    public void depositar(double valor){
        saldo += valor;
        depositos += valor;
    }
    
    public abstract boolean sacar(double valor);
    
    public abstract void atualizar(double taxa);
    
    public abstract void fecharMes();
    
    public abstract void demonstrativo();
    
} //Conta
