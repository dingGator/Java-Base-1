package Obj6_Overriding;

import java.io.IOException;

/**
 * Created by Ki on 11/26/2016.
 */
public class Cat_illegalOverride extends Animal{


    //Error:  cannot be private void eatThrow()
    //becasue access Modifier is more restrictive
   // private void eatThrow(){

     public void eatThrow(){
        System.out.println("Cat_illegalOverride eatThrow");
    }

    public void eatThrowException() throws Exception{
        System.out.println(" Cat_illegalOverride eatThrowException() throws Exception ");
    }

    public void  eatThrow(String food){
        System.out.println(" eatThrow method overloaded NOT override: ");
        System.out.println(" eatThrow(String food): "+ food);
    }
    public void  eatThrowException(String food) throws Exception{
        System.out.println(" eatThrowException method overloaded NOT override: ");
        System.out.println(" eatThrowException(String food): "+ food);
    }
    /*
    Error:      public String eatThrow(){
     is not an override
     is not an overload

    public String eatThrow(){
        String food = "food";
        return food;
    }
    */


}
