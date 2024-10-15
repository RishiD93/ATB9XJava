package Oct.ex_11152024;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Using ternary operator to find the largest number
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
