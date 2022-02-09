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
public abstract class Imovel {

    private int codigo;
    private String endereco;
    private int cep;
    private String nomeProp;
    private boolean dispAluguel;
    private String corretor;

    public Imovel(int codigo, String endereco, int cep, String nomeProp) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.cep = cep;
        this.nomeProp = nomeProp;
        dispAluguel = true;
        corretor = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public boolean isDispAluguel() {
        return dispAluguel;
    }

    public void setDispAluguel(boolean dispAluguel) {
        this.dispAluguel = dispAluguel;
    }

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    public abstract void imprimir();
}
