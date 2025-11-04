package app;

public class Turn {
    private Phase currentPhase;
    private int currentPlayerIndex;

    public void changePhase(){
        if (this.currentPhase == Phase.Draw) {
            this.currentPhase = Phase.Standby;
        }
        else if (this.currentPhase == Phase.Standby) {
            this.currentPhase = Phase.Main1;
        }
        else if (this.currentPhase == Phase.Main1) {
            this.currentPhase = Phase.Battle;
        }
        else if (this.currentPhase == Phase.Battle) {
            this.currentPhase = Phase.Main2;
        }
        else if (this.currentPhase == Phase.Main2) {
            this.currentPhase = Phase.End;
        }
    }
}
