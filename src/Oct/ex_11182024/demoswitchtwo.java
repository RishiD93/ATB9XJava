package Oct.ex_11182024;

import java.util.Scanner;

public class demoswitchtwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3");
        double side3 = scanner.nextDouble();

        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Invalid input : Sode length must be positive");
        } else if (side1 == side2 && side2 == side3 && side1 ==side3) {
            System.out.println("The triangle is eqilateral");
            
        } else {
            System.out.println("The triangle is scalene");
        }
        scanner.close();


    }
}
