package generics;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("The dog is drinking");
    }

    public static void isOverridden(){
        System.out.println("I see no one who can stop me");
    }
}
