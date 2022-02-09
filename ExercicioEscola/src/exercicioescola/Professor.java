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
public class Professor extends Funcionario{
    protected String area_atuacao;
    
    public Professor() {
        super();
        area_atuacao = null;
    }
    
    //Construtores
    public Professor(String nome, String rg, double salario_hora, int qtd_horas_mes, String area_atuacao) {    
        super(nome, rg, salario_hora, qtd_horas_mes);
        if(!area_atuacao.equals("")) {
            if(area_atuacao.equals("Humanas") || area_atuacao.equals("Exatas") || area_atuacao.equals("Biológicas")){
                this.area_atuacao = area_atuacao;
            }            
        }        
    }

    //Getters
    public String getArea_atuacao() {
        return area_atuacao;
    }
    
    //Setters
    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }
    
    //Métodos
    @Override
    public String toString() {
        return super.toString() + "\nÁrea de atuação: " + area_atuacao;
    }
}
