import java.util.List;

public class Player {
    private String name;
    private String color;
    private int victoryPoints = 0;
    private List<Card> resources;

    public String getColor() {
        return color;
    }

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void addVictoryPoints(int victoryPoints) {
        this.victoryPoints += victoryPoints;
    }

    private List<Card> developmentCards;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getResources() {
        return resources;
    }

    public void setResources(List<Card> resources) {
        this.resources = resources;
    }

    public List<Card> getDevelopmentCards() {
        return developmentCards;
    }

    public void setDevelopmentCards(List<Card> developmentCards) {
        this.developmentCards = developmentCards;
    }
}
