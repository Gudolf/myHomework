package projectGroup.homework1;

public class FirstHalf {
    public static void main(String[] args) {

        String str = "helloWorld";
        String half = "";
        for ( int i = 0; i <= (str.length()-1)/2; i++ ){
            half += str.charAt(i);
        }
        System.out.print(half);
    }
}
