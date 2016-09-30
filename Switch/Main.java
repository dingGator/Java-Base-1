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
      int value =6;
      if (value ==1){
          System.out.println("Value " + value +" was 1");
      }else if (value==2){
          System.out.println("Values " + value +" was 2");
    }else {
          System.out.println("Values " + value +" was not 1 nor 2");
              
    }
      
      int switchValue =3;
      switch(switchValue){
          case 1:
              System.out.println("Value2 " + switchValue +" was 1");
             break;
          case 2:
              System.out.println("Value2 " + switchValue +"was 2");
             break;
         
          case 3:case 4:case 5:
              System.out.println("Value " + switchValue +" was 3 or 4 or 5 ");
              System.out.println("Value was " + switchValue);
             break;
         
              
          default:
              System.out.println("Value2 " + switchValue +" was not 1 nor 2");       
              break;
         
          
      }
      
       System.out.println("*********** Challenge**********");
                          
      
      //switch statement    char
      // new char variable
      //switch statement testing for A,B,D,E
      //display message if any are found
      //default: not found
      
      char switchChar='A';
      switch(switchChar){
          case 'A':
              System.out.println("switchChar " + switchChar +" is A was found ");       
              break;
          case 'B':
              System.out.println("switchChar " + switchChar +" is B");       
              break;
          case 'C':
              System.out.println("switchChar " + switchChar +" is C");       
              break;
              
          case 'D':
              System.out.println("switchChar " + switchChar +" is D");       
              break;
          case 'E':
              System.out.println("switchChar " + switchChar +" is E");       
              break;
          default:
             
              System.out.println("switchChar " + switchChar +" is not found");       
              break;
      }
      
      
      String month ="JaN";
      switch(month.toLowerCase()) {
          case "jan":
           System.out.println("month " + month +" is jan");       
              break;
         case "feb":
           System.out.println("month " + month +" is feb");       
              break;
         default:
             System.out.println("month " + month + " is not found");       
              break;};
        
           
      }
    
}
