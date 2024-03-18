package factory;

public class CharacterFactory {
    public Character getCharacter(String race, String name) {
        if(race == null) {
            return null;
        }
        if(race.equalsIgnoreCase("elf")) {
            return new Elf(name);
        }
        if(race.equalsIgnoreCase("orc")) {
            return new Orc(name);
        }
        if(race.equalsIgnoreCase("nord")) {
            return new Nord(name);
        }
        return null;
    }
}
