package Quiz_1_29.Question5;

import javax.sound.midi.spi.MidiDeviceProvider;

import static javax.swing.text.html.HTML.Tag.U;

/**
 * Created by Ki on 1/29/2017.
 */
public class Under extends Mid {
    static String s=" ";

    public static void main(String[] args) {
        Upper u = new Under();
        s = u.go();
        Mid m = (Mid)u;
        System.out.println(s += m.go());
    }
}
