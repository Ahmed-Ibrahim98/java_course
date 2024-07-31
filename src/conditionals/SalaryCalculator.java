package conditionals;

import java.util.Scanner;

/*
If statement,
a team of salespeople where all salespeople get a payment of $1000 dollars per week,
salespeople who exceed 10 sales get an additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String[] arg){
        // Initialize known values
        int payment = 1000;
        int bonus = 250;
        int quota = 10;
        // Get unknown values
        System.out.println("Please enter the number of sales you have made for this week!");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Quick detour for the bonus earners
        if (sales > quota){
            payment = payment +  bonus;
        }
        // Output
        System.out.println("Your salary for this week is $" + payment + " dollars");
    }
}
