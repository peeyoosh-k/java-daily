// Read three sides and print whether the triangle is 
// equilateral, isosceles, or scalene.

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side = ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd side = ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side = ");
        int c = sc.nextInt();

        if ((a > 0 && b > 0 && c > 0) && ((a + b) > c && (a + c) > b && (b + c) > a)) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid sides. They cannot form a triangle.");
        }

        sc.close();
    }
}

// Output 1
// Enter 1st side = 5
// Enter 2nd side = 5
// Enter 3rd side = 5
// Equilateral Triangle

// Output 2
// Enter 1st side = 5
// Enter 2nd side = 5
// Enter 3rd side = 8
// Isosceles Triangle

// Output 3
// Enter 1st side = 5
// Enter 2nd side = 8
// Enter 3rd side = 5
// Isosceles Triangle

// Output 4
// Enter 1st side = 8
// Enter 2nd side = 5
// Enter 3rd side = 5
// Isosceles Triangle

// Output 5
// Enter 1st side = 3
// Enter 2nd side = 4
// Enter 3rd side = 5
// Scalene Triangle

// Output 6
// Enter 1st side = 1
// Enter 2nd side = 2
// Enter 3rd side = 10
// Invalid sides. They cannot form a triangle.

// Output 7
// Enter 1st side = 1
// Enter 2nd side = 2
// Enter 3rd side = 3
// Invalid sides. They cannot form a triangle.

// Output 8
// Enter 1st side = 5
// Enter 2nd side = 5
// Enter 3rd side = 10
// Invalid sides. They cannot form a triangle.

// Output 9
// Enter 1st side = 0
// Enter 2nd side = 5
// Enter 3rd side = 5
// Invalid sides. They cannot form a triangle.

// Output 10
// Enter 1st side = -3
// Enter 2nd side = 4
// Enter 3rd side = 5
// Invalid sides. They cannot form a triangle.