package arrays;

import java.util.Arrays;
import java.util.Random;

/* Example Scenario:
 * Create a Lottery Quick Pick Application that will generate a lottery ticket
 * with six random numbers between 1-69.
 */
public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] arg) {
        System.out.println("Lottery Ticket Numbers : " + Arrays.toString(generateNumbers()));
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean binarySearch(int[] ticket, int numberToSearchFor){
        Arrays.sort(ticket);
        int index = Arrays.binarySearch(ticket, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean search(int[] ticket, int randomNumber) {
        for (int j : ticket) {
            if (j == randomNumber) {
                return true;
            }
        }
        return false;
    }
}
