package Chpt3A.Question1.Question13;

/**
 * Created by Ki on 12/30/2016.
 */
public class Ouch {
    public static void main(String[] args) {
        new Ouch().bleh();
    }
    public void bleh(){
        for(int i =0; i< 10; i++){
            int f =4;
            String name = "Bob = ";
            if (i>7) f++;
            else f+=2;
        }
       // System.out.println(name +f);
    }
}
