package sample;

public class Player {

    private String name;
    private int numberOfWins;
    private int numberOfLose;
    private int numberOfDraws;


    public Player(String name) {
        this.name = name;
        this.numberOfWins = 0;
        this.numberOfLose = 0;
        this.numberOfDraws = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getNumberOfLose() {
        return numberOfLose;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }


}


