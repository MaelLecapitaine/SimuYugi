package field;

public class SpellTrapZone extends FieldZone {

    private boolean pendulumRight = false;
    private boolean pendulumLeft = false;

    public SpellTrapZone(boolean pR, boolean pL){
        this.pendulumLeft = pL;
        this.pendulumRight = pR;
    }

    public boolean isPendulumZone(){
        return (this.pendulumLeft || this.pendulumRight);
    }
}
