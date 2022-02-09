/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotecelagem;

/**
 *
 * @author gabri
 */
public class Producao extends Funcionario {
    private int horasDiurnas, horasNoturnas;
    
    //Construtor
    public Producao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    //Getters
    public int getHorasDiurnas() {
        return horasDiurnas;
    }

    public int getHorasNoturnas() {
        return horasNoturnas;
    }
    
    //Setters
    public void setHorasDiurnas(int horasDiurnas) {
        this.horasDiurnas = horasDiurnas;
    }

    public void setHorasNoturnas(int horasNoturnas) {
        this.horasNoturnas = horasNoturnas;
    }
        
    //Métodos
    public void registrarHorasDiurnas(int horas) {
        horasDiurnas += horas;
    }
    
    public void registrarHorasNoturnas(int horas) {
        horasNoturnas += horas;
    }
    
    @Override
    public double salarioLiquido() {
        double valorHorasDiurnas = salarioBase * horasDiurnas;
        double valorHorasNoturnas = salarioBase * 1.3 * horasNoturnas;
        return valorHorasDiurnas + valorHorasNoturnas;
    }
   
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Valor horas diurnas: " + salarioBase * horasDiurnas +
            "\nValor horas noturnas: " + salarioBase * 1.3 * horasNoturnas +
            "\nSalário líquido: " + salarioLiquido()
        );
        
    }

    @Override
    public void novoMes() {
        horasDiurnas = 0;
        horasNoturnas = 0;
    }    
}
