import java.util.Scanner;

/**
 * Created by macbookair on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;

    void chooseName() {
        System.out.println ("What is your name, traveler?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Good Luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        Scanner scanner = new Scanner(System.in);
        weapon = scanner.nextLine();
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
            Scanner scanner = new Scanner(System.in);
            area = scanner.nextLine();
            if (area.equals ("1")) {
                System.out.println("Entering the forest...");
            }else if (area.equals("2")){
                System.out.println("Entering the tunnel...");
            }else{
                throw new Exception("Invalid area.");
        }
    }
}
