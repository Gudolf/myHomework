package projectGroup.homework6;

public class Task4 {
    public static void main(String[] args) {

        int side1, side2, side3;
        side1 = 50;
        side2 = 50;
        side3 = 60;

        if (side1 == side2 && side1 == side3){
            System.out.println("This is an equilateral triangle");

        }else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an isosceles triangle");

        }else {
            System.out.println("This is a scalene triangle");
        }

    }
}
