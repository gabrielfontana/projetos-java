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
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*-----------------------*/
        
        System.out.println("\nClasse Circulo\n");
        
        System.out.println("Construtores");
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3, 5, 2);
        Circulo c3 = new Circulo(c2);
        
        c1.print("c1: ");
        c2.print("c2: ");
        c3.print("c3: ");
        
        System.out.println("\nMétodos");
        c3.assign(c1);
        c3.print("c3 assign c1: ");
        
        c2.escale(2);
        c2.print("c2 escale: ");
        
        System.out.println("c2 is valid?: " + (c2.isValid() ? "sim" : "não"));
        System.out.println("c1 perimeter: " + c1.perimter());
        System.out.println("c1 area: " + c1.area());
        
        /*-----------------------*/
        
        /*System.out.println("\nClasse Triangulo\n");
        
        System.out.println("Construtores");
        Triangulo t1 = new Triangulo(); //construtor padrão
        Triangulo t2 = new Triangulo(1.5, 3.73205080756892, 0.5, 2, 2.5, 2); //construtor parametrizado
        Triangulo t3 = new Triangulo(t1); //construtor de cópia
       
        t1.print("t1: ");
        t2.print("t2: ");
        t3.print("t3: ");

        System.out.println("\nMétodos");
        System.out.println("t2 lengthA: " + t2.lengthA());
        System.out.println("t2 lengthB: " + t2.lengthB());
        System.out.println("t2 lengthC: " + t2.lengthC());
        
        System.out.println("t2 equilateral?: " + (t2.equilateral() ? "sim" : "não"));
        
        System.out.println("t2 perimeter: " + t2.perimeter());
        
        System.out.println("t2 area: " + t2.area());
        
        System.out.println("t2 is valid?: " + (t2.isValid() ? "sim" : "não"));
        
        System.out.println("t2 gravCenter: " + t2.gravCenter());
        
        System.out.println("\nGetter");
        t2.print("t2: ");
        Ponto pg = t2.getVa();
        pg.print();
        pg.escale(2);
        pg.print();
        t2.print("t2: ");
        
        System.out.println("\nSetter");
        Ponto ps = new Ponto(1, 1);
        ps.print("ps: ");
        t2.setVa(ps);
        t2.print("t2: ");
        ps.escale(2);
        ps.print("ps: ");
        t2.print("t2: ");*/
        
        /*-----------------------*/
        
        /*System.out.println("\nClasse Triangulo\n");
        
        System.out.println("Construtores");
        Triangulo t1 = new Triangulo(); //construtor padrão
        Triangulo t2 = new Triangulo(2, 2, 2, 4, 4, 2); //construtor parametrizado
        Triangulo t3 = new Triangulo(t2); //construtor de cópia
       
        t1.print("t1: ");
        t2.print("t2: ");
        t3.print("t3: ");

        System.out.println("\nMétodos");
        System.out.println("t1 lengthA: " + t1.lengthA());
        System.out.println("t1 lengthB: " + t1.lengthB());
        System.out.println("t1 lengthC: " + t1.lengthC());
        
        System.out.println("t1 equilateral?: " + (t1.equilateral() ? "sim" : "não"));
        
        System.out.println("t1 perimeter: " + t1.perimeter());
        
        System.out.println("t1 area: " + t1.area());
        
        System.out.println("t1 is valid?: " + (t1.isValid() ? "sim" : "não"));
        System.out.println("t2 is valid?: " + (t2.isValid() ? "sim" : "não"));
        
        System.out.println("t1 gravCenter: " + t1.gravCenter());
        System.out.println("t2 gravCenter: " + t2.gravCenter());*/
         
        /*-----------------------*/
        
        /*System.out.println("\nClasse Segmento\n");
        
        Segmento s1 = new Segmento();
        Segmento s2 = new Segmento(2, 4, 3, 5);
        Segmento s3 = new Segmento(s2);
        
        s1.print("s1: ");
        s2.print("s2: ");
        s3.print("s3: ");
        
        s3.desloc(1, 2);
        s3.print("s3 desloc: ");
        
        s3.escale(2);
        s3.print("s3 escale: ");
        
        System.out.println("s1 length: " + s1.length());
        
        System.out.println("s2 is valid?: " + (s2.isValid() ? "sim" : "não"));
        
        s3.assign(s2);
        s3.print("s3 assign s2: ");
        
        System.out.println("s1 midpoint: " + s1.midPoint());*/
                
        /*-----------------------*/
        
        /*System.out.println("\nClasse Ponto\n");
        
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(10, 20);
        Ponto p3 = new Ponto(p1);
        
        p1.print("p1: ");
        p2.print("p2: ");
        p3.print("p3: ");
        
        p3.assign(p1);
        p3.print("p3 assign p1: ");
        
        p3.desloc(3, 4);
        p3.print("p3 desloc: ");
       
        p3.escale(2);
        p3.print("p3 escale: ");
        
        System.out.println("Distância de p2 até (2, 5): " + p2.distance(2, 5));
        
        p3.assign(p2);
        p3.desloc(3, 4);
        System.out.println("Distância de p2 até p3: " + p2.distance(p3));
        
        p3.setXY(3, 4);
        System.out.println("Distância de p3 até (0, 0): " + p3.distance());*/
    }
    
}
