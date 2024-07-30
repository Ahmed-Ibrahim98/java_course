package loops;

import java.util.Scanner;

/* FOR LOOP:
 * write a cashier program that will scan a given
 * number of items and tally the cost
 */
public class Cashier {

    public static void main(String[] arg){

        // Get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        // Input validation for quantity
        while (quantity < 0) {
            System.out.println("The number of items cannot be negative. Please enter a valid number of items: ");
            quantity = scanner.nextInt();
        }

        double total = 0;

        // Create loop to iterate through all of the items and accumulate the costs
        for (int i = 1; i <= quantity; i++){
            System.out.println("Enter the cost of item number " + i + " : ");
            double itemCost = scanner.nextDouble();

            // Input validation for item cost
            while (itemCost < 0) {
                System.out.println("The cost of an item cannot be negative. Please enter a valid cost for item number "
                        + i + " : ");
                itemCost = scanner.nextDouble();
            }

            total = total + itemCost;
        }

        // Close the scanner
        scanner.close();

        // Output total cost
        System.out.println("The cost of all items purchased is $" + total + " dollars");
    }
}
