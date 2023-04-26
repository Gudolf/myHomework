package projectGroup.homework8;

public class Task6 {
    public static void main(String[] args) {

        String str = "iTopiNonAvevanoNipoti";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse)){
            System.out.println(reverse + " is palindrome");
        }else {
            System.out.println(reverse + " is not palindrome");
        }
    }
}
