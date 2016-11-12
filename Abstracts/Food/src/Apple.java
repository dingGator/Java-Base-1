/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Apple extends Fruit{
    public Apple(String name){
        super(name);
    }
     @Override
    public void shape(){
        System.out.println(getName()+" is round");
    }
    @Override
    public void taste(){
          System.out.println(getName() + " is sweet and crispy ");

    }
    
    
}
