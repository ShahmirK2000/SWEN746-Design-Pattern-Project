package Factory;

public class GiantFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Giant(name);
    }
}
