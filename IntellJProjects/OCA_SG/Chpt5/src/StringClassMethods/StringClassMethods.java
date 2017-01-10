package StringClassMethods;

/**
 * Created by Ki on 1/9/2017.
 */
public class StringClassMethods {
    public static void main(String[] args) {
        String a = "airplane";
        System.out.println(a.charAt(2));
        String b = "taxi";
        System.out.println(b.concat(" cab"));
        String c = "library";
        System.out.println(c + " card");
        String d ="Atlantic";
        d+= " ocean";
        System.out.println(d);
        String e = "Exit";
        System.out.println(e.equalsIgnoreCase("EXIT"));
        System.out.println(e.equalsIgnoreCase("tixe"));
        String f = "01234567";
        System.out.println(f.length());
        String g = "oxoxoxox";
        System.out.println(g.replace('x', 'X'));
        String h= "0123456789";
        System.out.println(h.substring(5));
        System.out.println(h.substring(5,8));
        String i ="big surprise";
        System.out.println(i.toString());
        String j = "A New Moon";
        System.out.println(j.toUpperCase());
        String k = " hi ";
        System.out.println( k + "t");
        System.out.println( k.trim()+"t");
    }
}
