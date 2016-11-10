/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        
        Parrot parrot = new Parrot("Aust. Green Neck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
    
}
