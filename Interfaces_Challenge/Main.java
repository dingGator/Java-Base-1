
import java.util.ArrayList;
import java.util.List;
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
    public static void main(String[] args) {
        // TODO code application logic here
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
      //  loadObject(tim);
        System.out.println(tim);
        
       ISaveable werewolf = new Monster("Werewolf",20,40);
       System.out.println("strength= "+((Monster)werewolf).getStrength());
 
      //  Monster werewolf = new Monster("Werewolf",20,40);
      //  werewolf.getStrength();
        //System.out.println(werewolf);
        saveObject(werewolf);
        
    }
   public static ArrayList<String> readValues(){
       ArrayList<String> values = new ArrayList<String>();
       Scanner scanner = new Scanner(System.in);
       boolean quit = false;
       int index =0;
       System.out.println("Choose\n"+
               "1 to enter a string\n"+
               "0 to quit\n");
       while(!quit){
           System.out.print("Choose an option\n");
           int choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice){
               case 0: 
                   quit = true;
                   break;
               case 1:
                   System.out.print("Enter a string: ");
                   String stringInput = scanner.nextLine();
                   values.add(index, stringInput);
                   index++;
                   break;
           }
       }
       return values;
   } 
   public static void saveObject(ISaveable objectToSave){
       for (int i=0; i<objectToSave.write().size();i++){
           System.out.println("Saving "+objectToSave.write().get(i)+
                   " to storage device");
       }
   }
   public static void loadObject(ISaveable objectToLoad){
       ArrayList<String> values =readValues();
       objectToLoad.read(values);
   }
}
