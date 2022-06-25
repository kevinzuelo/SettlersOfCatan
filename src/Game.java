import javax.swing.*;
import java.util.List;

public class Game {

    public static void main(String[] args) {


        Board board = new Board();
        board.generateGameBoard();
//
//        board.getRows().get(0)[0].setPiece(1,new Settlement());

//        System.out.println(board.getRows().get(0)[0].getVertices()[1].getClass());
//        board.connectTilesInRows();
//
//        System.out.println(board.getRows().get(0)[1].getVertices()[5].getClass());

            Player kevin = new Player("Kevin", "Blue");



            Location.LOCATIONS.get(0).setGamePiece(new Settlement(kevin));
            Location.LOCATIONS.get(1).setGamePiece(new City(kevin));

            List<Location> temp = Location.LOCATIONS;


    }
}
