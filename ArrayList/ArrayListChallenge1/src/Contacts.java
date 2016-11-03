
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
public class Contacts {
    private ArrayList<String> contactList = new ArrayList<String>();
    private ArrayList<String> contactName = new ArrayList<String>();
    private ArrayList<String> contactPhoneNumber = new ArrayList<String>();
  
    public ArrayList<String> getContactName() {
        return contactName;
    }
    public ArrayList<String> getContactPhoneNumber() {
        return contactPhoneNumber;
    }
    
    public void printContactList(){
        System.out.println("You have "+ contactList.size()+
                " contacts in your Contact List");
        for (int i =0; i< contactList.size(); i++){
            System.out.println((i+1) + ". " + contactList.get(i));
     //       System.out.print((i+1) + ". " + contactPhoneNumber.get(i));
        
        }
    }
    public void addContactName(String contactName){
        contactList.add(contactName);
    }

    public ArrayList<String> getContactList() {
        return contactList;
    }
    
    
    public void modifyContactName(String currentName, String newName){
        int position = findName(currentName);
        if(position >=0){
            modifyContactName(position,newName);
        }
    }
    private void modifyContactName(int position, String newName){
        contactList.set(position, newName);
        System.out.println("Contact Name "+ (position+1)+
                " has been modified.");
    }
    public void removeContactName(String name){
       int position = findName(name);
       if (position >= 0){
           removeContactName(position);
       }
    }
    private void removeContactName(int position){
    //    String theItem = groceryList.get(position);
        contactList.remove(position);
    }
    public boolean onFile(String searchName){
        int position = findName(searchName);
        if(position>=0){
            return true;
        }
        return false;
    }
    private int findName(String searchName){
        return contactList.indexOf(searchName);
    }
}

    

