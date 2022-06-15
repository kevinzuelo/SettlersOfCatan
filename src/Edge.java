import java.util.ArrayList;
import java.util.List;

public class Edge {
    private List<Location> locations;
    private Road road;


    public Edge(Location to, Location from, Road road) {
        locations = new ArrayList<>();
        this.locations.add(to);
        this.locations.add(from);
        this.road = road;

    }




    public List<Location> getLocation() {
        return locations;
    }

    public Road getRoad() {
        return road;
    }
}
