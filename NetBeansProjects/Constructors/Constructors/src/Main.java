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
         System.out.println("****challenge BankAccount***************");
        // create new class for bank account
        // create fields for account number, phone number
        //                   balance,e-mail
        //                   customer name
        // create getters and setter for each field
        // create two additional methods
        // 1. to allow customer to deposit funds
        //       this should increment the balance field
        // 2. to allow customer to withdraw funds
        //       this should deduct from the balance field
        //       but not allow the withdrawal to complete 
        //       if there are insufficient funds
        // You will want to create various code in the Main class
        //       to confirm your code is working
        // Add some System.out.println's in the method above
        
     /*
         BankAccount kim = new BankAccount();
           kim.setCustomerName("kim");
         System.out.println(" name = "+ kim.getCustomerName());
         
        kim.setEmail("kim@chucrew.net");
         System.out.println(" emai = "+ kim.getEmail());
   
         kim.setPhoneNumber("3522814199");
    System.out.println(" Phone Number = "+ kim.getPhoneNumber());
    
    kim.setAccountNumber("1234");
        System.out.println(" Account Number = "+ kim.getAccountNumber());
   
      kim.setBalance(1500.00);
      System.out.println(" Balance is "+ kim.getBalance());
      
      double deposit = 1523.20;
     double balanceDeposit = balanceDeposit(deposit,kim.getBalance());
     System.out.println(" Balance + deposit is = "+ balanceDeposit);
     
     double withdraw= 1523.20;
     if (withdraw < balanceDeposit)
     {
      double balanceWithdraw = balanceWithdraw(withdraw, balanceDeposit);
          System.out.println(" Balance - withdrawal is = "+ balanceWithdraw);
     } else {
       System.out.println(" withdrawal is not possible ");   
     }
     */
     System.out.println("******* challenge bobAccount************");
     
      Account bobsAccount = new Account();
              /*"12345",
              0.00,
              "Bob Brown",
          "myemail@bob.com", 
              "(087)123-4567");*/
  System.out.println("bobsAccount.getNumber()= " +bobsAccount.getNumber());
System.out.println("bobsAccount.getBalance() = "+ bobsAccount.getBalance());
 /*     bobsAccount.setNumber("12345");
      bobsAccount.setBalance(0.00);
      bobsAccount.setCustomerName("Bob Brown");
      bobsAccount.setCustomerEmailAddress("myEmail@bob.com");
      bobsAccount.setCustomerPhoneNumber("3522814199");
      
*/      
      
      bobsAccount.withdrawal(100.0);
      bobsAccount.deposit(50.0);
      bobsAccount.withdrawal(100.0);
      bobsAccount.deposit(51.0);
      bobsAccount.withdrawal(100.0);
    
System.out.println("***********TimAccount**********");

      Account timsAccount = new Account("Tim", "time@email.com", "12345");
      System.out.println(timsAccount.getNumber()+ " name= "+ timsAccount.getCustomerName());
 
   //   System.out.println("Current balance is "+ timsAccount.getBalance());
   //   timsAccount.withdrawal(100.55);
System.out.println("********challenge***********");
     

 /*******************************************
      create new class VipCustomer
        have three fields name, credit limit , email address
    create 3 constructors
      1st constructor should call constructor 
        with 3 parameters with default values
      2nd constructor should pass 2 values 
         and add default value for 3rd
      3rd constructor should save all fields
      create getters only for this using code generation 
        setter wont be needed
      test and confirm it works
      ******************/
       
      VipCustomer kimVipCustomer= new VipCustomer();
   System.out.println(" name= "+ kimVipCustomer.getName()+" ***credit limit= "+
           kimVipCustomer.getCreditLimit() + " *** email address= "+ kimVipCustomer.getEmailAddress());
    
    VipCustomer kim2VipCustomer= new VipCustomer("kim",25000.00);
   System.out.println(" name= "+ kim2VipCustomer.getName()+" *** credit limit= "+
           kim2VipCustomer.getCreditLimit() + " ***email address= "+ kim2VipCustomer.getEmailAddress());
           
    VipCustomer kim3VipCustomer= new VipCustomer("Tim",6000.00, "tim@email.com");
   System.out.println(" name= "+ kim3VipCustomer.getName()+" *** credit limit= "+
           kim3VipCustomer.getCreditLimit() + " ***email address= "+ kim3VipCustomer.getEmailAddress());
         }
}     
   
      //Account timsAccount = new Account("Tim", "time@email.com", "12345");
    //  System.out.println(timsAccount.getNumber()+ " name "+ timsAccount.getCustomerName());  
   /*   
   
    public static double balanceDeposit(double deposit,double balance){
        double depositBalance = balance + deposit;
         return depositBalance;
         
         */

   /* 
    public static double balanceWithdraw(double withdraw,double balance){
        if (withdraw < balance){
        double withdrawBalance = balance - withdraw;
         return withdrawBalance;
        }else {
            return -1.0;
        }
}
}
*/