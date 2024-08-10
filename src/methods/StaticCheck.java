package methods;

public class StaticCheck {
    public static void main(String[] args) {
        FamilyMember husband = new FamilyMember("John", 40, "Male");
        FamilyMember wife = new FamilyMember("Jane", 38, "Female");
        FamilyMember kid = new FamilyMember("Jake", 12, "Male");

        husband.goBathroom(); // John is going to the bathroom
        wife.goBathroom();    // Jane is going to the bathroom
        kid.goBathroom();     // Jake is going to the bathroom

        FamilyMember.eatDinner(); // The Smith family is eating dinner
    }
}
