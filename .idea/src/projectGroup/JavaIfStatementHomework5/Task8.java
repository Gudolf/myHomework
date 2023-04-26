package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.nextLine();
        String str1 = "";
        String str2 = "";
        String str3 = "";

        str1 = str.substring(0,2);
        str2 = str.substring(str.length()-2);
        str3 = str.substring(2,str.length()-2);

        if (str1.equals(str2)){
            str = str3.concat(str2);
            System.out.println(str);

        }else {
            System.out.println(str);
        }
    }
}
