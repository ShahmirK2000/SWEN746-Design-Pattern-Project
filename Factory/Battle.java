/*
 * Shahmir Mahmud Khan
 * This class shows how we can use the factories within this design
 */

package Factory;

import java.util.Random;

public class Battle {
    private static Random rand = new Random();

    public static void main(String[] args) {
        WarriorFactory wf = new WarriorFactory(); // Making all of the factories
        ScoutFactory sf = new ScoutFactory();
        HealerFactory hf = new HealerFactory();
        GiantFactory gf = new GiantFactory();

        Character c1;
        Character c2;
        
        int type = rand.nextInt(4); //For the purposes of this project, I am randomizing which factory to use, so we get different character types

        switch(type) {
            case 0:
                c1 = wf.createCharacter("Iron Man");
                break;
            case 1:
                c1 = sf.createCharacter("Iron Man");
                break;
            case 2:
                c1 = hf.createCharacter("Iron Man");
                break;
            case 3:
                c1 = gf.createCharacter("Iron Man");
                break;
            default:
                c1 = null;
                break;
        }

        type = rand.nextInt(4);

        switch(type) {
            case 0:
                c2 = wf.createCharacter("Captain America");
                break;
            case 1:
                c2 = sf.createCharacter("Captain America");
                break;
            case 2:
                c2 = hf.createCharacter("Captain America");
                break;
            case 3:
                c2 = gf.createCharacter("Captain America");
                break;
            default:
                c2 = null;
                break;
        }

        System.out.println(c1); //printing out the initial states of each character
        System.out.println(c2);

        Arena a = new Arena(); //Making a new arena for the characters to fight
        a.Fight(c1, c2);
    }
}
