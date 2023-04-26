package projectGroup.homework9;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] array = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        Arrays.sort(array);
        int number = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != array[array.length - 1]) {
                number = array[i];
                break;
            }
        }
        System.out.println(number);
        System.out.println(Arrays.toString(array));
    }
}
