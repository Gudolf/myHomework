package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one String value");
        String str = scanner.nextLine();
        int x = str.length() % 2;
        String middle = "";
        if( x == 1){
            for ( int i = ((str.length()-1)/2 - 1); i <= ((str.length()-1)/2) + 1; i ++){
                middle += str.charAt(i);
            }
        }
        System.out.println(middle);
    }
}
