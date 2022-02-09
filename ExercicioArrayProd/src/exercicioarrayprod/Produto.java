/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarrayprod;

/**
 *
 * @author gabri
 */
public class Produto {
    //Atributos
    private int codigo;
    private String descricao;
    private double peso;
    private int quantidade;
    
    //Construtor
    public Produto(int codigo, String descricao, double peso, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
    }
    
    //Getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Métodos
    public void acrescentar(int qtd) {
        quantidade += qtd;
    }
    
    public boolean retirar(int qtd) {
        if(qtd > quantidade) {
            return false;
        }
        else {
            quantidade -= qtd;
            return true;
        }
    }

    public void imprimir() {
        System.out.println(
            "Código: " + codigo + "\n" +
            "Descrição: " + descricao + "\n" +
            "Peso Unitário: " + peso + "\n" + 
            "Quantidade: " + quantidade + "\n" + 
            "Peso Total: " + peso * quantidade + "\n"
        );
    }
}
