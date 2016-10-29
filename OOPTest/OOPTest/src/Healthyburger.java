/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Healthyburger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public Healthyburger(String meat,
            double price) {
        super("Healthy", meat, price, "Brown rye");

    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger(); //To change body of generated methods, choose Tools | Templates.
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name
                    + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name
                    + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }

}
/*
    public Healthyburger(String breadRoll, 
            String meat, 
            double price, 
            int numOfAdds, 
            double grandTotal) {
        super(breadRoll, meat, price, numOfAdds, grandTotal);
    }
    
    
   
    @Override
    public void hamburgerReceipt(String baseAdd1, String baseAdd2) {
       System.out.println(" A  Healthyburger = $2.50");
        grandTotal = 2.50;
        nameAdd(baseAdd1);
        nameAdd(baseAdd2);
        grandTotal(grandTotal);
    }

 
    
}
*/
