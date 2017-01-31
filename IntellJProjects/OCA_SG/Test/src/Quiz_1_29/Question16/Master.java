package Quiz_1_29.Question16;

/**
 * Created by Ki on 1/30/2017.
 */
import java.io.*;
public class Master {
    String doFileStuff() throws FileNotFoundException{return "a";}
}
class Slave extends Master{
    public static void main(String[] args) {
        String s =null;
        try{s= new Slave().doFileStuff();
    }catch (Exception x){
        s="b";}
        System.out.println(s);
    }
    //String doFileStuff(){return "b";}                             //output b
    //String doFileStuff() throws IOException{return "b";}          //not compile
    //String doFileStuff(int x)  throws IOException{return "b";}    //output a
    //String doFileStuff() throws FileNotFoundException{return "b";}  //output b
    //String doFileStuff() throws NumberFormatException{return "b";}    //output b
    String doFileStuff() throws NumberFormatException, FileNotFoundException { return "b";}
    //output b
}
