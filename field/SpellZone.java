package field;

public class SpellZone extends FieldZone {

    private boolean pendulumRight = false;
    private boolean pendulumLeft = false;

    public SpellZone(boolean pR, boolean pL){
        this.pendulumLeft = pL;
        this.pendulumRight = pR;
    }

    public boolean isPendulumZone(){
        return (this.pendulumLeft || this.pendulumRight);
    }
}
