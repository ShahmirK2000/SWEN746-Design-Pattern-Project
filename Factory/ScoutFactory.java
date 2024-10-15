package Factory;

public class ScoutFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Scout(name);
    }
}
