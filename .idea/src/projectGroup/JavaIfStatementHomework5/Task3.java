package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();

        if( number >= 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
