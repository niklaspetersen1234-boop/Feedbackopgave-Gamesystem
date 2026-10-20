import javax.naming.Name;

public class Player {
    private int playerID;
    private String name;
    private int age;
    private double score;

    public Player(int playerID, String name, int age, double score) {
        this.playerID = playerID;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Player() {}

    public int getPlayerID() {
        return this.playerID;
    }
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return this.score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void updateScore(double newScore) {
        this.score = newScore;
    }

}
