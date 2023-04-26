package projectGroup.project1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of minutes:");
        int minutes = scanner.nextInt();
        int years, days;
        days = minutes / 1440;
        years = days / 365;
        days = days - (years * 365);

        System.out.println( years + " years " + " and " + days + " days ");
        System.out.println("Leap year is not included!");


    }
}
