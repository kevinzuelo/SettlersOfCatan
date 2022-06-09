import java.util.ArrayList;
import java.util.List;

public class ResourceDeck {
    private List<Card> deck = new ArrayList<>();

    public List<Card> getDeck() {
        return deck;
    }

    public void generateDeck() {
        for (int i = 0; i < 19; i++) {
            deck.add(new Card("Lumber"));
            deck.add(new Card("Wool"));
            deck.add(new Card("Clay"));
            deck.add(new Card("Ore"));
            deck.add(new Card("Wheat"));

        }
    }
}

