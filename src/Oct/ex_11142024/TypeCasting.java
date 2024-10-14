package Oct.ex_11142024;

public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 100;
        double myDouble = myInt;  // Automatic conversion from int to double (widening)
        System.out.println("Implicit Type Casting (int to double): " + myDouble); // Outputs: 100.0

        // 2. Explicit Type Casting (Narrowing)
        double anotherDouble = 9.99;
        int anotherInt = (int) anotherDouble; // Manual conversion from double to int (narrowing)
        System.out.println("Explicit Type Casting (double to int): " + anotherInt); // Outputs: 9 (fractional part lost)

        // 3. Char to Int Conversion
        char myChar = 'A';
        int asciiValue = (int) myChar; // Manual conversion from char to int (getting ASCII value)
        System.out.println("Char to Int Casting ('A' to ASCII): " + asciiValue); // Outputs: 65

        // 4. Int to Char Conversion
        int ascii = 66;
        char convertedChar = (char) ascii; // Manual conversion from int to char (getting character from ASCII)
        System.out.println("Int to Char Casting (ASCII 66 to char): " + convertedChar); // Outputs: B

        // 5. String to Int Conversion (Parsing)
        String stringNumber = "123";
        int parsedInt = Integer.parseInt(stringNumber); // Parsing String to int
        System.out.println("String to Int Casting (\"123\" to int): " + parsedInt); // Outputs: 123

        // 6. String to Double Conversion (Parsing)
        String stringDecimal = "45.67";
        double parsedDouble = Double.parseDouble(stringDecimal); // Parsing String to double
        System.out.println("String to Double Casting (\"45.67\" to double): " + parsedDouble); // Outputs: 45.67

        // 7. Int to String Conversion
        int num = 1000;
        String strNum = Integer.toString(num); // Converting int to String
        System.out.println("Int to String Casting (1000 to \"1000\"): " + strNum); // Outputs: "1000"

        // 8. Double to String Conversion
        double decimal = 99.99;
        String strDouble = Double.toString(decimal); // Converting double to String
        System.out.println("Double to String Casting (99.99 to \"99.99\"): " + strDouble); // Outputs: "99.99"
    }
}
