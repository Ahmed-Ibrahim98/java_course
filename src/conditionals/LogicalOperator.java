package conditionals;

import java.util.Scanner;

/*
 * Logical Operators:
 * To qualify for a loan, a person must make at least $30,000,
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperator {
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
        System.out.println("Please enter how many years have you been working at your current job:");
        double yearsWorked = scanner.nextDouble();
        while (yearsWorked < 0) {
            System.out.println("Years worked cannot be negative. Please enter a valid number of years:");
            yearsWorked = scanner.nextInt();
        }
        scanner.close();
        // Check if the person meets the wage criteria
        if (wage < minimumWage || yearsWorked < minimumYearsWorked) {
            // If wage or yearsWorked don't meet criteria, output message
            System.out.println("We regret to inform you that you don't qualify for a loan.");
        } else {
            // Person qualifies for a loan, output message
            System.out.println("Congrats, you qualify for a loan.");

        }
    }
}
