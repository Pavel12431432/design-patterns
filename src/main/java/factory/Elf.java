package factory;

public class Elf extends Character{

    public Elf(String name) {
        super(name);
        race = "Elf";
    }

    @Override
    public void specialAttack() {
        System.out.printf("Elf called %s used Fire Spell!%n", name);
    }
}
