package factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1 = characterFactory.getCharacter("Elf", "David");
        character1.specialAttack();
        Character character2 = characterFactory.getCharacter("Orc", "Nasko");
        character2.specialAttack();
        Character character3 = characterFactory.getCharacter("Nord", "Pavel");
        character3.specialAttack();
    }

}
