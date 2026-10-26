// Read three numbers and print the largest one.

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number = ");
        double num2 = sc.nextDouble();

        System.out.print("Enter 3rd number = ");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("1st number is the largest: %.2f%n", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("2nd number is the largest: %.2f%n", num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("3rd number is the largest: %.2f%n", num3);
        } else if (num1 == num2 && num3 > num1) {
            System.out.printf("3rd number is the largest: %.2f%n", num3);
        } else if (num1 == num2 && num1 > num3) {
            System.out.printf("1st and 2nd numbers are the largest: %.2f%n", num1);
        } else if (num2 == num3 && num1 > num2) {
            System.out.printf("1st number is the largest: %.2f%n", num1);
        } else if (num2 == num3 && num2 > num1) {
            System.out.printf("2nd and 3rd numbers are the largest: %.2f%n", num2);
        } else if (num1 == num3 && num2 > num1) {
            System.out.printf("2nd number is the largest: %.2f%n", num2);
        } else if (num1 == num3 && num1 > num2) {
            System.out.printf("1st and 3rd numbers are the largest: %.2f%n", num1);
        } else {
            System.out.printf("All numbers are equal: %.2f%n", num1);
        }

        sc.close();
    }
}

// Output 1
// Enter 1st number = 21
// Enter 2nd number = 33
// Enter 3rd number = 52
// 3rd number is the largest: 52.00

// Output 2
// Enter 1st number = 11
// Enter 2nd number = 22
// Enter 3rd number = 5
// 2nd number is the largest: 22.00

// Output 3
// Enter 1st number = 76
// Enter 2nd number = 36
// Enter 3rd number = 56
// 1st number is the largest: 76.00

// Output 4
// Enter 1st number = 23
// Enter 2nd number = 23
// Enter 3rd number = 11
// 1st and 2nd numbers are the largest: 23.00

// Output 5
// Enter 1st number = 23
// Enter 2nd number = 23
// Enter 3rd number = 33
// 3rd number is the largest: 33.00

// Output 6
// Enter 1st number = 45
// Enter 2nd number = 67
// Enter 3rd number = 67
// 2nd and 3rd numbers are the largest: 67.00

// Output 7
// Enter 1st number = 45
// Enter 2nd number = 23
// Enter 3rd number = 23
// 1st number is the largest: 45.00

// Output 8
// Enter 1st number = 54
// Enter 2nd number = 34
// Enter 3rd number = 54
// 1st and 3rd numbers are the largest: 54.00

// Output 9
// Enter 1st number = 23
// Enter 2nd number = 45
// Enter 3rd number = 23
// 2nd number is the largest: 45.00

// Output 10
// Enter 1st number = 2
// Enter 2nd number = 2
// Enter 3rd number = 2
// All numbers are equal: 2.00

// Output 11
// Enter 1st number = -5
// Enter 2nd number = -3
// Enter 3rd number = -9
// 2nd number is the largest: -3.00

// Output 12
// Enter 1st number = 2.5
// Enter 2nd number = 7.5
// Enter 3rd number = 3.5
// 2nd number is the largest: 7.50