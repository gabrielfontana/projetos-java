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
public class Consignado extends Carro {

    private String nomeProp;
    private double valorProp;

    public Consignado(int cod, String placa, int ano, String modelo, String nomeProp, double valorProp) throws EmptyLicensePlateException {
        super(cod, placa, ano, modelo);
        this.nomeProp = nomeProp;
        this.valorProp = valorProp;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(
                "Nome do proprietário: " + nomeProp + "\n"
                + "Valor p/ o proprietário: " + valorProp + "\n"
        );
    }

    @Override
    public boolean oferta(double valor) {
        return valor >= valorProp * 1.05;
    }
}
