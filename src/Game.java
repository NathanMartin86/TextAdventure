import java.util.Scanner;

/**
 * Created by macbookair on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my text adventure.");
        System.out.println ("What is your name, traveler?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Good Luck, " + name);

        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        String weapon = scanner.nextLine();
        if (weapon.equals("1")) {
            System.out.println("That's a fine sword!");
        } else if (weapon.equals("2")){
            System.out.println("That's a heavy mallet!");
        } else {
            throw new Exception("Invalid Weapon");
        }
        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the underground tunnel");
        String area = scanner.nextLine();
        if (area.equals ("1")) {
            System.out.println("Entering the forest...");
        }else if (area.equals("2")){
            System.out.println("Entering the tunnel...");
        }else{
            throw new Exception("Invalid area.");

        }

    }
}
