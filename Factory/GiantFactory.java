/*
 * Shahmir Mahmud Khan
 */
package Factory;
//this is the factory for giants
public class GiantFactory implements FactoryInterface {
    public Character createCharacter(String name) {
        return new Giant(name);
    }
}
