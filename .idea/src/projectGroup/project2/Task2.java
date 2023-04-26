package projectGroup.project2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 digit numbers");
        String fiveDigits = scanner.nextLine();

        String reversed = "";
        for( int i = fiveDigits.length()-1; i >= 0; i-- ){
            reversed += fiveDigits.charAt(i);
        }
        System.out.println(reversed);
    }
}
