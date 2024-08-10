package variables;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg){
//        1. get the number of hours worked
        System.out.println("Enter the number of hours employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours =  scanner.nextInt();
        scanner.nextLine();
//        2. get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        String payRateInput = scanner.nextLine();
        scanner.close();
        double payRate = Double.parseDouble(payRateInput);
//        3. multiply hours and pay rate
        double grossPay = hours * payRate;
//        4. display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
