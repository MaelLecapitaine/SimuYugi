package player;

public class Player {
    private int lifePoints;
    private String name;
    private Deck deck;

    public Player(String name, Deck d){
        this.lifePoints = 8000;
        this.name = name;
        this.deck = d;
    }

    public int getLifePoints(){
        return this.lifePoints;
    }

    public void looseLifePoints(int points){
        this.lifePoints -= points;
    }

    public void gainLifePoints(int points){
        this.lifePoints += points;
    }

}
