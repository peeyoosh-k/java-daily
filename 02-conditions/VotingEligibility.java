// Read an age and print whether the person can vote (18 or above).

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age = ");
        int age = sc.nextInt();

        // Valid ages are 0 to 120: 0 is allowed (a newborn),
        // 120 is the oldest realistic age.
        if (age < 0 || age > 120) {
            System.out.println("Invalid age. Enter a value from 0 to 120.");
        } else if (age >= 18) {
            System.out.println("The person can vote.");
        } else {
            System.out.println("The person cannot vote.");
        }

        sc.close();
    }
}

// Output 1
// Enter age = 17
// The person cannot vote.

// Output 2
// Enter age = 18
// The person can vote.

// Output 3
// Enter age = 19
// The person can vote.

// Output 4
// Enter age = 0
// The person cannot vote.

// Output 5
// Enter age = 120
// The person can vote.

// Output 6
// Enter age = -1
// Invalid age. Enter a value from 0 to 120.

// Output 7
// Enter age = 121
// Invalid age. Enter a value from 0 to 120.

// Output 8
// Enter age = -2
// Invalid age. Enter a value from 0 to 120.

// Output 9
// Enter age = 124
// Invalid age. Enter a value from 0 to 120.