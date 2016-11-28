package Obj6_Overriding;

/**
 * Created by Ki on 11/26/2016.
 */
public class Dog2 extends Animal {
    public void eatThrow(){
        System.out.println(" Dog2 no Exception ");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("****Dog2 throws Exception");
        Animal dAnimal = new Animal();
        Animal dAnimalDog = new Dog2();

        Dog2 dDog = new Dog2();

        dAnimal.eatThrow();
        dDog.eatThrow();
        dAnimalDog.eatThrow();



    }
}
