package factory;

public class Nord extends Character {
    public Nord(String name) {
        super(name);
        race = "Nord";
    }

    @Override
    public void specialAttack() {
        System.out.printf("Nord called %s used Battle Cry!%n", name);
    }
}
