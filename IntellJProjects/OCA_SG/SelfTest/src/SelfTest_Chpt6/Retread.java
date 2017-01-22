package SelfTest_Chpt6;

/**
 * Created by Ki on 1/22/2017.
 */
class MyException extends Exception {}
class Tire{
    void doStuff(){}
}
public class Retread extends Tire{
    public static void main(String[] args) {
        new Retread().doStuff();
    }
    //void doStuff(){ compile but not run
    //void doStuff() throws MyException{  //Not compile
    void doStuff() throws RuntimeException{  //compile but not run
    //void doStuff() throws ArithmeticException{  compile but not run
        System.out.println(7/0);
    }

}
