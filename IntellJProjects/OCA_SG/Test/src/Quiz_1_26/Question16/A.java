package Quiz_1_26.Question16;

/**
 * Created by Ki on 1/26/2017.
 */
public class A {
    public void say(){ System.out.println("Hey! "); }
}
class B extends A{
    public void say(String name){System.out.print ("Hello, "+ name);}
}
class C extends A{}
class Start{
    public static void main(String[] args) {
       // A b = new A();
       // A b = new B();
       // A b = new C();
       // B b = new A();
        B b = new B();  //compile good
       //B b = new C();
       // C b = new C();
        b.say();
        b.say("John Lennon");
    }
}
