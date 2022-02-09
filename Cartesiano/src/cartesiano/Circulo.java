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
public class Circulo extends Ponto {
    private double raio;

    //Construtor padrão
    public Circulo() {
        super();
        raio = 1;
    }

    //Construtor parametrizado
    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }
    
    //Construtor de cópia
    public Circulo(Circulo c){
        super(c); //Um objeto de uma classe descendente também é instância de todas as suas classes ancestrais
        raio = c.raio;
    }
    
    //Métodos
    public void assign(Circulo c){
        super.assign(c);
        raio = c.raio;
    }
       
    @Override
    public void escale(double factor){
        super.escale(factor);
        raio *= factor;
    }
    
    //Sobreposição: ocorre quando uma classe descendente reescreve um método que já existe na classe ancestral,
    //usando exatamente a mesma assinatura. Nesse caso, a versão descendente do método se sobrepõe à versão
    //ancestral. Um objeto da classe descendente, ao chamar esse método, irá executar a versão descendente,
    //mesmo que a chamada ocorra na classe ancestral.
    @Override     
    public String toString(){       
       return super.toString() + ":" + raio; 
    }
    
    public boolean isValid(){
        return raio > 0;
    }

    public double perimter(){
        return 2 * Math.PI * raio;
    }

    public double area(){
        return Math.PI * raio * raio;
    }        
}
