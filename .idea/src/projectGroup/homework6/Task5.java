package projectGroup.homework6;

public class Task5 {
    public static void main(String[] args) {

        char ch = '@';
        if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)){
            System.out.println("This is a special character");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("This is a number");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("This is an alphabet");
        }
    }
}
