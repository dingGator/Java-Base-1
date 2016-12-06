package Question8;

/**
 * Created by Ki on 12/5/2016.
 */
public class DogShow {
        public static void main(String[] args){ new DogShow().go();
        }
        void go(){
            new Hound().bark();
            ((Dog) new Hound()).bark();
            //((Dog) new Hound()).sniff();
        }
    }

