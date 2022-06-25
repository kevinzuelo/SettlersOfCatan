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

    public List<Location> getLocation() {
        return locations;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

}
