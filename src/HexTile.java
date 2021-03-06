import java.util.ArrayList;
import java.util.List;

public class HexTile {
    private int tileNum;
    private NumberTile numberTile;
    private Resource resource;
    private boolean hasRobber = false;

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

    public void setHasRobber(boolean hasRobber) {
        this.hasRobber = hasRobber;
    }
}
