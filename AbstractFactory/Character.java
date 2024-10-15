package AbstractFactory;

public abstract class Character implements CharacterInterface {
    
    String name;
    CharacterType cType;
    double Health;

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

    public double getHealth() {
        if(this.Health < 0) {
            this.Health = 0;
        }
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public boolean isAlive() {
        return this.Health > 0;
    }

    @Override
    public String toString() {
        return name + " is a " + this.getcType() + " and has " + Health + " health";
    }

}
