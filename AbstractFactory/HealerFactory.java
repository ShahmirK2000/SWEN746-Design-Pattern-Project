package AbstractFactory;

public class HealerFactory {
    public Character createHealer(String name) {
        return new Healer(name);
    }
}
