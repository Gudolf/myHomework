package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String value: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        if (str.contains("r") && str.contains("e") && str.contains("d") && str.contains("b") && str.contains("l") && str.contains("u") && str.contains("e")) {
            System.out.println("red and blue");

        }else if (str.contains("b") && str.contains("l") && str.contains("u") && str.contains("e")) {
            System.out.println("blue");

        }else if(str.contains("r") && str.contains("e") && str.contains("d")){
            System.out.println("red");

        }else{
            System.out.println("This String has not a color like red or blue");
        }
    }
}
