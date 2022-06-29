import java.util.ArrayList;
import java.util.List;

public class Edge {
    private List<Location> locations;
    private Road road;

    public static final List<Edge> edges = new ArrayList<>();

    public Edge(Location to, Location from) {
        locations = new ArrayList<>();
        this.locations.add(to);
        this.locations.add(from);

    }

    public List<Location> getLocations() {
        return locations;
    }

    public List<GamePiece> getLocationsPieces() {
        List<GamePiece> locationsPieces = new ArrayList<>();

        for(Location location : locations) {
            locationsPieces.add(location.getGamePiece());
        }
        return locationsPieces;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public Road getRoad() {
        return road;
    }
}
