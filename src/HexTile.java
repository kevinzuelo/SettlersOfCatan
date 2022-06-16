import java.util.ArrayList;
import java.util.List;

public class HexTile {
    private int tileNum;
    private NumberTile numberTile;

    private Resource resource;
    private List<Location> vertices;
    private List<Edge> edges;

    public HexTile(int num) {
        tileNum = num;
    }

    public NumberTile getNumberTile() {
        return numberTile;
    }

    public void setNumberTile(NumberTile numberTile) {
        this.numberTile = numberTile;
    }

    public Resource getResource() {
        return resource;
    }

    public HexTile setResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public List<Location> getVertices() {
        return vertices;
    }

    public void addLocation (Location location) {
        vertices.add(location);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
