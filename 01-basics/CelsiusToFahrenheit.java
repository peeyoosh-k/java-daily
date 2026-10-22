// Read a Celsius value and print the Fahrenheit value (F = C * 9/5 + 32).

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Celsius Value = ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("Fahrenheit Value = %.2f%n", fahrenheit);

        sc.close();
    }
}

// Output
// Enter the Celsius Value = 45
// Fahrenheit Value = 113.00