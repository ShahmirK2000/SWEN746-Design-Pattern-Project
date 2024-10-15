/*
 * Shahmir Mahmud Khan
 */
package Factory;
//This class is an arena where the characters fight, basically just a for loop that checks to see if a character has died or not
//Handles the dodging/healing or any other special property that a child-character class has
public class Arena {
    public void Fight(Character c1, Character c2) {
        while(c1.isAlive() && c2.isAlive()) {
            if(c2.dodge(c1)) {
                System.out.println(c2.getName() + " dodged the attack from: " + c1.getName());
            } else {
                c1.dealDamage(c2);
            }

            if(!c2.isAlive()) {
                System.out.println(c2.getName() + " has been defeated!");
                break;
            }

            if(c1.dodge(c2)) {
                System.out.println(c1.getName() + " dodged the attack from: " + c2.getName());
            } else {
                c2.dealDamage(c1);
            }

            if(!c1.isAlive()) {
                System.out.println(c1.getName() + " has been defeated!");
                break;
            }
        }
        System.out.println("The battle is over!");
    }
}
