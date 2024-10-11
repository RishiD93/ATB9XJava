package Oct.ex_11102024;

public class Task9th {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-15s %-25s %-20s%n", "Data Type", "Description", "Example Value");
        System.out.printf("%-15s %-25s %-20s%n", "---------", "-----------------------", "------------");

        // Print table rows with data
        System.out.printf("%-15s %-25s %-20d%n", "byte", "8-bit signed integer", 127);
        System.out.printf("%-15s %-25s %-20d%n", "short", "16-bit signed integer", 32767);
        System.out.printf("%-15s %-25s %-20d%n", "int", "32-bit signed integer", 2147483647);
        System.out.printf("%-15s %-25s %-20d%n", "long", "64-bit signed integer", 9223372036854775807L);
        System.out.printf("%-15s %-25s %-20.2f%n", "float", "32-bit floating-point", 3.14f);
        System.out.printf("%-15s %-25s %-20.15f%n", "double", "64-bit floating-point", 3.141592653589793);
        System.out.printf("%-15s %-25s %-20s%n", "char", "16-bit Unicode character", 'A');
        System.out.printf("%-15s %-25s %-20s%n", "boolean", "true or false", true);
    }

}
