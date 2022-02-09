/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexercicioarrayprod;

/**
 *
 * @author gabri
 */
public class Produto {
    //Atributos
    private int cod;
    private String desc;
    private double peso;
    private int qtd;
    
    //Construtor
    public Produto(int cod, String desc, double peso, int qtd) {
        this.cod = cod;
        this.desc = desc;
        this.peso = peso;
        this.qtd = qtd;
    }    
      
    //Getters
    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public double getPeso() {
        return peso;
    }

    public int getQtd() {
        return qtd;
    }
            
    //Setters
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
        
    //Métodos
    public void acrescentar(int qtd) {
        this.qtd += qtd;
    }
    
    public boolean retirar(int qtd) {
        if(qtd > this.qtd) {
            return false;
        }
        this.qtd -= qtd;
        return true;
    }

    public double pesoTotal() {
        return peso * qtd;
    }
    
    //Um método static é um método "de classe" e não "de instância" como todos os
    //outros métodos desta classe. Sendo um método de classe, ele não pode depender
    //de atributos e métodos de instância. Um método static só pode chamar métodos
    //da classe que também sejam static.
    //Métodos static podem ser chamados diretamente a partir da classe sem ser
    //necessário criar objetos.
    public static void cabecalho() {
        System.out.println("Cod\t" + "Peso\t" + "Qtd\t" + "PesoTot\t" + "Desc");
    }
    
    public void imprimir() {
        System.out.println(cod + "\t" + peso + "\t" + qtd + "\t" + pesoTotal() + "\t" + desc);
    }
}
