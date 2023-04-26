package projectGroup.homework1;

public class RemoveX {
    public static void main(String[] args) {

        String str1 = "xHelloworldxx";
        String str = "";
        char ch;
        for ( int i = 0; i <= str1.length()-1; i++){
            ch = str1.charAt(i);
            if (ch == 'x'){

            }else {
                str += str1.charAt(i);
            }
        }
        System.out.println(str);
    }
}
