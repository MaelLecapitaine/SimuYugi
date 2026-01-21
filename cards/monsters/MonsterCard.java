package cards.monsters;

import java.text.AttributedCharacterIterator.Attribute;

import cards.Card;

public class MonsterCard extends Card {
    private MonsterType monsterType;
    private boolean isEffectMonster;
    private MonsterType type;
    private int atk;
    private int def;
    private int level;
    private Attribute attribute;
    private MonsterCardType monsterCardType;

    public MonsterCard(String text, String name, Attribute attribute, int atk, int def, int level, MonsterType type, MonsterCardType monsterCardType, boolean isEffectMonster) {
        super(text, name);
        this.attribute = attribute;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.type = type;
        this.monsterCardType = monsterCardType;
        this.isEffectMonster = isEffectMonster;
    }
}
