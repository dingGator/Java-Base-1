/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

 /****************************************/ 
    public Account(){
       this("56789",2.50,"Default name","Default address", "Default phone");
        System.out.println("Empty Constructor called");
    }
    public Account(String number,
            double balance, 
            String customerName,
            String customerEmailAddress,
            String customerPhoneNumber){
   System.out.println("Account constructor with parameters called");

    
    //setNumber(number);
this.number =number;
this.balance =balance;
this.customerName = customerName;
this.customerEmailAddress = customerEmailAddress;
this.customerPhoneNumber = customerPhoneNumber;
}

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerPhoneNumber);
      System.out.println(" Constructor called:  99999, 100.50");
 
    
    }
    

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount + " made.  New balance is "+ this.balance);
    }
    
    public void withdrawal(double withdrawalAmount){
        if (balance-withdrawalAmount <0){
            System.out.println("Only "+ this.balance + " available.  Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
       System.out.println("Withdrawal of "+ withdrawalAmount + " processed.  Remaining balace = " + this.balance);
            
        }
    }
    
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String Number) {
        this.number = Number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
}
