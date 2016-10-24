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
         Minivan minivan = new Minivan(36);
       minivan.steer(45);
        minivan.accelerate(30);
       minivan.accelerate(20);
        minivan.accelerate(-42);

    
    }
    
}
