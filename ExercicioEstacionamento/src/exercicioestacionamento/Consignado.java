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
public class Consignado extends Carro {
    private final String nome_proprietario;
    private final double valor_desejado;

    public Consignado(int codigo, String placa, String ano_fabricacao, String modelo_carro, String nome_proprietario, double valor_desejado ) {
        super(codigo, placa, ano_fabricacao, modelo_carro);
        this.nome_proprietario = nome_proprietario;
        this.valor_desejado = valor_desejado;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(
            "Nome do proprietário: " + nome_proprietario + 
            "\nValor desejado: " + valor_desejado
        );
    }    

    @Override
    public boolean oferta(double valor) {
        return (valor >= (valor_desejado * 0.05) + valor_desejado);
    }
}
