// Read two numbers and print the sum, difference, product, quotient, 
// and remainder.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1st Number = ");
        double num1 = sc.nextDouble();

        System.out.print("2nd Number = ");
        double num2 = sc.nextDouble();

        System.out.println("Results:");
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));
        System.out.println("Remainder = " + (num1 % num2));

        sc.close();
    }
}

// Output
// 1st Number = 20
// 2nd Number = 50
// Results:
// Sum = 70.0
// Difference = -30.0
// Product = 1000.0
// Quotient = 0.4
// Remainder = 20.0