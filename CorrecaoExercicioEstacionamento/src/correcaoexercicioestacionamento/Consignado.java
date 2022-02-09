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
public class Consignado extends Carro {
    private String nomeProprietario;
    private double valorDesejado;

    public Consignado(int cod, String placa, String modelo, int ano, String nomeProprietario, double valorDesejado) {
        super(cod, placa, modelo, ano);
        this.nomeProprietario = nomeProprietario;
        this.valorDesejado = valorDesejado;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(
            "Nome do proprietário: " + nomeProprietario + 
            "\nValor desejado: " + valorDesejado
        );
    }  
    
    @Override
    public boolean oferta(double valor) {
        return valor >= valorDesejado * 1.05;
    }    
}
