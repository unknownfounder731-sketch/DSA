import java.util.Scanner;

public class InteractiveOrderStatusTracker_bitMasking {

    // Define unique bit masks for each order status
    private static final int PLACED    = 1 << 0; // 0001 (Decimal 1)
    private static final int PAID      = 1 << 1; // 0010 (Decimal 2)
    private static final int SHIPPED   = 1 << 2; // 0100 (Decimal 4)
    private static final int DELIVERED = 1 << 3; // 1000 (Decimal 8)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderStatus = 0; // The order starts fresh (0000)

        System.out.println("=== BIT MASKING INTERACTIVE TRACKER ===");

        while (true) {
            // Display current states
            printStatus(orderStatus);

            // Display Menu
            System.out.println("\nChoose an action:");
            System.out.println("1. Turn ON 'Paid' status (Set using OR)");
            System.out.println("2. Turn ON 'Shipped' status (Set using OR)");
            System.out.println("3. Turn ON 'Delivered' status (Set using OR)");
            System.out.println("4. REMOVE 'Shipped' status (Revoke using AND NOT)");
            System.out.println("5. CHECK if order is ready to ship (Check using AND)");
            System.out.println("6. Reset Order (Clear all bits)");
            System.out.println("7. Exit Program");
            System.out.print("Enter choice (1-7): ");

            if (!scanner.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                // Rule 2: Set bit using OR (|)
                orderStatus = orderStatus | PLACED | PAID; 
                System.out.println("\n[Action] Marked as Placed and Paid.");
            } 
            else if (choice == 2) {
                // Rule 2: Set bit using OR (|)
                orderStatus = orderStatus | SHIPPED;
                System.out.println("\n[Action] Marked as Shipped.");
            } 
            else if (choice == 3) {
                // Rule 2: Set bit using OR (|)
                orderStatus = orderStatus | DELIVERED;
                System.out.println("\n[Action] Marked as Delivered.");
            } 
            else if (choice == 4) {
                // Rule 3: Revoke bit using AND NOT (& ~)
                orderStatus = orderStatus & ~SHIPPED;
                System.out.println("\n[Action] Removed Shipped status.");
            } 
            else if (choice == 5) {
                // Rule 1: Check bit status using AND (&)
                boolean hasPaid = (orderStatus & PAID) != 0;
                boolean alreadyShipped = (orderStatus & SHIPPED) != 0;

                System.out.println("\n--- Verification Report ---");
                if (alreadyShipped) {
                    System.out.println("Result: Order has already been shipped!");
                } else if (hasPaid) {
                    System.out.println("Result: Safe to ship! Payment verified.");
                } else {
                    System.out.println("Result: CANNOT SHIP. Customer hasn't paid yet.");
                }
            } 
            else if (choice == 6) {
                orderStatus = 0;
                System.out.println("\n[Action] Resetting order back to 0000.");
            } 
            else if (choice == 7) {
                System.out.println("\nExiting program. Goodbye!");
                break; // Break the infinite loop
            } 
            else {
                System.out.println("\nPlease choose a valid menu number (1-7).");
            }
            
            System.out.println("...........................................");
        }

        scanner.close(); // Safeguard resources
    }

    // Helper method to visually track bit shifts
    private static void printStatus(int status) {
        String binary = String.format("%4s", Integer.toBinaryString(status)).replace(' ', '0');
        System.out.println("\n[Current Variable Data] Decimal: " + status + " | Binary: " + binary);
        System.out.println("  -> Placed:    " + ((status & PLACED) != 0));
        System.out.println("  -> Paid:      " + ((status & PAID) != 0));
        System.out.println("  -> Shipped:   " + ((status & SHIPPED) != 0));
        System.out.println("  -> Delivered: " + ((status & DELIVERED) != 0));
    }
}
