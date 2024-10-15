/*
 * Shahmir Mahmud Khan
 */
package Factory;
//This is the factory interface that all of the factories for the characters will implement
public interface FactoryInterface {
    public abstract Character createCharacter(String name);
}
