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
public class Producao extends Funcionario {   
    //Atributos
    private int horasDn;
    private int horasNt;
    
    //Construtor
    public Producao(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        horasDn = 0;
        horasNt = 0;
    }
   
    //Getters
    public int getHorasDn() {
        return horasDn;
    }

    public int getHorasNt() {
        return horasNt;
    }
        
    //Métodos
    public void registrarHorasDiurnas(int horas) {
        horasDn += horas;
    }
    
    public void registrarHorasNoturnas(int horas) {
        horasNt += horas;
    }
    
    public double valorHorasDn() {
        return horasDn * getSalBase();
    }
    
    public double valorHorasNt() {
        return horasNt * (getSalBase() * 1.3);
    }
    
    @Override
    public double salarioLiquido() {
        return valorHorasDn() + valorHorasNt();
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Valor para horas diurnas: " + valorHorasDn() +
            "\nValor para horas noturnas: " + valorHorasNt()
        );
    }

    @Override
    public void novoMes() {
        horasDn = 0;
        horasNt = 0;
    }
} //Producao
