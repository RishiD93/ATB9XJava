package Oct.ex_11102024;

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 4; // c = c * 4
        System.out.println("c *= 4: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equals
        System.out.println("a != b: " + (a != b)); // Not equals
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        int bitA = 5;  // 0101 in binary
        int bitB = 3;  // 0011 in binary
        System.out.println("bitA & bitB: " + (bitA & bitB)); // Bitwise AND
        System.out.println("bitA | bitB: " + (bitA | bitB)); // Bitwise OR
        System.out.println("bitA ^ bitB: " + (bitA ^ bitB)); // Bitwise XOR
        System.out.println("~bitA: " + (~bitA)); // Bitwise NOT
        System.out.println("bitA << 1: " + (bitA << 1)); // Left shift
        System.out.println("bitA >> 1: " + (bitA >> 1)); // Right shift
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("min value between a and b: " + min);
        System.out.println();

        // Unary Operators
        System.out.println("Unary Operators:");
        int unary = 5;
        System.out.println("unary++: " + (unary++)); // Post-increment
        System.out.println("++unary: " + (++unary)); // Pre-increment
        System.out.println("unary--: " + (unary--)); // Post-decrement
        System.out.println("--unary: " + (--unary)); // Pre-decrement

    }
}
