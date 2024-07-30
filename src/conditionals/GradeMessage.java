package conditionals;


import java.util.Scanner;

/* Switch statement.
 * Have a user enter their grade,
 * and using switch statement,
 * print out a message letting them know how they did
 */
public class GradeMessage {

    public static void main(String[] arg){
        // Get the test grade from student
        System.out.println("Please enter your grade: A, B, C, D, or F");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        // if input is less or more than one character or the character is not one of "ABCDF" characters
        while (grade.length() != 1 || !"ABCDF".contains(grade.toUpperCase())) {
            System.out.println("Invalid grade entered. Please enter a valid grade: A, B, C, D, or F");
            grade = scanner.next();
        }
        scanner.close();
        String msg;
        switch (grade){
            case "A":
                msg = "Excellent job!";
                break;
            case "B":
                msg = "Great job!";
                break;
            case "C":
                msg = "Good job!";
                break;
            case "D":
                msg = "You need to work a bit harder!";
                break;
            case "F":
                msg = "Worthless Trash, LOL";
                break;
            default:
                msg = "Error, Invalid Grade";
        }
        System.out.println(msg);

        String message = switch (grade.toUpperCase()) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder!";
            case "F" -> "Worthless Trash, LOL";
            default -> "Error, Invalid Grade";
        };
        System.out.println(message);
    }
}
