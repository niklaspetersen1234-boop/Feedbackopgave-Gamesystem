import java.util.ArrayList;

public class GameSystem {
    private Game[] gameList = new Game[99];
    private Player[] playerList = new Player[99];
    private int gameCount;
    private int playerCount;

    public GameSystem() {

    }

    public void addPlayer(String name, int age, int playerID, double score) {
        for (int i = 0; i < playerList.length; i++) {
            if (playerList[i] == null) {
                playerList[i] = new Player(playerID, name, age, score);
                break;
            }
        }
    }

    public void addGame(String title, String genre, int gameID, double price) {
        for (int i = 0; i < gameList.length; i++) {
            if (gameList[i] == null) {
                gameList[i] = new Game(gameID, title, genre, price);
                break;
            }
        }
    }


    public void printAllGameDetails() {
        for (int i = 0; i < gameList.length; i++) {
            if (gameList[i] == null) {
                break;
            }
            Game game = gameList[i];
            System.out.println("Title: " + game.getTitle());
            System.out.println("Genre: " + game.getGenre());
            System.out.println("Game ID: " + game.getGameID());
            System.out.println("Price: $" + game.getPrice());
            System.out.println();
        }
    }

    public void printAllPlayerDetails() {
        for (int i = 0; i < playerList.length; i++) {
            if (playerList[i] == null) {
                break;
            }
            Player player = playerList[i];
            System.out.println("Name: " + player.getName());
            System.out.println("Age: " + player.getAge());
            System.out.println("Player ID: " + player.getPlayerID());
            System.out.println("Score: " + player.getScore());
            System.out.println();
        }
    }

    public void printPlayerByID(int playerID) {
        for (Player player : playerList) {
            if (player.getPlayerID() == playerID) {
                System.out.println("Name: " + player.getName());
                System.out.println("Age: " + player.getAge());
                System.out.println("Player ID: " + player.getPlayerID());
                System.out.println("Score: " + player.getScore());
                System.out.println();
                break;
            }
        }
    }

    public void printGameByID(int gameID) {
        for (Game game : gameList) {
            if (game.getGameID() == gameID) {
                System.out.println("Title: " + game.getTitle());
                System.out.println("Genre: " + game.getGenre());
                System.out.println("Game ID: " + game.getGameID());
                System.out.println("Price: $" + game.getPrice());
                System.out.println();
                break;
            }
        }
    }

    public void updatePlayerScore(int playerID, double newScore) {
        for (Player player : playerList) {
            if (player.getPlayerID() == playerID) {
                player.updateScore(newScore);
                break;
            }
        }
    }

    public void findTopScoringPlayer() {
        int topScoreIndex = 0;
        for (int i = 1; i < playerList.length; i++) {
            if (playerList[i] == null) {
                break;
            }
            if (playerList[i].getScore() > playerList[topScoreIndex].getScore()) {
                topScoreIndex = i;
            }
        }
        System.out.println("Topscore: " + playerList[topScoreIndex].getName() + " | " + playerList[topScoreIndex].getScore());
    }
}
