
import java.util.ArrayList;
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
public class MobilePhone {

    /**
     * @param args the command line arguments
     */
        private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactList = new Contacts();
 
    public static void main(String[] args) {
        // TODO code application logic here
      
         boolean quit = false;
          int choice =0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addName();
                    break;
                case 3:
                    modifyName();
                    break;
                case 4:
                    removeName();
                    break;
                case 5:
                    searchName();
                    break;
                case 6:
                    quit = true;
                    break;
                    
                    
            }
        }}
    
    public static void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print Choice options.");
        System.out.println("\t 1 - To Print the List of Contacts.");
        System.out.println("\t 2 - To Add New Contacts To the List.");
        System.out.println("\t 3 - To Update Existing Contact of the List.");
        System.out.println("\t 4 - To Remove A Contact from the List.");
        System.out.println("\t 5 - To Search A Contact In the List.");
        System.out.println("\t 6 - To Quit the Application.");
        
    }
    public static void addName(){
    System.out.print("Please enter the contact name: ");
    contactList.addContactName(scanner.nextLine());
}
public static void modifyName(){
    System.out.print("Enter current Name: ");
    //int itemNo = scanner.nextInt();
    String name = scanner.nextLine();    
    
    System.out.print("Enter replacement Name: ");
    String newName = scanner.nextLine();
    contactList.modifyContactName(name, newName);
}
public static void removeName(){
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    
    contactList.removeContactName(name);
}
public static void searchName(){
     System.out.print("Name to search for: ");
     String searchName = scanner.nextLine();
     if (contactList.onFile(searchName)){
          System.out.println("Found " +searchName +
                  " in our Contact List. ");
    }else { 
         System.out.println(searchName + " is not in the Contact List");
     }
   
   
}
}
       


    
    

