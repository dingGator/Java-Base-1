package Quiz_2_6.Question38;

/**
 * Created by Ki on 2/9/2017.
 */
public class Mineral {}
class Gem extends Mineral{}
class Miner {
    static int x =7;
    static String s = null;
    public static void getWeight(Mineral m) {
        int y = 0 / x;
        System.out.println(s + " ");
    }

    public static void main(String[] args) {
        Mineral[] ma = {new Mineral(), new Gem()};
        for(Object o:ma)
            getWeight((Mineral)o);
    }

    }


