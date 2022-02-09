/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoescontroleestoque;

/**
 *
 * @author gabri
 */
public class Produto {

    private int cod;
    private String descr;
    private double peso;
    private int qtd;

    // Construtor
    public Produto(int cod, String descr, double peso, int qtd) {
        this.cod = cod;
        this.descr = descr;
        this.peso = peso;
        this.qtd = qtd;
    }

    // Getters
    public int getCod() {
        return cod;
    }

    public String getDescr() {
        return descr;
    }

    public double getPeso() {
        return peso;
    }

    public int getQtd() {
        return qtd;
    }

    // Setters
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void acrescentar(int qtd) {
        if (qtd < 0) {
            throw new NegativeAmountException();
        }
        this.qtd += qtd;
    }

    public boolean retirar(int qtd) {
        if (qtd < 0) {
            throw new NegativeAmountException();
        }

        if (qtd > this.qtd) {
            return false;
        }

        this.qtd -= qtd;
        return true;
    }

    public double pesoTotal() {
        return peso * qtd;
    }

    public static void printCab() {
        System.out.format("| %-5s | %-20s | %-8s | %-5s | %-8s |\n", "Cod", "Descrição", "Peso unt", "Qtd", "Peso tot");
    }

    public void print() {
        System.out.format("| %5d | %-20s | %8.2f | %5d | %8.2f |\n", cod, descr, peso, qtd, pesoTotal());
    }
}
