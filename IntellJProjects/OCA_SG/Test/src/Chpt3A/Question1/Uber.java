package Chpt3A.Question1;

/**
 * Created by Ki on 12/30/2016.
 */
public class Uber {
    static int y =2;
    Uber(int x){
        this();
        y =y*2;
        System.out.println("Uber(int x) x =  " + x );
        System.out.println("uber(int x) y = " + y ); }
    Uber(){
        y++;
        System.out.println("Uber() y= "+ y);
    }
}
