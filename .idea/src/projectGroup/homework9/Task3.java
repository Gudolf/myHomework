package projectGroup.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int k = 10;
        for  ( int i = 0; i <= numbers.length-1; i++){
            System.out.println("Please enter the int number. You have " + k + " space in array");
            int number = scanner.nextInt();
            numbers[i] = number;
            k--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
