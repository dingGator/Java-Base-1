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
         System.out.println("*****  Hamburger hamburger1********");
        
        Hamburger hamburger = new Hamburger(
                "Basic", 
                "Sausage", 
                3.56,
                "white");
       double price =hamburger.itemizeHamburger();
       hamburger.addHamburgerAddition1("Tomato",0.27);
       hamburger.addHamburgerAddition2("Lettuce",0.75);
       hamburger.addHamburgerAddition3("Cheese",1.13);
         
       System.out.println("Total Burger price is "+ 
                 hamburger.itemizeHamburger());
       System.out.println("*****  Healthyburger 1********");
     
        Healthyburger healthyburger = new Healthyburger(
                "Bacon", 
                5.67);
       healthyburger.addHamburgerAddition1("Egg",5.43);
       healthyburger.addHealthAddition1("Lentils",3.41);
      healthyburger.itemizeHamburger();
      System.out.println("Total Healthy Burger price is "+ 
                 healthyburger.itemizeHamburger());
    
           Deluxeburger db = new Deluxeburger();
           db.itemizeHamburger();
           db.addHamburgerAddition3("Should not do this ", 50.53);
           db.itemizeHamburger();
           

    }
}
     /*  hamburger.burgerReceipt("lettuce");
       System.out.println("*****  Healthyburger healthyburger;********");
       Healthyburger healthyburger = new Healthyburger(
               "wheat",
               "beef",
               2.50);
       healthyburger.hamburgerReceipt("carrots");
       System.out.println("*****  Deluxeburger deluxeburger;********");
             Deluxeburger deluxeburger = new Deluxeburger(
                "wheat",
                "beef",
               2.50);
       deluxeburger.hamburgerReceipt("pickle");
       
       
    }
    */

