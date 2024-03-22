package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(1);
        History history = new History();

        history.addMemento(game.createMemento());

        game.placePiece(0);
        history.addMemento(game.createMemento());

        game.placePiece(3);
        history.addMemento(game.createMemento());

        game.placePiece(8);
        history.addMemento(game.createMemento());

        System.out.println(game);

        game.restoreMemento(history.getMemento(1));
        System.out.println(game);

        game.restoreMemento(history.getMemento(2));
        System.out.println(game);

    }
}
