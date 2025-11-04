package field;

public class CompleteField {
    private PlayerField[] field = { new PlayerField(), new PlayerField() };

    public PlayerField getField(int playerIndex) {
        return field[playerIndex];
    }

    public String toString() {
        return "Player 0 Field:\n" + field[0].toString() + "\nPlayer 1 Field:\n" + field[1].toString();
    }
}
