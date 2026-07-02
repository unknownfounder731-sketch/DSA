// input: a=10, b=20 using pointer swap both number so that output: a=20, b=10

import java.util.Scanner;

public class SwapNumUsingPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using pointer (simulated with an array)
        int[] arr = {a, b};
        a = arr[1];
        b = arr[0];

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}