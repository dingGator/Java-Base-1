/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class BankAccount {
    
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    
    public void deposit (double depositAmount){
        this.balance+= depositAmount;
          System.out.println("Deposit of "+ depositAmount+ " processed.  New balance = " +this.balance);
   
    }
    public void withdrawal (double withdrawalAmount){
       if (this.balance - withdrawalAmount <=0){
           System.out.println("Only "+ this.balance+ " available.  Withdrawal not processed");
       }else {
           this.balance -= withdrawalAmount;
    System.out.println("Withdrawal of "+ withdrawalAmount+ " processed.  Remaining balance = " +this.balance);
           
       }
    }
    //setter & getter for customer name
    public void setCustomerName(String customerName){
        this.customerName = customerName;
        System.out.println("  the customer name = "+ customerName);
            }
    public String getCustomerName(){
    return this.customerName;
    }
    
    //setter & getter for email
    public void setEmail(String email){
        this.customerEmailAddress = email;
        System.out.println("  the email = "+ email);
            }
    public String getEmail(){
    return this.customerEmailAddress;
    }
    
    //setter & getter for phone number
    public void setPhoneNumber(String phoneNumber){
        this.customerPhoneNumber = phoneNumber;
        System.out.println("  the phone number = "+ phoneNumber);
            }
    public String getPhoneNumber(){
    return this.customerPhoneNumber;
    }
    //setter & getter for accountNumber
     public void setAccountNumber(String accountNumber){
        if ((accountNumber=="1234")|| (accountNumber =="4321"))
        {
             System.out.println("  This accountNumber = "+ accountNumber );
            this.number =accountNumber;
        }else{
        System.out.println("  This accountNumber = "+ accountNumber + " is not valid.");
        }
    }
    public String getAccountNumber(){
    return this.number;
    }
        
    //setter & getter for balance
    public void setBalance(double balance){
                this.balance = balance;
        System.out.println("  the balance = "+ balance);
            }
    public double getBalance(){
    return this.balance;
    }
     
    
}
