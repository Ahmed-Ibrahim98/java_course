package methods;

public class ObjectExample {
    public static void main(String[] arg) {
        ObjectExample example = new ObjectExample();
        var result = example.getItem(false);
        var result2 = example.getItemGeneric(true);
        System.out.println("'" + result + "' is of type " + result.getClass().getSimpleName());
        System.out.println("'" + result2 + "' is of type " + result2.getClass().getSimpleName());
        // Check the type of result and handle accordingly
//        if (result instanceof String str) {
//            System.out.println(str); // If result is a String, print it
//        } else {
//            int num = (Integer) result; // Otherwise, assume it's an Integer and cast it
//            System.out.println(num);
//        }
    }

    // Method returns an Object based on the condition
    public Object getItem(boolean condition) {
        if (condition) {
            return "A string"; // Returns a String if condition is true
        } else {
            return 123; // Returns an Integer if condition is false
        }
    }

    public <T> T getItemGeneric(boolean condition){
        if (condition) {
            return (T) "A string";
        } else {
            return (T) (Integer)123;
        }
    }
}
