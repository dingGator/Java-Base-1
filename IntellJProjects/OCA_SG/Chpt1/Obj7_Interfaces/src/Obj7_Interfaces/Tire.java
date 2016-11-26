package Obj7_Interfaces;

/**
 * Created by Ki on 11/21/2016.
 */
class Tire implements Bounceable {
    public void bounce(){
        System.out.println("interfaces bounce");
    }
    public void setBounceFactor(int bf){
        System.out.println("setBounceFactor "+ bf);
    }
    public void bounce1(){
        System.out.println("interfaces bounce1 ");
    }
    public void bounce2(){
        System.out.println("interfaces bounce2 ");
    }
    public void bounce3(){
        System.out.println("interfaces bounce3");
    }
    public void bounce4(){
        System.out.println("interfaces bounce4 ");
    }
}
