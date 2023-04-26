package projectGroup.homework8;

public class Example {
    public static void main(String[] args) {

        int startNumber = 2;
        int endNumber = 50;
        int primeNumber = 1; // always better use boolean type!!!  primeNumber = 0 is not correctly working!
        for (int i = startNumber; i <= endNumber; i++){

            for (int j = 2; j <= i/j; ++j ){

                if (i % j == 0){
                    primeNumber = 0;
                    break;
                }

                primeNumber = 1;
            }

            if(primeNumber == 1){
                System.out.print(i + " ");
            }
        }
    }
}




