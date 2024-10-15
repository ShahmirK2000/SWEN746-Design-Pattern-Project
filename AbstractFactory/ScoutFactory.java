package AbstractFactory;

public class ScoutFactory {
    public Character createScout(String name) {
        return new Scout(name);
    }
}
