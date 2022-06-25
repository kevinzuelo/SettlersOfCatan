import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private String locationLabel;
    private GamePiece gamePiece;
    private List<HexTile> adjHexTiles;
    private List<Edge> edges = new ArrayList<>();

    public static final List<Location> LOCATIONS = new ArrayList<>();
    static {

        // Creates and links "outer ring" of 30 locations
        LOCATIONS.add(new Location("A0"));
        LOCATIONS.add(new Location("AB", LOCATIONS.get(0)));
        LOCATIONS.add(new Location("B0", LOCATIONS.get(1)));
        LOCATIONS.add(new Location("BC", LOCATIONS.get(2)));
        LOCATIONS.add(new Location("C0", LOCATIONS.get(3)));
        LOCATIONS.add(new Location("C1", LOCATIONS.get(4)));
        LOCATIONS.add(new Location("CD", LOCATIONS.get(5)));
        LOCATIONS.add(new Location("D1", LOCATIONS.get(6)));
        LOCATIONS.add(new Location("DE", LOCATIONS.get(7)));
        LOCATIONS.add(new Location("E1", LOCATIONS.get(8)));
        LOCATIONS.add(new Location("E2", LOCATIONS.get(9)));
        LOCATIONS.add(new Location("EF", LOCATIONS.get(10)));
        LOCATIONS.add(new Location("F2", LOCATIONS.get(11)));
        LOCATIONS.add(new Location("FG", LOCATIONS.get(12)));
        LOCATIONS.add(new Location("G2", LOCATIONS.get(13)));
        LOCATIONS.add(new Location("G3", LOCATIONS.get(14)));
        LOCATIONS.add(new Location("GH", LOCATIONS.get(15)));
        LOCATIONS.add(new Location("H3", LOCATIONS.get(16)));
        LOCATIONS.add(new Location("HI", LOCATIONS.get(17)));
        LOCATIONS.add(new Location("I3", LOCATIONS.get(18)));
        LOCATIONS.add(new Location("I4", LOCATIONS.get(19)));
        LOCATIONS.add(new Location("IJ", LOCATIONS.get(20)));
        LOCATIONS.add(new Location("J4", LOCATIONS.get(21)));
        LOCATIONS.add(new Location("JK", LOCATIONS.get(22)));
        LOCATIONS.add(new Location("K4", LOCATIONS.get(23)));
        LOCATIONS.add(new Location("K5", LOCATIONS.get(24)));
        LOCATIONS.add(new Location("KL", LOCATIONS.get(25)));
        LOCATIONS.add(new Location("L5", LOCATIONS.get(26)));
        LOCATIONS.add(new Location("LA", LOCATIONS.get(27)));
        LOCATIONS.add(new Location("A5", LOCATIONS.get(28)));
        LOCATIONS.get(29).addEdge(LOCATIONS.get(0),LOCATIONS.get(29));

        // Creates and links "middle ring" of 18 locations
        LOCATIONS.add(new Location("ABM"));
        LOCATIONS.add(new Location("BNM", LOCATIONS.get(30)));
        LOCATIONS.add(new Location("BCN", LOCATIONS.get(31)));
        LOCATIONS.add(new Location("CDN", LOCATIONS.get(32)));
        LOCATIONS.add(new Location("NDO", LOCATIONS.get(33)));
        LOCATIONS.add(new Location("DEO", LOCATIONS.get(34)));
        LOCATIONS.add(new Location("OEF", LOCATIONS.get(35)));
        LOCATIONS.add(new Location("OFP", LOCATIONS.get(36)));
        LOCATIONS.add(new Location("PFG", LOCATIONS.get(37)));
        LOCATIONS.add(new Location("PGH", LOCATIONS.get(38)));
        LOCATIONS.add(new Location("QPH", LOCATIONS.get(39)));
        LOCATIONS.add(new Location("QHI", LOCATIONS.get(40)));
        LOCATIONS.add(new Location("JQI", LOCATIONS.get(41)));
        LOCATIONS.add(new Location("RQJ", LOCATIONS.get(42)));
        LOCATIONS.add(new Location("KRJ", LOCATIONS.get(43)));
        LOCATIONS.add(new Location("LRK", LOCATIONS.get(44)));
        LOCATIONS.add(new Location("LMR", LOCATIONS.get(45)));
        LOCATIONS.add(new Location("AML", LOCATIONS.get(46)));
        LOCATIONS.get(47).addEdge(LOCATIONS.get(30),LOCATIONS.get(47));

        // Creates and links "inner ring" of 6 locations (center tile)
        LOCATIONS.add(new Location("MNS"));
        LOCATIONS.add(new Location("NOS", LOCATIONS.get(48)));
        LOCATIONS.add(new Location("SOP", LOCATIONS.get(49)));
        LOCATIONS.add(new Location("SPQ", LOCATIONS.get(50)));
        LOCATIONS.add(new Location("RSQ", LOCATIONS.get(51)));
        LOCATIONS.add(new Location("MSR", LOCATIONS.get(52)));
        LOCATIONS.get(53).addEdge(LOCATIONS.get(48), LOCATIONS.get(53));


    }

    public Location(String locationLabel) {
        this.locationLabel = locationLabel;
    }

    public Location(String locationLabel, Location to) {
        this.locationLabel = locationLabel;
        addEdge(to, this);
    }

    public void addEdge(Location to, Location from) {
        Edge edge = new Edge(to, from);
        to.edges.add(edge);
        from.edges.add(edge);

    }


    public void addAdjHexTile(HexTile hexTile) {
        adjHexTiles.add(hexTile);
    }


    public void setGamePiece(GamePiece gamePiece) { //TODO Distance Rule: must place settlements two spaces away from each other
        //Distance Rule: If I want to place a piece on a location i should check the adjTiles of that location and compare the odd/even vertices...?
        //example: if i want to place on a location on index 0,2 or 4 of a hexTile i just need to check that the adjTiles locations 1,3 or 5 does not contain a building
        this.gamePiece = gamePiece;

        if(gamePiece.getClass().getSimpleName().equals("Settlement")) {
            gamePiece.getPlayer().addVictoryPoints(1);
        }
        else if(gamePiece.getClass().getSimpleName().equals("City")) {
            gamePiece.getPlayer().addVictoryPoints(1);
        }
    }
}
