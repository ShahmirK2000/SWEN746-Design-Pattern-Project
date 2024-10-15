package Factory;

public class Healer extends Character {
    private int turnsSinceLastHeal;

    public Healer(String name) {
        super(name, CharacterType.Healer, 100);
        turnsSinceLastHeal = 0;
    }

    @Override
    public void dealDamage(Character target) {
        target.takeDamage(20); //Base damage is 20 for a healer
        turnsSinceLastHeal++;
        heal();
    }

    public void heal() {
        if(turnsSinceLastHeal >= 2) {
            this.setHealth(Health + 30);
            System.out.println(name + " Healed for 30 health, and now has " + this.getHealth());
            turnsSinceLastHeal = 0;
        }
    }
}
