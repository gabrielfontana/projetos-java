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
public abstract class Carro {

    private int cod;
    private String placa;
    private int ano;
    private String modelo;
    private boolean disp;
    private String vendedor;

    public Carro(int cod, String placa, int ano, String modelo) throws EmptyLicensePlateException {
        this.cod = cod;
        if (placa.isEmpty()) {
            throw new EmptyLicensePlateException();
        } else {
            this.placa = placa;
        }
        this.ano = ano;
        this.modelo = modelo;
        disp = true;
    }

    public int getCod() {
        return cod;
    }

    public boolean disponivel() {
        return disp;
    }

    public void imprimeDados() {
        System.out.println("Código: " + cod + "\n"
                + "Placa: " + placa + "\n"
                + "Modelo: " + modelo + "\n"
                + "Ano: " + ano + "\n"
                + "Disponível: " + (disp ? "Sim" : "Não")
        );
        if (!disp) {
            System.out.println("Vendedor: " + vendedor);
        }

    }

    public abstract boolean oferta(double valor);

    public boolean venderCarro(String vendedor, double valorVenda) throws NegativeOfferException {
        if (!disp) {
            return false;
        }
        if (valorVenda < 0) {
            throw new NegativeOfferException();
        }
        if (!oferta(valorVenda)) {
            return false;
        }

        disp = false;
        this.vendedor = vendedor;
        return true;
    }
}
