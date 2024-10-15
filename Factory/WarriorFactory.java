/*
 * Shahmir Mahmud Khan
 */
package Factory;
//This is the warrior factory
public class WarriorFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
