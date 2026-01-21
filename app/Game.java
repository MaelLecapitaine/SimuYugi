package app;

import field.CompleteField;

public class Game {
    public Turn currentTurn;

    private CompleteField field = new CompleteField();

    public Game() {
        this.currentTurn = new Turn();
    }

    public CompleteField getField() {
        return this.field;
    }
}
