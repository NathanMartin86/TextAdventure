import java.util.ArrayList;

/**
 * Created by macbookair on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName() {
        System.out.println ("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println("Good Luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        weapon = Game.nextLine();
        if (weapon.equals("1")) {
            System.out.println("That's a fine sword!");
        } else if (weapon.equals("2")) {
            System.out.println("That's a heavy mallet!");
        } else {
            throw new Exception("Invalid Weapon");
        }
    }

        void chooseArea() throws Exception {
            System.out.println("[1] Enter the forest");
            System.out.println("[2] Enter the underground tunnel");
            area = Game.nextLine();
            if (area.equals ("1")) {
                System.out.println("Entering the forest...");
            }else if (area.equals("2")){
                System.out.println("Entering the tunnel...");
            }else{
                throw new Exception("Invalid area.");
        }
    }
    void findItem(String item){
        System.out.println("Found Item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")){
            System.out.println("You found a " + item);
            items.add(item);
        }
    }
}
