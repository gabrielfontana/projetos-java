/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoescriacao;

/**
 *
 * @author gabri
 */
public class ListaFuncionarios {

    private Funcionario[] lista;
    private int count;

    public ListaFuncionarios(int capMax) {
        lista = new Funcionario[capMax];
        count = 0;
    }

    public boolean addFunc(Funcionario f) {
        if (count >= lista.length) {
            throw new ArrayLotadoException(); //Criar e lançar instância da exceção
        }
        lista[count] = f;
        count++;
        return true;
    }

//    public boolean addFunc(Funcionario f) {
//        if(count >= lista.length) {
//            ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException(); //Criar instância da exceção
//            throw exc; //Lançar exceção na pilha de execução
//            
//            ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException(count); //Criar instância da exceção
//            throw exc; //Lançar exceção na pilha de execução
//            
//            ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException("Array lotado!"); //Criar instância da exceção
//            throw exc; //Lançar exceção na pilha de execução
//            
//            throw new ArrayIndexOutOfBoundsException("Array lotado!"); //Criar e lançar instância da exceção
//        }        
//        lista[count] = f;
//        count++;
//        return true;
//    }
//    
//    public boolean addFunc(Funcionario f) throws Exception {
//        if(count >= lista.length) {            
//            throw new Exception(); //Criar e lançar instância da exceção
//        }        
//        lista[count] = f;
//        count++;
//        return true;
//    }
    
    public void relatorioAdministracao() {
        double acumuladorSalario = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Administracao) {
                lista[i].hollerith();
                acumuladorSalario += lista[i].salarioLiquido();
            }
        }
        System.out.println("\nTotal dos salários: " + acumuladorSalario);
    }

    public void relatorioVendas() {
        double acumuladorTotVendas = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Vendas) {
                lista[i].hollerith();
                Vendas v = (Vendas) lista[i];
                acumuladorTotVendas += v.getTotVendas();
            }
        }
        System.out.println("\nTotal de vendas: " + acumuladorTotVendas);
    }

    public void relatorioProducao() {
        int acumuladorHrDia = 0;
        int acumuladorHrNoite = 0;
        for (int i = 0; i < count; i++) {
            if (lista[i] instanceof Producao) {
                lista[i].hollerith();
                Producao p = (Producao) lista[i];
                acumuladorHrDia += p.getHrDia();
                acumuladorHrNoite += p.getHrNoite();
            }
        }
        System.out.println(
                "\nTotal de horas diurnas: " + acumuladorHrDia
                + "\nTotal de horas noturnas: " + acumuladorHrNoite
        );
    }
}
