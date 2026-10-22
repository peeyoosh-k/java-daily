// Swap two variables using a third variable. Print both before and after.

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 23;
        int b = 44;

        System.out.println("Before Swap:");
        System.out.println("First = " + a);
        System.out.println("Second = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("First = " + a);
        System.out.println("Second = " + b);

    }
}

// Output 
// Before Swap:
// First = 23
// Second = 44
// After Swap:
// First = 44
// Second = 23