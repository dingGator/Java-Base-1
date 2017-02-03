package Quiz_1_30.Question22;

import Quiz_1_29.Question5.Mid;
import Quiz_1_29.Question5.Upper;

/**
 * Created by Ki on 2/2/2017.
 */
class Under extends Mid {
        static String s=" ";

        public static void main(String[] args) {
            Upper u = new Under();
         //   s = u.go();
            Mid m = (Mid)u;
         //   System.out.println(s += m.go());
        }
    }

