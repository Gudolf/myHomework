package projectGroup.homework6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the month number");
        int month = scanner.nextInt();
        String str = new String();
        int days = 0;

        switch (month) {
            case 1:
                str = "January";
                days = 31;
                break;
            case 2:
                str = "February";
                days = 28;
                break;
            case 3:
                str = "March";
                days = 31;
                break;
            case 4:
                str = "April";
                days = 30;
                break;
            case 5:
                str = "May";
                days = 31;
                break;
            case 6:
                str = "June";
                days = 30;
                break;
            case 7:
                str = "July";
                days = 31;
                break;
            case 8:
                str = "August";
                days = 31;
                break;
            case 9:
                str = "September";
                days = 30;
                break;
            case 10:
                str = "October";
                days = 31;
                break;
            case 11:
                str = "November";
                days = 30;
                break;
            case 12:
                str = "December";
                days = 31;
                break;
            default:
                System.out.println("It is not funny!!!");
                break;
        }
        System.out.println("Input the year number");
        int year = scanner.nextInt();

        boolean leapYear = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))); // the year must be greater than 1584 (in which the leap year was introduced)

        if (leapYear) {
            if ( days == 28){
                System.out.println(str + " " + year + " has " + (days + 1) + " days");
            }else {
                System.out.println(str + " " + year + " has " + days + " days");
            }
        }else {
            System.out.println(str + " " + year + " has " + days + " days");
        }
    }
}
