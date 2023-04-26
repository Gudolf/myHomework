package projectGroup.homework1;

public class MiddleThree {
    public static void main(String[] args) {

        String str = "helloWorld";
        String middle = "";
        for ( int i = ((str.length()-1)/2 - 1); i <= ((str.length()-1)/2) + 1; i ++){
            middle += str.charAt(i);
        }
        System.out.println(middle);
    }
}
