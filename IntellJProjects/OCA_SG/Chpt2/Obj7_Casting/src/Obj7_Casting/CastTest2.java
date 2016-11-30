package Obj7_Casting;

/**
 * Created by Ki on 11/28/2016.
 */
public class CastTest2 {
    public static void main(String[] args) {
        System.out.println("***main");
        Animal animal1 = new Animal();
       Animal a5 = new Dog();
        Dog d1 = (Dog) a5;  //casting the ref. var.
        //compile but fails later

        Animal animal2 = new Dog();
        Dog d2 = (Dog) animal2;
        //String s = (String) animal2;
        // Error animal can NOT be a string
        //inconvertible types

        Animal a3 = new Dog();
        Dog d3 = (Dog) a3;
        d3.doDogStuff();


        System.out.println("****  Animal[] a = {new Animal(), new Dog(), new Animal()}; ");


        Animal[] a = {new Animal(), new Dog(), new Animal()};


        for (Animal animal : a) {
            System.out.println("*****makeNoice() ");
            animal.makeNoice();
            if (animal instanceof Dog) {

                System.out.println("***instanceof  ");
                System.out.println("***((Dog) animal).playDead();  ");

                ((Dog) animal).playDead();
                System.out.println("***  Dog d =(Dog) animal;");

                Dog d = (Dog) animal;  //casting the ref. var.
                //compile but fails later

                System.out.println("*** d.playDead();  ");

                d.playDead();
            }

        }
    }

}
