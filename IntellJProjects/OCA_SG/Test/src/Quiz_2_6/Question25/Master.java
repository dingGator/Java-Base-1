package Quiz_2_6.Question25;

/**
 * Created by Ki on 2/8/2017.
 */

import java.io.*;

public class Master {
    String doFileStuff() throws FileNotFoundException {
        return "a";
    }
}

class Slave extends Master {
    public static void main(String[] args) {
        String s = null;
        try {
            s = new Slave().doFileStuff();
        } catch (Exception x) {
            s = "b";
        }
        System.out.println(s);
    }

   //yes String doFileStuff() { return "b";    }

   //no String doFileStuff() throws IOException {   return "b";  }

   //yes String doFileStuff(int x) throws IOException {  return "b";    }

   //yes String doFileStuff() throws FileNotFoundException { return "b";    }

   //yes String doFileStuff() throws NumberFormatException { return "b";    }

   //yes String doFileStuff() throws NumberFormatException, FileNotFoundException { return "b"; }

}

