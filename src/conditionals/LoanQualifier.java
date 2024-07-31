package conditionals;

import java.util.Scanner;

/*
 * Nested if example:
 * To qualify for a loan, a person must make at least $30,000,
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {
        // Initialize known values
        double minimumWage = 30000;
        int minimumYearsWorked = 2;

        // Get necessary unknown values
        Scanner scanner = new Scanner(System.in);

        // Get the person's wage
        System.out.println("Please enter how much money you make:");
        double wage = scanner.nextDouble();

        // Validate wage input
        while (wage < 0) {
            System.out.println("Wage cannot be negative. Please enter a valid amount:");
            wage = scanner.nextDouble();
        }

        // Check if the person meets the wage criteria
        if (wage < minimumWage) {
            // If wage doesn't meet criteria, output message
            System.out.println("We regret to inform you that you don't qualify for a loan.");
        } else {
            // Wage meets criteria, so check the other criteria
            System.out.println("Please enter the number of years you have been working at your current job:");
            double yearsWorked = scanner.nextDouble();

            // Validate years worked input
            while (yearsWorked < 0) {
                System.out.println("Years worked cannot be negative. Please enter a valid number of years:");
                yearsWorked = scanner.nextInt();
            }

            // Check if the person meets the years worked criteria
            if (yearsWorked < minimumYearsWorked) {
                // If years worked doesn't meet criteria, output message
                System.out.println("We regret to inform you that you don't qualify for a loan.");
            } else {
                // Person qualifies for a loan, output message
                System.out.println("Congrats, you qualify for a loan.");
            }
        }
        scanner.close();
    }
}
