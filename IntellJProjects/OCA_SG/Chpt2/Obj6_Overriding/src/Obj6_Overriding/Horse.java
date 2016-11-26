package Obj6_Overriding;

/**
 * Created by Ki on 11/23/2016.
 */
class Horse extends Animal {

    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");}


    public void buck(){
        System.out.println("Horse buck");
    }

   public void printYourself(){
       System.out.println("Horse super.printYourself ");
       super.printYourself();
   }
}
