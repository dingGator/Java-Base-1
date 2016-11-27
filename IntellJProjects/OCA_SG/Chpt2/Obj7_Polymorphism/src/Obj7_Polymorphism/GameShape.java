package Obj7_Polymorphism;

/**
 * Created by Ki on 11/23/2016.
 */
class GameShape {

    public void displayShape() {

        System.out.println("displayShape()....  displaying shape");
    }

}

class PlayerPiece extends GameShape implements AnimaTable{
    public void movePiece() {
        System.out.println("moving game piece");
    }

    public void animate(){
        System.out.println("animating...");
    }
}

class TilePiece extends GameShape {
    public void getAdjacent() {

        System.out.println("getting adjacent tiles");
    }
}



