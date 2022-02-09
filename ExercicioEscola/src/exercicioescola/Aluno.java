/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioescola;

/**
 *
 * @author gabri
 */
public class Aluno extends Pessoa{
    protected String ra;
    protected String turno;
    protected String status;
    
    //Construtores
    public Aluno() {
        super();
        ra = null;
        turno = null;
        status = null;
    }

    public Aluno(String nome, String rg, String ra, String turno) {
        super(nome, rg);
        this.ra = ra;
        this.turno = turno;
        this.status = "Ativo";
    }

    //Getters
    public String getRa() {
        return ra;
    }

    public String getTurno() {
        return turno;
    }

    public String getStatus() {
        return status;
    }
    
    //Setters
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Métodos
    @Override
    public String toString() {
        return super.toString() + "\nRA: " + ra + "\nTurno: " + turno + "\nStatus: " + status;
    }
    
    public void Trancar() {        
        if(status.equals("Ativo")){
            status = "Suspenso";
        }
    }
    
    public void Destrancar() {     
        if(status.equals("Suspenso")){
            status = "Ativo";
        }
    }
    
    public void Formar() {
        if(status.equals("Ativo")){
            status = "Egresso";
        }
    }
    
    public void Desistir() {
        if(status.equals("Ativo") || status.equals("Suspenso")){
            status = "Desistente";
        }
    }
}
