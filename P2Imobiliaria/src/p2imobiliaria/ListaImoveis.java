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
public class ListaImoveis {

    private Imovel[] lista;
    private int contador;

    public ListaImoveis(int capacidadeMax) {
        lista = new Imovel[capacidadeMax];
        contador = 0;
    }

    private int procurarCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (codigo == lista[i].getCodigo()) {
                return i;
            }
        }

        return -1;
    }

    public void cadastrarImovel(Imovel imv) {
        if (contador >= lista.length) {
            throw new ListIsFullException();
        }
        if (procurarCodigo(imv.getCodigo()) >= 0) {
            throw new RepeatedCodeException();
        }
        lista[contador] = imv;
        contador++;
    }

    public void alugarImovel(int codigo, String corretor) {
        int indice = procurarCodigo(codigo);
        if (indice < 0) {
            throw new NonExistentCodeException();
        }
        if (lista[indice].isDispAluguel() == false) {
            throw new RentalUnavailability();
        }
        lista[indice].setDispAluguel(false);
        lista[indice].setCorretor(corretor);
    }

    public void venderImovel(int codigo, String corretor) {
        int indice = procurarCodigo(codigo);
        if (indice < 0) {
            throw new NonExistentCodeException();
        }
        if (lista[indice] instanceof Comercial) {
            throw new ComercialTypeException();
        }
        if (lista[indice] instanceof Residencial) {
            Residencial r = (Residencial) lista[indice];
            if (r.isDispVenda() == false) {
                throw new AlreadySoldException();
            }
        }
        Residencial r = (Residencial) lista[indice];
        r.setDispVenda(false);
        r.setDispAluguel(false);
        r.setCorretor(corretor);
    }

    public void listarImoveis(String titulo, boolean apenasDisponiveis, boolean residenciais) {
        System.out.println(titulo);
        for (int i = 0; i < contador; i++) {
            if (residenciais == true && lista[i] instanceof Residencial) {
                lista[i].imprimir();                
            } else if (apenasDisponiveis == true && residenciais == false) {
                if (lista[i].isDispAluguel() == true) {
                    lista[i].imprimir();
                }
            } else if (apenasDisponiveis == false && residenciais == false) {
                lista[i].imprimir();
            }
        }
    }
}
