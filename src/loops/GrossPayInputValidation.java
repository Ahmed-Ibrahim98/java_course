package loops;

import java.util.Scanner;

/* while loop,
 * each store employee makes $15 dollars an hour.
 * write a program that allows manager to enter the number of weekly hours
 * worked for each employee and calculate their pay. do not allow for over time
 */
public class GrossPayInputValidation {

    public static void main(String[] arg) {

        // Initialize values we know
        int rate = 15;
        int maxHours =40;
        // Get values we don't know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please the enter the number of hours worked this week by the employee:");
        int hoursWorked = scanner.nextInt();
        while (hoursWorked < 1 || hoursWorked > maxHours) {
            System.out.println("The number of hours worked must be between 1 and 40," +
                    " please enter a valid number of hours");
            hoursWorked =  scanner.nextInt();
        }
        scanner.close();
        // Calculating the gross pay for the employee
        int grossPay = rate * hoursWorked;
        // output
        System.out.println("The gross pay for this employee this week is $" + grossPay + " dollars");
    }
}
