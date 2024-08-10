package loops;

import java.util.Scanner;

/*
 * do - while,
 * write a program that allows user to enter two numbers, and then sums up the two numbers
 * the user should be able to repeat this action until they indicate they are done
 */
public class AddNumbers {

    public static void main(String[] arg) {
        // Initialize the sentinel
        boolean repeat;
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this program will help add any two numbers you want to add as much as you want");
        do {
            System.out.println("Please enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 + num2;
            System.out.println("The sum of " + num1 + " + " + num2 + " = " + result);
            System.out.println("Do you Still want to add another two number? Y/N");
            input = scanner.next();
            while (input.length() != 1 || !("YN".contains(input.toUpperCase()))){
                System.out.println("Invalid input. Please enter either 'Y' to continue or 'N' to exit");
                input = scanner.next();
            }
            repeat = input.equalsIgnoreCase("Y");
        } while (repeat);
        scanner.close();
        System.out.println("Thank you for using the program, Goodbye!");
    }
}
