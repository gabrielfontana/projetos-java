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
public class ListaPessoas {
    private Pessoa[] lista;
    private int count;
    
    public ListaPessoas(int capMax) {
        lista = new Pessoa[capMax];
        count = 0;
    }
    
    private Pessoa buscar(int cod) {
        for(int i = 0; i < count; i++) {
            if(lista[i].getCod() == cod) {
                return lista[i];
            }
        }
        return null;
    }
    
    public boolean addPessoa(Pessoa p) {
        if(count >= lista.length) {
            return false;
        }
        
        lista[count] = p;
        count++;
        return true;
    }
    
    public void listagem() {
        for(int i = 0; i < count; i++) {
            lista[i].print();
        }
    }
    
    public void listagemAlunos() {
        for(int i = 0; i < count; i++) {
            if(lista[i] instanceof Aluno){
                lista[i].print();
            }            
        }
    }
    
    public void listagemProfessores() {
        for(int i = 0; i < count; i++) {
            if(lista[i] instanceof Professor){
                lista[i].print();
            }            
        }
    }
    
    public boolean addFaltaAluno(int codAluno) {
        Pessoa p = buscar(codAluno);
        
        if(p == null) {
            return false;
        }      
        if(!(p instanceof Aluno)) {
            return false;
        }
              
        Aluno a = (Aluno) p;
        a.addFalta();
        return true;
    }
}
