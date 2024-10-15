package Factory;

public class HealerFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Healer(name);
    }
}