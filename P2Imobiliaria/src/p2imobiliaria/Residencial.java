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
public class Residencial extends Imovel {

    private int qtdQuartos;
    private int nrVagas;
    private boolean dispVenda;

    public Residencial(int codigo, String endereco, int cep, String nomeProp, int qtdQuartos, int nrVagas) {
        super(codigo, endereco, cep, nomeProp);
        this.qtdQuartos = qtdQuartos;
        this.nrVagas = nrVagas;
        dispVenda = true;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public int getNrVagas() {
        return nrVagas;
    }

    public void setNrVagas(int nrVagas) {
        this.nrVagas = nrVagas;
    }

    public boolean isDispVenda() {
        return dispVenda;
    }

    public void setDispVenda(boolean dispVenda) {
        this.dispVenda = dispVenda;
    }

    @Override
    public void imprimir() {
        System.out.println(
                "\nCódigo:" + getCodigo()
                + "\nEndereço: " + getEndereco()
                + "\nCEP: " + getCep()
                + "\nNome do proprietário: " + getNomeProp()
                + "\nDisponibilidade de aluguel: " + (isDispAluguel() ? "Sim" : "Não")
                + "\nDisponibilidade para venda: " + (isDispVenda() ? "Sim" : "Não")
                + "\nQuantidade de quartos: " + qtdQuartos
                + "\nNúmero de vagas da garagem: " + nrVagas                
        );
        if(!(isDispAluguel())) {
            System.out.println("Corretor: " + getCorretor());
        }
    }
}
