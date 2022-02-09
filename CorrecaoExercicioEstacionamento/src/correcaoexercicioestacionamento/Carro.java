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
public abstract class Carro {
    private int cod;
    private String placa, modelo;
    private int ano;
    private boolean disp;
    private String vendedor;

    //Construtor
    public Carro(int cod, String placa, String modelo, int ano) {
        this.cod = cod;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        disp = true;
        vendedor = "";
    }    

    //Getters
    public int getCod() {
        return cod;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
    //Setters
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Métodos
    public boolean disponivel() {
        return disp;
    }
    
    public void imprimeDados() {
        System.out.println(
            "\nCódigo: " + cod +
            "\nPlaca: " + placa + 
            "\nAno de fabricação: " + ano + 
            "\nModelo do carro: " + modelo +
            "\nDisponível para venda: " + (disp ? "Sim" : "Não")
        );
        if(!disp) {
            System.out.println("Vendedor: " + vendedor);
        }
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda) {
        if(!disp) {
            return false;
        }
        if(!oferta(valorVenda)) {
            return false;
        }
        
        disp = false;
        this.vendedor = vendedor;
        return true;
    }
}
