package player;

public class Player {
    private int lifePoints;
    private String name;

    public Player(String name){
        this.lifePoints = 8000;
        this.name = name;
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
