public class GamePiece {
    private Player player;
    private String colorOfPieces;

    public GamePiece(Player player) {
        setPlayer(player);
        setColorOfPieces(player.getColor());
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getColorOfPieces() {
        return colorOfPieces;
    }

    public void setColorOfPieces(String colorOfPieces) {
        this.colorOfPieces = colorOfPieces;
    }
}
