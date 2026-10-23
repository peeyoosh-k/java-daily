// Read a number and print whether it is positive, negative, or zero.

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        sc.close();
    }
}

// Output 1
// Enter the number = 0.1
// Number is positive.

// Enter the number = -0.2
// Number is negative.

// Enter the number = 0
// Number is zero.