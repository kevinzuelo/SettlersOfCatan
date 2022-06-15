import java.util.ArrayList;
import java.util.List;

public class HexTile {
    private NumberTile numberTile;
    private String resource;
    private List<Location> vertices;
    private List<Edge> edges;

    public NumberTile getNumberTile() {
        return numberTile;
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

    public List<Location> getVertices() {
        return vertices;
    }

    public void setVertices(List<Location> vertices) {
        this.vertices = vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
