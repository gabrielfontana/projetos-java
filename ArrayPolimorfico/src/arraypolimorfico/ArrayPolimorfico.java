/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypolimorfico;

/**
 *
 * @author gabri
 */
public class ArrayPolimorfico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPessoas lp = new ListaPessoas(10);
        
        lp.addPessoa(new Aluno(1, "José", "46.500.100-2", "153768-00"));
        lp.addPessoa(new Professor(2, "Zeca", "55.511.360-8", "Matemática"));
        lp.addPessoa(new Aluno(3, "Maria", "11.789.456-1", "415698-10"));
        lp.addPessoa(new Professor(4, "Rita", "74.103.987-9", "Português"));
        
        lp.listagem();
                        
        //instanceof: operador do Java que informa se um objeto
        //é ou não instância de uma classe. Retorna um valor booleano.
        //
        //(obj instanceof classe)
        
        System.out.println("\n");
        
        lp.listagemAlunos();
        
        System.out.println("\n");
        
        lp.listagemProfessores();
        
        System.out.println("\n");
        
        lp.addFaltaAluno(1);
        lp.addFaltaAluno(1);
        lp.addFaltaAluno(3);
        lp.addFaltaAluno(3);
        
        lp.listagem();
    }    
}
