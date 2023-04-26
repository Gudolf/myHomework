package projectGroup.homework8;

public class Task4 {
    public static void main(String[] args) {

        int startNumber = 2;
        int endNumber = 50;
        boolean primeNumber= true;
        for (int i = startNumber; i <= endNumber; i++){

            for (int j = 2; j <= i/j; ++j ){

                if (i % j == 0){
                    primeNumber = false;
                    break;
                }

                primeNumber = true;
            }

            if(primeNumber){
                System.out.print(i + " ");
            }
        }
    }
}
