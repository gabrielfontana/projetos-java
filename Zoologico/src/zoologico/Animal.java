/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author gabri
 */
public abstract class Animal {
    public abstract void somDoAnimal();
    
    public void fome(){
        somDoAnimal();
        somDoAnimal();
        somDoAnimal();        
    }
}
