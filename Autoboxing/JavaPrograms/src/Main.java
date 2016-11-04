
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
class IntClass{
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
        
    }
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");
        // can not use ArrayList with primitive type = int
  //      ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass>intClassArrayList = 
                new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doublevalue = new Double(12.25);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
       
 System.out.println( " Integer Autoboxing ");        
// autoBoxing  valueOf taking an integer and making it into a class
        for (int i =0; i<=10;i++){
            //do not need to use valueOf   Java does it automatically
           // intArrayList.add(Integer.valueOf(i));
            intArrayList.add(i);
        }
        //unboxing  taking
        for (int i =0; i<=10;i++){
            System.out.println(i+ " --> " +intArrayList.get(i).intValue());
        }
        Integer myIntValue =56;   //Integer.valueOf(56)
        int myInt = myIntValue.intValue();   //myIntValue.intValue()
         System.out.println(" Double Autoboxing array " );
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10.0; dbl+= 0.5){
            //do not need to use valueOf(dbl) //   Java does it automatically
           // myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl);
        }
        for(int i =0; i< myDoubleValues.size(); i++){
         //   double value = myDoubleValues.get(i).doubleValue();
           double value = myDoubleValues.get(i);
            System.out.println(i +" --> "+ value );
           
        }
    }
    
}
