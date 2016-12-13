package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */
public class Birthdays {
    static int [] year = new int[100];

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            System.out.println("year = [" + i + "]= "+ year[i]);
        }
    }
}
