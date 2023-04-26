package projectGroup.project3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall are you?");
        int tall = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (tall >= 120 && age >= 9){
            int price = 12;
            if (age < 18){
                price = 7;
            }
            System.out.println("Welcome aboard " + "\nTicket price " + price);

        }else {
            if (age < 9){
                System.out.println("Sorry, you are not eligible to ride you are too young");
            }else {
                System.out.println("Sorry, you are not eligible to ride, you have to be at least 120 cm");
            }
        }

    }
}
