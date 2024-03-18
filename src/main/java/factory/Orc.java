package factory;

public class Orc extends Character {
    public Orc(String name) {
        super(name);
        race = "Orc";
    }

    @Override
    public void specialAttack() {
        System.out.printf("Orc called %s used Berserker Rage!%n", name);
    }
}
