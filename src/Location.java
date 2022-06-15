import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private String locationLabel;
    private List<Edge> edges;
    private GamePiece gamePiece;

    public Location(String locationLabel) {
        this.locationLabel = locationLabel;
        edges = new ArrayList<>();
    }

    public void addEdge(Location to, Location from, Road road) {
        Edge edge = new Edge(to, from, road);
        edges.add(edge);
        from.edges.add(edge);

    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }
}
