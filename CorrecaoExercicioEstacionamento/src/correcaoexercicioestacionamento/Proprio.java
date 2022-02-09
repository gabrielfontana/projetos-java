/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoexercicioestacionamento;

/**
 *
 * @author gabri
 */
public class Proprio extends Carro {
    private double valorCompra;
    private String dataCompra;

    //Construtor
    public Proprio(int cod, String placa, String modelo, int ano, double valorCompra, String dataCompra) {
        super(cod, placa, modelo, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }
    
    //Getters
    public double getValorCompra() {
        return valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }
    
    //Setters
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    //Métodos    
    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(
            "Valor da compra: " + valorCompra + 
            "\nData da compra: " + dataCompra
        );
    }
    
    @Override
    public boolean oferta(double valor) {
        return valor >= valorCompra * 1.1;
    }    
}
