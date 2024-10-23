package Oct.ex_11182024;

import java.util.Scanner;

public class demoswitchthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Browser = sc.next();
        System.out.println("Enter the browser");
        switch (Browser){
            case "chrome" :
                System.out.println("Starting the chrome ");
                break;
            case "safari" :
                System.out.println("Starting safari");
                break;

            default:
                System.out.println("I have no idea regarding this browser");
                break;


        }

    }
}
