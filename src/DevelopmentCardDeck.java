import java.util.ArrayList;
import java.util.List;

public class DevelopmentCardDeck {
    private List<Card> deck = new ArrayList<>();

    public List<Card> getDeck() {
        return deck;
    }

    public void generateDeck() {
        for (int i = 0; i < 14; i++) {
            deck.add(new Card("Knight"));
        }
        for (int i = 0; i < 5; i++) {
            deck.add(new Card("Victory Point"));
        }
        for (int i = 0; i < 2; i++) {
            deck.add(new Card("Year of Plenty"));
            deck.add(new Card("Monopoly"));
            deck.add(new Card("Road Building"));
        }
    }
}
