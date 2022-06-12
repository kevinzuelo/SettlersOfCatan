import java.util.List;

public class Player {
    private String name;
    private List<Card> resources;
    private List<Card> developmentCards;
    private int victoryPoints = 0;

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
