package Literals;

/**
 * Created by Ki on 12/10/2016.
 */
public class FloatingPoint {
    public static void main(String[] args) {
        //float f = 2.3467890;
        float fl = 49837849.029847F;
        double d = 110599.995211D;
        double g = 987.897;
        boolean t = true;
        boolean f = false;
        char a = 'a';
        char b = 'b';
        char letterN = '\u004E';
        char a1 = 0x892;
        char b1 = 982;
        char c1 = (char) 70000;
        char d1 = (char) -98;
        // char e1 =-29;
        // char f1 = 70000;
        char c2 = '\"';  // double quote
        char d2 = '\n';     // a new line
        char tab = '\t';    // a tab

        String s = "Bill Joy";
        byte b2 = 27;
        byte b3 = (byte) 28;

        byte a4 = 3;
        byte b4 = 8;
        //byte c4 = a4 + b4; // compiler error: sum requires int
        byte c4 = (byte) (a4 + b4);


        System.out.println("float f = 2.3467890; // not legal " +
                "\n float f = 49837849.029847F; = has F suffix  " + fl +
                "\n double d = 110599.995211D;  optional D suffix  " + d +
                "\n double g = 987.897;   " + g +
                "\n boolean t = " + t +
                "\n boolean f = 0 //not legal" +
                "\n char a ='a';  " + a +
                "\n char b = 'b'; " + b +
                "\n char letterN =  u004E ; =  ;  " + letterN +
                "\n char a1=  ;  " + a1 +
                "\n char e1 =-29;  // compiler error not legal" +
                "\n char f1 = 70000;  // compiler error" +
                "\n char c2 = '\\\"';  //  double quote" +
                "\n char d2 = '\\n';   // new line " +
                "\n char tab = '\\t';   // tab     " +
                "\n String s = \"Bill Joy\";   " + s +
                "\n Bill" + " Joy" +
                "\n byte b2 =27;  " + b2 +
                "\n byte b3 = (byte)28;  " + b3 +
                "\n byte a4 =3; " + a4 +
                "\n byte b4 = 8;  " + b4 +
                "\n byte c4 = a4 + b4; // compiler error: sum requires int   " +
                "\n byte c4 = (byte)(a4+b4);  " + c4


        );
    }

}
