package Obj6_Overriding;

/**
 * Created by Ki on 11/27/2016.
 */
public class UseAnimals {
    public void doStuff(Animal a){
        System.out.println("In the Animal version: ");
    }
    public void doStuff(Horse h){
        System.out.println("In the Horse version");
    }

    public static void main(String[] args) {
        System.out.println("***UseAnimals     ua.doStuff ");

        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        Animal animalRefToHorse = new Horse();


        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
        ua.doStuff(animalRefToHorse);

        System.out.println("***UseAnimals     a.doStuff ");

        Animal a = new Animal();
        a.eat();

        Horse h =new Horse();
        h.eat();

        Animal ah = new Horse();
        ah.eat();

        Horse he = new Horse();
        he.eat("Apples");

        Animal a2 = new Animal();
    //    a2.eat("treats");

        Animal ah2 = new Horse();
      //  ah2.eat("Carrots");



    }
}
