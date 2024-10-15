/*
 * Shahmir Mahmud Khan
 */
package Factory;

//This is the scout factory
public class ScoutFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Scout(name);
    }
}
