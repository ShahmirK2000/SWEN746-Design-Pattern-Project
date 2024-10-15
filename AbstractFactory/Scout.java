package AbstractFactory;

import java.util.Random;

public class Scout extends Character {

    private Random rand = new Random();

    public Scout(String name) {
        super(name, CharacterType.Scout, 150);
    }

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
