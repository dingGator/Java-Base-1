package Obj6_Overriding;

/**
 * Created by Ki on 11/23/2016.
 */
public class TestAnimals {
    public static void main(String[] args) throws Exception {
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

        Dog2 aDog2 = new Dog2();
        aDog2.eatThrow();
        System.out.println("***Test Animal: aDog2.eatThrow()");

        Animal dAnimal = new Animal();
        Animal dAnimalDog = new Dog2();

        Dog2 dDog = new Dog2();

        dDog.eatThrow();
        //Error: not handled exception in the main
        //  dAnimal.eatThrow();
        // dAnimalDog.eatThrow();
        System.out.println("***Test Animal: catAnimal.eatThrow()");

        Animal catAnimal = new Animal();
        Animal catAnimalCatIllegal = new Cat_illegalOverride();
        Cat_illegalOverride cat_illegalOverride = new Cat_illegalOverride();

        //Error because eatThrow in Cat_illegalOverride is private
        //Access modifier is more restrictive than the eatThrow in Animal
        // cat_illegalOverride.eatThrow();
        //cat_illegalOverride.eatThrow();
        System.out.println("***Test Animal: catAnimal.eatThrow() ***  try/catch ");

        try {
            catAnimal.eatThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            catAnimal.eatThrowException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("***Test Animal: catAnimal.eatThrow() *** .eatThrowException ");
        catAnimal.eatThrow();
        catAnimal.eatThrowException();

        System.out.println("***Test Animal: catAnimalCatIllegal.eatThrow() *** .eatThrowException ");

        catAnimalCatIllegal.eatThrow();
        catAnimalCatIllegal.eatThrowException();

        System.out.println("***Test Animal: catIllegalOverride.eatThrow() *** .eatThrowException ");

        cat_illegalOverride.eatThrow();
        cat_illegalOverride.eatThrowException();

        System.out.println("***Test Animal: cat_illegalOverride.eatThrow(fish) *** .eatThrowException(fish) ");

        String fish = "fish";
        cat_illegalOverride.eatThrow(fish);
        cat_illegalOverride.eatThrowException(fish);


    }
}
