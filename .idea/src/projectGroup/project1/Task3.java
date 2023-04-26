package projectGroup.project1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input inches:");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(meters);
    }
}

