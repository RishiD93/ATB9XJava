package Oct.ex_10102024;

public class variables {

    // Instance variable (belongs to the instance of the class)
    int instanceVariable = 10;

    // Static variable (belongs to the class)
    static String staticVariable = "Hello, I am a static variable!";

    public static void main(String[] args) {
        // Data types

        byte byteVar = 127;          // 8-bit signed integer
        short shortVar = 32767;      // 16-bit signed integer
        int intVar = 2147483647;     // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        // Floating-point Types
        float floatVar = 3.14f;      // 32-bit floating-point
        double doubleVar = 3.141592653589793; // 64-bit floating-point

        // Character Type
        char charVar = 'A';          // 16-bit Unicode character

        // Boolean Type
        boolean boolVar = true;      // true or false

        // Print all values
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + boolVar);

        // Local variable (declared inside a method)
        int localVariable = 5;

        // Print the local variable
        System.out.println("Local Variable: " + localVariable);

        // Print the static variable directly
        System.out.println("Static Variable: " + staticVariable);

        // Creating an object to access instance variables
        variables example = new variables();
        System.out.println("Instance Variable: " + example.instanceVariable);

        // Constant variable (final keyword makes it a constant)
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);

        // Array variable (storing multiple values)
        int[] arrayVariable = {1, 2, 3, 4, 5};
        System.out.println("Array Variable (First element): " + arrayVariable[0]);

        // String variable (Object)
        String stringVariable = "Java Programming";
        System.out.println("String Variable: " + stringVariable);

    }
}