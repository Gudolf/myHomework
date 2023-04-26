package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String value");
        String str1 = scanner.nextLine();
        System.out.println("Enter second String value");
        String str2 = scanner.nextLine();

        String str3 = "";
        String str = str1.concat(str2);
        System.out.println(str);
        System.out.println("====================");

        if (str1.length() > str2.length()) {

            str3 = str1.substring(0, str2.length());
            str = str3.concat(str2);
            System.out.println(str);

        }else if (str1.length() < str2.length()){

            str3 = str2.substring(0, str1.length());
            str = str1.concat(str3);
            System.out.println(str);

        }else{
            System.out.println(str);
        }

    }
}
