/*
 * Shahmir Mahmud Khan
 */

package AbstractFactory;

public interface CharacterInterface {
    //This interface will be implemented by different characters in the game
    public enum CharacterType {
        Warrior,
        Scout,
        Healer,
        Giant
    }

    public abstract void setName(String name);
    public abstract String getName();
    public abstract double getHealth();
    public abstract void takeDamage(double Damage);
    public abstract boolean isAlive();
    public abstract void dealDamage(Character target);
}