package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.nextLine();
        String str1 = "";

        if (str.charAt(0) == 'x' || str.charAt(1) == 'x'){

            str1 = str.substring(0,2);
            str = str.substring(2);
            str1 = str1.replace("x", "");
            str = str1.concat(str);

            System.out.println(str);

        }else {
            System.out.println(str);
        }
    }
}
