public class Game {


    public static void main(String[] args) {
//        HexTile lumberTile = new HexTile();
//        lumberTile.setResource("Lumber");
//
//        HexTile oreTile = new HexTile();
//        oreTile.setResource("ore");
//
//
//        lumberTile.getVertices()[0] = new City();
//        lumberTile.getVertices()[1] = new Settlement();
//
//        oreTile.getVertices()[5] = lumberTile.getVertices()[1];
//
//        Board board = new Board();
//        board.generateGameBoard();
//
//        board.getRows().get(0)[0].setPiece(1,new Settlement());

//        System.out.println(board.getRows().get(0)[0].getVertices()[1].getClass());
//        board.connectTilesInRows();
//
//        System.out.println(board.getRows().get(0)[1].getVertices()[5].getClass());


            Location a1 = new Location("A1");
            Location a2 = new Location("A2");
            Road a1Edge = new Road("blue");

            a1.addEdge(a1,a2,a1Edge);

    }
}
