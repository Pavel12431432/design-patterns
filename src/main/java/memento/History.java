package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<GameMemento> mementos;

    public History() {
        mementos = new ArrayList<>();
    }

    public void addMemento(GameMemento memento) {
        mementos.add(memento);
    }

    public GameMemento getMemento(int index) {
        return mementos.get(index);
    }
}
