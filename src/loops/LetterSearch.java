package loops;

import java.util.Scanner;

/*
 * search a string to determine if it contains letter 'A'
 */
public class LetterSearch {

    public static void main(String[] arg) {

        // Get text
        System.out.println("Please enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Get the letter
        System.out.println("Please enter a letter you want to search for in the text you provided: ");
        String letterSearched = scanner.nextLine();
        while (letterSearched.length() != 1){
            System.out.println("Invalid entry, please enter only one letter you want to search for in the text");
            letterSearched = scanner.nextLine();
        }
        letterSearched = letterSearched.toLowerCase();

        scanner.close();
        // Create a loop to iterate through the text letter by letter till you find the letter
        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if(letterSearched.equals(String.valueOf(Character.toLowerCase(letter)))){
                System.out.println("Found letter '" + letterSearched +"' in text: '" + text + "' at the index " + i +
                        " of the input text");
                break;
            }else {
                if (i == (text.length() - 1)) {
                    System.out.println("The letter '" + letterSearched + "'  was not fount in text: '" +
                            text +"'");
            }
        }
    }
}}
