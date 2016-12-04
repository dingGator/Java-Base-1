package Obj6_Statics;

/**
 * Created by Ki on 12/3/2016.
 */
public class Dog extends Animal {

    static void doStuff() {
        System.out.println("Dog ***extends Animal" +
                "  doStuff   d  ");
    }

    @Override
    void doStuffNonStatic() {
        System.out.println("Dog extends Animal " +
                "  ***doStuffNonStatic()  d  ");
    }

    public static void main(String[] args) {

        Animal[] a = {new Animal(), new Dog(), new Animal()};
        System.out.println("for loop");
        for (int x = 0; x < a.length; x++) {
            System.out.println("***Dog extends Animal main  a[x].doStuff()  x =  " + x);

            a[x].doStuff();
            a[x].doStuffNonStatic();
        }

        System.out.println("**outside for loop  Dog.doStuff()");
        Dog.doStuff();
        //Dog.doStuffNonStatic();
        System.out.println("**outside for loop  dog.doStuff()");

        Dog dog = new Dog();
        dog.doStuff();
        dog.doStuffNonStatic();
        //   this.doStuffNonStatic();
        //  Animal.doStuff();

    }
}
