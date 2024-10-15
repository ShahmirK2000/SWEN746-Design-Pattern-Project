/*
 * Shahmir Mahmud Khan
 */
package Factory;

//This is the healer factory
public class HealerFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Healer(name);
    }
}
