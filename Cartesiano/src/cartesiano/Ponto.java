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
public class Ponto {
    private double x; 
    private double y;
    
    //Construtores
    //Construtor padrão
    public Ponto(){
        x = 0;
        y = 0;
    }
    
    //Construtor parametrizado
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Construtor de cópia
    public Ponto(Ponto pt){
        this(pt.x, pt.y);
    }
        
    //Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
        
    //Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Métodos
    public void setXY(double newX, double newY){
        x = newX;
        y = newY;
    }
    
    public void assign(Ponto pt){
        x = pt.x;
        y = pt.y;
    }
    
    public double deltaX(double vX){
        return vX - x;
    }
    
    public double deltaY(double vY){
        return vY - y;
    }
           
    public void desloc(double dX, double dY){
        x += dX;
        y += dY;
    }
    
    public void escale(double factor){
        x *= factor;
        y *= factor;
    }
    
    public double distance(double posX, double posY){       
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double distance(Ponto pt){
        return distance(pt.x, pt.y);
    }
    
    public double distance(){
        return distance(0, 0);
    }
    
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")"; 
    }
    
    public void print(){
        System.out.println(toString());
    }
    
    public void print(String caption){
        System.out.print(caption);
        print();
    }
}
