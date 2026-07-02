import java.util.Scanner;

public class KernighanAlgorithm {
    public static int countSetBits(int n) {
        int count = 0;
        
        while (n > 0) {
            n = n & (n - 1); // Clears the lowest set bit
            count++;         // Tracks how many bits we cleared
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int result = countSetBits(input);
        
        System.out.println("Input: " + input + " (Binary: " + Integer.toBinaryString(input) + ")");
        System.out.println("Total Set Bits: " + result);
    }
}
