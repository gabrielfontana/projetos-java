/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioescola;

/**
 *
 * @author gabri
 */
public class Funcionario extends Pessoa{
    protected double salario_hora;
    protected int qtd_horas_mes;
    
    //Construtores
    public Funcionario() {
        super();
        salario_hora = 0.0;
        qtd_horas_mes = 0;
    }
    
    public Funcionario(String nome, String rg, double salario_hora, int qtd_horas_mes) {
        super(nome, rg);
        this.salario_hora = salario_hora;
        this.qtd_horas_mes = qtd_horas_mes;
    }
    
    //Getters
    public double getSalario_hora() {
        return salario_hora;
    }

    public int getQtd_horas_mes() {
        return qtd_horas_mes;
    }
        
    //Setters
    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    public void setQtd_horas_mes(int qtd_horas_mes) {
        this.qtd_horas_mes = qtd_horas_mes;
    }
    
    //Métodos 
    @Override
    public String toString() {
        return super.toString() + "\nSalário hora: " + salario_hora + "\nQuantidade de horas por mês: " + qtd_horas_mes;
    }
}
