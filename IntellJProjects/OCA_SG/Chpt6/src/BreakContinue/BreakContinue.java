package BreakContinue;

/**
 * Created by Ki on 1/19/2017.
 */
public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("\n /***************************/");
        for (int e =0; e<10; e++){
            System.out.println("Inside loop e = "+ e);
            continue;
        }


        System.out.println("\n /***************************/");
        Foo foo= new Foo();
        for(int f =0; f<10; f++){
            System.out.println("Inside loop f = "+f);
            if (foo.doStuff() ==5){
                continue;
            }
        }
    }
}
