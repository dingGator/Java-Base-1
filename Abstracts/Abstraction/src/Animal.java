/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();
    
    public String getName(){
        return name;
    }
}
