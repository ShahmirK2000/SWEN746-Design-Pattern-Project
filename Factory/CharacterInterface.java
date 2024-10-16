/*
 * Shahmir Mahmud Khan
 */

package Factory;

public interface CharacterInterface {
    //This interface will be implemented by different characters in the game
    //The enum determines which type of character will be implemented by the child classes
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