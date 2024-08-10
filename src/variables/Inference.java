package variables;

public class Inference {
//    var gender = "Male";
    public static void main(String[] arg) {
        int age;
        age = 20;

        var firstName = "John";
//        firstName = 10;
//        var middleName;
//        middleName = "M";
        var lastName = "Doe";
        System.out.println("Hello, " + firstName + " " + lastName + ". So, you are " + age + " years old, huh.");

        Object info;;
        info = "Saleh";
        System.out.println(info);
        System.out.println(((String) info).length()); // Prints: 5
//        info = 25;
        System.out.println((Integer) info * 2); // Prints: 50
        System.out.println(info);
    }
}
