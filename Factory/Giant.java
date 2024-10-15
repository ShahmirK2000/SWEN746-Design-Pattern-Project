package Factory;

import java.util.Random;

public class Giant extends Character {
    private Random rand = new Random();

    public Giant(String name) {
        super(name, CharacterType.Giant, 300);
    }

    @Override
    public void dealDamage(Character target) {
        double damage = 80;
        int chance = rand.nextInt(100);
        if (chance < 10) {
            System.out.println(name + " was too slow, and missed " + target.getName());
            return;
        }

        if(target.getcType() == CharacterType.Warrior) {
            damage *= 1.25; //Damage buff against Warrior
        }

        target.takeDamage(damage);
    }
}
