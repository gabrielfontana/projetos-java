/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoexcecoesestacionamento;

/**
 *
 * @author gabri
 */
public class Proprio extends Carro {

    private double valorCompra;
    private String dataCompra;

    public Proprio(int cod, String placa, int ano, String modelo, double valorCompra, String dataCompra) throws EmptyLicensePlateException {
        super(cod, placa, ano, modelo);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(
                "Valor de compra: " + valorCompra + "\n"
                + "Data de compra: " + dataCompra + "\n"
        );
    }

    @Override
    public boolean oferta(double valor) {
        return valor >= valorCompra * 1.1;
    }
}
