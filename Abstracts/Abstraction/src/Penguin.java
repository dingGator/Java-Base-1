/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }
    @Override
    public void fly(){
        super.fly();
        System.out.println("I'm not very good at that, can go for a swim instead");
    }
}
