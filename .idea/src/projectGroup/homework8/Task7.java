package projectGroup.homework8;

public class Task7 {
    public static void main(String[] args) {

        int line = 10;
        int number = 1;
        for (int i = 1; i <= line; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }
}
