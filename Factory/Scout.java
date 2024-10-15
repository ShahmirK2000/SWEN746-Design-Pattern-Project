/*
 * Shahmir Mahmud Khan
 */
package Factory;

import java.util.Random;

//This is a child class that implements the Scout type of character
public class Scout extends Character {

    private Random rand = new Random();

    public Scout(String name) {
        super(name, CharacterType.Scout, 150);
    }

    //Implementing the dealdamage method from the interface
    @Override
    public void dealDamage(Character target) {
        double damage = 30;
        if(target.getcType() == CharacterType.Healer) {
            damage *= 1.25; //Damage buff against a healer
        } else if (target.getcType() == CharacterType.Giant) {
            damage *= 0.75; //Damage reduced against a Giant
        }

        target.takeDamage(damage);
    }

    //Special method only available to the scout, because this character type is nimble
    @Override
    public boolean dodge(Character attacker) {
        int chance = rand.nextInt(100);

        if(attacker.getcType() == CharacterType.Giant) {
            return chance < 50; //This gives a 50% chance to dodge an attack from a giant
        } else if (attacker.getcType() == CharacterType.Warrior) {
            return chance < 30; //This gives a 30% chance to dodge an attack from a warrior
        }
        return false;
    }
}
