package projectGroup.homework6;

public class Task7 {
    public static void main(String[] args) {

        int card = 36;
        int cost = 3;
        int i = 1;
        while (card >= 3){
            card = card - cost;
            System.out.println("Usage " + i);
            i++;
        }
    }
}
