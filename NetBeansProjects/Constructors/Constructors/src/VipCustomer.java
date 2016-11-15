/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class VipCustomer {
    
     private String name;
     private double creditLimit;
    private String emailAddress;
    
    public VipCustomer(String name,
      double creditLimit,
     String emailAddress){
        this.name =name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
public VipCustomer(String name, double creditLimit){
        this(name,creditLimit, "unknown");
        System.out.println("Account constructor with parameters called");
        
    
    }

public VipCustomer(){
    this("Default name", 50000.00, "default@demdl.com");
}

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
}
