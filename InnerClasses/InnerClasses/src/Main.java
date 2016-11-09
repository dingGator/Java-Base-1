
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
    private static Button btnPrint = new Button("Print"); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gearbox mcLaren = new Gearbox(6);
    //    Gearbox.Gear first = mcLaren.new Gear(1,12.3);
       //two errors:
        //1.  inner class need  
        //mcLaren.new to refernce the outer class first
        //because not enclosing class        
        // Gearbox.Gear second = new Gearbox.Gear(2,15.4);
       
        // 2. mcLaren.Gear can not be resolved
        // Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
       // System.out.println(first.driveSpeed(1000));
   //************
        // addGear should not be call here
        // by adding this: for loop to: Gearbox constructor
        /*  for(int i=0;i<maxGears;i++){
            addGear(i, i*5.3);
        }                     
        then mcLaren.addGear can be taken out
        *****        
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
    ***********/
                
    mcLaren.operateClutch(true);
    mcLaren.changeGear(1);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(1000));
    mcLaren.changeGear(2);
    System.out.println(mcLaren.wheelSpeed(3000)); 
    mcLaren.operateClutch(true);
    mcLaren.changeGear(3);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(6000));
    
    System.out.println("*****Button**************");    
    class ClickListener implements Button.OnClickListener{
        public ClickListener(){
            System.out.println("I've been attached");
        }
        @Override
        public void onClick(String title){
            System.out.println(title +" on 1 was clicked");
        }
    }
    
    btnPrint.setOnClickListener(new ClickListener());
  listen();
     System.out.println("************ Anymous clas*****");
      btnPrint.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(String title) {
                System.out.println(title+ " on anymous was clicked");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });  
    
    listen();
    }
    private static void listen(){
        boolean quit =false;
        while(!quit){
            int choice= scanner.nextInt();
        
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
