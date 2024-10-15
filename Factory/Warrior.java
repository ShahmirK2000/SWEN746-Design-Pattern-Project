/*
 * Shahmir Mahmud Khan
 */
package Factory;

//This is a child class that implements the Warrior type of character
public class Warrior extends Character {

    public Warrior(String name) {
        super(name, CharacterType.Warrior, 200);
    }

    //Implements the dealdamage method from the interface
    @Override
    public void dealDamage(Character target) {
        double damage = 50;
        if(target.getcType() == CharacterType.Healer) {
            damage *= 1.25; //Damage buff against a healer
        } else if (target.getcType() == CharacterType.Giant) {
            damage *= 0.75; //Damage reduced against a Giant
        }

        target.takeDamage(damage);
    }
}
