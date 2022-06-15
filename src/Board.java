import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<String, HexTile> gameBoard = new HashMap<>();
    private List<HexTile[]> rows = new ArrayList<>();

    public Map<String, HexTile> getGameBoard() {
        return gameBoard;
    }

    public List<HexTile[]> getRows() {
        return rows;
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

//    public void connectTilesInRows() {
//        for(HexTile[] row : rows) {
//            for (int i = 0; i < row.length - 1; i++) {
//                row[i].setVertex;
//            }
//        }
//    }

    public void generateGameBoard() {
        HexTile[] firstRow = generateRow(3);
        rows.add(firstRow);
        HexTile[] secondRow = generateRow(4);
        rows.add(secondRow);
        HexTile[] thirdRow = generateRow(5);
        rows.add(thirdRow);
        HexTile[] fourthRow = generateRow(4);
        rows.add(fourthRow);
        HexTile[] fifthRow = generateRow(3);
        rows.add(fifthRow);



    }


}
