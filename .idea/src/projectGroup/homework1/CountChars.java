package projectGroup.homework1;

public class CountChars {
    public static void main(String[] args) {

        String str1 = "Helloworld";
        char ch;
        int a = 0;
        for (int i = 0; i <= str1.length()-1; i++){
            ch = str1.charAt(i);
            if (ch == 'l'){
                a += 1;
            }
        }
        System.out.println(a);
    }
}
