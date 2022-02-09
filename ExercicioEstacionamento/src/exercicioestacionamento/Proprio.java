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
public class Proprio extends Carro{
    private final double valor_compra;
    private final String data_compra;

    public Proprio(int codigo, String placa, String ano_fabricacao, String modelo_carro, double valor_compra, String data_compra) {
        super(codigo, placa, ano_fabricacao, modelo_carro);
        this.valor_compra = valor_compra;
        this.data_compra = data_compra;
    }
        
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(
            "Valor da compra: " + valor_compra + 
            "\nData da compra: " + data_compra
        );
    }
    
    @Override
    public boolean oferta(double valor) {
        return (valor >= (valor_compra * 0.10) + valor_compra);
    }
}
