package Obj2_ReturnRules;

/**
 * Created by Ki on 12/1/2016.
 */
public class Animal {
    String animal1;
    public void setAnimal(String animal){
        System.out.println("Animal setAnimal   animal = [" + animal + "]");
        animal1= animal;
    }
    public String getAnimal(){
        System.out.println(" Animal getAnimal return animal1");
        return animal1;
    }
}
