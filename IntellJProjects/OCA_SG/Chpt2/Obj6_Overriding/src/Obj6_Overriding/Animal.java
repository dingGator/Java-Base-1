package Obj6_Overriding;

/**
 * Created by Ki on 11/23/2016.
 */
public class Animal {
    public void eat() {
        System.out.println("Anicmal Public Generic Animal Eating Generically");

    }

    //eatPrivate:  is private thus is NOT inheritable (usable) by amy method
    private void eatPrivate() {
        System.out.println(" Animal Private Generic Animal Eating Generically");
    }


    public void printYourself() {
        System.out.println("Animal Print yourself ");
    }

    public void eatThrow() throws Exception {
        System.out.println(" Animal eatThrow throws Exception ");
    }


}
