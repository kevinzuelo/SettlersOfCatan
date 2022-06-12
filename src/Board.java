import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    Map<String, HexTile> gameBoard = new HashMap<>();

    public Map<String, HexTile> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Map<String, HexTile> gameBoard) {
        this.gameBoard = gameBoard;
    }

    public HexTile[] generateRow(int rowLength) {
        HexTile[] row = new HexTile[rowLength];
        for (int i = 0; i < rowLength ; i++) {
            row[i] = new HexTile();
        }
        return row;
    }

    public void generateGameBoard() {
        HexTile[] firstRow = generateRow(3);
        HexTile[] secondRow = generateRow(4);
        HexTile[] thirdRow = generateRow(5);
        HexTile[] fourthRow = generateRow(4);
        HexTile[] fifthRow = generateRow(3);
    }
}
