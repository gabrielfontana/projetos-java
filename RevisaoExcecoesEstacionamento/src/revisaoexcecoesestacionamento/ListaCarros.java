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
public class ListaCarros {

    private Carro[] list;
    private int count;

    public ListaCarros(int capMax) {
        list = new Carro[capMax];
        count = 0;
    }

    private Carro getCarro(int cod) {
        for (int i = 0; i < count; i++) {
            if (cod == list[i].getCod()) {
                return list[i];
            }
        }

        return null;
    }

    public boolean add(Carro car) throws ListIsFullException, RepeatedCodeException {
        if (count >= list.length) {
            throw new ListIsFullException();
        }

        if (getCarro(car.getCod()) != null) {
            throw new RepeatedCodeException();
        }

        list[count] = car;
        count++;
        return true;
    }

    public boolean disponivel(int cod) {
        Carro car = getCarro(cod);
        if (car == null) {
            return false;
        }

        return car.disponivel();
    }

    public void imprimeDados(int cod) {
        Carro car = getCarro(cod);
        if (car == null) {
            System.out.println("Código não encontrado!");
        } else {
            car.imprimeDados();
        }
    }

    public boolean oferta(int cod, double valor) {
        Carro car = getCarro(cod);
        return (car != null ? car.oferta(valor) : false);
    }

    public boolean venderCarro(int cod, String vendedor, double valorVenda) throws NegativeOfferException {
        Carro car = getCarro(cod);
        if (car == null) {
            return false;
        }
        return car.venderCarro(vendedor, valorVenda);
    }

    public void listagem(String title, boolean all, boolean disp) {
        System.out.println("+-------------------------------------+\n" + title);
        for (int i = 0; i < count; i++) {
            if (all || (disp == list[i].disponivel())) {
                //System.out.println(all);
                //System.out.println(disp);
                //System.out.println(disp == list[i].disponivel());
                list[i].imprimeDados();
            }
//            if (all == true) {
//                list[i].imprimeDados();
//            } else if (all == false && disp == true && list[i].disponivel() == true) {
//                list[i].imprimeDados();
//            } else if (all == false && disp == false && list[i].disponivel() == false) {
//                list[i].imprimeDados();
//            } 
        }
    }
}
