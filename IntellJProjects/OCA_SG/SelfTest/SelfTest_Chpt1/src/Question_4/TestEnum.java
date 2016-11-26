package Question_4;

/**
 * Created by Ki on 11/17/2016.
 */

enum Animals{
    DOG("woof"),
    CAT("meow"),
    FISH("burble");
    String sound;
    Animals(String s) {sound =s;}
}
class TestEnum {
    static Animals a;
    public static void main(String[] args){
        System.out.println(a.DOG.sound +" " + a.FISH.sound);
    }
}
