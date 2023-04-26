package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one String value");
        String str = scanner.nextLine();

        if( str.length() >= 3){
           str = str.substring(1,str.length()-1);
            System.out.println(str);
        }else {
            System.out.println(str);
        }
    }
}
