package generics;

import java.util.ArrayList;

public class GenericSpecial {
    public static void main(String[] arg) {
        Cat kitty = new Cat();
        Dog max = new Dog();

        RaiseAnimal<Cat> cat = new RaiseAnimal<>(kitty);
        RaiseAnimal<Dog> dog = new RaiseAnimal<>(max);

        cat.raiseAnimal();
        dog.raiseAnimal();

        Dog dog2 = new Dog();
        Cat cat2 = new Cat();
        dog2.isOverridden();
        cat2.isOverridden();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(kitty);
        cats.add(cat2);
        printList(cats);

     }

    public static void printList (ArrayList<? extends Animal> arrayList){
        for (Animal cat : arrayList) {
            cat.eat();
        }
    }
    public static <T> void wildCards(T thing){}
}
