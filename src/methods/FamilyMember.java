package methods;

public class FamilyMember {
    String name;
    int age;
    String gender;
    static String lastName = "Smith"; // Shared by all family members

    public FamilyMember(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Instance method
    public void goBathroom() {
        System.out.println(name + " is going to the bathroom");
    }

    // Static method
    public static void eatDinner() {
        System.out.println("The " + lastName + " family is eating dinner");
    }
}
