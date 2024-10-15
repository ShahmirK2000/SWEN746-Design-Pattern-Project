package AbstractFactory;

public class WarriorFactory {
    public Character createWarrior(String name) {
        return new Warrior(name);
    }
}
