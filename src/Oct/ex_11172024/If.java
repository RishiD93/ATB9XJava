package Oct.ex_11172024;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int age =20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
         age = scanner.nextInt();
        if(age>18)
        {
            System.out.println("not allowed");
        }
    }
}
