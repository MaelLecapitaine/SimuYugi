package player;

public class Player {
    public int lifePoints;

    public Player(){
        this.lifePoints = 8000;
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
