package arrays;
/* Make an array that holds the textual values of the days of the week
 * have the user input a number corresponding to a day of the week
 * your program should output the string that represents the day of the week
 */
import java.util.Scanner;

public class DaysOfWeek {
    public static String[] weekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static Scanner scanner = new Scanner(System.in);
    public static int number;
    public static void main(String[] arg) {
        printOutput();
        scanner.close();
    }
    public static String getUserInput(){
        System.out.println("Please enter a number that corresponds to a day of the week: ");
        number = scanner.nextInt();
        while (number < 0 || number > 7) {
            System.out.println("Please enter a number between 1-7.");
            number = scanner.nextInt();
        }
        return weekDays[number - 1];
    }

    public static void printOutput(){
        String day = getUserInput();
        System.out.println("The day of the week that corresponds to number " + number + " is : " + day);
    }
}
