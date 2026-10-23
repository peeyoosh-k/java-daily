// Read a number and print whether it is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        sc.close();
    }
}

// Output 1
// Enter the number = 34
// Number is even.

// Output 2
// Enter the number = 21
// Number is odd.

// Output 3
// Enter the number = 0
// Number is even.

// Output 4
// Enter the number = -3
// Number is odd.