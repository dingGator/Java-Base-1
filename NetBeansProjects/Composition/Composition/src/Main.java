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
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2200",
                "Dell", "240",
                dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast",
                "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200",
                "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        /*  thePC.getMonitor().drawPixelAt(1500,1200,"red");
         thePC.getMotherboard().loadProgram("Windows 1.0");
         thePC.getTheCase().pressPowerButton();
         */
        thePC.powerUp();
    }

}
