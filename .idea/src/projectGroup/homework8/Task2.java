package projectGroup.homework8;

public class Task2 {
    public static void main(String[] args) {

        int firstNumber = 1;
        int lastNumber = 50000;

        for ( int i = firstNumber; i <= lastNumber; i++ ){

            int sum = 0;
            for (int j = 1; j <= i/2; j++){
                if (i % j == 0){
                    sum += j;
                }
            }if (sum == i){
                System.out.println(i + "");
            }
        }
    }
}
