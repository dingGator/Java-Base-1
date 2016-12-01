package Obj2_ReturnRules;

/**
 * Created by Ki on 12/1/2016.
 */
public interface Chewable {

    public class Gum implements Chewable{}

    public class TestChewable{
        // Method with an interface return type
        public Chewable getChewable(){
            System.out.println("Chewable getChewable return new Gum");
            return new Gum();
        }
    }

}
