/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public abstract class Fruit  {
    private String name;
    public Fruit(String name){
        this.name = name;
    }
    public abstract void shape();
    public abstract void taste();
    
    public String getName(){
        return name;
    }

    
    
}
