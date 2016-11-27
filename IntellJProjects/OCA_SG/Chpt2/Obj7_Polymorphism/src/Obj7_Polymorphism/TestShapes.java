package Obj7_Polymorphism;

/**
 * Created by Ki on 11/23/2016.
 */
public class TestShapes {

    public static void main(String[] args) {
        System.out.println("******PlayerPiece shape.displayShape: ********");
        PlayerPiece shape = new PlayerPiece();
        shape.displayShape();
        System.out.println("******* shape.movePiece: ********");

        shape.movePiece();

        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        System.out.println("*******doShapes(player);********");

        doShapes(player);
        System.out.println("*******doShapes(tile);********");

        doShapes(tile);
        System.out.println("*******player.movePiece()********");
        player.movePiece();
        System.out.println("*******tile.getAdjacent()********");

        tile.getAdjacent();
        System.out.println("*******GameShape********");
        GameShape gameShape = new GameShape();
        gameShape.displayShape();
        shape.movePiece();
        tile.getAdjacent();

        System.out.println("*******legal********");
        PlayerPiece playerLegal = new PlayerPiece();
        playerLegal.displayShape();
        Object objectLegal = playerLegal;
       // objectLegal.displayShape();
        GameShape shapeLegal = playerLegal;
        shapeLegal.displayShape();
        AnimaTable moverLegal = playerLegal;
       // moverLegal.displayShape();




    }

    public static void doShapes(GameShape shape) {
        System.out.println("******doShapes(GameShape shape)***** ");
        shape.displayShape();
    }
}


