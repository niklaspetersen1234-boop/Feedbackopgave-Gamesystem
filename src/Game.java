public class Game {
    private int gameID;
    private String title;
    private String genre;
    private double price;

    public Game(int gameID, String title, String genre, double price) {
        this.gameID = gameID;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public Game() {}

    public int getGameID() {
        return this.gameID;
    }
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
