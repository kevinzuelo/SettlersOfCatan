
public class Board {
    private HexTile[] gameBoard;

    public Board(){
        gameBoard = new HexTile[19];
    }

    public HexTile[] generateRow(int rowLength) {
        HexTile[] row = new HexTile[rowLength];
        for (int i = 0, j = 0; i < rowLength ; i++,j++) {
            row[i] = new HexTile(i).setResource(Resource.resourcePool.get(i));
            //TODO fix if desert is first tile
            if(row[i].getResource().equals(Resource.desert)) {
                row[i].setHasRobber(true);
                j--;
            }
            else {
                row[i].setNumberTile(NumberTile.numberTiles.get(j));
            }
        }
        return row;
    }

    public void generateGameBoard() {
        HexTile[] gameBoard = generateRow(19);
        this.gameBoard = gameBoard;
    }

}
