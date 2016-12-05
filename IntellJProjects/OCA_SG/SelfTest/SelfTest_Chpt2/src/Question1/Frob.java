package Question1;

/**
 * Created by Ki on 12/4/2016.
 */
public class Frob extends Frob2 implements Frobnicate{
  //  public abstract void twiddle(String s){}
  public void twiddle(String i){
      System.out.println("Frob implements Frobnicate" +
              "  twiddle String i = [" + i + "]");

  }
   public void twiddle(Integer s){
       System.out.println("Frob implements Frobnicate" +
               "  twiddle int s = [" + s + "]");
   }
   // public void twiddle(Integer i){}
    public void twiddle2(String a){
        System.out.println("Frob implements Frobnicate" +
                "twiddle2 String a = [" + a + "]");
    }

}
