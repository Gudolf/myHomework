package projectGroup.JavaIfStatementHomework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade letter");
        String grade = scanner.nextLine();
        if (grade.equalsIgnoreCase("A")){
            System.out.println(4.0);
        }else if (grade.equalsIgnoreCase("A-")){
            System.out.println(3.7);
        }else if (grade.equalsIgnoreCase("B+")){
            System.out.println(3.3);
        }else if (grade.equalsIgnoreCase("B")){
            System.out.println(3.0);
        }else if (grade.equalsIgnoreCase("B-")){
            System.out.println(2.7);
        }else if (grade.equalsIgnoreCase("C+")){
            System.out.println(2.3);
        }else if (grade.equalsIgnoreCase("C")){
            System.out.println(2.0);
        }else if (grade.equalsIgnoreCase("C-")){
            System.out.println(1.7);
        }else if (grade.equalsIgnoreCase("D+")){
            System.out.println(1.3);
        }else if (grade.equalsIgnoreCase("D")){
            System.out.println(1.0);
        }else if (grade.equalsIgnoreCase("F")) {
            System.out.println(0);
        }
    }
}
