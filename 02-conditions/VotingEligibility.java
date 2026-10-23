// Read an age and print whether the person can vote (18 or above).

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age = ");
        int age = sc.nextInt();

        // Valid ages are 0 to 120: 0 is allowed (a newborn), 
        // 120 is the oldest realistic age.
        if (age < 0 || age > 120) {
            System.out.println("Wrong Input! Not Valid Age!");
            sc.close();
            return;
        }

        if (age >= 18) {
            System.out.println("The person can vote.");
        } else {
            System.out.println("The person cannot vote.");
        }

        sc.close();
    }
}

// Output 1
// Enter Age = 18
// The person can vote.

// Output 2
// Enter Age = 17
// The person cannot vote.

// Output 3
// Enter Age = -2
// Wrong Input! Not Valid Age!

// Output 4
// Enter Age = 124
// Wrong Input! Not Valid Age!

// Output 5
// Enter Age = 0
// The person cannot vote.

// Output 6
// Enter Age = 120
// The person can vote.

// Output 7
// Enter Age = 19
// The person can vote.