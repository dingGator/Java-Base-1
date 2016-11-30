package Obj6_Overloading1;

/**
 * Created by Ki on 11/27/2016.
 */
public class FooTest {
    public static void main(String[] args)  {
        System.out.println("***Foo foo.doStuff(3, hi) ");

        String hi = "hi";
        Foo foo = new Foo();
        foo.doStuff(3, hi);

        System.out.println("***Foo fooBar.doStuff(3, hi) ");

        Foo fooBar = new Bar();
        fooBar.doStuff(3, hi);

        System.out.println("***Bar bar.doStuff(3, hi) ");

        Bar bar = new Bar();
        bar.doStuff(3,hi);

        System.out.println("***Bar bar.doStuff(3, long1) ");

        long long1 = 1293940498;
       // bar.doStuff(3,long1);

        // Error:  foo and fooBar NOT overloading with doStuff
        // so long1 does not work
        //foo.doStuff(3,long1);
        //fooBar.doStuff(3,long1);
        System.out.println("***  .doStuff1() ");

        foo.doStuff1();
        fooBar.doStuff1();
        bar.doStuff1();

        System.out.println("***  .doStuff1(hi) ");
       //Error:
        // foo.doStuff1(hi);    //bcs foo  does not have doStuff1(String s)
       // fooBar.doStuff1(hi); // fooBar does not have doStuff1(String s)
        bar.doStuff1(hi);   // bar have both doStuff1() and doStuff1(String s)





    }


}
