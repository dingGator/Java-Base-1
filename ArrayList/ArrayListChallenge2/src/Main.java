
import java.util.Scanner;

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
private static Scanner scanner = new Scanner(System.in);
private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println(" Enter Action:"
                    + " (6 to show avaiable actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit =true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
      
        }
   }
    }
   private static void addNewContact(){
       System.out.println("Enter New Contact Name: ");
       String name= scanner.nextLine();
       System.out.println("Enter New Phone Number: ");
       String phone= scanner.nextLine();
       Contact newContact = Contact.createContact(name, phone);
   if (mobilePhone.addNewContact(newContact)){
   System.out.println("New Contact added: name = "+ name+
           ", phone= "+ phone);
       
   }else{
       System.out.println("Cannot add, " + name+
                " already on file");
  
   }
   }
   private static void updateContact(){
       System.out.println("Enter Existing Contact Name: ");
       String name= scanner.nextLine();
       Contact existingContactRecord= 
               mobilePhone.queryContact(name);
       if(existingContactRecord ==null){
           System.out.println("Contact not found.");
           return;
       }
       System.out.print("Enter New Contact Name:");
       String newName= scanner.nextLine();
       System.out.print("Enter New Contact Phone Number:");
       String newNumber = scanner.nextLine();
       Contact newContact= Contact.createContact(
               newName, newNumber);
      if( mobilePhone.updateContact(
               existingContactRecord, newContact)){
          System.out.println("Successfully updated record");
      }else{
          System.out.println("Error updating record.");
      }
    
   }
   private static void removeContact(){
       System.out.println("Enter Existing Contact Name: ");
       String name= scanner.nextLine();
       Contact existingContactRecord= 
               mobilePhone.queryContact(name);
       if(existingContactRecord ==null){
           System.out.println("Contact not found.");
           return;
       }
       if(mobilePhone.removeContact(existingContactRecord)){
           System.out.println("Successfully deleted");
       }else {
           System.out.println("Error deleting contact");
       }
   }
    private static void queryContact(){
       System.out.println("Enter Existing Contact Name: ");
       String name= scanner.nextLine();
       Contact existingContactRecord= 
               mobilePhone.queryContact(name);
       if(existingContactRecord ==null){
           System.out.println("Contact not found.");
           return;
       }
            System.out.println("Name: " +
                    existingContactRecord.getName()+
                    " Phone Nuber: " +
                    existingContactRecord.getPhoneNumber());
       
   }
    private static void startPhone(){
        System.out.println("Starting phone...");
    }
    
     private static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("\t 0 - To Shutdown.");
        System.out.println("\t 1 - To Print the List of Contacts.");
        System.out.println("\t 2 - To Add New Contacts To the List.");
        System.out.println("\t 3 - To Update Existing Contact of the List.");
        System.out.println("\t 4 - To Remove A Contact from the List.");
        System.out.println("\t 5 - To Query If A Contact Exists On the List.");
        System.out.println("\t 6 - To Print A List of Available Actions to the Application");
        System.out.println("Choose Your Action.");
          
    }   
}
