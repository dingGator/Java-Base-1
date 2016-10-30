
import java.util.ArrayList;

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
      Bank bank = new Bank("National Australia Bank");
      if(bank.addBranch("Adelaide")){
          System.out.println("Adelaide branch created");
      }
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim", 50.05);
        bank.addCustomer("Adelaide","Mike", 175.34);
        bank.addCustomer("Adelaide","Percy", 220.12);
        
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob", 150.54);
      
        bank.addCustomerTransaction("Adelaide","Tim", 44.22);
        bank.addCustomerTransaction("Adelaide","Tim", 12.44);
        bank.addCustomerTransaction("Adelaide","Mike", 1.65);
        
        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);
        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne","Brian",5.53)){
            System.out.println("Error Melbourne branch does not exist");
        }
        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide Branch already exists");
        }
         if(!bank.addCustomerTransaction("Adelaide","Fergus", 52.33)){
            System.out.println("Customer does not exist at Adelaide Branch");
        }
        if (!bank.addCustomer("Adelaide", "Tim", 12.21)){
            System.out.println("Customer Tim already exist at Adelaide Branch");
        }
    }
    
}
