package methods;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] arg){
        String firstName1 = "Ahmed";
        String firstName2 = "Ahmed";

        System.out.println(firstName1 == firstName2); // This will print: true

        String firstName3 = new String("Ahmed");
        String firstName4 = new String("Ahmed");

        System.out.println(firstName3 == firstName4); // This will print: false

        System.out.println(firstName3.equals(firstName4)); // This will print: true

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String predefinedString = "Ahmed";

        System.out.println(userInput == predefinedString); // This may print: false
        System.out.println(userInput.equals(predefinedString)); // This will print: true if userInput is "Ahmed"


    }
}
