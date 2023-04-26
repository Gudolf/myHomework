package projectGroup.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String");
        String str = scanner.nextLine();
        System.out.println("Please enter index number");
        int index = scanner.nextInt();

        String[] array = {"Liam", "Emma", "Noah", "Olivia", "William"};
        array[index] = str;
        System.out.println(Arrays.toString(array));

    }
}
