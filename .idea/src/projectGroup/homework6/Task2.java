package projectGroup.homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a single character");
        String str = scanner.nextLine();


        char ch = str.charAt(0);

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) && str.length() == 1 ){
            if( (ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O') || ( ch == 'u' || ch == 'U') || (ch == 'y' || ch == 'Y')){
                System.out.println("Input letter is Vowel");
            }else{
                System.out.println("Input letter is Consonant");
            }
        }else {
            System.out.println("Error message");
        }

    }
}
