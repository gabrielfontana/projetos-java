/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno_v2;

/**
 *
 * @author gabri
 */
public class Aluno{
    private String nome, ra;
    private double media;
    private int faltas;
    
    //Construtor
    public Aluno(String nome, String ra){
        setNome(nome);
        setRa(ra);
        media = 0;
        faltas = 0;
    }
    
    //Getters
    public String getNome(){
        return nome;
    }

    public String getRa(){
        return ra;
    }

    public double getMedia(){
        return media;
    }

    public int getFaltas(){
        return faltas;
    }
        
    //Setters
    public final void setNome(String nome){
        if(!nome.isEmpty()) this.nome = nome;
    }
    
    public final void setRa(String ra){
        if(!ra.isEmpty()) this.ra = ra;
    }
    
    public void setMedia(double media){
        if(media >= 0 && media <= 10) this.media = media;
    }
    
    public void setFaltas(int faltas){
        if(faltas >= 0) this.faltas = faltas;
    }
    
    //Métodos
    public void aprovacao(){
        if(media >= 6 && faltas <= 20)
            System.out.println("Resultado: Aprovado");
        else
            System.out.println("Resultado: Reprovado");        
    }
    
    public void print(){
        System.out.println(
                "\n" + "Nome: " + nome + 
                "\n" + "RA: " + ra + 
                "\n" + "Media: " + media + 
                "\n" + "Faltas: " + faltas
        );
        aprovacao();
    }        
}
