import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by macbookair on 10/8/15.
 */
public class ATM  {
    public static void run()throws Exception{
        System.out.println("What is your name?");

        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        if (name.equals("")) {
            throw new Exception("ERROR");
        }
        System.out.println("Welcome" + " " + name);

        System.out.println("What Would you like to do?");
        System.out.println("[1] Check your Balance");
        System.out.println("[2] Make a Withdrawal");
        System.out.println("[3] Cancel");
        String option = scanner.nextLine();

        if (option.equals("1")){
            System.out.println("Your Balance is $100");
        }
        else if(option.equals("2")){
            System.out.println("How much do you want to Withdraw?");
            String amount = scanner.nextLine();
            int amountNum = Integer.valueOf(amount);
            if (amountNum <= 100){
                System.out.println("Thank you! Have a nice day.");
            }
            if (amountNum>100){
                System.out.println("Sorry :( You have exceeded your withdrawal limit");
            }

        }
        if(option.equals("3")){
            System.out.println("Transaction Cancelled");
        }

    }


}