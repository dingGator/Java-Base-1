package Question12;

/**
 * Created by Ki on 12/5/2016.
 */
public class House extends Building {
    House(){
        System.out.print("h ");
    }
    House(String name){
        this(); System.out.print("hn "+ name);
    }

    public static void main(String[] args) {
        new House("x ");
    }
}
