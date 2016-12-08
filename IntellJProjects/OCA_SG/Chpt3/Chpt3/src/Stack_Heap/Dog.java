package Stack_Heap;

/**
 * Created by Ki on 12/7/2016.
 */
public class Dog {
    Collar c;
    String name;

    public static void main(String[] args) {
        Dog d;
        d= new Dog();
        d.go(d);
        System.out.println("d.go  ");
                 d.go(d);

    }
    void go(Dog dog){
        c = new Collar();
        dog.setName("Aiko");
        System.out.println("dog  name:  "+ name);
   }
   void setName(String dogName){
       name = dogName;
   }
}
