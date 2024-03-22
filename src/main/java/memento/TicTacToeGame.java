package memento;

import java.util.Arrays;

public class TicTacToeGame {
    private int[] board;
    private int playerTurn;

    public TicTacToeGame(int firstPlayer) {
        board = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        playerTurn = firstPlayer;
    }

    public void placePiece(int pos) {
        if (board[pos] == 0) {
            board[pos] = playerTurn;
            playerTurn = 3 - playerTurn;
        }
    }

    public GameMemento createMemento() {
        return new GameMemento(board.clone(), playerTurn);
    }

    public void restoreMemento(GameMemento memento) {
        board = memento.getBoard();
        playerTurn = memento.getPlayerTurn();
    }

    @Override
    public String toString() {
        return String.format("TicTacToeGame{boards=%s, playerTurn=%s}", Arrays.toString(board), playerTurn);
    }
}
