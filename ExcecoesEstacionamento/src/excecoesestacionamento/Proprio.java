/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoesestacionamento;

/**
 *
 * @author gabri
 */
public class Proprio extends Carro {

    private double valorCompra;
    private String dataCompra;

    //Construtor
    public Proprio(int cod, String placa, String modelo, int ano, double valorCompra, String dataCompra) throws PlacaEmBrancoException {
        super(cod, placa, modelo, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    //Métodos    
    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(
                "Valor da compra: " + valorCompra
                + "\nData da compra: " + dataCompra
        );
    }

    @Override
    public boolean oferta(double valor) throws OfertaNegativaException {
        if (valor < 0) {
            throw new OfertaNegativaException();
        }

        return valor >= valorCompra * 1.1;
    }
}
