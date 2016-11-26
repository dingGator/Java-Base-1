package Obj6_Overriding;

/**
 * Created by Ki on 11/23/2016.
 */
public class TestAnimals {
    public static void main(String[] args) {
        Animal aAnimal = new Animal();
        Animal bAnimal = new Horse();
        Horse aHorse = new Horse();

        System.out.println("***Test Animal: .eat()");
        aAnimal.eat();
        bAnimal.eat();

        aHorse.eat();

        System.out.println("***Test Animal: .buck()");
        aHorse.buck();

        //Error:  Animal does not have method: buck
        //only Horse does have method: buck
        //aAnimal.buck();
        //bAnimal.buck();


        //Error: bcs eatPrivate is private
        // aAnimal.eatPrivate();
        // bAnimal.eatPrivate();

        //Error: Horse did not inherit: eatPrivate() because private
        //aHorse.eatPrivate();  }




        System.out.println("***Test Animal: aAnimal.printYourself()");
        aAnimal.printYourself();
        System.out.println("***Test Animal: bAnimal.printYourself()");

        bAnimal.printYourself();
        System.out.println("***Test Animal: aHorse.printYourself()");

        aHorse.printYourself();
        System.out.println("***Test Animal: aDog2.eatThrow()");

        Dog2 aDog2= new Dog2();
        aDog2.eatThrow();
        System.out.println("***Test Animal: aDog2.eatThrow()");

        Animal dAnimal = new Animal();
        Animal dAnimalDog = new Dog2();

        Dog2 dDog = new Dog2();

        dAnimal.eatThrow();
        dDog.eatThrow();
        dAnimalDog.eatThrow();







    }
}
