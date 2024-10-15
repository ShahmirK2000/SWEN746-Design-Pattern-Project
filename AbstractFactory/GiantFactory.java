package AbstractFactory;

public class GiantFactory {
    public Character createGiant(String name) {
        return new Giant(name);
    }
}
