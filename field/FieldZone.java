package field;

import cards.Card;
import cards.MonsterCard;

public abstract class FieldZone {
    private boolean occupied = false;
    private Card carte = null;
    private Type typeZone;

    public boolean placeCard(Card c, boolean faceUp){
        boolean success = false;
        if(c.getTypeCarte() == this.typeZone){
            if(faceUp){
                carte = c;
            }
            else{
                if (c.getTypeCarte() == Type.Monster) {
                    c.setFaceDown();
                    carte = c;
                }
            }
        }

        return success;
    }
}
