package Obj2_ReturnRules;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Button button = new Button();
        button.doStuff();

        System.out.println("*** button.go()  " + Arrays.toString(button.go()));

        System.out.println("*** button.foo3()  " + button.foo3());


        System.out.println("*** button.foo4() " + button.foo4());

        button.bar();

        Animal animal = new Animal();
        animal.setAnimal("Main horse");
        System.out.println("*** Main   animal.getAnimal()  " + animal.getAnimal());

        Animal horse = new Horse();
        horse.setAnimal("horse");
        System.out.println("*** Main  horse.getAnimal()  " + horse.getAnimal());
        //horse.horseGallop();  // can NOT call horseGallop


        Horse horse1 = new Horse();
        horse1.horseGallop();
        horse1.setAnimal("Main horse");
        System.out.println("*** Main horse1.getAnimal()  " + horse1.getAnimal());

        Gum gum = new Gum();
        TestChewable testChewable = new TestChewable();
        gum.gumOut();
       testChewable.getChewable();
    }


}
