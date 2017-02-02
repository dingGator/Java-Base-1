package Quiz_1_30.Question12;

/**
 * Created by Ki on 2/1/2017.
 */
class Alien {
    String invade(short ships){return "a few";}
    String invade(short... ships){return "many";}
    }
class Defender{
    public static void main(String[] args) {
        System.out.println(new Alien().invade((short)7));
    }
}
