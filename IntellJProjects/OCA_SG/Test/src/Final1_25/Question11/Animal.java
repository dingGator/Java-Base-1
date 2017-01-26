package Final1_25.Question11;

/**
 * Created by Ki on 1/25/2017.
 */
public class Animal {}
class Gerbil extends Animal{}
class Vet{
    Animal go(){return new Animal();}
}
class SmallAnimalVet extends Vet{
   // Gerbil go(){return new Gerbil();}
   //Animal go(){return new Animal();}
   // Gerbil go(){return new Animal();}  // not compile
   // Animal go(){ return new Gerbil();}
}