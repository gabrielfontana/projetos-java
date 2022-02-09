/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

/**
 *
 * @author gabri
 */
public abstract class Carro {
    protected int codigo;
    protected String placa, ano_fabricacao, modelo_carro, vendedor;
    protected boolean disponibilidade;

    public Carro(int codigo, String placa, String ano_fabricacao, String modelo_carro) {
        this.codigo = codigo;
        this.placa = placa;
        this.ano_fabricacao = ano_fabricacao;
        this.modelo_carro = modelo_carro;
        this.vendedor = "";
        this.disponibilidade = true;
    }

    public boolean disponivel(){
        return disponibilidade == true;
    }
    
    public void imprimeDados(){
        System.out.println(
            "\nCódigo: " + codigo +
            "\nPlaca: " + placa + 
            "\nAno de fabricação: " + ano_fabricacao + 
            "\nModelo do carro: " + modelo_carro +
            "\nDisponibilidade: " + disponibilidade
        );
        if(disponibilidade == false){
            System.out.println("Vendedor: " + vendedor);
        }
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda){
        if(disponibilidade == false || oferta(valorVenda) == false){
            return false;
        }
        else{
            disponibilidade = false;
            this.vendedor = vendedor;
            return true;
        }
    }
}
