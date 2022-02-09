/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioproduto;

/**
 *
 * @author gabri
 */
public class Produto {
    private int codigo, qtd;
    String descricao;
    double peso;
   
    //Construtor parametrizado
    public Produto(int codigo, int qtd, String descricao, double peso) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.descricao = descricao;
        this.peso = peso;
    }
    
    //Construtor de cópia
    public Produto(Produto p){
        this(p.codigo, p.qtd, p.descricao, p.peso); //Chama o construtor parametrizado       
    }
    
   //Getters
   public int getCodigo(){
       return codigo;
   }
   
   public int getQtd(){
       return qtd;
   }
   
   public String getDescricao(){
       return descricao;
   }
   
   public double getPeso(){
       return peso;
   }
   
   //Setters
   public void setCodigo(int codigo){
       this.codigo = codigo;
   }
   
   public void setQtd(int qtd){
       this.qtd = qtd;
   }
   
   public void setDescricao(String descricao){
       this.descricao = descricao;
   }
   
   public void setPeso(double peso){
       this.peso = peso;
   }
    
   //Métodos
   public void print(){
       System.out.println(
            "\n" + "Código: " + codigo + 
            "\n" + "Quantidade: " + qtd + 
            "\n" + "Descrição: " + descricao + 
            "\n" + "Peso: " + peso
       );
   }
   
} //Classe Produto
