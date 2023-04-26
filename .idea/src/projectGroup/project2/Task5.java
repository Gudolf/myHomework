package projectGroup.project2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three different ingredients");
        String str = scanner.nextLine();

        int k = 0;
        Loop:
        do {
            for ( int i = 0, countSpace = 1; i <= str.length()-1; i++, countSpace++)  {

                if ( str.charAt(0) == ' '){

                    System.out.println("You have a space before the beginning of the sentence, Please input your sentence again");
                    str = scanner.nextLine();
                    continue Loop;

                } else if ( str.charAt(str.length()-1) == ' ') {

                    System.out.println("You have a space after the sentence, Please input your sentence again");
                    str = scanner.nextLine();
                    continue Loop;

                } else if ( str.charAt(i) == ' '){

                    if (str.charAt(countSpace) == ' ') {

                        System.out.println("You have two or more spaces in the sentence, Please input your sentence again");
                        str = scanner.nextLine();
                        continue Loop;
                    }
                }
            }
            k++;

        }while (k == 0);

        System.out.println("Enter any int number");
        int number = scanner.nextInt();

        str = str.substring(0,0) + number++ + str.substring(1);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' '){

                str = str.substring(0,i+1) + number++ + str.substring(i+2);

            }
        }
        System.out.println(str);
    }
}
