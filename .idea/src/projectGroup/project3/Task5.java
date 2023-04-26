package projectGroup.project3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }
}
