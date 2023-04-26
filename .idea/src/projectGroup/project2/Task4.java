package projectGroup.project2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one sentence with three words (Notice: you can't input a space before and after words and also you can't input two spaces between words!)");
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

        str = str + " ";
        int sum = 0;
        String index;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' '){
                index = str.charAt(i - 1) + " ";
                sum += i-1;
                System.out.println( (i-1) + " --> index number of '" + index +"'");
            }
        }
        System.out.println("The sum: " + sum);
    }
}
