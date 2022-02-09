/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author gabri
 */
public class Triangulo {
    private Ponto va;
    private Ponto vb;
    private Ponto vc;
    
    //Construtor padrão
    public Triangulo(){
        va = new Ponto(0, 0);
        vb = new Ponto(1, 0);
        vc = new Ponto(0, 1);
    }
    
    //Construtor parametrizado
    public Triangulo(double x_va, double y_va, double x_vb, double y_vb, double x_vc, double y_vc) {
        va = new Ponto(x_va, y_va);
        vb = new Ponto(x_vb, y_vb);
        vc = new Ponto(x_vc, y_vc);
    }
    
    //Construtor de cópia
    public Triangulo(Triangulo tr){
        va = new Ponto(tr.va);
        vb = new Ponto(tr.vb);
        vc = new Ponto(tr.vc);
    }
    
    //Métodos
    public double lengthA(){
        BigDecimal length = new BigDecimal(vb.distance(vc)).setScale(2, RoundingMode.HALF_EVEN);
        return length.doubleValue();
    }
    
    public double lengthB(){
        BigDecimal length = new BigDecimal(vc.distance(va)).setScale(2, RoundingMode.HALF_EVEN);
        return length.doubleValue();
    }
    
    public double lengthC(){
        BigDecimal length = new BigDecimal(va.distance(vb)).setScale(2, RoundingMode.HALF_EVEN);
        return length.doubleValue();
    }
    
    public boolean equilateral(){
        return lengthA() == lengthB() && lengthA() == lengthC();
    }
    
    public double perimeter(){
        return lengthA() + lengthB() + lengthC();
    }
    
    public double area(){
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - lengthA()) * (p - lengthB()) * (p - lengthC()));
    }
    
    public boolean isValid(){ 
        return (va != null) && (vb != null) && (vc != null) &&
               (lengthA() > 0) && (lengthB() > 0) && (lengthC() > 0) &&
               (lengthA() < lengthB() + lengthC()) &&
               (lengthB() < lengthA() + lengthC()) &&
               (lengthC() < lengthA() + lengthB());
        
        //if(va == null || vb == null || vc == null) return false;
        //if(lengthA() <= 0 || lengthB() <= 0 || lengthC() <= 0) return false;
        //if(lengthA() > lengthB() + lengthC() || lengthB() > lengthA() + lengthC() || lengthC() > lengthA() + lengthB()) return false;
        //return true;
    }
    
    public Ponto gravCenter(){
        double xm = (va.getX() + vb.getX() + vc.getX()) / 3;
        double ym = (va.getY() + vb.getY() + vc.getY()) / 3;
        return new Ponto(xm, ym);
    }
    
    @Override
    public String toString(){
        return "[" + va.toString() + ", " + vb.toString() + ", " + vc.toString() + "]"; 
    }
    
    public void print(){        
        System.out.println(toString());
    }
    
    public void print(String caption){
        System.out.println(caption + toString());
    }
    
    //Getters
    public Ponto getVa() {
        return new Ponto(va);
    }

    public Ponto getVb() {
        return new Ponto(vb);
    }

    public Ponto getVc() {
        return new Ponto(vc);
    }
    
    //Setters  
    public void setVa(Ponto va) {
        this.va = new Ponto(va);
    }

    public void setVb(Ponto vb) {
        this.vb = new Ponto(vb);
    }

    public void setVc(Ponto vc) {
        this.vc = new Ponto(vc);
    }
}
