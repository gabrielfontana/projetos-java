/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author gabri
 */
public class Segmento {
    private Ponto p1;
    private Ponto p2;
    
    //Construtores
    //Construtor padrão
    public Segmento(){
        p1 = new Ponto(0, 0);
        p2 = new Ponto(0, 1);
    }
    
    //Construtor parametrizado
    public Segmento(double x1, double y1, double x2, double y2) {
        p1 = new Ponto(x1, y1);
        p2 = new Ponto(x2, y2);
    }
    
    //Construtor de cópia
    public Segmento(Segmento sg){
        p1 = new Ponto(sg.p1);
        p2 = new Ponto(sg.p2);
    }
    
    //Métodos
    public void assign(Segmento sg){
        p1.assign(sg.p1);
        p2.assign(sg.p2);        
    }
    
    public void desloc(double dX, double dY){
        p1.desloc(dX, dY);
        p2.desloc(dX, dY);
    }
    
    public void escale(double factor){
        p1.escale(factor);
        p2.escale(factor);
    }
    
    @Override
    public String toString(){
        return "[" + p1.toString() + ", " + p2.toString() + "]"; 
    }
    
    public void print(){        
        System.out.println(toString());
    }
    
    public void print(String caption){
        System.out.println(caption + toString());
    }
    
    public double length(){
        return p1.distance(p2);
    }
    
    public boolean isValid(){     
       if(p1 == null || p2 == null) {
           return false;
       }
       if(p1.getX() == p2.getX() && p1.getY() == p2.getY()){
           return false;
       }
       return true;
    }
    
    public Ponto midPoint(){
        double xm = (p1.getX() + p2.getX())/2;
        double ym = (p1.getY() + p2.getY())/2;
        return new Ponto(xm, ym);
    }
}
