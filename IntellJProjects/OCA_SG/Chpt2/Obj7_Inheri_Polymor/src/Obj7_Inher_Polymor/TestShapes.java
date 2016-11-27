package Obj7_Inher_Polymor;

/**
 * Created by Ki on 11/21/2016.
 */
public class TestShapes {
    public static void main(String[] args) {
        System.out.println("*******TestShapes1********");
        PlayerPiece shape = new PlayerPiece();
        shape.displayShape();
        shape.movePiece();
        System.out.println("*******TestShapes2********");
        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);
        System.out.println("*******TestShapes3********");
        player.movePiece();
        tile.getAdjacent();
        System.out.println("*******TestShapes4********");
        GameShape gameShape = new GameShape();
        gameShape.displayShape();
        shape.movePiece();
        tile.getAdjacent();

    }

    public static void doShapes(GameShape shape) {
        shape.displayShape();
            }
}

