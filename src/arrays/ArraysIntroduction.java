package arrays;
/* arrays are special objects or containers that are capable of
 * storing multiple values
 */
public class ArraysIntroduction {
    public static void main(String[] arg) {
        int[] myArray; // Declares an array variable without allocating memory
        myArray = new int[10]; // Initializes the array with a size of 10
        int[] newArray = new int[5]; // Now the array is initialized
        newArray[0] = 1; // Now you can store values
        int[] myArray1 = new int[3];
        // Attempting to access or store a value at an invalid index will cause an error
        myArray1[3] = 10; // This will throw an ArrayIndexOutOfBoundsException
        var array = new int[] {5,10,15};
        Object[] array2 = new Object[5];
        array2[0] = "Ahmed";
        array[1] = 20;

    }
}
