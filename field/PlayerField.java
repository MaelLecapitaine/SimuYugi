package field;

public class PlayerField {
    /*
     * field is an array with 12 cases
     * 0 to 4 : Monster Zones
     * 5 to 9 : Spell & Trap Zones
     * 10     : Field Spell Zone
     * 11     : Extra Monster Zone
     * 12     : second Extra Monster Zone
     * 
     * Each player has a field
     * 
     * For further information please refer to Yu-Gi-Oh!'s rules.
     */
    private FieldZone[] field = {
        new MonsterZone(),
        new MonsterZone(),
        new MonsterZone(),
        new MonsterZone(),
        new MonsterZone(),
        new SpellZone(false, false),
        new SpellZone(false, false),
        new SpellZone(false, false),
        new SpellZone(false, false),
        new SpellZone(false, false),
        new FieldSpellZone(),
        new ExtraMonsterZone(),
        new ExtraMonsterZone(),
    };
        
    public FieldZone getZone(int index){
        return this.field[index];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("PlayerField:\n");
        for(int i = 0; i < field.length; i++){
            sb.append(" Zone " + i + ": " + field[i].getClass().getSimpleName() + "\n");
        }
        return sb.toString();
    }
}
