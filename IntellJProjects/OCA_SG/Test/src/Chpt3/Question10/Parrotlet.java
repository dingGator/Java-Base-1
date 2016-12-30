package Chpt3.Question10;

/**
 * Created by Ki on 12/29/2016.
 */
public class Parrotlet extends Parrot {
    static void chirp(long loud){
        System.out.print("chirp "  );
    }

    public static void main(String[] args) {
        Parrotlet bokeh = new Parrotlet();
        bokeh.chirp(420);
      //
        bokeh.chirp(123_456_789_012);
    }
}
