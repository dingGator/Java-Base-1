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
        Car porsche = new Car();
        Car holden = new Car();
       // porsche = null;
       // System.out.println("Model is "+ porsche.getModel());
       //porsche.model = "carrera";
     //   System.out.println("Model is "+ porsche.getModel());
    System.out.println("Model is ***** valid");
      
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
   
        System.out.println("Model is ***** not valid");     
         porsche.setModel("911");
        System.out.println("Model is "+ porsche.getModel());
        
    }
    
}
