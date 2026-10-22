// Read principal, rate, and time, then print the interest (P * R * T / 100).

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal = ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate = ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time = ");
        double time = sc.nextDouble();

        double interest = principal * rate * time / 100;

        System.out.printf("Interest = %.2f%n", interest);

        sc.close();
    }
}

// Output
// Enter Principal = 1000
// Enter Rate = 5
// Enter Time = 2
// Interest = 100.00