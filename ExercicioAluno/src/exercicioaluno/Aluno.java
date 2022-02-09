/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno;

/**
 *
 * @author gabri
 */
public class Aluno{
    private String nome, ra;
    private double media;
    private int faltas;
    
    //Construtor
    public Aluno(String vNome, String vRa){
        setNome(vNome);
        setRa(vRa);
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
    public final void setNome(String vNome){
        if(!vNome.isEmpty()) nome = vNome;
    }
    
    public final void setRa(String vRa){
        if(!vRa.isEmpty()) ra = vRa;
    }
    
    public void setMedia(double vMedia){
        if(vMedia >= 0 && vMedia <= 10) media = vMedia;
    }
    
    public void setFaltas(int vFaltas){
        if(vFaltas >= 0) faltas = vFaltas;
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
