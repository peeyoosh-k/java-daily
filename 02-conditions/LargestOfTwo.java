// Read two numbers and print the larger one.

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger.");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

// Output 1
// Enter 1st number = 32
// Enter 2nd number = -9
// 32 is larger.

// Output 2
// Enter 1st number = -5
// Enter 2nd number = -3
// -3 is larger.

// Output 3
// Enter 1st number = 1
// Enter 2nd number = 1
// Both numbers are equal.