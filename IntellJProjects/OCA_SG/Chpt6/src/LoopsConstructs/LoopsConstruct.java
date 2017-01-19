package LoopsConstructs;

/**
 * Created by Ki on 1/18/2017.
 */
public class LoopsConstruct {
    public static void main(String[] args) {
        int x =2;
        while(x==2){
            System.out.println("x in while = "+x);
            ++x;
        }
        System.out.println("x exit while = "+x);
        System.out.println("*********************************");
        int a = 8;
        while(a >8) {
            System.out.println(" in the loop ");
            x =10;
        }
        System.out.println(" past the loop");
        System.out.println("*********************************");

        do{
            System.out.println("inside do loop");
        } while(false);

    }
}
