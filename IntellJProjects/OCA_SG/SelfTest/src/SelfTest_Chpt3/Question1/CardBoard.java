package SelfTest_Chpt3.Question1;

import javax.smartcardio.Card;

/**
 * Created by Ki on 12/28/2016.
 */
public class CardBoard {
    Short story =200;
    CardBoard go(CardBoard cb){
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();// eligible for garbage collection
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
        //do stuff
    }

}
