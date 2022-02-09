/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author gabri
 */
public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, String sobrenome, String area) {
        super(nome, sobrenome);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Professor{" + "area=" + area + " " + super.toString() + '}';
    }
}
