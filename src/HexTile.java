public class HexTile {
    private NumberTile numberTile;
    private String resource;
    private GamePiece[] vertices = new GamePiece[6];
    private GamePiece[] roads = new Road[6];

    public NumberTile getNumberTile() {
        return numberTile;
    }

    public GamePiece[] getVertices() {
        return vertices;
    }

    public GamePiece[] getRoads() {
        return roads;
    }

    public void setRoads(GamePiece[] roads) {
        this.roads = roads;
    }

    public void setVertices(GamePiece[] vertices) {
        this.vertices = vertices;
    }

    public void setNumberTile(NumberTile numberTile) {
        this.numberTile = numberTile;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
