package VariableInitialization;

/**
 * Created by Ki on 12/13/2016.
 */
public class Book {
    private String title;
    public String getTitle(){
        return title;
    }

    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("The title is " + b.getTitle());
        String s = b.getTitle();
        if(s !=null) {
            String t = s.toLowerCase();
        }
    }
}
