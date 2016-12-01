package Obj2_ReturnRules;

/**
 * Created by Ki on 12/1/2016.
 */
public class Button {

    //RULES
    //1.   you can return "null" in a method
    // with an object reference return type

    public Button doStuff(){
        System.out.println("1.  Button doStuff");
        return null;
    }

    //2. An array is LEGAL return type
    public String [] go(){
        System.out.println("2.  Button String[] go()");
        return new String[]{
                "Fred", "Barney", "Wilma"
        };
    }

    //3.  In a method with a primitive return type
    // you can return any value or variable
    // that can be implicitly converted
    // to declared return type
    public int foo3(){
        System.out.println("3.  Button int foo3:  return char" +
                " is compatible to int ");
        char c = 'c';
        return c; // char is compatible with int
    }

    //4. In a method with a primitive return type
    // you can return any value or variable
    // that can be explicitly cast
    // to the declared return type
    //
    public int foo4(){
        System.out.println("4.  Button  int foo4 cast float to (int) ");
        float f = 32.5f;
        return (int) f;
    }

    //5.  You must not return anything from a method
    // with a void return type
    public void bar(){
        System.out.println("5.  Button public void Bar() = no return");
        //return "this is it";  NOT Legal
    }
    //6.  In a method with an object reference return type
    // you can return any object type that can be implicitly
    // cast to the declared return type
    public Animal getAnimalInButton(){
        System.out.println("6.  Button  Animal getAnimal()" +
                "return new Horse ");
        return new Horse();
    }

    public Object getObject(){
        System.out.println("6.  Button  Object getObject()");
        int[] nums = {1,2,3};
        return nums;
    }


}
