package loops;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){

        // Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        // Process all students
        double studentTestScores = 0;
        double averageTestScores;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++){
            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Please enter the test score of test " + (j+1) + " for student number " +
                        (i+1) + ": ");
                studentTestScores = studentTestScores + scanner.nextDouble();
            }
            averageTestScores = studentTestScores / numberOfTests;
            System.out.println("The average test scores of student number " + (i+1) + ": " + averageTestScores);
            studentTestScores = 0;
        }
        scanner.close();
    }
}