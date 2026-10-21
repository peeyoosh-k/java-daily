// Use Scanner to read a name and age, 
// then print: Hi Rahul, you are 21 years old.

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.println("Hi " + name + ", you are " + age + " years old.");

        sc.close();
    }
}

// Output
// Name: Rahul
// Age: 21
// Hi Rahul, you are 21 years old.