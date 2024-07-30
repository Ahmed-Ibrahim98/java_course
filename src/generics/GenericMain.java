package generics;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] arg) {
//        IntegerPrinter number = new IntegerPrinter(5);
//        number.print();

        // if i want to do the exact same thing for a double for example
        // i would have to create a whole new class that takes in double
        // you are making different of version of essentially the same class and that is a problem

        // Using the generic Printer Class
//        Object[] thingsToPrint = {"String", 5.15, 10, true, 'C'};
//        for(Object thing: thingsToPrint) {
//            Printer<Object> item = new Printer<>(thing);
//            item.print();
//        }

        Printer<String> thing = new Printer<>("Ahmed");

        // to be discussed after collections
//        ArrayList <Object> animals = new ArrayList<>();
//        animals.add(new Cat());
////        animals.add(new Dog());
//        Cat mycat = (Cat) animals.get(0);
    }
}
