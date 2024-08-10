package generics;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("The Cat is eating");
    }
    @Override
    public void sleep(){
        System.out.println("The cat is sleeping");
    }
    @Override
    public void drink(){
        System.out.println("The cat is drinking");
    }

    public static void isOverridden(){
        System.out.println("Oh yes i will");
    }
}
