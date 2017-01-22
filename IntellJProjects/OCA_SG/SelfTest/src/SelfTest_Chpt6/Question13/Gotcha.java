package SelfTest_Chpt6.Question13;

/**
 * Created by Ki on 1/21/2017.
 */
public class Gotcha {
    public static void main(String[] args) {
        //new Gotcha().go();  // stackOverFlow error
       /*
        try { new Gotcha().go();}

            catch (Error e){ System.out.println("ouch"); }
          output :  ouch*/
       //
       // output error  stackOverflowError
       /* try{ new Gotcha().go();}
        catch (Exception e){
            System.out.println("ouch");}
*/
    }
    void go(){
        go();
    }
}
