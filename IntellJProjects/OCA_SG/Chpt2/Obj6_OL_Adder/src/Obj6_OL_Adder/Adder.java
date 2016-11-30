package Obj6_OL_Adder;

/**
 * Created by Ki on 11/26/2016.
 */
public class Adder {
    public int addThen(int x, int y){
        System.out.println("***Adder addThen(int x, int y" +
                " ***x = [" + x + "], y = [" + y + "]");

        int int_xAddy = x + y;
        return int_xAddy;
    }
    public double addThen(double x, double y){

        double double_xAddy =  x + y;
        System.out.println("***Adder addThen(double x,double y"+
                " ***x = [" + x + "], y = [" + y + "]");
        return  double_xAddy;
    }
}
