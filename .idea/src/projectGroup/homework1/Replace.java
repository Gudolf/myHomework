package projectGroup.homework1;

public class Replace {
    public static void main(String[] args) {

        String str1 = "Helloworld";
        String str2 = "ad";
        String str3 = str2.concat(str1.concat(str2));
        System.out.println(str3);
    }
}
