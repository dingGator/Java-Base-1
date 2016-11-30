package Obj7_Casting;

/**
 * Created by Ki on 11/28/2016.
 */
public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Animal a2 = (Animal) d;
    }
}
