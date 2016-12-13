package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */
public class Birthdate {
    int year;

    public static void main(String[] args) {
        Birthdate bd = new Birthdate();
        bd.showYear();
    }
    public void showYear(){
        System.out.println("the year is "+ year);
    }
}
