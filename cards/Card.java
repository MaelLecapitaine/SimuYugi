package cards;

import java.util.ArrayList;

import field.FieldZone;
import field.Type;

public abstract class Card {
    
    private Type typeCarte = null;
    private boolean faceUp;
    private String cardText;

    public Card(String text){
        this.cardText = text;
    }

    public boolean play(FieldZone z){
        boolean success = true;
        return success;
    }

    public Type getTypeCarte(){
        return this.typeCarte;
    }

    public boolean getFaceUp(){
        return this.faceUp;
    }

    public void setFaceDown(){
        this.faceUp = false;
    }

    public void setFaceUp(){
        this.faceUp = true;
    }
}
