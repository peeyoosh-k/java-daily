// Store 9.99 in a double, cast it to int, and print both. Then divide 7 / 2 
// using ints and again using doubles, and print both results.

public class CheckTypes {
    public static void main(String[] args) {

        double number = 9.99;
        int converted = (int) number;

        int result1 = 7 / 2;

        double result2 = 7.0 / 2.0;

        System.out.printf("The Original double = %.2f%n", number);
        System.out.printf("The cast int = %d%n", converted);
        System.out.printf("The integer division result = %d%n", result1);
        System.out.printf("The double division result = %.2f%n", result2);

    }
}

// Output 
// The Original double = 9.99
// The cast int = 9
// The integer division result = 3
// The double division result = 3.50