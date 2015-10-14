import java.util.ArrayList;

/**
 * Created by macbookair on 10/9/15.
 */
public class Player extends Character {

    String area;
    ArrayList items = new ArrayList();

    public Player (){
        health = 100;
        damage = 20;
    }

    void chooseName() {
        System.out.println ("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println(String.format("Good Luck, %s", name));
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        int weaponNum = Integer.valueOf(Game.nextLine());
        if (weaponNum ==1) {

            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;
        } else if (weaponNum == 2) {

            weapon = new Weapon();
            weapon.name = "Mallet";
            weapon.damage = 10;
        } else {
            throw new Exception("Invalid Weapon");
        }
        System.out.println(String.format("That's a fine %s !", weapon.name.toLowerCase()));
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
            System.out.println(String.format("You found a %s", item));
            items.add(item);
        }
    }
}
