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
        LOCATIONS.add(new Location("A0 0"));
        LOCATIONS.add(new Location("AB 1", LOCATIONS.get(0)));
        LOCATIONS.add(new Location("B0 2", LOCATIONS.get(1)));
        LOCATIONS.add(new Location("BC 3", LOCATIONS.get(2)));
        LOCATIONS.add(new Location("C0 4", LOCATIONS.get(3)));
        LOCATIONS.add(new Location("C1 5", LOCATIONS.get(4)));
        LOCATIONS.add(new Location("CD 6", LOCATIONS.get(5)));
        LOCATIONS.add(new Location("D1 7", LOCATIONS.get(6)));
        LOCATIONS.add(new Location("DE 8", LOCATIONS.get(7)));
        LOCATIONS.add(new Location("E1 9", LOCATIONS.get(8)));
        LOCATIONS.add(new Location("E2 10", LOCATIONS.get(9)));
        LOCATIONS.add(new Location("EF 11", LOCATIONS.get(10)));
        LOCATIONS.add(new Location("F2 12", LOCATIONS.get(11)));
        LOCATIONS.add(new Location("FG 13", LOCATIONS.get(12)));
        LOCATIONS.add(new Location("G2 14", LOCATIONS.get(13)));
        LOCATIONS.add(new Location("G3 15", LOCATIONS.get(14)));
        LOCATIONS.add(new Location("GH 16", LOCATIONS.get(15)));
        LOCATIONS.add(new Location("H3 17", LOCATIONS.get(16)));
        LOCATIONS.add(new Location("HI 18", LOCATIONS.get(17)));
        LOCATIONS.add(new Location("I3 19", LOCATIONS.get(18)));
        LOCATIONS.add(new Location("I4 20", LOCATIONS.get(19)));
        LOCATIONS.add(new Location("IJ 21", LOCATIONS.get(20)));
        LOCATIONS.add(new Location("J4 22", LOCATIONS.get(21)));
        LOCATIONS.add(new Location("JK 23", LOCATIONS.get(22)));
        LOCATIONS.add(new Location("K4 24", LOCATIONS.get(23)));
        LOCATIONS.add(new Location("K5 25", LOCATIONS.get(24)));
        LOCATIONS.add(new Location("KL 26", LOCATIONS.get(25)));
        LOCATIONS.add(new Location("L5 27", LOCATIONS.get(26)));
        LOCATIONS.add(new Location("LA 28", LOCATIONS.get(27)));
        LOCATIONS.add(new Location("A5 29", LOCATIONS.get(28)));
        LOCATIONS.get(29).addEdge(LOCATIONS.get(0),LOCATIONS.get(29));

        // Creates and links "middle ring" of 18 locations
        LOCATIONS.add(new Location("ABM 30"));
        LOCATIONS.add(new Location("BNM 31", LOCATIONS.get(30)));
        LOCATIONS.add(new Location("BCN 32", LOCATIONS.get(31)));
        LOCATIONS.add(new Location("CDN 33", LOCATIONS.get(32)));
        LOCATIONS.add(new Location("NDO 34", LOCATIONS.get(33)));
        LOCATIONS.add(new Location("DEO 35", LOCATIONS.get(34)));
        LOCATIONS.add(new Location("OEF 36", LOCATIONS.get(35)));
        LOCATIONS.add(new Location("OFP 37", LOCATIONS.get(36)));
        LOCATIONS.add(new Location("PFG 38", LOCATIONS.get(37)));
        LOCATIONS.add(new Location("PGH 39", LOCATIONS.get(38)));
        LOCATIONS.add(new Location("QPH 40", LOCATIONS.get(39)));
        LOCATIONS.add(new Location("QHI 41", LOCATIONS.get(40)));
        LOCATIONS.add(new Location("JQI 42", LOCATIONS.get(41)));
        LOCATIONS.add(new Location("RQJ 43", LOCATIONS.get(42)));
        LOCATIONS.add(new Location("KRJ 44", LOCATIONS.get(43)));
        LOCATIONS.add(new Location("LRK 45", LOCATIONS.get(44)));
        LOCATIONS.add(new Location("LMR 46", LOCATIONS.get(45)));
        LOCATIONS.add(new Location("AML 47", LOCATIONS.get(46)));
        LOCATIONS.get(47).addEdge(LOCATIONS.get(30),LOCATIONS.get(47));

        // Creates and links "inner ring" of 6 locations (center tile)
        LOCATIONS.add(new Location("MNS 48"));
        LOCATIONS.add(new Location("NOS 49", LOCATIONS.get(48)));
        LOCATIONS.add(new Location("SOP 50", LOCATIONS.get(49)));
        LOCATIONS.add(new Location("SPQ 51", LOCATIONS.get(50)));
        LOCATIONS.add(new Location("RSQ 52", LOCATIONS.get(51)));
        LOCATIONS.add(new Location("MSR 53", LOCATIONS.get(52)));
        LOCATIONS.get(53).addEdge(LOCATIONS.get(48), LOCATIONS.get(53));

        // Links "outer ring" and "middle ring" together
        LOCATIONS.get(1).addEdge(LOCATIONS.get(30),LOCATIONS.get(1));
        LOCATIONS.get(3).addEdge(LOCATIONS.get(32),LOCATIONS.get(3));
        LOCATIONS.get(6).addEdge(LOCATIONS.get(33),LOCATIONS.get(6));
        LOCATIONS.get(8).addEdge(LOCATIONS.get(35),LOCATIONS.get(8));
        LOCATIONS.get(11).addEdge(LOCATIONS.get(36),LOCATIONS.get(11));
        LOCATIONS.get(13).addEdge(LOCATIONS.get(38),LOCATIONS.get(13));
        LOCATIONS.get(16).addEdge(LOCATIONS.get(39),LOCATIONS.get(16));
        LOCATIONS.get(18).addEdge(LOCATIONS.get(41),LOCATIONS.get(18));
        LOCATIONS.get(21).addEdge(LOCATIONS.get(42),LOCATIONS.get(21));
        LOCATIONS.get(23).addEdge(LOCATIONS.get(44),LOCATIONS.get(23));
        LOCATIONS.get(26).addEdge(LOCATIONS.get(45),LOCATIONS.get(26));
        LOCATIONS.get(28).addEdge(LOCATIONS.get(47),LOCATIONS.get(28));

        // Links "middle ring" to "inner ring"(center tile)

        LOCATIONS.get(31).addEdge(LOCATIONS.get(48),LOCATIONS.get(31));
        LOCATIONS.get(34).addEdge(LOCATIONS.get(49),LOCATIONS.get(34));
        LOCATIONS.get(37).addEdge(LOCATIONS.get(50),LOCATIONS.get(37));
        LOCATIONS.get(40).addEdge(LOCATIONS.get(51),LOCATIONS.get(40));
        LOCATIONS.get(43).addEdge(LOCATIONS.get(52),LOCATIONS.get(43));
        LOCATIONS.get(46).addEdge(LOCATIONS.get(53),LOCATIONS.get(46));


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

    public GamePiece getGamePiece() {
        return this.gamePiece;
    }

    public boolean canPlacePiece(Player player) {
        if(!hasRoad(player)) {
            System.out.println("Must place building connecting to one of your roads");
            return false;
        }
        for(Edge edge : edges) {
            for(Location location : edge.getLocations()) {
                if(location.getGamePiece() != null) {
                    System.out.println("Cannot place building one space away");
                    return false;

                }
            }
        }
        return true;
    }

    public boolean hasRoad(Player player) {
        for(Edge edge : edges) {
            if (edge.getRoad() != null && edge.getRoad().getColorOfPieces().equals(player.getColor())) {
                return true;
            }
        }
        return false;
    }


    public void setGamePiece(GamePiece gamePiece) { //TODO Distance Rule: must place settlements two spaces away from each other
        //Distance Rule: Check Location's edges and make sure their locations don't contain a gamepiece.
        // since the spot i want to place a piece on has to be null i can just check that all locations in edges are null
        // eg: every edge has a "from location" and "to location", if the location i want to put a piece on has 3 edges i can check that all 6 locations are null

        if(canPlacePiece(gamePiece.getPlayer())) {
            this.gamePiece = gamePiece;

            if(gamePiece.getClass().getSimpleName().equals("Settlement")) {
                gamePiece.getPlayer().addVictoryPoints(1);
            }
            else if(gamePiece.getClass().getSimpleName().equals("City")) {
                gamePiece.getPlayer().addVictoryPoints(1);
            }
        }

    }
}
