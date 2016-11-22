package abstractClass_Ex;

/**
 * Created by Ki on 11/9/2016.
 */
public abstract class Convertible extends Car{
    public void doThings(){

        SportsCar sc = new SportsCar();
        sc.goFast();
    }
    public void doMore(){
        goFast();
    }
}
