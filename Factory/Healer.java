/*
 * Shahmir Mahmud Khan
 */
package Factory;
//This is a child class that implements the Healer type of character
public class Healer extends Character {
    private int turnsSinceLastHeal;

    public Healer(String name) {
        super(name, CharacterType.Healer, 100);
        turnsSinceLastHeal = 0;
    }

    //Implementing the dealdamage method from the interface
    @Override
    public void dealDamage(Character target) {
        target.takeDamage(20); //Base damage is 20 for a healer
        turnsSinceLastHeal++;
        heal();
    }
    
    //Special method that is only avialable to the healer, every 2 turns the healer heals 30 health
    public void heal() {
        if(turnsSinceLastHeal >= 2) {
            this.setHealth(Health + 30);
            System.out.println(name + " Healed for 30 health, and now has " + this.getHealth());
            turnsSinceLastHeal = 0;
        }
    }
}
