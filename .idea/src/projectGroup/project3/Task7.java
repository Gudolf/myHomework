package projectGroup.project3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the year number");
        int year = scanner.nextInt();
        boolean leapYear = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))); // the year must be greater than 1584 (in which the leap year was introduced)
        if (leapYear == true){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}

