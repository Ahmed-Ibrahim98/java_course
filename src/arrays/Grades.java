package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* Create a program that allows the user to enter any number of grades
 * and provides them with their average score as well as the highest
 * and lowest scores.
 */
public class Grades {
    public static int[] grades;
    public static int numberOfGrades;

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        getGradesNumber(scanner);
        getGrades(scanner);
        printSummary();
    }

    public static void getGrades(Scanner scanner) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade Number #" + (i+1));
            int grade = scanner.nextInt();
            while (grade < 0) {
                System.out.println("Invalid grade, please enter a valid positive grade");
                grade = scanner.nextInt();
            }
            grades[i] = grade;
        }
    }

    public static void getGradesNumber(Scanner scanner){
        System.out.println("Please enter the number of grades you want to enter: ");
        numberOfGrades = scanner.nextInt();
        while (numberOfGrades < 1) {
            System.out.println("Invalid number of grades, please enter a valid number");
            numberOfGrades = scanner.nextInt();
        }
        grades = new int[numberOfGrades];
    }

    public static int calculateSum(){
        int sum = 0;
        for(int j : grades){
            sum += j;
        }
        return sum;
    }
    public static int getHighestScore(){
        Arrays.sort(grades);
        return grades[numberOfGrades -1];
    }
    public static int getLowestScore(){
        Arrays.sort(grades);
        return grades[0];
    }
    public static String formatDouble(double value, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Decimal places must be non-negative.");
        }

        long factor = (long) Math.pow(10, decimalPlaces);
        long temp = Math.round(value * factor);

        long wholePart = temp / factor;
        long fractionalPart = Math.abs(temp % factor);

        StringBuilder formatted = new StringBuilder();
        formatted.append(wholePart).append(".");

        // Ensure the fractional part has exactly the specified number of digits
        String fractionString = String.valueOf(fractionalPart);
        int numZeroesToAdd = decimalPlaces - fractionString.length();
        formatted.append("0".repeat(Math.max(0, numZeroesToAdd)));
        formatted.append(fractionString);

        return formatted.toString();
    }

    public static String calculateAverage() {
        return formatDouble(((double) calculateSum() / numberOfGrades), 2);
//        return String.format("%.2f", ((double) calculateSum() / numberOfGrades));
    }
    public static void printSummary() {
        System.out.println("Student's Grades Summary\n" +
                "Average Score: " + calculateAverage() + "\n" +
                "The Highest Score: " + getHighestScore() +
                "\n" + "The Lowest Score: " + getLowestScore() + "\n");
    }
}
