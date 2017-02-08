package Quiz_2_6.Question14;

/**
 * Created by Ki on 2/7/2017.
 */
class Animal {
}

class Gerbil extends Animal {
}

class Vet {
    Animal go() {
        return new Animal();
    }
}

class SmallAnimalVet extends Vet {
    // Gerbil go(){return new Gerbil();}
    //Animal go(){return new Animal();}
    // Gerbil go(){return new Animal();}  // not compile
    // Animal go(){ return new Gerbil();}
}



