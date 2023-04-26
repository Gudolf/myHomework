package projectGroup.homework8;

public class Task3 {
    public static void main(String[] args) {

        int number = 153;
        int numberOriginal = number;
        String str = String.valueOf(number);

        int num = 0;
        int sum = 0;

        for ( int i = 0; i <= str.length()-1; i++){

            sum += (int)(Math.pow(number % 10,str.length()));
            number = number/10;

        }
        if (numberOriginal == sum){
            System.out.println(numberOriginal + " is an Armstrong number");
        }else {
            System.out.println(numberOriginal + " is not an Armstrong number");
        }
    }
}
