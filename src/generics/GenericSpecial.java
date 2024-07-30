package generics;

public class GenericSpecial {
    public static void main(String[] arg) {
        Cat kitty = new Cat();
        Dog max = new Dog();

        RaiseAnimal<Cat> cat = new RaiseAnimal<>(kitty);
        RaiseAnimal<Dog> dog = new RaiseAnimal<>(max);

        cat.raiseAnimal();
        dog.raiseAnimal();
     }
}
