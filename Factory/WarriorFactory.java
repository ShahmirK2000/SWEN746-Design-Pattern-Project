package Factory;

public class WarriorFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
