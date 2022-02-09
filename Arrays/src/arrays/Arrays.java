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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARRAYS COM UMA DIMENSÃO
        int vet[]; //Declaração        
        
        vet = new int[10]; //Construção        
        
        vet[0] = 10;
        
        int val = vet[0];
        
        //Preenchimento
        for(int i = 0; i < vet.length; i++) {
            vet[i] = i * 2;
        }
        
        //Impressão
        for(int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "\t");
        }        
        System.out.println();
        
        //ARRAYS COM DUAS DIMENSÕES
        int mat[][];
        
        //Construção de um array onde todas as linhas têm a mesma quantidade de colunas.        
        mat = new int[5][10]; //O array tem 5 linhas e 10 colunas
        
        //Preenchimento
        for(int linha = 0; linha < mat.length; linha++) {
            for(int coluna = 0; coluna < mat[linha].length; coluna++) {
                mat[linha][coluna] = linha + coluna;
            }
        }
        
        //Impressão
        System.out.println();
        for(int linha = 0; linha < mat.length; linha++) {
            for(int coluna = 0; coluna < mat[linha].length; coluna++) {
                System.out.print(mat[linha][coluna] + "\t");
            }
            System.out.println();
        }
                        
        //Construção de um array com linhas de comprimentos diferentes
        int mat2[][];
        
        //Construção das linhas
        mat2 = new int[10][];
        
        //Construção das colunas
        for(int linha = 0; linha < mat2.length; linha++) {
            mat2[linha] = new int[linha + 1];
        }
        
        //Preenchimento
        for(int linha = 0; linha < mat2.length; linha++) {
            for(int coluna = 0; coluna < mat2[linha].length; coluna++) {
                mat2[linha][coluna] = linha * coluna;
            }
        }
                
        //Impressão
        System.out.println();
        for(int linha = 0; linha < mat2.length; linha++) {
            for(int coluna = 0; coluna < mat2[linha].length; coluna++) {
                System.out.print(mat2[linha][coluna] + "\t");
            }
            System.out.println();
        }
        
        /*--------------------------------------------*/
        System.out.print("\n");
        
        //Declaração
        Pessoa p1;   
        
        //Construção
        p1 = new Pessoa("Maria", "Pereira");
        
        //Declaração de um array de objetos da classe Pessoa
        Pessoa lista[]; 
        
        //Construção do array com 10 elementos
        lista = new Pessoa[10];
        
        //Construção dos objetos
        lista[0] = new Pessoa("João", "Silva");
        lista[1] = p1;
        
        //Impressão
        lista[0].print();
        lista[1].print();
        
        System.out.print("\n");
        
        Aluno a1 = new Aluno("Zé", "Carioca", "123456-7");
                        
        //Um objeto de uma classe descendente sempre será 
        //instância de todas as suas classes ancestrais.
        //Portanto, se um array tem como tipo base uma classe ancestral, 
        //poderá conter objetos da classe que dá tipo ao array e também 
        //de todas as classes descendentes.
        //Todo aluno também é uma pessoa.
        lista[2] = a1;
        lista[2].print();
        
        System.out.print("\n");
        
        lista[3] = new Professor("Jonas", "Oliveira", "Programação");
        lista[3].print();               
    }    
}
