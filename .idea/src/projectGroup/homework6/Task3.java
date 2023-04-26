package projectGroup.homework6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temperature in centigrade");
        int centigrade = scanner.nextInt();

        if ( centigrade < 0){
            System.out.println("It's freezing weather");
        }else if ( centigrade >= 0 && centigrade < 10){
            System.out.println("It's very cold weather");
        }else if ( centigrade >= 10 && centigrade < 20){
            System.out.println("It's cold temper");
        }else if ( centigrade >= 20 && centigrade < 30){
            System.out.println("It's normal in temp");
        }else if (centigrade >= 30 && centigrade < 40){
            System.out.println("It's hot");
        }else{
            System.out.println("It's very hot");
        }
    }
}
