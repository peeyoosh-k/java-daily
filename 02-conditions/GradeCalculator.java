// Read marks (0 to 100) and print the grade: A (90+),
// B (75+), C (50+), otherwise F.

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks = ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a value from 0 to 100.");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}

// Output 1
// Enter marks = 100
// Grade A

// Output 2
// Enter marks = 90
// Grade A

// Output 3
// Enter marks = 89
// Grade B

// Output 4
// Enter marks = 75
// Grade B

// Output 5
// Enter marks = 74
// Grade C

// Output 6
// Enter marks = 50
// Grade C

// Output 7
// Enter marks = 49
// Grade F

// Output 8
// Enter marks = 0
// Grade F

// Output 9
// Enter marks = -1
// Invalid marks. Enter a value from 0 to 100.

// Output 10
// Enter marks = 101
// Invalid marks. Enter a value from 0 to 100.