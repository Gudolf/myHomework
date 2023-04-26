package projectGroup.project2;

public class Task3 {
    public static void main(String[] args) {

        String str1 = " Snicker";
        String str2 = "Cookie";

        str1 = str1.trim().toUpperCase().substring(3);
        char ch = str1.charAt(0);

        System.out.println(str1);
        System.out.println(ch);

        str2 = str2.toLowerCase().replace('o','u').concat("s");
        String strWithUpperCharacter = str2.substring(0,1).toUpperCase() + str2.substring(1);

        System.out.println(str2);
        System.out.println(strWithUpperCharacter);

    }
}
