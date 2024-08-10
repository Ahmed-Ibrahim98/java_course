package conditionals;
/* if else-if else example,
 * Display a letter grade for a student
 * based on their test score
 */
import java.util.Scanner;

public class TestResults {

    public static void main(String[] arg){
        // Get the test score from student
        System.out.println("Please enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        // validate the student test score input
        while (score < 0 || score > 100) {
            if(score < 0) {
                System.out.println("Score can't be a negative number please enter a valid test score");
            } else {
                System.out.println("Score can't be more than a hundred please enter a valid test score");
            }
            score = scanner.nextDouble();
        }
        scanner.close();
        // Determine the letter grade
        char grade;
        if (score < 60){
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        // Output
        System.out.println("Your Grade is " + grade);
    }
}
