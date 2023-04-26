package projectGroup.homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of terms: ");
        int terms  = scanner.nextInt();

        int i = 1;
        int k;
        int sum = 0;

        while (i <= terms){

            k = (int)((Math.pow(10,i) - 1) / 9);
            if (i == terms){
                System.out.println(k);
            }else {
                System.out.print(k + " + ");
            }
            sum += k;
            i++;
        }
        System.out.println("The Sum is: " + sum);
    }
}
