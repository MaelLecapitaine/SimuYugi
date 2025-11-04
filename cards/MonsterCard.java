package cards;

import java.text.AttributedCharacterIterator.Attribute;

public class MonsterCard extends Card {
    private MonsterType monsterType;
    private boolean isEffectMonster;
    private MonsterType type;
    private int atk;
    private int def;
    private int level;
    private Attribute attribute;
    private MonsterCardType monsterCardType;

    public MonsterCard(String text){
        super(text);
    }   
}
