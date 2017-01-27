package Quiz_1_26.Question6;

/**
 * Created by Ki on 1/26/2017.
 */
public class Allen {
    String invade(short ships){return "a few";}
    String invade (short... ships){return "many";}

}
class Defender {
    public static void main(String[] args) {
        System.out.println(new Allen().invade((short)7));
    }
}
