package memento;

public class GameMemento {
    private final int[] board;
    private final int playerTurn;

    public GameMemento(int[] board, int playerTurn) {
        this.board = board;
        this.playerTurn = playerTurn;
    }

    public int[] getBoard() {
        return board;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }
}
