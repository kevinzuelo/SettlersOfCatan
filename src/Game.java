import javax.swing.*;
import java.util.List;

public class Game {

    public static void main(String[] args) {


        Board board = new Board();
        board.generateGameBoard();

            Player kevin = new Player("Kevin", "Blue");

            Location.LOCATIONS.get(0).setGamePiece(new Settlement(kevin));
            Location.LOCATIONS.get(1).setGamePiece(new City(kevin));
            Location.LOCATIONS.get(30).setGamePiece(new Settlement(kevin));

            List<Location> temp = Location.LOCATIONS;

    }
}
