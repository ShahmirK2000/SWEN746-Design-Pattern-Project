/*
 * Shahmir Mahmud Khan
 */
package Factory;
//This is the abstract character class, that doesn't fully implement the character interface
//The child classes will fully implement the interface, and inherit these methods.
public abstract class Character implements CharacterInterface {
    
    String name;
    CharacterType cType;
    double Health;

    //Simple constructor
    public Character(String name, CharacterType cType, double Health) {
        this.name = name;
        this.cType = cType;
        this.Health = Health;
    }

    public void takeDamage(double damage) {
        this.Health -= damage;
        System.out.println(this.name + " took " + damage + " damage, and has " + this.getHealth() + " health left!");
    }

    public boolean dodge(Character attacker) {
        return false; //Defaulted to false, as most classes will not be able to dodge an attack
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getcType() {
        return cType;
    }

    //Getter that returns the health of a character, however if it falls below 0 due to an attack, it just returns 0
    public double getHealth() {
        if(this.Health < 0) {
            this.Health = 0;
        }
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    //Helper function that returns if a character is still alive or not
    public boolean isAlive() {
        return this.Health > 0;
    }

    //Simple toString that prints out the character enum type and the health of the character
    @Override
    public String toString() {
        return name + " is a " + this.getcType() + " and has " + Health + " health";
    }

}
