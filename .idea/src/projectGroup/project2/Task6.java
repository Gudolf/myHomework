package projectGroup.project2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String value:");
        String str = scanner.nextLine();
        System.out.println("Please enter the starting number:");
        int numberStart = scanner.nextInt();
        System.out.println("Please enter the ending number");
        int numberEnd = scanner.nextInt();

        str = str.substring(numberStart-1,numberEnd);
        System.out.println(str);
    }
}
