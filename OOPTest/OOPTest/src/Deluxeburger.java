/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Deluxeburger extends Hamburger {
 public Deluxeburger() {
        super("Deluxe","Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
     
     }

    @Override
    public void addHamburgerAddition4(String name, double price) {
         System.out.println("Cannot add additional items to a deluxe burger"); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
         System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price) {
      System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
      System.out.println("Cannot add additional items to a deluxe burger"); }
 
    
    }

    
    
    
    

/*   private String drinks= "Cola";
    private String chips = "chips";
    private int delAdd;
private double grandTotal;

    public Deluxeburger(int delAdd, 
            String breadRoll, 
            String meat, 
            double price) {
        super(breadRoll, meat, price);
        this.drinks = drinks;
        this.chips = chips;
        this.delAdd = delAdd;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getChips() {
        return chips;
    }

    public int getDelAdd() {
        return delAdd;
    }


@Override
    public void hamburgerReceipt(String baseAdd1, String baseAdd2) {
       System.out.println(" A  Deluxeburger = $2.50");
        
        System.out.println(" A  drink = $0.50");
        System.out.println(" A  chips = $1.00");
        grandTotal = 4.00;
        
        grandTotal(grandTotal);
    }
}*/