// Read the radius (a double) and print the area using Math.PI.

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius = ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.printf("Area = %.2f%n", area);

        sc.close();
    }
}

// Output 
// Enter the radius = 2
// Area = 12.57