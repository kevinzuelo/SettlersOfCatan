import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private HexTile[] gameBoard;


    public Board(){
        gameBoard = new HexTile[19];
    }

    public HexTile[] getGameBoard() {
        return gameBoard;
    }

    public HexTile[] generateRow(int rowLength) {
        HexTile[] row = new HexTile[rowLength];
        for (int i = 0; i < rowLength ; i++) {
            row[i] = new HexTile(i).setResource(Resource.resourcePool.get(i));
            //TODO wrap setNumberTile in If statement to check for desert
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
        HexTile[] gameBoard = generateRow(19);
        this.gameBoard = gameBoard;
    }


}
