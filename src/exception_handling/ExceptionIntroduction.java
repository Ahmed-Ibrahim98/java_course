package exception_handling;

public class ExceptionIntroduction {
    public static void main(String[] arg) {
//        int myInt = Integer.parseInt("PANTS"); // throws an exception you can't make an integer out of PANTS
        try {
            // Code that may cause an exception
            int myInt = Integer.parseInt("PANTS"); // catch block won't be executed if you change PANTS to '1'
            // code after the line of code above won't execute if an exception happen it will go search for
            // a catch that handles the exception and then get out of the try-catch block it will never
            // reach this code
        } catch (NumberFormatException nfe) {
            // code we want to execute if this type of exception happens
            System.out.println("stop messing around, you can't make an int out of that.");
        }

        try {
            // Code that may cause an exception
            int myInt = Integer.parseInt("PANTS"); // catch block won't be executed if you change PANTS to '1'
        } catch (Exception e) {
            // code we want to execute if this type of exception happens
            System.out.println("stop messing around, you can't make an int out of that.");
        }

        try {
            // Code that may cause an exception
            String[] emptyArray = new String[0];
            performOperation(emptyArray);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
            }else {
                // code we want to execute if this type of exception happens
                System.out.println("Caught a NullPointerException: " + e.getMessage());
            }
        }

//        try {
//            // code may cause exception
//        }catch (Exception e) {
//            // how to handle that exception
//        } finally {
//            // code that will execute no matter what
//        }

        System.out.println("Program ends here");
//        System.out.println(returnNumber());
    }


    // i don't need to catch an exception in a method that may cause an exception but
    // if i call it i definitely need to call it within a try catch blocks of code
    // Method that can throw multiple types of exceptions
    public static void performOperation(String[] array) {
        if (array == null) {
            throw new NullPointerException("Array is null");
        } else if (array.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }

//        // Accessing the first element
//        System.out.println(array[0]);
    }

    // an interesting method
    public static int returnNumber() {
        try {
            return 2;
        } catch (Exception e) {
            return 4;
        } finally {
            return 8;
        }
    }
}
