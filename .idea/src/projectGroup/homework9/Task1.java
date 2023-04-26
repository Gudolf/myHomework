package projectGroup.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] a = {10,4,3,55,32,145,443,234,98,32};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scanner.nextInt();

        for (int i = 0; i <= a.length-1; i++){

            if (a[i] == number){
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}