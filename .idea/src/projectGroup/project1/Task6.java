package projectGroup.project1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = scanner.nextDouble();

        int quarters, dime, nickels, pennies, dollarsToCents;
        dollarsToCents = (int)(balance * 100) ;

        quarters = dollarsToCents / 25;
        dime = (dollarsToCents - (quarters * 25)) / 10;
        nickels = (dollarsToCents - (quarters * 25) - (dime * 10)) / 5;
        pennies = (dollarsToCents - (quarters * 25) - (dime * 10) - (nickels * 5)) / 1;

        System.out.println("$"+balance + " will make " + quarters + " quarters " + dime + " dime " + nickels + " nickels and " + pennies + " pennies" );
    }
}
