package player;

import java.util.ArrayList;

import cards.Card;

public class Deck {
    private ArrayList<Card> cards;
    private int nbCartesDeck;
    private int nbCartesRestantes;

    public Deck(int nbCartesDeck, int nbCartesRestantes){
        this.cards = new ArrayList<Card>();
        this.nbCartesDeck = nbCartesDeck;
        this.nbCartesRestantes = nbCartesRestantes;
    }

    private Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card c){
        this.cards.add(c);
    }
}
