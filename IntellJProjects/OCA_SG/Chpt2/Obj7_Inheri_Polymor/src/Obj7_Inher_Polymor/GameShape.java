package Obj7_Inher_Polymor;

/**
 * Created by Ki on 11/20/2016.
 */
class GameShape {
    public void displayShape() {
        System.out.println("displaying shape");
    }

}

class PlayerPiece extends GameShape {
    public void movePiece() {
        System.out.println("moving game piece");
    }
}

class TilePiece extends GameShape {
    public void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }
}


