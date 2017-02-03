package Quiz_1_30.Question13;

/**
 * Created by Ki on 2/1/2017.
 */
import java.io.*;
class Master {
    String doFileStuff() throws FileNotFoundException{ return "a"; }
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

    //a yes    String doFileStuff(){return "b";}
    //b no     String doFileStuff()throws IOException {return "b";}
    //c yes    String doFileStuff(int x) throws IOException {return "b";}
    //d yes    String doFileStuff() throws  FileNotFoundException {return "b";}
    //e yes    String doFileStuff() throws NumberFormatException{return "b"; }
    //f yes    String doFileStuff() throws NumberFormatException, FileNotFoundException {
     //     return "b";}
}