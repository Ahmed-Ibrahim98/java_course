package conditionals;

import java.util.Scanner;

/*
If else statement,
all salespeople are expected to make at least 10 sales each week
For those who do they get a congratulatory message
For those who don't they are informed of how many sales they are short.
 */
public class QuotaCalculator {
    public static void main(String[] arg){
        // Initialize known values
        int quota = 10;
        // Get unknown values
        System.out.println("Please enter the number of sales you have made for this week!");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // check the sales and print output
        if (sales >= quota){ // those who made at least 10 sales
            System.out.println("Congratulation on meeting your quota for this week!");
        }else { // those who didn't meet their quota
            int salesShort = quota - sales;
            System.out.println("We regret to inform you that you are " + salesShort + " sales short");
        }
    }
}
