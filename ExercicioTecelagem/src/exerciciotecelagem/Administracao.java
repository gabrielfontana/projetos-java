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
public class Administracao extends Funcionario {
    private int faltas;
    
    //Construtor
    public Administracao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;       
    }
    
    //Getters
    public int getFaltas() {
        return faltas;
    }
    
    //Setters
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
        
    //Métodos
    public void registrarFalta( ) {
        faltas++;
    }

    @Override
    public double salarioLiquido() {
        return salarioBase - (faltas * (salarioBase / 30));
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println(
            "Desconto: " + (faltas * (salarioBase / 30)) + 
            "\nSalário líquido: " + salarioLiquido()
        );
    }

    @Override
    public void novoMes() {
        faltas = 0;
    }    
}
