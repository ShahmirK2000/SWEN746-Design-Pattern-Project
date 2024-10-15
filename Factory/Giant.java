/*
 * Shahmir Mahmud Khan
 */
package Factory;

import java.util.Random;
//This is a child class that implements the Giant type of character
public class Giant extends Character {
    private Random rand = new Random();

    public Giant(String name) {
        super(name, CharacterType.Giant, 300);
        //Calling the parent constructor with the name, CharacterType of giant, and 300 base health
    }

    //implementing the dealdamage method from the interface
    @Override
    public void dealDamage(Character target) {
        double damage = 80;
        int chance = rand.nextInt(100);
        if (chance < 10) { //10% chance to miss an attack because the giant character type is slow
            System.out.println(name + " was too slow, and missed " + target.getName());
            return;
        }

        if(target.getcType() == CharacterType.Warrior) {
            damage *= 1.25; //Damage buff against Warrior
        }

        target.takeDamage(damage);
    }
}
