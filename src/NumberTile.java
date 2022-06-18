import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberTile {
    private char tileLetter;
    private int tileNumber;
    private int probabilityMarker;
    public static List<NumberTile> numberTiles = new ArrayList<>();


    public NumberTile(char tileLetter, int tileNumber, int probabilityMarker) {
        this.tileLetter = tileLetter;
        this.tileNumber = tileNumber;
        this.probabilityMarker = probabilityMarker;
    }

    public char getTileLetter() {
        return tileLetter;
    }

    public int getTileNumber() {
        return tileNumber;
    }

    public int getProbabilityMarker() {
        return probabilityMarker;
    }

    static {
        numberTiles.add(new NumberTile('A',5,4));
        numberTiles.add(new NumberTile('B',2,1));
        numberTiles.add(new NumberTile('C',6,5));
        numberTiles.add(new NumberTile('D',3,2));
        numberTiles.add(new NumberTile('E',8,5));
        numberTiles.add(new NumberTile('F',10,3));
        numberTiles.add(new NumberTile('G',9,4));
        numberTiles.add(new NumberTile('H',12,1));
        numberTiles.add(new NumberTile('I',11,2));
        numberTiles.add(new NumberTile('J',4,3));        numberTiles.add(new NumberTile('A',5,4));
        numberTiles.add(new NumberTile('K',8,5));
        numberTiles.add(new NumberTile('L',10,3));
        numberTiles.add(new NumberTile('M',9,4));
        numberTiles.add(new NumberTile('N',4,3));
        numberTiles.add(new NumberTile('O',5,4));
        numberTiles.add(new NumberTile('P',6,5));
        numberTiles.add(new NumberTile('Q',3,2));
        numberTiles.add(new NumberTile('R',11,2));
    }
}
