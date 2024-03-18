package factory;

public abstract class Character {
    public String name;
    public String race;

    public Character(String name) {
        this.name = name;
    }

    public abstract void specialAttack();
}