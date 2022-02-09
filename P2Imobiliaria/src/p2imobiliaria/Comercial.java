/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2imobiliaria;

/**
 *
 * @author gabri
 */
//Gabriel Fontana Junqueira Araújo - RA: 0040482011019
public class Comercial extends Imovel {

    private String tipoComercio;

    public Comercial(int codigo, String endereco, int cep, String nomeProp, String tipoComercio) {
        super(codigo, endereco, cep, nomeProp);
        this.tipoComercio = tipoComercio;
    }

    public String getTipoComercio() {
        return tipoComercio;
    }

    public void setTipoComercio(String tipoComercio) {
        this.tipoComercio = tipoComercio;
    }

    @Override
    public void imprimir() {
        System.out.println(
                "\nCódigo:" + getCodigo()
                + "\nEndereço: " + getEndereco()
                + "\nCEP: " + getCep()
                + "\nNome do proprietário: " + getNomeProp()
                + "\nDisponibilidade de aluguel: " + (isDispAluguel() ? "Sim" : "Não")
                + "\nDisponibilidade para venda: Não"
                + "\nTipo de comércio: " + tipoComercio
        );
        if(!(isDispAluguel())) {
            System.out.println("Corretor: " + getCorretor());
        }
    }
}
