package projectGroup.project2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input only 6 digit numbers");
        String sixDigits = scanner.nextLine();

        while ( sixDigits.length() != 6  ){
            System.out.println("You didn't input 6 digits, please input ONLY 6 digit numbers");
            sixDigits = scanner.nextLine();
        }
        int mult = 1, sum = 0 ;

        for (int i = 0; i < sixDigits.length(); i++) {
            sum += Integer.parseInt(String.valueOf(sixDigits.charAt(i)));
            mult *= Integer.parseInt(String.valueOf(sixDigits.charAt(i)));
        }
        System.out.println(sixDigits + "\nMultiplication of all digits is " + mult + "\nThe Sum of all digits is " + sum);
    }
}
