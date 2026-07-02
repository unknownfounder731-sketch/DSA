import java.util.Scanner;

public class CheckTwoNumbersEqualUsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        boolean isEqual = areNumbersEqual(a, b);
        System.out.println("Are the two numbers equal? " + isEqual);
    
        scanner.close(); 
    }
    
    static boolean areNumbersEqual(int a, int b) {
        return (a ^ b) == 0;
    }
}
